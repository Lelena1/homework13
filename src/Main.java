public class Main {
    public static void main(String[] args) {

        System.out.println("Old code (from Homework 12)\n");
//  **Простой уровень**
//  Реализовать методы toString, equals и hashCode в классах Author и Book, которые были созданы на прошлом
//  уроке.  Обратите внимание, что toString книги не должен дублировать код из toString автора,
//  а должен делегировать (вызывать) его версию метода.

        Author author1 = new Author("Stephen", "King");
        Book book1 = new Book("Later", author1, 2021);

        System.out.println("book1.bookName = " + book1.getBookName() + "\n" + "author1.authorFirstName = " +
                author1.getAuthorFirstName() + "\n" + "author1.authorLastName = " + author1.getAuthorLastName() + "\n" +
                "book1.publishingYear = " + book1.getPublishingYear() + "\n");

        book1.setPublishingYear(2022);
        System.out.println("book1.getPublishingYear() = " + book1.getPublishingYear());

        System.out.println();

        Author author2 = new Author("Joanne", "Rowling");
        Book book2 = new Book("Harry Potter and the Chamber of Secrets", author2, 1998);

        System.out.println("book2.bookName = " + book2.getBookName() + "\n" + "author2.authorFirstName = " +
                author2.getAuthorFirstName() + "\n" + "author2.authorLastName = " + author2.getAuthorLastName() + "\n" +
                "book2.publishingYear = " + book2.getPublishingYear() + "\n");

        book2.setPublishingYear(2005);
        System.out.println("book2.getPublishingYear() = " + book2.getPublishingYear());
        System.out.println();


        System.out.println("Homework 13\n");

        System.out.println("Checking the equality of book names:");
        System.out.println(book1.equals(book2) + "\n");

        System.out.println("Checking the equality of the author's first and last names:");
        System.out.println(author1.equals(author2) + "\n");

        System.out.println("Хеш-коды названий книг:");
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        if (book1.hashCode() != book2.hashCode()) {
            System.out.println("Как видно, хеш-коды названий книг разные\n");
        } else {
            System.out.println("Как видно, хеш-коды названий книг одинаковые\n");
        }

        System.out.println("Хеш-коды имени и фамилии авторов:");
        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());

        if (author1.hashCode() != author2.hashCode()) {
            System.out.println("Как видно, хеш-коды имени и фамилии авторов разные\n");
        } else {
            System.out.println("Как видно, хеш-коды имени и фамилии авторов одинаковые\n");
        }

        Book b1 = new Book("Later", new Author("Stephen", "King"), 2021);
        Book b2 = new Book("Harry Potter and the Chamber of Secrets",
                new Author("Joanne", "Rowling"), 1998);

        String s1 = b1.toString();
        String s2 = b2.toString();

        System.out.println(s1);
        System.out.println(s2);
    }
}