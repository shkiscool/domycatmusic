package com.shk.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.google.gson.Gson;
import com.shk.entity.Users;
import com.shk.service.UsersService;
import com.shk.serviceImpl.UsersServiceImpl;
import com.shk.util.PageData;

/**
 * 用户后端控制器
 * 
 * @author 徐扬 2018/6/2 20:00
 *
 */
@WebServlet("/UsersController")
public class UsersController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// 创建Service对象
	UsersService us = new UsersServiceImpl();
	public static Map<String, String> Nomalform = new HashMap<String, String>();
	private static String USER_PHOTO = "";

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response) 判断执行哪个操作
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// TODO Auto-generated method stub

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		// 参数名 op 值如果等于 list才做查询
		String op = request.getParameter("op");
         System.out.println(op);
		if ("ajax".equals(op)) {
			doAjax(request, response);
		} else if ("sign".equals(op)) {
			doSign(request, response);
		} else if ("login".equals(op)) {
			doLogin(request, response);
		} else if ("list".equals(op)) {
			doList(request, response);
		} else if ("add".equals(op)) {
			doAdd(request, response);
		} else if ("del".equals(op)) {
			doDel(request, response);
		} else if ("udp".equals(op)) {
			doUpd(request, response);
		}
	}

	/**
	 * 执行用户的修改操作
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doUpd(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		// 检查请求是否是multipart/form-data类型
		if (!ServletFileUpload.isMultipartContent(request)) { // 不是multipart/form-data类型
			throw new RuntimeException("表单的enctype属性不是multipart/form-data类型！！");
		}

		// 创建上传所需要的两个对象
		DiskFileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload sfu = new ServletFileUpload(factory); // 解析器依赖于工厂

		// 创建容器来接受解析的内容
		List<FileItem> items = new ArrayList<FileItem>();
		// 将上传的文件信息放入容器中
		try {
			items = sfu.parseRequest(request);
		} catch (FileUploadException e) {
			e.printStackTrace();
		}

		// 遍历容器,处理解析的内容;封装两个方法，一个处理普通表单域，一个处理文件的表单域
		for (FileItem item : items) {
			if (item.isFormField()) {
				handleFormField(item);
			} else {
				handleUploadField(item);
			}
		}
		Users users = new Users(Integer.parseInt(Nomalform.get("userId")), Nomalform.get("userName"),
				Nomalform.get("userPwd"), Integer.parseInt(Nomalform.get("userLevel")), Nomalform.get("userEmail"),
				Nomalform.get("userLove"), USER_PHOTO, Nomalform.get("userSex"), Nomalform.get("userBirthday"));
		boolean flag = us.updateUsers(users);
		PrintWriter out = response.getWriter();
		if (flag) {
			out.print("true");
		}
		out.close();
	}

	/**
	 * 执行用户的删除操作
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doDel(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userId = request.getParameter("userId"); // 从网页端换取管理员想要删除用户的ID
		boolean flag = us.delUsers(Integer.parseInt(userId));
		PrintWriter out = response.getWriter();
		if (flag) {
			out.print("true");
		}
		out.close();
	}

	/**
	 * 执行用户的增加操作
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doAdd(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PageData<Users> pd = us.getUsers(1, 1, "");
		int USER_ID = pd.getTotal() + 1; // 从用户表中获取用户的总数然后加一变成新加用户的编号（有缺陷，中间不能隔断）
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		// 检查请求是否是multipart/form-data类型
		if (!ServletFileUpload.isMultipartContent(request)) { // 不是multipart/form-data类型
			throw new RuntimeException("表单的enctype属性不是multipart/form-data类型！！");
		}

		// 创建上传所需要的两个对象
		DiskFileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload sfu = new ServletFileUpload(factory); // 解析器依赖于工厂

		// 创建容器来接受解析的内容
		List<FileItem> items = new ArrayList<FileItem>();
		// 将上传的文件信息放入容器中
		try {
			items = sfu.parseRequest(request);
		} catch (FileUploadException e) {
			e.printStackTrace();
		}

		// 遍历容器,处理解析的内容;封装两个方法，一个处理普通表单域，一个处理文件的表单域
		for (FileItem item : items) {
			if (item.isFormField()) {
				handleFormField(item);
			} else {
				handleUploadField(item);
			}
		}

		Users users = new Users(USER_ID, Nomalform.get("userName"), Nomalform.get("userPwd"),
				Integer.parseInt(Nomalform.get("userLevel")), Nomalform.get("userEmail"), Nomalform.get("userLove"),
				USER_PHOTO, Nomalform.get("userSex"), Nomalform.get("userBirthday"));
		boolean flag = us.addUsers(users);
		PrintWriter out = response.getWriter();
		if (flag) {
			out.print("true");
		}
		out.close();
	}

	/**
	 * 处理普通的表单域
	 * 
	 * @param item
	 */
	private void handleFormField(FileItem item) {
		String fieldName = item.getFieldName(); // 得到表单域的name的值
		String value = "";
		try {
			value = item.getString("utf-8"); // 得到普通表单域中所输入的值
			Nomalform.put(fieldName, value);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 处理文件的表单域
	 * 
	 * @param item
	 */
	private void handleUploadField(FileItem item) {
		String fileName = item.getName(); // 得到上传文件的文件名
		if (fileName != null && !"".equals(fileName)) {
			// 控制只能上传图片
			if (!item.getContentType().startsWith("image")) {
				return;
			}
		}

		// 上传文件存储路径
		String path = "E:/upload/images";
		// 创建子目录
		File childDirectory = getChildDirectory(path);

		// 写入服务器或者磁盘
		try {
			String Filename = UUID.randomUUID() + "_" + fileName;
			item.write(new File(childDirectory.toString(), Filename));
			String str = childDirectory.toString().replace("E:\\upload", "");
			String str1 = str + "/" + Filename;
			str1 = str1.replace("\\", "/");
			USER_PHOTO = "http://127.0.0.1:8080" + str1;
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 按照时间创建子目录，防止一个目录中文件过多，不利于以后遍历查找
	 * 
	 * @param path
	 * @return
	 */
	private File getChildDirectory(String path) {
		Date currTime = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String time = sdf.format(currTime);

		File file = new File(path, time);
		if (!file.exists()) {
			file.mkdirs();
		}
		return file;
	}

	/**
	 * 执行用户的分页查询操作
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doList(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("mvc/userList.jsp").forward(request, response);
	}

	/**
	 * 执行用户的登录操作
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doLogin(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		String userName = request.getParameter("userName");
		System.out.println(userName);
		// 调用userService的方法
		Users u = us.getUserByName(userName);
		System.out.println(u);
		if (u.getUSERLEVEL() == 2) {
			// 将用户信息存储在session对象中
			session.setAttribute("users", u);
			// 转发到用户后台
			request.getRequestDispatcher("mvc/Behinddesk.jsp").forward(request, response);
		} else {
			// 将用户信息存储在session对象中
			session.setAttribute("users", u);
			// 未登录的或者是普通用户则转发到前台界面
			response.sendRedirect("MusicController");
		
		}
	}

	/**
	 * 执行用户的注册操作
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doSign(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PageData<Users> pd = us.getUsers(1, 1, "");
		int USER_ID = pd.getTotal() + 1; // 从用户表中获取用户的总数然后加一变成新加用户的编号（有缺陷，中间不能隔断）
		int USER_LEVEL = 1; // 用户权限（一般默认为普通用户，这句其实是多余的~~）
		String USER_LOVE = ""; // 注册界面没有该窗口所以为空
		String USER_PHOTO = ""; // 注册界面没有该窗口所以为空
		String USER_SEX = "男";
		String USER_BIRTHDAY = "2000/01/01";
		String USER_EMAIL = ""; // 这句其实也是多余的，因为登录界面必须输入EMAIL地址才能注册成功
		String USER_NAME = request.getParameter("userName"); // 从网页端获取用户名
		String USER_PWD = request.getParameter("userPwd"); // 从网页端获取用户密码
		String userEmail = request.getParameter("userEmail"); // 从网页端获取EMAIL地址
		if (null != userEmail) {
			USER_EMAIL = userEmail;
		}

		Users users = new Users(USER_ID, USER_NAME, USER_PWD, USER_LEVEL, USER_EMAIL, USER_LOVE, USER_PHOTO, USER_SEX,
				USER_BIRTHDAY);

		boolean flag = us.addUsers(users); // 执行增加操作

		request.setAttribute("Usignflag", flag);
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	/**
	 * 执行ajax操作,在登录成功之前,实现对用户提示的局部刷新;（包含了登录页面和注册页面）
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doAjax(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String ap = request.getParameter("ap");
		PrintWriter out = response.getWriter();
		if ("au".equals(ap)) { // 当ap=au时，执行查询操作，判断用户名在数据库中是否存在
			String username = request.getParameter("username");
			Users uss = us.getUserByName(username);
			if (null != uss) {
				out.print("用户名已存在！");
			}
		} else if ("aw".equals(ap)) { // 当ap=aw 时，判断两次输入的密码是否一致
			String password = request.getParameter("password");
			String repassword = request.getParameter("repassword");
			if (!password.equals(repassword)) {
				out.print("两次输入的密码不一致！请重新输入！");
			}
		} else if ("login".equals(ap)) { // 当ap=login时，执行登录操作，判断用户名和密码是否正确
			String userName = request.getParameter("userName");
			String userPwd = request.getParameter("userPwd");
			Users u = us.login(userName, userPwd);
			if (null == u) {
				out.print("用户名或密码错误！");
			} else {
				out.print("true");
			}
		} else if ("list".equals(ap)) {
			// 模糊查询的初始设置值为"";这样可以查询所有数据
			String userNameLike = "";
			// 从网页端获取页码
			int page = Integer.parseInt(request.getParameter("Userpage"));

			// 从网页端获取管理员设置的每页数据量信息
			int pagesize = Integer.parseInt(request.getParameter("pagesize"));

			// 从网页端获取管理员查询所使用的关键字
			if (null != request.getParameter("userNameLike")) {
				userNameLike = request.getParameter("userNameLike");
			}

			PageData<Users> pd = us.getUsers(page, pagesize, userNameLike);

			Map<Object, Object> info = new HashMap<Object, Object>();
			info.put("data", pd.getData());
			info.put("page", pd.getPage());
			info.put("totalpage", pd.getTotalPage());
			String json = new Gson().toJson(info);
			out.write(json);
		}
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
