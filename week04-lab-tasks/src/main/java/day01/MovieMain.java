package day01;

public class MovieMain {
    public static void main(String[] args) {
        Movie movie = new Movie("Film", 2000);
        movie.addActor(new Actor("Name1", 1983));
        movie.addActor(new Actor("Name2", 1979));
        movie.addActor(new Actor("Name3", 1974));
        movie.addActor(new Actor("Name4", 1965));

        System.out.println("Actors in their 20's: " + movie.actorsInTheirTwenties());
    }
}
