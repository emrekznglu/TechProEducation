package p16_dateTime;

import java.time.LocalDateTime;

public class LocalDateTime01 {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt); // 2023-05-20T17:26:47.192167700
		
		System.out.println(ldt.toString()); // 2023-05-20T17:26:47.192167700
		
		String time=ldt.toString();			
		System.out.println(time.startsWith("2023")); // True
	}

}
