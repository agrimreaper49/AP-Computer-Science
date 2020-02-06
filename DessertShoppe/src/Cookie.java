
public class Cookie extends DessertItem {
	private int number;
	private double pricePerDozen;
	private String string;

	public Cookie(String string, int number , double pricePerDozen ) {
		this.string = string;
		this.number = number;
		this.pricePerDozen = pricePerDozen;
	}
	@Override
	public int compareTo(DessertItem o) {
		return (int) (this.getCost() - o.getCost());
	}

	@Override
	public double getCost() {
		return (number * pricePerDozen) * 10;
	}
	public int returnNumber() {
		return this.number;
	}
	public double pricePerDozen() {
		return this.pricePerDozen;
	}

}
