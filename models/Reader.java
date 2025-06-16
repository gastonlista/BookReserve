public class Reader extends LibraryUser implements BookReserver {
    public Reader(String name) {
        super(name);
    }

    @Override
    public void reserveBook(String title) {
        System.out.println(name + " ha reservado el libro: " + title);
    }
}
