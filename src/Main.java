public class Main {
    public static void main(String[] args) {
        Author Tolle = new Author("Eckhart", "Tolle");
        Author Carroll = new Author("Lee", "Carroll");

        Book ANewEarth = new Book("A New Earth", Tolle, 2005);
        Book TheJourneyHome = new Book("The Journey Home", Carroll, 1996);

        TheJourneyHome.setYearOfPublication(1997);

        System.out.println("Название " + ANewEarth.getBookName() + ", автор " + Tolle.getAuthorName() + ", год выпуска " + ANewEarth.getYearOfPublication());
        System.out.println("Название " + TheJourneyHome.getBookName() + ", автор " + Carroll.getAuthorName() + ", год выпуска " + TheJourneyHome.getYearOfPublication());
    }
}