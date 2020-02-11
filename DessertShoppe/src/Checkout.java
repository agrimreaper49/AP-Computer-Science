import java.util.ArrayList;

public class Checkout {
	private final double taxRate = .06;
	private ArrayList <DessertItem> items = new ArrayList <DessertItem>();
	private double cashRegister;
	
	
	Sundae sun = new Sundae ("Sundae" , 0.50);
	IceCream ice = new IceCream (0.25 , "IceCream");
	Cookie cookie = new Cookie ("Cookie" , 5 , 0.50);
	Candy candy = new Candy("Candy" , 0.50 , 2);

	
	public static void main(String[] args) {

	}
	
	public double enterItemsGetRegister() {
		items.add(sun);
		items.add(ice);
		items.add(cookie);
		items.add(candy);
		for ( int i = 0; i < items.size(); i++ ) {
			cashRegister += items.get(i).getCost();
		}
		System.out.println(cashRegister);
		return cashRegister;
	}
	public void clearRegister() {
		cashRegister = 0;
		items.clear();
	}
	public double getCostBeforeTax(){
		double total = enterItemsGetRegister();
		return total;
	}
	public double getTotalCostAfterTax() {
		double total = 0;
		total += enterItemsGetRegister() * this.taxRate;
		return total;
	}
	public double getEffectOfTax(){
		return enterItemsGetRegister() * this.taxRate;
	}
	public String toString() {
		String str = "";
		str += "The Dessert Shoppe\n------------------";
		str += cookie.returnNumber() + "@" + cookie.pricePerDozen() + "/dz" + "\n" +
				cookie.returnName() + cookie.returnNumber();
		str += candy.getWeight() + "lbs" + "@" + candy.getPricePerPound() + "/lb" +
				"/lb" + "\n" + candy.getName() + candy.getCost() + "\n";
		str += ice.getCost() + "lbs" + "\n" + ice.returnName() + ice.getCost() + "\n";
		str += sun.getCost() + "\n"  + sun.returnName() + "\n" + (ice.getCost() + sun.getCost()) + "\n";
		str += "----------------------------";
		str += "Number of items:" + 4 + "\n";
		str += "Subtotal: " + getCostBeforeTax();
		str += "Tax: " + getEffectOfTax() + "\n";
		str += "Total Cost: " + getTotalCostAfterTax();

		return str;
	}


}
