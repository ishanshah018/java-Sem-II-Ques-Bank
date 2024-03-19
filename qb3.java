//qb-3

class Fruit {
    void display() {
        System.out.println("This is Fruit Parent Class");
    }
}

class Apple extends Fruit {
    void display() {
        System.out.println("This is Apple  Class");

    }

}

class Banana extends Fruit {
    void display() {
        System.out.println("This is Banana Class");

    }

}

class Main {
    public static void main(String[] args) {
        Fruit s1 = new Apple();
        Fruit s2 = new Banana();
        s1.display();
        s2.display();
    }

}
