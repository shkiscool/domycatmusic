package com.shk.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.shk.entity.Music;
import com.shk.service.MusicService;
import com.shk.serviceImpl.MusicServiceImpl;
import com.shk.util.PageData;

/**
 * Servlet implementation class MusicController
 */
@WebServlet("/MusicController")
public class MusicController extends HttpServlet {
	static MusicService ms = new MusicServiceImpl();
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MusicController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//�����������ã�
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		String op = "query";
		int page = 1;
		int pageSize = 12;
		String musicLike = "";
		
		if(null!=request.getParameter("op"))
		{
			//��ȡop��ֵ
			op = request.getParameter("op");
		}

		if("query".equals(op)) {
			
			if(null!=request.getParameter("page"))
			{
				page =Integer.parseInt(request.getParameter("page"));
			}
			if(null!=request.getParameter("pageSize"))
			{
				pageSize =Integer.parseInt(request.getParameter("pageSize"));
			}
			if(null!=request.getParameter("musicLike"))
			{
				musicLike = request.getParameter("musicLike");
			}
			
			String str = getMyList(page, pageSize, musicLike); //�ҵ������б�
			PageData<Music> pdRandom = getRandomMusic(pageSize);//�Ƽ�����
			PageData<Music> pdNew = getRandomMusic(8);//�����Ƽ�
			request.setAttribute("pdNew", pdNew);
			request.setAttribute("data", str);
			request.setAttribute("pdRandom", pdRandom);
			
			request.getRequestDispatcher("jsps/NewFile.jsp").forward(request, response);
		}
		
		/**
		 * �������
		 */
		/**
		 * ��˼�棺������������õ���ҳ�赥�б�ķ���
		 */
		if("search".equals(op)) {
			if(null!=request.getParameter("page"))
			{
				page =Integer.parseInt(request.getParameter("page"));
			}
			if(null!=request.getParameter("pageSize"))
			{
				pageSize =Integer.parseInt(request.getParameter("pageSize"));
			}
			String keyword = request.getParameter("keyword");
			PageData<Music> pd = ms.getMusic(page, pageSize, keyword);
			Gson gson = new Gson();
			String data = gson.toJson(pd);
			System.out.println(data);
			out.print(data);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	/**
	 * ���������Ƽ�����
	 * @param pageSize
	 */
	public static PageData<Music> getRandomMusic(int pageSize) {
		Random rd = new Random();
		int page = rd.nextInt(100);
		
		PageData<Music> pd = ms.getMusic(page, pageSize, "");
		
		return pd;
		
	}
	
	/**
	 * ����ҵ������б�ĸ���
	 * @param page
	 * @param pageSize
	 * @param musicLike
	 * @return
	 */
	public static String getMyList(int page,int pageSize,String musicLike) {
		PageData<Music> pd = ms.getMusic(page, pageSize, musicLike);
		String str = ms.changeToSongStr(pd.getData());
		System.out.println(str);
		return str;
	}

}
