interface A {
    void methodA();
}

interface B {
    void methodB();
}

interface C extends A, B {
    void methodC();
}

class D implements C {
    public void methodA() {
        System.out.println("Inside method A");
    }

    public void methodB() {
        System.out.println("Inside method B");
    }

    public void methodC() {
        System.out.println("Inside method C");
    }
}

class Main {
    public static void main(String[] args) {
        D obj = new D();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}
