/* Author: Romu Tiwari
 * Employee id: 844549
 * Created on: 08/01/2020
 * Time: 12:11am
 * Description: Login POJO Implementation
 */
package com.in;

public class MailLoginTest {

	public static void main(String[] args) {
		
		
		MailLogin mg1 = new MailLogin();
		MailLogin mg2 = new MailLogin();
		MailLogin mg3 = new MailLogin();
		
		//setting values
		mg1.setUserName("HeyImRomu");
		mg1.setPassWord("hello");
		MailLogin.setMailVendor("Gmail");
		
		//getting values
		System.out.println("Username 1 is: "+mg1.getUserName());
		System.out.println("Password is: "+mg1.getPassWord());
		System.out.println("Mail vendor is: "+MailLogin.getMailVendor());
		
		mg2.setUserName("blazerRt");
		mg2.setPassWord("root");
		System.out.println("Username 2 is: "+mg2.getUserName());
		System.out.println("Password is: "+mg2.getPassWord());
		System.out.println("Mail vendor is: "+MailLogin.getMailVendor());
		
		mg3.setUserName("pegasusRt");
		mg3.setPassWord("growMore");
		System.out.println("Username 3 is: "+mg3.getUserName());
		System.out.println("Password is: "+mg3.getPassWord());
		System.out.println("Mail vendor is: "+MailLogin.getMailVendor());
		
		

	}

}
