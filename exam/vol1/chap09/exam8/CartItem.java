package vol1.chap09.exam8;

public class CartItem {
	private String name;
	private double unitPrice;
	private int count;
	public double getItemPrice;
	
	public String getName() 
	{return name;}
	public void setName(String name) 
	{this.name = name;}
	public double getUnitPrice() 
	{return unitPrice;}
	public void setUnitPrice(double unitPrice) 
	{this.unitPrice = unitPrice;}
	public int getCount() 
	{return count;}
	public void setCount(int count) 
	{this.count = count;}
	public double getGetItemPrice() {
		return getItemPrice;
	}
	public void setGetItemPrice(double getItemPrice) {
		this.getItemPrice = getItemPrice;
	}
	public CartItem(String name, double unitPrice, int count) {
		super();
		this.name = name;
		this.unitPrice = unitPrice;
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "CartItem [name=" + name + ", unitPrice=" + unitPrice + ", count=" + count + "]";
	}

}
