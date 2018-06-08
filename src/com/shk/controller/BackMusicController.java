package com.shk.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.shk.entity.Music;
import com.shk.entity.Users;
import com.shk.service.MusicService;
import com.shk.service.UsersService;
import com.shk.serviceImpl.MusicServiceImpl;
import com.shk.serviceImpl.UsersServiceImpl;
import com.shk.util.PageData;

/**
 * Servlet implementation class BackMusicController
 * ������̨�����������ֻ�й���Ա�ܽ���
 */

@WebServlet("/BackMusicController")
public class BackMusicController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    MusicService ms = new MusicServiceImpl();
    UsersService us = new UsersServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BackMusicController() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doSign(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    	
    }
    protected void doLogin(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    	
    }
    protected void doList(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    	request.getRequestDispatcher("music/MusicList.jsp").forward(request, response);
    	
    }
    protected void doAdd(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    	
    }
    protected void doDel(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    	
    }
    protected void doUpd(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    	
    }
    
    protected void doAjax(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String ap = request.getParameter("ap");
		PrintWriter out = response.getWriter();
		if("list".equals(ap)) {
			//ģ����ѯ�ĳ�ʼ����ֵΪ"";�������Բ�ѯ��������
			String musicNameLike = "";  
			//����ҳ�˻�ȡҳ��
			int	page = Integer.parseInt(request.getParameter("musicpage"));
			
			//����ҳ�˻�ȡ����Ա���õ�ÿҳ��������Ϣ
			int pageSize = Integer.parseInt(request.getParameter("pageSize"));

			//����ҳ�˻�ȡ����Ա��ѯ��ʹ�õĹؼ���
			if (null != request.getParameter("musicNameLike")) {
				musicNameLike = request.getParameter("musicNameLike");
			}

			PageData<Music> pd = ms.getMusic(page, pageSize, musicNameLike);

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		// ������ op ֵ������� list������ѯ
		String op = request.getParameter("op");
//		HttpSession session = request.getSession();
//		//�жϵ�¼
//		Object obj = session.getAttribute("users");
//		if(null != obj){
//			//�жϹ���ԱȨ�ޣ����ǹ���Ա����������²���
//			Users user = (Users)obj;
//			int level = user.getUSERLEVEL();
//			if(level==2){
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
//			}
//		}
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
