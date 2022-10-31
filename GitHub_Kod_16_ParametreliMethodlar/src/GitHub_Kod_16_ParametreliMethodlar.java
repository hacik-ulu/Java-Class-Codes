
public class GitHub_Kod_16_ParametreliMethodlar {

	public static void main(String[] args) {

		//String mesaj ="Bugün hava çok güzel!";
		  String yeniMesaj = sehirDondur();
		  System.out.println(yeniMesaj);
		  int sayi = topla(5,7);
		  System.out.println(sayi);
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}
	
	public static void sil() {
		System.out.println("Silindi");
        return; // bitiş
		
	}
	
	public static void güncelle() {
		System.out.println("Güncellendi");

	}
	
	public static int topla(int sayi1,int sayi2) {
		int sonuc = 0;
		sonuc = sayi1+sayi2;
		return sonuc;
	}
	
	public static String sehirDondur() {
		return "ISTANBUL";
	}
}
