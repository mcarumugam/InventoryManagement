package com.att.action;

import com.att.Util.CustomUtil;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String username;
	private String password;
	
	 
	public String execute() {

		if (CustomUtil.validLogin(username, password)) 
	   {
			return SUCCESS;
		} else {
			addActionError(getText("error.login"));
			return ERROR;
		}
	 
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
