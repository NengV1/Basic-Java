package com.ss.poltmor;

import javax.print.attribute.standard.MediaSize.Engineering;

public class main6 {

	public static void main(String[] args) {
	
		Employee [] myem = new Employee[2];
		myem[0] = new Manager("123",25000,"Neng","IT");
		myem[1] = new Programmer("123",25000,"Neng JAVA DEV","Payment");
		
		for (Employee myes : myem){
		System.out.println(myes.getDetail());	
		}
		}

}
