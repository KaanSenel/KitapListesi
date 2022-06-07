import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Book book1=new Book("İnci",120,"John Steinbeck","2000/04/07");
        Book book2=new Book("Ateş ve Kan",800,"George R. R. Martin","2020/05/12");
        Book book3=new Book("Yılkı Atı",95,"Peyami Safa","1977/12/12");
        Book book4=new Book("Sol Ayağım",89,"Christy Brown","1985/04/25");
        Book book5=new Book("Yıldız Gemisi",125,"Brian Aldiss","1954/08/11");
        Book book6=new Book("Yabancı",90,"Albert Camus","2004/10/04");
        Book book7=new Book("Dönüşüm",160,"Franz Kafka","1940/04/05");
        Book book8=new Book("Siyah İnci",150,"Anna Sewell","2014/02/25");
        Book book9=new Book("Ejderhaların Dansı",700,"George R. R. Martin","2013/02/10");
        Book book10=new Book("Kış Rüzgarları",657,"George R. R. Martin","inş çıkar :D");

        ArrayList<Book> books=new ArrayList<>();
        books.add(book1); books.add(book2);
        books.add(book3); books.add(book4);
        books.add(book5); books.add(book6);
        books.add(book7); books.add(book8);
        books.add(book9); books.add(book10);

        /*
            Alttaki kod örneğinde de bir map yapısı kullanmadan istenilen değerleri yazdırabiliyoruz.

         */
       // System.out.println("Kitap İsmi --- Yazar İsmi");
       // books.stream().map(k-> k.getName()+" --- "+k.getAuthor()).forEach(p-> System.out.println(p));

        Map<String,String> booksAndAuthors=new HashMap<>();
        books.stream().forEach(p-> booksAndAuthors.put(p.getName(), p.getAuthor()));

        for (String b:booksAndAuthors.keySet()){
            System.out.println("Kitap : "+ b+", Yazar : "+booksAndAuthors.get(b));
        }


        List<Book> newList=books.stream().filter(p->p.getPage()>100).toList();
        System.out.println("\nSayfa Sayısı 100'den fazla olan kitaplar :");
        for(Book b:newList){
            System.out.println("Kitap Adı : "+b.getName()+" | " +
                               "Sayfa Sayısı : "+b.getPage()+" | "+
                               "Yazar : "+b.getAuthor()+" | "+
                               "Yayın Tarihi : "+b.getReleaseDate());
        }

    }
}
