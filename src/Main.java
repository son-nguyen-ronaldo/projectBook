import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new ProgramingBook("C01", "java1", 12, "TG1", "java", "None");
        books[1] = new ProgramingBook("C02", "java2", 15, "TG2", "PHP", "Lavavel");
        books[2] = new FictionBook("C03", "Lap trinh cơ ban", 20, "tG3", "edu");
        books[3] = new FictionBook("C04", "Lap trinh nâng cao", 25, "tG4", "fun");

        int sum = getTotalPrice(books);
        System.out.println("Tổng số tiền sách là: ");
        System.out.println(sum);
    }
//Tính tổng số tiền sách
    public static int getTotalPrice(Book[] books) {
        int sum = 0;
        for (int i = 0; i < books.length; i++) {
            sum += books[i].getPrice();
        }
        return sum;
    }
}
