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
 * �û���˿�����
 * 
 * @author ���� 2018/6/2 20:00
 *
 */
@WebServlet("/UsersController")
public class UsersController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// ����Service����
	UsersService us = new UsersServiceImpl();
	public static Map<String, String> Nomalform = new HashMap<String, String>();
	private static String USER_PHOTO = "";

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response) �ж�ִ���ĸ�����
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// TODO Auto-generated method stub

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		// ������ op ֵ������� list������ѯ
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
	 * ִ���û����޸Ĳ���
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

		// ��������Ƿ���multipart/form-data����
		if (!ServletFileUpload.isMultipartContent(request)) { // ����multipart/form-data����
			throw new RuntimeException("����enctype���Բ���multipart/form-data���ͣ���");
		}

		// �����ϴ�����Ҫ����������
		DiskFileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload sfu = new ServletFileUpload(factory); // �����������ڹ���

		// �������������ܽ���������
		List<FileItem> items = new ArrayList<FileItem>();
		// ���ϴ����ļ���Ϣ����������
		try {
			items = sfu.parseRequest(request);
		} catch (FileUploadException e) {
			e.printStackTrace();
		}

		// ��������,�������������;��װ����������һ��������ͨ����һ�������ļ��ı���
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
	 * ִ���û���ɾ������
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doDel(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userId = request.getParameter("userId"); // ����ҳ�˻�ȡ����Ա��Ҫɾ���û���ID
		boolean flag = us.delUsers(Integer.parseInt(userId));
		PrintWriter out = response.getWriter();
		if (flag) {
			out.print("true");
		}
		out.close();
	}

	/**
	 * ִ���û������Ӳ���
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doAdd(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PageData<Users> pd = us.getUsers(1, 1, "");
		int USER_ID = pd.getTotal() + 1; // ���û����л�ȡ�û�������Ȼ���һ����¼��û��ı�ţ���ȱ�ݣ��м䲻�ܸ��ϣ�
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		// ��������Ƿ���multipart/form-data����
		if (!ServletFileUpload.isMultipartContent(request)) { // ����multipart/form-data����
			throw new RuntimeException("����enctype���Բ���multipart/form-data���ͣ���");
		}

		// �����ϴ�����Ҫ����������
		DiskFileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload sfu = new ServletFileUpload(factory); // �����������ڹ���

		// �������������ܽ���������
		List<FileItem> items = new ArrayList<FileItem>();
		// ���ϴ����ļ���Ϣ����������
		try {
			items = sfu.parseRequest(request);
		} catch (FileUploadException e) {
			e.printStackTrace();
		}

		// ��������,�������������;��װ����������һ��������ͨ����һ�������ļ��ı���
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
	 * ������ͨ�ı���
	 * 
	 * @param item
	 */
	private void handleFormField(FileItem item) {
		String fieldName = item.getFieldName(); // �õ������name��ֵ
		String value = "";
		try {
			value = item.getString("utf-8"); // �õ���ͨ�������������ֵ
			Nomalform.put(fieldName, value);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	/**
	 * �����ļ��ı���
	 * 
	 * @param item
	 */
	private void handleUploadField(FileItem item) {
		String fileName = item.getName(); // �õ��ϴ��ļ����ļ���
		if (fileName != null && !"".equals(fileName)) {
			// ����ֻ���ϴ�ͼƬ
			if (!item.getContentType().startsWith("image")) {
				return;
			}
		}

		// �ϴ��ļ��洢·��
		String path = "E:/upload/images";
		// ������Ŀ¼
		File childDirectory = getChildDirectory(path);

		// д����������ߴ���
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
	 * ����ʱ�䴴����Ŀ¼����ֹһ��Ŀ¼���ļ����࣬�������Ժ��������
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
	 * ִ���û��ķ�ҳ��ѯ����
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
	 * ִ���û��ĵ�¼����
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
		// ����userService�ķ���
		Users u = us.getUserByName(userName);
		System.out.println(u);
		if (u.getUSERLEVEL() == 2) {
			// ���û���Ϣ�洢��session������
			session.setAttribute("users", u);
			// ת�����û���̨
			request.getRequestDispatcher("mvc/Behinddesk.jsp").forward(request, response);
		} else {
			// ���û���Ϣ�洢��session������
			session.setAttribute("users", u);
			// δ��¼�Ļ�������ͨ�û���ת����ǰ̨����
			response.sendRedirect("MusicController");
		
		}
	}

	/**
	 * ִ���û���ע�����
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doSign(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PageData<Users> pd = us.getUsers(1, 1, "");
		int USER_ID = pd.getTotal() + 1; // ���û����л�ȡ�û�������Ȼ���һ����¼��û��ı�ţ���ȱ�ݣ��м䲻�ܸ��ϣ�
		int USER_LEVEL = 1; // �û�Ȩ�ޣ�һ��Ĭ��Ϊ��ͨ�û��������ʵ�Ƕ����~~��
		String USER_LOVE = ""; // ע�����û�иô�������Ϊ��
		String USER_PHOTO = ""; // ע�����û�иô�������Ϊ��
		String USER_SEX = "��";
		String USER_BIRTHDAY = "2000/01/01";
		String USER_EMAIL = ""; // �����ʵҲ�Ƕ���ģ���Ϊ��¼�����������EMAIL��ַ����ע��ɹ�
		String USER_NAME = request.getParameter("userName"); // ����ҳ�˻�ȡ�û���
		String USER_PWD = request.getParameter("userPwd"); // ����ҳ�˻�ȡ�û�����
		String userEmail = request.getParameter("userEmail"); // ����ҳ�˻�ȡEMAIL��ַ
		if (null != userEmail) {
			USER_EMAIL = userEmail;
		}

		Users users = new Users(USER_ID, USER_NAME, USER_PWD, USER_LEVEL, USER_EMAIL, USER_LOVE, USER_PHOTO, USER_SEX,
				USER_BIRTHDAY);

		boolean flag = us.addUsers(users); // ִ�����Ӳ���

		request.setAttribute("Usignflag", flag);
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	/**
	 * ִ��ajax����,�ڵ�¼�ɹ�֮ǰ,ʵ�ֶ��û���ʾ�ľֲ�ˢ��;�������˵�¼ҳ���ע��ҳ�棩
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
		if ("au".equals(ap)) { // ��ap=auʱ��ִ�в�ѯ�������ж��û��������ݿ����Ƿ����
			String username = request.getParameter("username");
			Users uss = us.getUserByName(username);
			if (null != uss) {
				out.print("�û����Ѵ��ڣ�");
			}
		} else if ("aw".equals(ap)) { // ��ap=aw ʱ���ж���������������Ƿ�һ��
			String password = request.getParameter("password");
			String repassword = request.getParameter("repassword");
			if (!password.equals(repassword)) {
				out.print("������������벻һ�£����������룡");
			}
		} else if ("login".equals(ap)) { // ��ap=loginʱ��ִ�е�¼�������ж��û����������Ƿ���ȷ
			String userName = request.getParameter("userName");
			String userPwd = request.getParameter("userPwd");
			Users u = us.login(userName, userPwd);
			if (null == u) {
				out.print("�û������������");
			} else {
				out.print("true");
			}
		} else if ("list".equals(ap)) {
			// ģ����ѯ�ĳ�ʼ����ֵΪ"";�������Բ�ѯ��������
			String userNameLike = "";
			// ����ҳ�˻�ȡҳ��
			int page = Integer.parseInt(request.getParameter("Userpage"));

			// ����ҳ�˻�ȡ����Ա���õ�ÿҳ��������Ϣ
			int pagesize = Integer.parseInt(request.getParameter("pagesize"));

			// ����ҳ�˻�ȡ����Ա��ѯ��ʹ�õĹؼ���
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
