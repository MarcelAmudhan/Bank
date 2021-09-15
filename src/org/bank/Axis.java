package org.bank;

public class Axis extends BankData {
	private void accountNo() {

System.out.println("23456567788");
	}
	private void acHolderName() {

		System.out.println("Ajith Prasanna");
	}
private void ifsc() {
	
System.out.println("0122");
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
