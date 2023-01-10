/*
 * Activity 3.7.5
 */
import java.util.ArrayList;

public class LibraryRunner
{
  public static void main(String[] arg)
  {

    //Steps 6 and 7
    Library library = new Library();
    ArrayList<Book> childrensBooks = library.getChildrensBooks();
    String authorToFind = "L. Frank Baum";
    for (Book book : childrensBooks) {
      if (authorToFind.equals(book.getAuthor())) {
        System.out.println(book.getTitle());
      }
    }

    //Step 8, 9 and 10
    String bookToFind = "Sky Island";
    Double minimumRating = 0.0;
    for (Book book : childrensBooks) {
      if (bookToFind.equals(book.getTitle())) {
        minimumRating = book.getRating();
        System.out.println(minimumRating);
      }
    }

  }
}