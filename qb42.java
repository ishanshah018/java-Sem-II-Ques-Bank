interface A {
    void methodA();
}


interface B {
    void methodB();
}

interface C {
    void methodC();
}

class D implements A, B {
    public void methodA() {
        System.out.println("Inside methodA");
    }

    
    public void methodB() {
        System.out.println("Inside methodB");
    }
}

class E extends D implements C {
    public void methodC() {
        System.out.println("Inside methodC");
    }
}

public class Main {
    public static void main(String[] args) {
        E obj = new E();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}
