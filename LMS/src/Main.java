public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Welcome to Library Management System");
        Address univerAddress = new Address("Movarounnahr 1","Tashkent","Tashkent","122121","Uzbekistan");
        Library library = new Library( "NUU Library", univerAddress);
        System.out.println(library.toString());



    }
}