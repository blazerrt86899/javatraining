/* Author: Romu Tiwari
 * Employee id: 844549
 * Created on: 08/01/2020
 * Time: 12:11am
 * Description: POJO class for Mail Login
 */
package com.in;

public class MailLogin {
	
	private static String mailVendor;
	private String userName;
	private String passWord;
	

//	No Arg Contructor
	public MailLogin() {
		
	}
	//Getter and Setters
	public static String getMailVendor() {
		return mailVendor;
	}
	public static void setMailVendor(String mailVendor) {
		MailLogin.mailVendor = mailVendor;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	
	//Parametrized Constructor
	public MailLogin(String userName, String passWord) {
		
		this.userName = userName;
		this.passWord = passWord;
	}
	
	
	
	

}
