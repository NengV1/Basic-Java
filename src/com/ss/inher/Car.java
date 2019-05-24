package com.ss.inher;

public class Car {

		private int speed;
		private String color;
		private String model;
		public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		
}


class Honda extends Car{
	
}


class Toyota extends Honda{
	
	private String engineType;

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
		
}

class Camry extends Toyota {
	
	private boolean autoDrive = true;

	public boolean isAutoDrive() {
		return autoDrive;
	}

	public void setAutoDrive(boolean autoDrive) {
		this.autoDrive = autoDrive;
	}
	
	
}

