package main;

public class Account {

	private String accId;
	private double balance;
	
	
	public String getAccId() {
		return accId;
	} 
	public void setAccId(String accId) {
		this.accId = accId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance >= 0){
		this.balance = balance;
		}
	}
	
}

class Customer{
	
	private String id;
	private String name;
	private String address;
	private Account acc;
	
	
	
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
