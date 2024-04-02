interface university {
    void takeExam();
}

interface state {
    String getName();
}

interface stateuniversity extends university, state {
    void print();
}

class TestState implements stateuniversity {

    public void takeExam() {
        System.out.println("Taking Exams");
    }

    public String getName() {
        return "LJ university";
    }

    public void print() {
        System.out.println("Name of State University is: " + getName());
    }

}

class Main1 {
    public static void main(String[] args) {
        TestState t = new TestState();
        t.takeExam();
        t.print();
    }
}
