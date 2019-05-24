package com.ss.inher;

import java.util.Set;

public class main5 {

	public static void main(String[] args) {
	
		
		Car c = new Car();
		c.setColor("red");
		c.setModel("sport");
		c.setSpeed(100);
		
		Honda h = new Honda();
		h.setSpeed(200);
		h.setColor("bronz");
		h.setModel("CRV");
		
		Toyota t = new Toyota();
		t.setEngineType("IV");
	
		Camry cam = new Camry();
		cam.setAutoDrive(true);
		cam.setColor("Yello");
		
		
		
	
	}

}
