package com.sc;

import com.sa.Student;
import com.sb.A;
import com.sb.B;

public class Test {

	public static void main(String[] args) {
		
		Student s=new Student("aa");
		System.out.println(s.show());
		
		A s1 = new A("a1",80);
		System.out.println(s1.show());
		System.out.println(s1.getChi());
		
		B s2 = new B("a2",70);
		System.out.println(s2.show());
		System.out.println(s2.getName());
		

	}

}
