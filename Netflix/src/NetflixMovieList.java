import java.util.ArrayList;
import java.util.Scanner;
public class NetflixMovieList {
   public static void main (String [] args) {
        startNetflix();   
    }
   public static ArrayList<Movie> getMovieList() {
        ArrayList<Movie>MovieList = new ArrayList<Movie>();
        Movie happyFeet = new Movie ("Happy Feet" , 2006, "PG", 2 , "Family",
                "In the great nation of Emperor Penguins, you’re "
                + "nobody unless you can sing – which is unfortunate "
                + "for Mumble, who is the worst singer in the world. "
                + "He is born dancing to his own tune...tap dancing " , false);
        Movie batman = new Movie ("Batman Begins" , 2005, "PG-13", 2 , "Action",
                "In the great city of Gotham, crime "
                + "is everywhere, until a crusader known as Batman awakens " , false);
        Movie starWars = new Movie ("Star Wars" , 1977, "PG-13", 2 , "Sci-Fi",
                "A long time ago, in a galaxy far far away, the resistance fights the sith" , true);
        Movie lotr = new Movie ("Lord of the Rings, the fellowship of the ring" , 2001, "PG", 2 , "Fantasy",
                "In the great nation of middle earth, Frodo "
                + "and his friends must destroy the ring to restore balance" , true);
        Movie backToTheFuture = new Movie ("Back to the future" , 1984, "PG", 2 , "Sci-Fi",
                "Marty accidentally goes back in time, and ruins his present " , true);
        MovieList.add(happyFeet);
        MovieList.add(batman);
        MovieList.add(starWars);
        MovieList.add(lotr);
        MovieList.add(backToTheFuture);
        return MovieList;
    }
    public static void startNetflix() {
        ArrayList <Movie> movies = getMovieList();
        System.out.print("Welcome to Netflix!\nEnter your name: ");
        Scanner scan = new Scanner (System.in);
        String name = scan.nextLine();
        System.out.println("Welcome " + name + "!");
        System.out.print("How many movies would you like to display (3 - 5): ");
        int numDisplayed = scan.nextInt();
        int start = 0;
        displayMovies (movies , numDisplayed , 0);
        System.out.println("-------------");
        printInstructions();
        String input = "";
        
        if (scan.hasNext()) {
            input = scan.next().toUpperCase();
        }
        
        System.out.println(input);
       
        while (!input.equals("X")) {
                        
            if (input.equals(">")) {
                start++;
                if (start >= movies.size()) {
                    start -= movies.size();
                }
                displayMovies (movies , numDisplayed , start);
                System.out.println("-------------");
                printInstructions();
            }
            if (input.equals("<")) {
                start--;
                if ( start <= 0 ) {
                    start += movies.size();
                }
                displayMovies (movies , numDisplayed , start);
                System.out.println("-------------");
                printInstructions();
            }
            if (input.equals("D")) {
                displayMovies (movies , numDisplayed , start);
                System.out.println("-------------");
                printInstructions();
            }
            if (input.equals("F")) {
                displayFavorites( movies );
                System.out.println("-------------");
                printInstructions();
            }
            if (input.equals("M")) {
                int selection = 0;
                System.out.println("What movie would you like to select: " );
                if (scan.hasNextInt()) {
                    selection = scan.nextInt();
                }
                System.out.println(movies.get(selection - 1) + "\n" + movies.get(selection - 1).returnDescription());
                options();
                
                String selection2 = "";
                System.out.println("Please enter your selection: " + selection2);
                if (scan.hasNext() ) {
                    selection2 = scan.next().toUpperCase();
                }
                
                if (selection2.equals("F")) {
                    movies.get(selection - 1).makeFavorite();
                    System.out.print("Done");
                    options();
                }
                if (selection2.equals("W")) {
                    System.out.println("-------------\nEnjoy" + movies.get(selection - 1).returnTitle() + "!");
                }
                if (selection2.equals("R")) {
                    displayMovies( movies , numDisplayed , 0);
                    
                }
            }
            if (input.equals("A")) {
                String enter = "";
                System.out.println("What is the title of the movie? ");
                if (scan.hasNext() ){
                    enter = scan.next();
                }
                int year = 0;
                System.out.println("When was it released? ");
                if ( scan.hasNextInt() ) {
                    scan.nextInt();
                }
                String newrating = "";
                System.out.println("What was it rated? ");
                if (scan.hasNext()) {
                    newrating = scan.next();
                }
                String nameOfGenre = "";
                System.out.println("What is the genre? ");
                if (scan.hasNext()) {
                    nameOfGenre = scan.next();
                }
                String summary = "";
                System.out.println("Please describe the movie: ");
                if (scan.hasNext()) {
                    summary = scan.next();
                }
                Movie added = new Movie ( enter , year , newrating , 0 , nameOfGenre , summary , false );
                movies.add(added);
                displayMovies( movies , numDisplayed , 0);
                printInstructions();
            }
            if (input.equals("R")) {
                displayMovies( movies , numDisplayed , 0 );
                int deletion =  0;
                System.out.println("Which movie would you like to delete? ");
                if ( scan.hasNextInt() ) {
                    deletion = scan.nextInt();
                }
                movies.remove(deletion - 1);
                System.out.println("Done");
                
                printInstructions();
            }
            if (scan.hasNext()) {
                input = scan.next().toUpperCase();
            }
        }
    }
    public static void displayMovies(ArrayList <Movie> movies, int num, int start) {
        for (int i = start; i < start + num; i++) {
            if (i < movies.size()) {
                System.out.println((i + 1) + ". " + movies.get(i).toString());
                
            }
            else {
                System.out.println((i - movies.size() + 1) + ". " + movies.get(i - movies.size()).toString());
            }
        }
    }
    public static void printInstructions() {
        System.out.println("Select an Option:\n" + 
                "> to scroll forward\n" + 
                "< to scroll backward\n" + 
                "D to display all\n" + 
                "F to display favorites\n" + 
                "M to select a movie\n" + 
                "A to add a movie to the list\n" + 
                "R to remove a movie from the list\n" + 
                "X to exit");
        System.out.println("-------------");
        System.out.print("Please enter your selection: ");
    }
    public static void options() {
        System.out.println("-------------\n"+"Select an Option:\n" +
            "F to add to favorites\n" +
            "W to watch\n"
          + "R to return to the movie list");
        System.out.println("-------------");
    }
    public static void displayFavorites( ArrayList <Movie> movies) {
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).returnFavorite() == true) {
                System.out.println((i + 1) + ". " + movies.get(i).toString());
            }
        }
    }
    
}
