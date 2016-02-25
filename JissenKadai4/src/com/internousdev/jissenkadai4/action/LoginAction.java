package com.internousdev.jissenkadai4.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.jissenkadai4.dao.LoginDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internous
 *
 */
public class LoginAction extends ActionSupport implements SessionAware{
	// login.jspの<s:~~~>のname属性で指定した名前とフィールド名を一致させることで、入力されてきたデータが受け取れる
	private String userId;
	private String password;
	private Map<String,Object> session;


	public String execute() {
		LoginDAO dao = new LoginDAO();

		boolean ret = dao.select(userId, password);
		if(ret==false){
			return ERROR;
		}
		System.out.println(dao.getAdmin_name());
		session.put("user_name",dao.getAdmin_name());
		return SUCCESS;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}