
public class Main {

	public static void main(String[] args) {

		Product product1 = new Product(); // constructor aslında burada çağrıldı!
		product1.setName("Urun1") ;
		product1.setId(1);
		product1.setDescription("Kahve Makinesi");
		product1.setPrice(4700);
		product1.setStockAmount(5);
		product1.setRenk("Kirmizi");
        //product1.getId();
		
		//System.out.println(getName(product1.name));
		//System.out.println(product1.renk);
		System.out.println(product1.getDescription());
		System.out.println(product1.getKod()); // bu metotta sadece get yazarak sadece kodu görsünler istedik.
		ProductManager productmanager = new ProductManager();
		productmanager.Add(product1);
		productmanager.Remove(product1);
		productmanager.Update(product1);

	}

}
