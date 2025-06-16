public class LibrarySystem {
    public static void main(String[] args) {
        //Obj creation
        Reader reader = new Reader("Carlos");
        LibraryAssistant assistant = new LibraryAssistant("Lucía");
        WebAdmin admin = new WebAdmin("Marta");

        //Interactions
        System.out.println("\n--- Reader ---");
        reader.showUser();
        reader.reserveBook("1984");

        System.out.println("\n--- Library Assistant ---");
        assistant.showUser();
        assistant.modifyAvailability("Don Quijote", false);

        System.out.println("\n--- Web Admin ---");
        admin.showUser();
        admin.reserveBook("El Principito");
        admin.modifyAvailability("El Principito", true);
    }
}
