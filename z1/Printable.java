package z1;

public interface Printable {
    public static void main(String[] args) {
        Printable[] printables = {new Magazine("polcon"), new Book("Как сдать сессию")};
        for (Printable p : printables) {
            p.print();
        }
        System.out.println("Magazine.printMagazines(printables):");
        Magazine.printMagazines(printables);
        System.out.println("Book.printBooks(printables):");
        Book.printBooks(printables);
    }
    void print();
}
