package comparator;

import java.util.ArrayList;
import java.util.Collections;

import comparable.Movie;

public class MainComparator {

	public static void main(String[] args) {
		
		
		ArrayList<Movie> movieList = new ArrayList<Movie>();
		   
		   movieList.add(new Movie("The Family Man",8.6,2019));
		   movieList.add(new Movie("Mirzapur 1",8.4,2018));
		   movieList.add(new Movie("Kota Factory",9.1,2019));
		   movieList.add(new Movie("Asur",8.4,2020));
		   movieList.add(new Movie("Paatal Lok",7.8,2020));
		   movieList.add(new Movie("Panchayat",8.7,2020));
		   movieList.add(new Movie("Breathe 1",8.3,2018));
		   movieList.add(new Movie("ImMATURE",8.8,2019));
		   
		   
		   RatingCompare ratingCamparator = new RatingCompare();
		   
		   Collections.sort(movieList,ratingCamparator);
		   System.out.println();
		   System.out.println(" Sorting by Rating : ");
		   for(Movie movie: movieList) {
			   System.out.println("[ " + movie.getName() + " " +
		                          movie.getRating()+ " " +
					              movie.getYear() + " ]");
			   }
		   
		   
		   // Sort by Name
		   NameCompare nameCompare = new NameCompare();
		   Collections.sort(movieList,nameCompare);
		   System.out.println();
		   System.out.println(" Sorting by Name : ");
		   for(Movie movie: movieList) {
			   System.out.println("[ " + movie.getName() + " " +
		                          movie.getRating()+ " " +
					              movie.getYear() + " ]");
			   }

    }
}	
