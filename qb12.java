class book {
    String author_name;

    book(String author_name) {
        this.author_name = author_name;
    }

    void display(String author_name) {
        System.out.println("Book Author " + author_name);
    }

}

class book_publication extends book {
    String title;

    book_publication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }
}

class paper_publication extends book {
    String title;

    paper_publication() {
        this.title = title;
    }

    void display(String title)) {
        System.out.println("Paper Publication: " + title);
    }

}

    class Main {
    public static void main(String[] args) {

        book b1=new book("John Done")
        book b2=new paper_publication("Machine Learning")
        b1.display();
        b2.display();
    }
}
