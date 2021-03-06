package Sprint2_Day1;
import java.util.ArrayList;
import java.util.Date;

public class Order extends ProductForm{

	private Supplier supplier;
	
	public Order(int id, ArrayList<Product> products, Date date, boolean isDelivered){
		super(id, products, date, isDelivered);
		this.supplier = products.get(0).getSupplier();	
	}
	
	public void printDetails(){
		
		System.out.println();
		System.out.println("***Order details***");
		
		for (Product p: getProducts()){
			System.out.println("Name of product: " + p.getName() + ", product SKU: " + p.getSku() + ", product quantity: " + p.getQuantity());
			
		}
			System.out.println("Supplier: " + supplier.getID());			
	
	}
	
	public Supplier getSupplier() {
		return supplier;
	}

	public void setSuppliers(Supplier supplier) {
		this.supplier = supplier;
	}	
	
}
