//QB-2 Write a program that implementts dynamic method dispatch. 

class parent {
    void m1() {
        System.out.println("parent m1");
    }

    void m2() {
        System.out.println("Parent m2");
    }
}

class child extends parent {
    void m1() {
        System.out.println("child m1");
    }

    void m3() {
        System.out.println("child m3");
    }
}

class run {
    public static void main(String[] args) {

        parent a = new child();
        a.m1();
    }
}
