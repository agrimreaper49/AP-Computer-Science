import java.util.Scanner;
public class ScanType {
    public static void main (String [] args) {
       firstMethod();
       secondMethod();
    }
    public static void firstMethod() {
        System.out.println("Statistics Program\n-------------------\nHow many numbers would you like to enter?");
        Scanner scan = new Scanner (System.in);
        if (scan.hasNextInt()) {
            int num = scan.nextInt();
            double mean = 0;
            double sum = 0;
            int [] arr = new int [num];
            
            for ( int i = 0; i < num; i++) {
                System.out.println("Enter number " + (i + 1) + ": ");
                if (scan.hasNextInt()) {
                    arr[i] = scan.nextInt();
                }
                else {
                    System.out.println("This won't work, please try again");
                }
            }
            System.out.println("-----------------\nStatistical Calculations are: ");
            for ( int k = 0; k < arr.length; k++ ) {
                sum += arr[k];
            }
            mean = sum / arr.length;
            
            System.out.println("\tSum: " + sum);
            System.out.println("\tMean: " + mean);
        
        }
    }
    public static void secondMethod() {
        System.out.println("Star Wars Name");
        System.out.println("------------------");
        Scanner scan = new Scanner (System.in);
        String first, last, middle, town;
        
        String newName = "";
        String newLastName = "";
       
        System.out.println("What is your last name?");
        last = scan.next();
        if ( last.length() < 3 ) {
            last = last.substring(0);
            newName += last.toUpperCase();
        }
        else {
            last = last.substring(0 , 3);
            newName += last.toUpperCase();
        }
        System.out.println("What is your first name?");
        
        first = scan.next();
        if ( first.length() < 2 ) {
            first = first.substring(0);
            newName += first.toUpperCase();
        }
        else {
            first = first.substring(0 , 2);
            newName += first.toUpperCase();
        }
        System.out.println("What is your middle name?");
        middle = scan.next();
        if ( middle.length() < 2 ) {
            middle = middle.substring(0);
            newLastName += middle.toUpperCase();
        }
        else {
            middle = middle.substring(0 , 2);
            newLastName += middle.toUpperCase();
        }
        
        
        
        System.out.println("Name of town where you were born: ");
        town = scan.next();
        if ( town.length() < 3 ) {
            town = town.substring(0);
            newLastName += town.toUpperCase();
        }
        else {
            town = town.substring(0 , 3);
            newLastName += town.toUpperCase();
        }
        
        System.out.println("\nStar wars name:\n\t" + newName + " " + newLastName);
        
    }
}
