import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Welcome to Library Management System");
        Address univerAddress = new Address("Movarounnahr 1","Tashkent","Tashkent","122121","Uzbekistan");
        Library library = new Library( "NUU Library", univerAddress);
        System.out.println(library.toString());
        Author author1 = new Author("Jack London"," Jack London  writer. Marti Eden");
        Author author2 = new Author("Hudoyberdi Tuxtaboyev","He wrote many books about Hoshimjon and his friend.");
        List<Author> authorList = new ArrayList<>();
        authorList.add(author2);
        authorList.add(author1);
        BookItem bookItem1 = new BookItem("47878839788","Sariq Devni Minib","Subject",
                "Yangi Avlod","Uzbek",378, authorList,"343434",false,new Date("2023/10/23"),
                new Date("2023/10/39"),35000, BookFormat.HARDCOVER,BookStatus.AVAILABLE,
                new Date("2022/1/1"), new Date("1987/2/10"),new Rack());

        System.out.println(bookItem1.toString());





    }
}