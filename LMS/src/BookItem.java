import java.util.Date;
import java.util.List;

public class BookItem extends Book {

    private String barcode;
    private boolean isReferenceOnly;
    private Date borrowed;
    private Date dueDate;
    private double price;
    private BookFormat format;
    private BookStatus status;
    private Date dateOfPurchase;
    private Date publicationDate;
    private Rack placedAt;

    public BookItem(String ISBN, String title, String subject, String publisher,
                    String language, int numberOfPages, List<Author> authors,
                    String barcode, boolean isReferenceOnly, Date borrowed, Date dueDate,
                    double price, BookFormat format, BookStatus status, Date dateOfPurchase,
                    Date publicationDate, Rack placedAt) {
        super(ISBN, title, subject, publisher, language, numberOfPages, authors);
        this.barcode = barcode;
        this.isReferenceOnly = isReferenceOnly;
        this.borrowed = borrowed;
        this.dueDate = dueDate;
        this.price = price;
        this.format = format;
        this.status = status;
        this.dateOfPurchase = dateOfPurchase;
        this.publicationDate = publicationDate;
        this.placedAt = placedAt;
    }

    public BookItem(String ISBN, String title, String subject, String publisher, String language, int numberOfPages, List<Author> authors) {
        super(ISBN, title, subject, publisher, language, numberOfPages, authors);

    }

    @Override
    public String toString() {
        return "BookItem{" +
                "barcode='" + barcode + '\'' +
                ", isReferenceOnly=" + isReferenceOnly +
                ", borrowed=" + borrowed +
                ", dueDate=" + dueDate +
                ", price=" + price +
                ", format=" + format +
                ", status=" + status +
                ", dateOfPurchase=" + dateOfPurchase +
                ", publicationDate=" + publicationDate +
                ", placedAt=" + placedAt +
                '}';
    }

    public boolean checkout(String memberId) {

        return true;
    }

}
