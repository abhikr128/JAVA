package test;

public class Paytm implements UPIPayments{
	
	@Override
	public String doPayments(String src, String dest) {
		UPIPayments.datePatterns("DD-MM-YYYY");
		return null;
	}
	
	@Override
	public double getScratchCard() {
		return UPIPayments.super.getScratchCard();
	}

}
