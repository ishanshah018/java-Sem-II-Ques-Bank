//QB-12 (Data to get from Command line argument method ) // java Main Ishan ABC Raj PQR

class book {
    private String author_name;

    public book(String author_name) {
        this.author_name = author_name;
    }

    void display() {
        System.out.println("Book Author name is" + author_name);
    }

}

class book_publication extends book {
    private String title;

    public book_publication(String author_name, String title) {
        super(author_name);
        this.title = title;

    }

    void display() {
        System.out.println("Title name is:" + title);
        super.display();
    }
}

class paper_publication extends book {
    private String title;

    public paper_publication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    void display() {
        System.out.println("Title name is:" + title);
        super.display();
    }
}

class Main {
    public static void main(String[] args) {
        book b1 = new book_publication(args[0], args[1]);
        book b2 = new paper_publication(args[2], args[3]);
        b1.display();
        b2.display();
    }
}
