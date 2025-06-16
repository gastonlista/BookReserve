public class LibraryAssistant extends LibraryUser implements AvailabilityManager {
    public LibraryAssistant(String name) {
        super(name);
    }

    @Override
    public void modifyAvailability(String title, boolean available) {
        String estado = available ? "disponible" : "no disponible";
        System.out.println(name + " ha cambiado la disponibilidad del libro '" + title + "' a: " + estado);
    }
}
