package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();

	}//camelCase
    public static void sayiBulmaca() {
    	int[] sayilar= new int[] {1,2,5,7,9,0};
    	int aranacak=6;
    	boolean varMi= false;
    	
    	for (int sayi: sayilar) {
    		if (sayi==aranacak) {
    			varMi=true;
    			break;
    		}
    		
    	}
    	String mesaj="";
    	if (varMi) {
    		mesaj="sayi mevcuttur"+aranacak;
    		mesajver(mesaj);
    	}else {
    		mesajver("sayi mevcut değildir"+ aranacak);
    		
    	}
    }
    public static void mesajver (String mesaj) {
    	System.out.println(mesaj);
    	
    }
}
