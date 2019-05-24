package main;

public class main4 {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.setAccId("1233");
		acc.setBalance(500.5);
		System.out.println(acc.getAccId());
		System.out.println(acc.getBalance());
		
		Customer cus = new Customer();
		cus.setId("123");
		cus.setName("Neng");
		cus.setAddress("Kalasin");
		
		cus.setAcc(acc);
		
		System.out.println(cus.getAddress()+cus.getName()+cus.getAcc().getBalance());
		
	}

}

