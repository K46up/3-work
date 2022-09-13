package z1;

public class Book implements Printable{
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public static void printBooks(Printable[] printable) {
        for (Printable p : printable) {
            if (p instanceof Book) {
                p.print();
            }
        }
    }
    public void print() {
        System.out.println("Название книги " + name);
    }

    /*public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(getName(), book.getName());
    }

    public int hashCode() {
        return Objects.hash(getName());
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
