// QB-17

abstract class vegetable {
    String color;

    public abstract String toString();
        

}

class potato extends vegetable {
    String color;

    public potato(String color) {
        this.color = color;
    }

    // Override
    public String toString() {
        return "potato color is " + color;
    }

}

class brinjal extends vegetable {
    String color;

    public brinjal(String color) {
        this.color = color;
    }

    // Override
    public String toString() {
        return "brinjal color is " + color;
    }

}

class tomato extends vegetable {
    String color;

    public tomato(String color) {
        this.color = color;
    }

    // Override
    public String toString() {
        return "tomato color is " + color;
    }

}

class Main {
    public static void main(String[] args) {
        potato p = new potato("Yellow");
        brinjal b = new brinjal("Violet");
        tomato t = new tomato("Red");

        System.out.println(p);
        System.out.println(b);
        System.out.println(t);
    }
}
