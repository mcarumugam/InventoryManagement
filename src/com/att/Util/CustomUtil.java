package com.att.Util;

import com.opensymphony.xwork2.ActionSupport;

public class CustomUtil {
	
	public static boolean validLogin(String username, String password) {
		ActionSupport actionSupport = new ActionSupport();
		if((username.equals(actionSupport.getText("username.one")) &&  password.equals(actionSupport.getText("password.one")))
		||  (username.equals(actionSupport.getText("username.two")) && password.equals(actionSupport.getText("password.two")))){
			return true;
		}
		return false;
	}

}
