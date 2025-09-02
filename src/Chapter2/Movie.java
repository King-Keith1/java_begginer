package Chapter2;

class Movie {
    String title;
    String genre;
    int rating;

    void playIt() {
        System.out.println("Playing the movie");
    }
    void display() {
        System.out.println("title: " + title);
        System.out.println("genre: " + genre);
        System.out.println("rating: " + rating);
    }
}
