
public class Movie {
    private String title;
    private int year;
    private String rating;
    private int numTimesWatched;
    private String genre;
    private String description;
    private boolean favorite;
    
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
 public String returnDescription(){
     return description;
 }
 public String returnTitle(){
     return description;
 }
 public boolean returnFavorite(){
     return favorite;
 }
 public void makeFavorite() {
     favorite = true;
 }
}
