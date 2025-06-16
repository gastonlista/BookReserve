public class WebAdmin extends LibraryUser implements BookReserver, AvailabilityManager {
    public WebAdmin(String name) {
        super(name);
    }

    @Override
    public void reserveBook(String title) {
        System.out.println(name + " (admin web) ha reservado el libro: " + title);
    }

    @Override
    public void modifyAvailability(String title, boolean available) {
        String estado = available ? "disponible" : "no disponible";
        System.out.println(name + " (admin web) ha modificado la disponibilidad del libro '" + title + "' a: " + estado);
    }
}
