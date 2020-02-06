
public abstract class DessertItem implements Comparable {
	
	private String nameOfDessert;
	
	public DessertItem() {
		nameOfDessert = "";
	}
	
	public DessertItem( String name ) {
		this.nameOfDessert = name;
	}
	
	public String returnName() {
		return this.nameOfDessert;
	}
	
	public abstract double getCost();
	
	
	@Override
	public int compareTo(Object o) {
		return 0;
	}
	
	public abstract int compareTo(DessertItem o);

}
