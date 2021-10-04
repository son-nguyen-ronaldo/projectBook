public class ProgramingBook extends Book {

    private String languege;
    private String framework;

    public ProgramingBook() {
    }

    public ProgramingBook(String languege, String framework) {
        this.languege = languege;
        this.framework = framework;
    }

    public ProgramingBook(String code, String name, int price, String author, String languege, String framework) {
        super(code, name, price, author);
        this.languege = languege;
        this.framework = framework;
    }

    public String getLanguege() {
        return languege;
    }

    public void setLanguege(String languege) {
        this.languege = languege;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }
}
