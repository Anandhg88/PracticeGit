package org.accdetails;

public class ICICI extends MyDetails {
	private void ifsc() {
		System.out.println("IFSC code: AAAA");

	}
	private void BranchName() {
		System.out.println("Branch Name: AAAA");

	}
	private void branchAddress() {
		System.out.println("Branch Address: AAAA");

	}
	public static void main(String[] args) {
		ICICI icici = new ICICI();
		icici.ifsc();
		icici.branchAddress();
		icici.BranchName();
	}
	

}
