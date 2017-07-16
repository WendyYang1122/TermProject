package org.fkit.service;
 
import javax.servlet.http.HttpSessionEvent; 
import javax.servlet.http.HttpSessionListener; 

public class SessionListener implements HttpSessionListener { 

	 private static int activeSessions = 0;
	    //session创建时执行
	    public void sessionCreated(HttpSessionEvent se) {
	        activeSessions++;
	        se.getSession().getServletContext().setAttribute("count", activeSessions);
	    }
	    //session销毁时执行
	    public void sessionDestroyed(HttpSessionEvent se) {
	        if (activeSessions > 0)
	            activeSessions--;
	        se.getSession().getServletContext().setAttribute("count", activeSessions);
	    }
	    //获取活动的session个数(在线人数)
	    public static int getActiveSessions() {
	        return activeSessions;
	        
	    }
} 