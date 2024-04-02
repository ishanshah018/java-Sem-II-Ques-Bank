interface A {
    void methodA();
}

interface B extends A {
    void methodB();
}

interface C extends A {
    void methodC();
}

interface D extends B, C {
    void methodD();
}

class MyClass implements D {
    public void methodA() {
        System.out.println("Inside methodA");
    }

    public void methodB() {
        System.out.println("Inside methodB");
    }

    public void methodC() {
        System.out.println("Inside methodC");
    }

    public void methodD() {
        System.out.println("Inside methodD");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodA(); 
        obj.methodB(); 
        obj.methodC(); 
        obj.methodD(); 
    }
}
