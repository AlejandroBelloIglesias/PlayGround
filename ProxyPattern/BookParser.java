public class BookParser implements IBookParser {

    private String book;
    private int numLines = -1;

    public BookParser (String book) {
        this.book = book;
        numLines = (int) book.lines().count(); //Operación costosa
        book.lines().forEach( System.out::println ); //Operación costosa
    }

    @Override
    public int getNumLines() {
        return numLines;
    }

    
    
}
