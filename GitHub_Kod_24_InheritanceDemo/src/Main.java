
public class Main {

	public static void main(String[] args) {

		//OgretmenKrediManager ogretmenkredimanager = new OgretmenKrediManager();
		//ogretmenkredimanager.Hesapla();

		KrediUI krediui = new KrediUI();
		krediui.KrediHesapla(new OgretmenKrediManager());
		krediui.KrediHesapla(new AskerKrediManager());
		krediui.KrediHesapla(new TarimKrediManager());

	}

}
