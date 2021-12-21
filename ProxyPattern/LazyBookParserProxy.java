public class LazyBookParserProxy implements IBookParser{

    private String book;
    private BookParser bookParser;  //Null?

    public LazyBookParserProxy (String book) {
        this.book = book;
    }

    @Override
    public int getNumLines() {
        if (bookParser == null) {
            bookParser = new BookParser(book);
        }
        return bookParser.getNumLines();
    }
    
}
