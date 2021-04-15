package Week02;

import java.time.*;

public class CertOfDeposit {

	private int certificateNo;
	private String lastname;
	private double balance;
	private LocalDate issuedate, maturitydate ;
	
	public CertOfDeposit(int certificateNo, String lastname, double balance, LocalDate issuedate) {
		this.balance=balance;
		this.certificateNo=certificateNo;
		this.balance = balance;
		this.issuedate = issuedate;
		
		
		
	}
	
	
	


	public int getCertificateNo() {
		return certificateNo;
	}
	public void setCertificateNo(int certificateNo) {
		this.certificateNo = certificateNo;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public LocalDate getToday() {
		return issuedate;
	}
	public void setToday(LocalDate issuedate) {
		this.issuedate = issuedate;
	}
	

}
