
public class ProductManager {

	public void Add(Product product1) {
		//JDBC
		System.out.println("Urun Eklendi"+" "+product1.getName());
	}
	
	public void Remove(Product product1) {
		//JDBC
		System.out.println("Urun Silindi"+" "+product1.getName());
	}
	
	public void Update(Product product1) {
		//JDBC
		System.out.println("Urun Guncellendi"+" "+product1.getName());
	}
	

}
