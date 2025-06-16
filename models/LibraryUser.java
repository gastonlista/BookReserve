public class LibraryUser {
    protected String name;

    public LibraryUser(String name) {
        this.name = name;
    }

    public void showUser() {
        System.out.println("Usuario: " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
