
public class Main {

	public static void main(String[] args) {

		Product product1 = new Product(id:1,name:"Kahve Makinesi",description:"Urun",price:4500,stockAmount:4,renk:"Kirmizi"); // constructor aslında burada çağrıldı!
		
		
		System.out.println(getName(product1.name));
		System.out.println(product1.renk);
		System.out.println(product1.getDescription());
		System.out.println(product1.getKod()); // bu metotta sadece get yazarak sadece kodu görsünler istedik.
		ProductManager productmanager = new ProductManager();
		productmanager.Add(product1);
		productmanager.Remove(product1);
		productmanager.Update(product1);*/
		
		System.out.println(product1.getKod());

	}

}
