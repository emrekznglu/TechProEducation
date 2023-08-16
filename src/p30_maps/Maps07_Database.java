package p30_maps;
import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

import java.util.HashMap;
import java.util.Map;

public class Maps07_Database {

	public static void main(String[] args) {
		
		String dosyaYolu= "‪C:\\Users\\emrek\\Masaüstü\\MapDatabase.csv";
		
		Map<String,String> veriMap = veriTabaniAl(dosyaYolu);
		System.out.println(veriMap);
		
	}

	@SuppressWarnings("resource")
	public static Map<String, String> veriTabaniAl(String dosyaYolu)  {
		
		Map<String,String> eklenecekMap =new HashMap<>();
		
			try {
				BufferedReader br=new BufferedReader(new FileReader(dosyaYolu));
				String satir=br.readLine();
				
				
				while(satir != null) {
					
					String keyValueArr[]=satir.split(",");
					eklenecekMap.put(keyValueArr[0], keyValueArr[1]);

					satir=br.readLine();
				}				
			} catch ( IOException e) {
				
				e.printStackTrace();
			}
		
		return eklenecekMap;
	}

}