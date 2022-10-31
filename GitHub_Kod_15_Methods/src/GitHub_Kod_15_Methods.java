
public class GitHub_Kod_15_Methods {

	public static void main(String[] args) {

		sayiBulmaca();
		sayiBulmaca();
		}

	//camel casing
	public static void sayiBulmaca() {// Fonksiyon - metod tanımlama
	int sayilar[]= {1,2,3,4,5,6,7};
	int aranacak_sayi=97;
	boolean mevcut_mu=false; // mevcut değil
	

	for(int i:sayilar) {
		if(i==aranacak_sayi) {
			mevcut_mu=true;
			break;
		}else {
			mevcut_mu=false;
		}
	}
	
	String mesaj ="";
	if(mevcut_mu==true) {
	  mesaj = "sayi mevcuttur"+aranacak_sayi;
	  mesajVer(mesaj);
		
	} else {
		System.out.println("sayi mevcut degil!: "+aranacak_sayi);
	}

  }
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
