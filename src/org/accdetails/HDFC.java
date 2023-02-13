package org.accdetails;

public class HDFC extends MyDetails {
	private void ifsc() {
		System.out.println("IFSC Code: 8765");

	}
	private void branchName() {
		System.out.println("Branch Name: AAAA");

	}
	private void branchAddress() {
		System.out.println("Branch Address: aaaa, bbbb, cccc");

	}
public static void main(String[] args) {
	HDFC hdfc = new HDFC();
	hdfc.branchAddress();
	hdfc.branchName();
	hdfc.ifsc();
}
}
