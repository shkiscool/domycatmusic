package com.shk.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shk.entity.Music;
import com.shk.service.MusicService;
import com.shk.serviceImpl.MusicServiceImpl;

/**
 * Servlet implementation class MusicController
 */
@WebServlet("/MusicController")
public class MusicController extends HttpServlet {
	MusicService ms = new MusicServiceImpl();
	
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
		//基本编码设置；
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		String op = "query";
		int page = 2;
		int pageSize = 15;
		String musicLike = "";
		
		if(null!=request.getParameter("op"))
		{
			//获取op的值
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
			
			
			String str = ms.changeToSongStr(ms.getMusic(page, pageSize, musicLike).getData());
			
			System.out.println(str);
			
			request.setAttribute("data", str);
			
			request.getRequestDispatcher("jsps/NewFile.jsp").forward(request, response);
		}
		
		/**
		 * 后续添加
		 */
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
