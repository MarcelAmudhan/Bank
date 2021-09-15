package org.bank;

public class Axis extends BankData {
	private void accountNo() {
<<<<<<< HEAD
		
System.out.println("23456567788");
	}
	private void holderName() {
		
System.out.println("Sumathi");
	}
private void ifsc() {
	
System.out.println("2222");
=======

System.out.println("23456567788");
	}
	private void acHolderName() {

		System.out.println("Ajith Prasanna");
	}
private void ifsc() {
	
System.out.println("0122");
>>>>>>> d7624f9dcc9cac4a6fe9b56d8da9550ebdb6c006
}
public static void main(String[] args) {
	Axis a=new Axis();
	a.accountNo();
	a.ifsc();
	a.acctName();
	a.address();
	a.adhar();
	a.phone();
}
}
