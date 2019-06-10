public class ArtAlbum extends Book {
    String name, paperQ;
    int nrPages;


    public ArtAlbum(String Xname, int XnrPages, String paperQuality) {
        super(Xname, XnrPages);
        name = Xname;
        nrPages = XnrPages;
        paperQ=paperQuality;
    }

    String getXname(){
        return name;
    }
    int getNrPages(){
        return nrPages;
    }
    @Override
    String getBookType(){
        return "artAlbum";
    }
    @Override
    String getPaperQ(){
        return paperQ;
    }

}
