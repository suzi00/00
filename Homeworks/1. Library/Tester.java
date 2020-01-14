public class Tester {

    public void TestTheProgram(){
        LibraryClass library = new LibraryClass("Storebg");

        library.AddBookToLibrary(new BookClass("The things they carried", "Stephen King", "Comicon", 1992, 1714123));
        library.AddBookToLibrary(new BookClass("Possesion", "Stephen King", "shadow", 1932, 123145753));
        library.AddBookToLibrary(new BookClass("L.A. Confidentials", "Tim O' Brien", "JSnow", 1995, 923423123));
        library.AddBookToLibrary(new BookClass("Devil in a blue dress", "John Updikins", "Harpy", 1996, 11244123));
        library.AddBookToLibrary(new BookClass("Good Omens", "Scott Turrow", "Stephensons", 1996, 1234123));


        System.out.println("Books Available: ");
        System.out.println(library.GetAllBooksToString());

        System.out.println("* * * * * ** * * * * ** * * *");
        library.removeBookWithAuthorName("Stephen King");
        System.out.println(library.GetAllBooksToString());
    }
}
