package p23_errorsGarbageCollector;

import java.sql.Date;

public class CheckMemory {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// gc() metodu ile JVM e istekte bulunuruz ve istegimizin dikkate alinmasinin veya sonuclarinin garantisi yoktur!
		Runtime rt = Runtime.getRuntime(); 

		System.out.println("Total Memory:"+rt.totalMemory());
		System.out.println("Loop'tan once Free Memory:"+rt.freeMemory());

		Date d=null;
		//Bu adimda cilginca Date objesi olusturalim :)
		for(int i=0; i<100000; i++){
			d= new Date(i);
			d=null;
		}
		//Deli gibi Date objesi olusturduk simdi freeMemory metodunu tekrar cagiralim
		System.out.println("After loop Free Memory:"+rt.freeMemory());

		//rt referans degiskeni ile JVM e garbage collector u calistirma isteginde bulunalim.
		rt.gc(); // ya da System.gc();
		System.out.println("After GarbageCollector Free Memory:"+rt.freeMemory());
	}

	// Bendeki ornek cikti su sekilde, calistirdiginizda sizde farkli olacaktir GC tum olusturalan objeleri silmeyi garanti etmedigi icin 
	// After GC Free Memory farkliliklar gosterebilir.

	//Total Memory:266338304
	//Free Memory:264492480
	//After Free Memory:262144000
	//After GarbageCollector Free Memory:7746288

}