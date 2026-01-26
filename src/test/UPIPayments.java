package test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public interface UPIPayments {
	
	String doPayments(String src, String dest);
	
	default double getScratchCard() {
		return new Random().nextDouble();
	}
	
	static String datePatterns(String patterns) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(patterns);
		return dateFormat.format(new Date());
	}	
}
