package com.shk.listener;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

import com.shk.entity.mUser;

/**
 * 用户的监听器（防止用户重复登录）
 * 
 * @author Administrator
 *
 */
@WebListener
public class Listener implements HttpSessionAttributeListener {


	public static Map<String, HttpSession> loginUser = new HashMap<String, HttpSession>();  
	  
    // 用这个作为session中的key  
    public static String SESSION_LOGIN_NAME = "users"; 
    /**
     * Default constructor. 
     */
    public Listener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     * 向用户的Map集合中添加用户（如果存在先移除后添加）
     * 
     */
    public void attributeAdded(HttpSessionBindingEvent se)  { 
         // TODO Auto-generated method stub
    	if (se.getName().equals(SESSION_LOGIN_NAME)) {  
    		  
    		mUser u = (mUser) se.getValue();  
            HttpSession session = loginUser.remove(u.getUSER_NAME());  
            if (session != null) {  
                session.removeAttribute("users");  
            }  
            loginUser.put(u.getUSER_NAME(), se.getSession());  
        } 
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     * 在用户的Map集合中删除用户
     * 
     */
    public void attributeRemoved(HttpSessionBindingEvent se)  { 
         // TODO Auto-generated method stub
    	if (se.getName().equals(SESSION_LOGIN_NAME)) {  
            try {  
            	mUser u = (mUser) se.getSession().getAttribute("users");  
                loginUser.remove(u.getUSER_NAME());  
            } catch (Exception e) {  
                  
            }  
        }
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     * 在用户的Map集合中替换用户
     * 
     */
    public void attributeReplaced(HttpSessionBindingEvent se)  { 
         // TODO Auto-generated method stub
    	if (se.getName().equals(SESSION_LOGIN_NAME)) {  
    		  
    		mUser u = (mUser) se.getValue();  
            loginUser.remove(u.getUSER_NAME());   
            loginUser.put(u.getUSER_NAME(), se.getSession());  
        }  
    }
	
}
