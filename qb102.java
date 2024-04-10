class Coordinate {
    double x;
    double y;
    double z;

    public Coordinate(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void display() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }

    public static Coordinate addCoordinates(Coordinate c1, Coordinate c2, Coordinate c3) throws Exception {
        double x = c1.x + c2.x + c3.x;
        double y = c1.y + c2.y + c3.y;
        double z = c1.z + c2.z + c3.z;
        if (x == 0 && y == 0 && z == 0) {
            throw new Exception("Resultant coordinate has zero values for x, y and z");
        }
        return new Coordinate(x, y, z);
    }

    public static void main(String[] args) {
        Coordinate c1 = new Coordinate(1, 2, 3);
        Coordinate c2 = new Coordinate(4, 5, 6);
        Coordinate c3 = new Coordinate(7, 8, 9);
        c1.display();
        c2.display();
        c3.display();
        try {
            Coordinate result = Coordinate.addCoordinates(c1, c2, c3);
            result.display();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
