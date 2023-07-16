class BooksTester {
    public static void main(String b[]){
        Books book1 = new Books();
        book1.name = "To the Lighthouse";
        book1.author = "Virginia Woolf";
        book1.type = "Modernist";
        book1.price = 1440.00;
        book1.publicationName = "Publisher X";
        book1.noOfPages = 200;
        book1.toGainKnowledge();
        System.out.println(book1.name + "\n" + book1.author + "\n" + book1.type + "\n" + book1.price + " INR" + "\n" + book1.publicationName + "\n" + book1.noOfPages + " pages");

        Books book2 = new Books();
        book2.name = "The Great Gatsby";
        book2.author = "F. Scott Fitzgerald";
        book2.type = "Fiction";
        book2.price = 650.00;
        book2.publicationName = "Publisher Y";
        book2.noOfPages = 300;
        book2.toGainKnowledge();
        System.out.println(book2.name + "\n" + book2.author + "\n" + book2.type + "\n" + book2.price + " INR" + "\n" + book2.publicationName + "\n" + book2.noOfPages + " pages");

        Books book3 = new Books();
        book3.name = "To Kill a Mockingbird";
        book3.author = "Harper Lee";
        book3.type = "Classic";
        book3.price = 950.00;
        book3.publicationName = "Publisher Z";
        book3.noOfPages = 400;
        book3.toGainKnowledge();
        System.out.println(book3.name + "\n" + book3.author + "\n" + book3.type + "\n" + book3.price + " INR" + "\n" + book3.publicationName + "\n" + book3.noOfPages + " pages");

        Books book4 = new Books();
        book4.name = "Harry Potter and the Sorcerer's Stone";
        book4.author = "J.K. Rowling";
        book4.type = "Fantasy";
        book4.price = 1200.00;
        book4.publicationName = "Publisher A";
        book4.noOfPages = 500;
        book4.toGainKnowledge();
        System.out.println(book4.name + "\n" + book4.author + "\n" + book4.type + "\n" + book4.price + " INR" + "\n" + book4.publicationName + "\n" + book4.noOfPages + " pages");

        Books book5 = new Books();
        book5.name = "1984";
        book5.author = "George Orwell";
        book5.type = "Dystopian";
        book5.price = 720.00;
        book5.publicationName = "Publisher B";
        book5.noOfPages = 350;
        book5.toGainKnowledge();
        System.out.println(book5.name + "\n" + book5.author + "\n" + book5.type + "\n" + book5.price + " INR" + "\n" + book5.publicationName + "\n" + book5.noOfPages + " pages");

        Books book6 = new Books();
        book6.name = "Pride and Prejudice";
        book6.author = "Jane Austen";
        book6.type = "Romance";
        book6.price = 1080.00;
        book6.publicationName = "Publisher C";
        book6.noOfPages = 450;
        book6.toGainKnowledge();
        System.out.println(book6.name + "\n" + book6.author + "\n" + book6.type + "\n" + book6.price + " INR" + "\n" + book6.publicationName + "\n" + book6.noOfPages + " pages");

        Books book7 = new Books();
        book7.name = "The Catcher in the Rye";
        book7.author = "J.D. Salinger";
        book7.type = "Coming-of-age";
        book7.price = 840.00;
        book7.publicationName = "Publisher D";
        book7.noOfPages = 300;
        book7.toGainKnowledge();
        System.out.println(book7.name + "\n" + book7.author + "\n" + book7.type + "\n" + book7.price + " INR" + "\n" + book7.publicationName + "\n" + book7.noOfPages + " pages");

        Books book8 = new Books();
        book8.name = "The Hobbit";
        book8.author = "J.R.R. Tolkien";
        book8.type = "Adventure";
        book8.price = 960.00;
        book8.publicationName = "Publisher E";
        book8.noOfPages = 400;
        book8.toGainKnowledge();
        System.out.println(book8.name + "\n" + book8.author + "\n" + book8.type + "\n" + book8.price + " INR" + "\n" + book8.publicationName + "\n" + book8.noOfPages + " pages");

        Books book9 = new Books();
        book9.name = "The Da Vinci Code";
        book9.author = "Dan Brown";
        book9.type = "Mystery";
        book9.price = 1320.00;
        book9.publicationName = "Publisher F";
        book9.noOfPages = 600;
        book9.toGainKnowledge();
        System.out.println(book9.name + "\n" + book9.author + "\n" + book9.type + "\n" + book9.price + " INR" + "\n" + book9.publicationName + "\n" + book9.noOfPages + " pages");

        Books book10 = new Books();
        book10.name = "The Alchemist";
        book10.author = "Paulo Coelho";
        book10.type = "Philosophical Fiction";
        book10.price = 780.00;
        book10.publicationName = "Publisher G";
        book10.noOfPages = 250;
        book10.toGainKnowledge();
        System.out.println(book10.name + "\n" + book10.author + "\n" + book10.type + "\n" + book10.price + " INR" + "\n" + book10.publicationName + "\n" + book10.noOfPages + " pages");
    }
}