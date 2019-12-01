import java.util.Scanner;
public class Movie {
    private String title;
    private int year;
    private String rating;
    private int numTimesWatched;
    private String genre;
    private String description;
    private boolean favorite;
    
    public static void main (String [] args) {
     
        Movie m1 = new Movie ("Joker" , 2019 , "R" , 2 , "Action" , "Awesome" , false);
        System.out.println(m1.toString());
        startNetflix();
        
    }
    public Movie ( String title , int year , String rating , int numTimesWatched, 
                   String genre , String description ,  boolean favorite ) {
        
        this.title = title;
        this.year = year;
        this.rating = rating;
        this.numTimesWatched = numTimesWatched;
        this.genre = genre;
        this.description = description;
        this.favorite = favorite;
           
    }
    
    public String toString()
    {
        return title + " (" + year + ")" + " - " + rating + " - " + genre;
    }
    public static void startNetflix() {
        System.out.print("Welcome to Netflix!\nEnter your name: ");
        Scanner scan = new Scanner (System.in);
        String name = scan.nextLine();
        System.out.println("How many movies would you like to display?");
        
    }

}
