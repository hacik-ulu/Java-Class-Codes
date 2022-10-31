
public class Product {

	public Product() { // constructor-yapıcı
		System.out.println("Yapici blok calistirildi");
	}
	//  attribute | field
	private int id; // private sadece tanımlandığı blokta geçerlidir.(Şu anda sadece Productta geçerli)
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
		
	}
	public String getKod() {
		return this.name.substring(0, 1)+id;

	}
	

	
	
	
	
	
	
}	