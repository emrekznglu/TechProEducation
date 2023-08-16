package p13_staticKeyword;
public class StaticKeyword2Ornek {
	
	static int x;
	int y;
	
	StaticKeyword2Ornek(){
	x+=2;
	y++;
	}
	
	static int getSquare() {
	return x*x;	
	}
	
	public static void main(String[] args) {
		
		StaticKeyword2Ornek sm1= new StaticKeyword2Ornek();
		StaticKeyword2Ornek sm2= new StaticKeyword2Ornek();
		
		@SuppressWarnings("static-access")
		int z= sm1.getSquare();
		
		System.out.println("-x"+z+"-y"+sm2.y); // -x16-y1
		
	}

}
