import java.util.Scanner;

import static jdk.nashorn.internal.runtime.ScriptingFunctions.readLine;

public class MainClass {

    public static void main(String...args){
        Book[] bookList = new Book [100];
        Book[] bookListAux = new Book [100];
        int bookListCounter = 0, pgNr;
        Scanner comand;
        char mainAnswer ='0';
        String name;
        while (mainAnswer !='q') {
            System.out.println("What would you like to do ? (Add book = a, List books = l, Quit = q)");
            comand = new Scanner(System.in);
            mainAnswer = comand.next().charAt(0);

            switch (mainAnswer) {
                case 'a':
                    System.out.println("What kind of book would you like to add ? (Novel = n, Art album = a)");
                    comand = new Scanner(System.in);
                    char answer = comand.next().charAt(0);
                    switch (answer) {
                        case 'n':
                            System.out.println("You have chosen to add a novel");
                            System.out.println("Type in the name of the book");
                            comand = new Scanner(System.in);
                            name = comand.next();
                            System.out.println("Type in the nr of pages: ");
                            comand = new Scanner(System.in);
                            pgNr = comand.nextInt();
                            System.out.println("Type in the novel type(string): ");
                            comand = new Scanner(System.in);
                            String novType = comand.next();
                            bookList[bookListCounter] = new Novel(name, pgNr, novType);
                            bookListCounter++;
                            System.out.println("Book has been added to library.");
                            break;
                        case 'a':
                            System.out.println("You have chosen to add an art album");
                            System.out.println("Type in the name of the book");
                            comand = new Scanner(System.in);
                            name = comand.next();
                            System.out.println("Type in the nr of pages: ");
                            comand = new Scanner(System.in);
                            pgNr = comand.nextInt();
                            System.out.println("Type in the paper quality(string): ");
                            comand = new Scanner(System.in);
                            String paperQuality = comand.next();
                            bookList[bookListCounter] = new ArtAlbum(name, pgNr, paperQuality);
                            bookListCounter++;
                            System.out.println("Book has been added to library.");
                            break;
                    }
                    break;
                case 'q':
                    System.out.println("The library is deleted now. Goodbye! ");
                    break;
                case 'l':
                    System.out.println("The books in the library are:");
                    for (int i=0; i<bookListCounter; i++){
                        System.out.print(i+" "+bookList[i].getName()+" "+bookList[i].getNrPag()+"pages "+bookList[i].getBookType());
                        if (bookList[i].getBookType()=="artAlbum"){
                            System.out.println(bookList[i].getPaperQ());
                        }
                        if (bookList[i].getBookType()=="novel"){
                            System.out.println(bookList[i].getNovType());
                        }

                    }
                    System.out.println("Would you like to delete a book ? (y/n)");
                    comand = new Scanner(System.in);
                    answer = comand.next().charAt(0);
                    if (answer=='y'){
                        System.out.println("Type in the number of the book you want to delete");
                        answer = comand.next().charAt(0);
                        int delBook = Character.getNumericValue(answer);
                        System.out.println("You have chosen to delete book"+delBook);
                        for (int i=0; i<delBook; i++){
                            bookListAux[i]=bookList[i];
                        }
                        for(int i=delBook+1; i<bookListCounter; i++){
                            bookListAux[i-1]=bookList[i];
                        }
                        bookListCounter--;
                        for (int i=0; i<bookListCounter; i++){
                            bookList[i]=bookListAux[i];
                        }

                    }


                    break;

            }
        }



    }
}

