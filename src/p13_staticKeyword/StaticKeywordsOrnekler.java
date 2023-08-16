package p13_staticKeyword;

public class StaticKeywordsOrnekler {
int count;
static int stCount;

    public StaticKeywordsOrnekler() {
     count++;
     stCount++;
}
    
    public int getCount() {
    return count;
    }
    
    public static int GetStCount() {
    return stCount;	
    }
	
    public static void main(String[] args) {
		
    /* StaticKeywordsOrnekler cs1 = new StaticKeywordsOrnekler();
    	StaticKeywordsOrnekler cs2 = new StaticKeywordsOrnekler();
    	StaticKeywordsOrnekler cs3 = new StaticKeywordsOrnekler();
    	StaticKeywordsOrnekler cs4 = new StaticKeywordsOrnekler();
    	StaticKeywordsOrnekler cs5 = new StaticKeywordsOrnekler();
    	StaticKeywordsOrnekler cs6 = new StaticKeywordsOrnekler();
    */
    	// System.out.println("Count is: "+cs1.getCount()); // 1 
    	// System.out.println("stCount is: "+cs1.GetStCount()); // 6
    	
    	// System.out.println("Count is: "+cs6.getCount()); // 1
		// System.out.println("stCount is: "+cs6.GetStCount()); // 6
	
	}

}
