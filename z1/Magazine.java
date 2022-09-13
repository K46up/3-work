package z1;

public class Magazine implements Printable{
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable p : printable) {
            if (p instanceof Magazine) {
                p.print();
            }
        }
    }

    public void print() {
        System.out.println(" " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   /* public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazine magazine = (Magazine) o;
        return Objects.equals(getName(), magazine.getName());
    }

    public int hashCode() {

        return Objects.hash(getName());
    }*/

    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                '}';
    }
}
