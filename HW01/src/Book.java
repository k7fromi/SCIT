public class Book {
 String name;
 int nrPages;

    public Book(String Xname, int XnrPages ) {
        this.name = Xname;
        this.nrPages = XnrPages;
    }

    String getName(){
        return name;
    }
    int getNrPag(){
        return nrPages;
    }


    String getBookType() {
        return "book";
    }

    String getPaperQ() {
        return "nothing";
    }

    String getNovType() {
        return "nothing";
    }
}
