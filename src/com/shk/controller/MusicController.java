package com.shk.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.shk.entity.Music;
import com.shk.entity.Song;
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
		//基本编码设置；
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		
		String op = "query";
		int page = 1;
		int pageSize = 1;
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
			
		
			if(null!=request.getParameter("musicId")) {
				
				int musicId =Integer.parseInt(request.getParameter("musicId"));
				
				List<Song> songList = (List<Song>)session.getAttribute("songList");
				String str = addSongToMyList(session,request, response, musicId, songList);
				System.out.println(str);
				request.setAttribute("autoPlay", true);
				request.setAttribute("data", str);
			} else {
				
				List<Song> songList = getMyList(page, pageSize, musicLike);
				String str = changToStr(songList);//我的音乐列表
				session.setAttribute("songList", songList);
				System.out.println("songList:"+str);
				request.setAttribute("autoPlay", false);
				request.setAttribute("data", str);
			}
			
			
			PageData<Music> pdRandom = getRandomMusic(2,12);//推荐音乐
			PageData<Music> pdNew = getRandomMusic(1,8);//新曲推荐
			request.setAttribute("pdNew", pdNew);
			
			request.setAttribute("pdRandom", pdRandom);
			
			request.getRequestDispatcher("jsps/NewFile.jsp").forward(request, response);
		}
		
		/**
		 * 后续添加
		 */
		/**
		 * 勾思奇：后续添加搜索得到分页歌单列表的方法
		 */
		else if("search".equals(op)) {
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
	 * 获得随机的推荐歌曲
	 * @param pageSize
	 */
	public static PageData<Music> getRandomMusic(int page,int pageSize) {
//		Random rd = new Random();
//		int page = rd.nextInt(5);
		
		PageData<Music> pd = ms.getMusic(page, pageSize, "");
		
		return pd;
		
	}
	
	/**
	 * 获得我的音乐列表的歌曲
	 * @param page
	 * @param pageSize
	 * @param musicLike
	 * @return
	 */
	public static List<Song> getMyList(int page,int pageSize,String musicLike) {
		PageData<Music> pd = ms.getMusic(page, pageSize, musicLike);
		List<Song> songList = ms.changeToSong(pd.getData());
		
		return songList;
	}
	
	/**
	 * 将List转换为Jplayer可接受的字符串格式
	 * @param songList
	 * @return
	 */
	public static String changToStr(List<Song> songList) {
		if(songList==null) {
			return null;
		}
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < songList.size(); i++) {
			sb.append("{");
			sb.append(songList.get(i).toString());
			if(i==(songList.size()-1)) {
				sb.append("}");
			} else {
				
				sb.append("},");
			}
		}
		sb.append("]");
		String str = new String(sb);
		
		return str;
	}
	
	public static String addSongToMyList(HttpSession session,HttpServletRequest request, HttpServletResponse response,int musicId,List<Song> songList) {
		System.out.println(request.getParameter("musicId"));
		int id =Integer.parseInt(request.getParameter("musicId"));
		Music music = ms.getMusicById(id);
		Song song = new Song(music.getmName(), music.getmUrl(), music.getmImg(), music.getSingerName());
		if(null!=songList) {
			songList.add(0, song);				
		}
		
		session.setAttribute("songList", songList);
		String str = changToStr(songList);
		return str;
	}

}
