//QB-34

interface transport {
    void deliver();
}

abstract class animal {
    abstract void sound();
}

class tiger extends animal {
    void sound() {
        System.out.println("Tiger Roars");
    }
}

class camel extends animal implements transport {
    public void deliver() {
        System.out.println("Camel delivers goods");
    }

    void sound() {
        System.out.println("Camel sound");
    }
}

class deer extends animal {
    void sound() {
        System.out.println("Deer sound");
    }
}

class donkey extends animal implements transport {
    public void deliver() {
        System.out.println("Donkey delivers goods");
    }

    void sound() {
        System.out.println("Donkey sound");
    }
}

class Main {
    public static void main(String[] args) {
        animal[] an = { new tiger(), new camel(), new deer(), new donkey() };
        for (animal ani : an) {
            if (ani instanceof transport) {
                ((transport) ani).deliver();
            }
        }
    }
}
