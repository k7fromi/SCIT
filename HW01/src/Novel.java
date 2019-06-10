public class Novel extends Book {
    String name, novelType;
    int nrPages;


    public Novel(String Xname, int XnrPages, String novType) {
        super(Xname, XnrPages);
        name = Xname;
        nrPages = XnrPages;
        novelType=novType;
    }
    @Override
    String getBookType(){
        return "novel";
    }

    String getXname(){
        return name;
    }
    int getNrPages(){
        return nrPages;
    }
    @Override
    String getNovType(){
        return novelType;
    }


}
