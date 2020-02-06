
public class IceCream extends DessertItem {
	private double cost;
	private String name;
	
	public IceCream(double cost , String name ) {
		super(name);
		this.cost = cost;
	}

	@Override
	public double getCost() {
		return cost;
	}

	@Override
	public int compareTo(DessertItem o) {
		return (int) (this.getCost() - o.getCost());
		
	}
	public String returnName() {
		return this.name;
	}

}
