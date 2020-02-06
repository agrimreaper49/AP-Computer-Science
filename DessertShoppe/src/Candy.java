
public class Candy extends DessertItem {
	
	private double weight;
	private double pricePerPound;
	private String string;

	public Candy (String string, double weight , double pricePerPound ){
		this.string = string;
		this.weight = weight;
		this.pricePerPound = pricePerPound;
	}
	public double getCost() {
		return (weight * pricePerPound) * 100;
	}
	@Override
	public int compareTo(DessertItem o) {
		return (int) (this.getCost() - o.getCost());
	}
	public double getWeight() {
		return this.weight;
	}
	public double getPricePerPound() {
		return this.pricePerPound;
	}
	public String getName() {
		return this.string;
	}

}
