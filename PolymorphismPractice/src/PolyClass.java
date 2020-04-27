public class PolyClass {
    public static void main (String [] args){
        Car newCar =  new Toyota("Tacoma", 2020);
        ((Toyota)newCar).drive(50);
        Garage mCar = new Car();
        ((Toyota)mCar).drive();
    }
}
class Car implements Garage{
    public void drive(){
        System.out.println("Drive method of Car");
    }

}
class Toyota extends Car{
    private String name = "";
    private int year = 0;
    private boolean isDriving;

    public Toyota(String name, int year){
        this.name = name;
        this.year = year;
    }

    public void drive(int n){
        isDriving = true;
        for ( int i = 0; i < n; i++ ){
            i++;
        }
        System.out.println("Drive Complete, drove for " + n + " miles");
    }
}
public interface Garage {
    void shutdown();
}
