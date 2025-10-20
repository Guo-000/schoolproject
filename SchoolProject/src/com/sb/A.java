package com.sb;

import com.sa.Student;
import com.sa.Student2;
/**
 * @version 1.0
 * @author teacher
 * <h3>學員管理系統</h3>
 */
public class A extends Student implements Student2{
	
	private int chi;
	
	/**
	 * 
	 * @param name 輸入姓名
	 * @param chi 輸入國文分數
	 * <br>
	 * 例如:<br>
	 * A a=new A("teacher",100);
	 * 
	 */
	
	public A(String name,int chi) {
		super(name);
		this.chi=chi;
	}
	public int getChi() {
		return chi;
	}
	public void setChi(int chi) {
		this.chi = chi;
	}
	@Override
	public String skill() {
		// TODO Auto-generated method stub
		return "A skill";
	}
	@Override
	public String show() {
		// TODO Auto-generated method stub
		return super.show()+"國文:"+chi;
	}
	
	
	

}
