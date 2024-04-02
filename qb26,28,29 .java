interface a {
    int constant_a = 10;

    void methoda();
}

interface a1 extends a {
    int constant_a1 = 20;

    void methoda1();
}

interface a2 extends a {
    int constant_a2 = 30;

    void methoda2();
}

interface a12 extends a1, a2 {
    int constant_a12 = 40;

    void methoda12();
}

class B implements a12 {
    public void methoda() {
        System.out.println("Method a invoked with constant: " + constant_a);
    }

    public void methoda1() {
        System.out.println("Method a1 invoked with constant: " + constant_a1);
    }

    public void methoda2() {
        System.out.println("Method a2 invoked with constant: " + constant_a2);
    }

    public void methoda12() {
        System.out.println("Method a12 invoked with constant: " + constant_a12);
    }

}

class Main {
    public static void main(String[] args) {
        B m = new B();
        m.methoda();
        m.methoda1();
        m.methoda2();
        m.methoda12();
    }
}
