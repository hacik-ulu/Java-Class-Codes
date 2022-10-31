
public class Main {

	public static void main(String[] args) {

		DortIslem dortıslem = new DortIslem(); // classı kullanmak için referans oluşturuldu.
		int sonuc_topla=dortıslem.Topla(8, 6);
		System.out.println(sonuc_topla);
		
		int sonuc_cikar=dortıslem.Cikar(8, 6);
        System.out.println(sonuc_cikar);
        
		int sonuc_carp=dortıslem.Carp(4, 8);
        System.out.println(sonuc_carp);
        
		int sonuc_bol=dortıslem.Bol(8, 4);
		System.out.println(sonuc_bol);
	}

}
