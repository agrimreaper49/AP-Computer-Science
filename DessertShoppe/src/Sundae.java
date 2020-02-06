
public class Sundae extends IceCream {
	private double cost;
	private String name;
	private IceCream iceCream;
	Sundae sun = new Sundae("Sundae" , this.getCost());
	public Sundae (String name , double cost ) {
		super(cost ,name);
	}
	public double getCost() {
		return iceCream.getCost() + cost;
	}
	@Override
	public int compareTo(DessertItem o) {
		return iceCream.compareTo(sun);
	}

}
