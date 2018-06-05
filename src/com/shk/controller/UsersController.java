package com.shk.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.shk.entity.mUser;
import com.shk.service.usersService;
import com.shk.serviceImpl.usersServiceImpl;
import com.shk.util.PageData;

/**
 * 用户后端控制器
 * 
 * @author 徐扬    2018/6/2 20:00
 *
 */
@WebServlet("/UsersController")
public class UsersController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// 创建Service对象
	usersService us = new usersServiceImpl();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 *      判断执行哪个操作
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
		String USER_EMAIL = ""; // 用户的邮箱地址
		String USER_LOVE = ""; // 用户的音乐喜好
		String userId = request.getParameter("userId");
		int USER_ID = Integer.parseInt(userId); // 用户的编号
		String USER_NAME = request.getParameter("userName"); // 用户名
		String USER_PASSWORD = request.getParameter("userPwd"); // 用户密码
		String userLevel = request.getParameter("userLevel");
		int USER_LEVEL = Integer.parseInt(userLevel); // 用户权限
		String USER_PHOTO = request.getParameter("userPhoto"); // 用户图片路径
		String userLove = request.getParameter("userLove");
		System.out.println(userLove);
		if (null != userLove) {
			USER_LOVE = userLove;
		}
		String userEmail = request.getParameter("userEmail");
		if (null != userEmail) {
			USER_EMAIL = userEmail;
		}
		mUser users = new mUser(USER_ID, USER_NAME, USER_PASSWORD, USER_LEVEL, USER_EMAIL, USER_LOVE, USER_PHOTO);
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
		String userId = request.getParameter("userId");  //从网页端换取管理员想要删除用户的ID
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
		PageData<mUser> pd = us.getUsers(1, 1, "");
		int USER_ID = pd.getTotal() + 1;  //从用户表中获取用户的总数然后加一变成新加用户的编号（有缺陷，中间不能隔断）
		String USER_PHOTO = "";  //用户照片的链接地址
		String USER_LOVE = "";  //用户的音乐喜好
		int USER_LEVEL = 1; //用户权限（一般默认为普通用户，这句其实是多余的~~）
		String USER_EMAIL = "";  //用户的邮箱地址
		String userLove = request.getParameter("userLove");
		if (null != userLove) {
			USER_LOVE = userLove;
		}
		String userId = request.getParameter("userId");
		if (null != userId) {
			USER_ID = Integer.parseInt(userId);
		}
		String USER_NAME = request.getParameter("userName");  //从网页端获取用户名
		String USER_PWD = request.getParameter("userPwd");  //从网页端获取用户密码
		String userLevel = request.getParameter("userLevel"); //从网页端获取设置的用户权限数据

		if (null != userLevel) {
			USER_LEVEL = Integer.parseInt(userLevel);
		}

		String userEmail = request.getParameter("userEmail");
		if (null != userEmail) {
			USER_EMAIL = userEmail;
		}
		mUser users = new mUser(USER_ID, USER_NAME, USER_PWD, USER_LEVEL, USER_EMAIL, USER_LOVE, USER_PHOTO);
		boolean flag = us.addUsers(users);
		PrintWriter out = response.getWriter();
		if (flag) {
			out.print("true");
		}
		out.close();
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
		int page = 1;  //初始页数为1，也就是第一页
		int pagesize = 5;  //初始每页的数据量，这里设置的是一页五条用户数据
		String userNameLike = "";  //模糊查询的初始设置值为"";这样可以查询所有数据

		//从网页端获取管理员点击的页码数
		if (null != request.getParameter("Userpage")) {
			page = Integer.parseInt(request.getParameter("Userpage"));

			if (page < 1) {
				page = 1;
			}

		}

		//从网页端获取管理员设置的每页数据量信息（其实这句是多余的，因为并没有给管理员设置页面数据量的窗口）
		if (null != request.getParameter("pagesize")) {
			pagesize = Integer.parseInt(request.getParameter("pagesize"));
		}

		//从网页端获取管理员查询所使用的关键字
		if (null != request.getParameter("userNameLike")) {
			userNameLike = request.getParameter("userNameLike");
		}

		PageData<mUser> pd = us.getUsers(page, pagesize, userNameLike);

		request.setAttribute("pd", pd);

		request.setAttribute("userNameLike", userNameLike);

		request.setAttribute("userLike", userNameLike);

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
		HttpSession session = request.getSession();
		String userName = request.getParameter("userName");
		String userPwd = request.getParameter("userPwd");
		// 调用userService的方法
		mUser u = us.login(userName, userPwd);
		if (u.getUSER_LEVEL() == 2) {
			// 将用户信息存储在session对象中
			session.setAttribute("users", u);
			// 转发到用户后台
			request.getRequestDispatcher("mvc/Behinddesk.jsp").forward(request, response);
		} else {
			// 将用户信息存储在session对象中
			session.setAttribute("users", u);
			// 未登录的或者是普通用户则转发到前台界面
			request.getRequestDispatcher("#").forward(request, response);
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
		PageData<mUser> pd = us.getUsers(1, 1, "");
		int USER_ID = pd.getTotal() + 1;   //从用户表中获取用户的总数然后加一变成新加用户的编号（有缺陷，中间不能隔断）
		int USER_LEVEL = 1;  //用户权限（一般默认为普通用户，这句其实是多余的~~）
		String USER_LOVE = "";  //注册界面没有该窗口所以为空
		String USER_PHOTO = "";  //注册界面没有该窗口所以为空
		String USER_EMAIL = "";  //这句其实也是多余的，因为登录界面必须输入EMAIL地址才能注册成功
		String USER_NAME = request.getParameter("userName");  //从网页端获取用户名
		String USER_PWD = request.getParameter("userPwd");  //从网页端获取用户密码
		String userEmail = request.getParameter("userEmail");  //从网页端获取EMAIL地址
		if (null != userEmail) {
			USER_EMAIL = userEmail;
		}
		mUser users = new mUser(USER_ID, USER_NAME, USER_PWD, USER_LEVEL, USER_EMAIL, USER_LOVE, USER_PHOTO);

		boolean flag = us.addUsers(users);  //执行增加操作

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
		if ("au".equals(ap)) {   //当ap=au时，执行查询操作，判断用户名在数据库中是否存在
			String username = request.getParameter("username");
			mUser uss = us.getUserByName(username);
			if (null != uss) {
				out.print("用户名已存在！");
			}
		} else if ("aw".equals(ap)) {  //当ap=aw 时，判断两次输入的密码是否一致
			String password = request.getParameter("password");
			String repassword = request.getParameter("repassword");
			if (!password.equals(repassword)) {
				out.print("两次输入的密码不一致！请重新输入！");
			}
		} else if ("login".equals(ap)) {  //当ap=login时，执行登录操作，判断用户名和密码是否正确
			String userName = request.getParameter("userName");
			String userPwd = request.getParameter("userPwd");
			mUser u = us.login(userName, userPwd);
			if (null == u) {
				out.print("用户名或密码错误！");
			}
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
