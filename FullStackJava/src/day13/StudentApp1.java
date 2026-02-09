package day13;

public class StudentApp1 {

    public static void main(String[] args) {

        Student8 s = new Student8();
        Bike1 b = new Bike1("Pulsar", 100000, "Black");
        Book1 b1 = new Book1("The Art of Being Alone", 500);

        System.out.println("---- Bike Details ----");
        s.hasA(b);

        System.out.println("---- Book Details ----");
        s.hasA(b1);

        System.out.println("---- Human Organs ----");
        System.out.println("Heart Job: " + s.h.getJob());
        System.out.println("Brain Cells: " + s.br.getCells());
    }
}

/* -------- IS-A Relationship -------- */
class Human {
    Heart1 h = new Heart1("Pump Blood", 3);
    Brain1 br = new Brain1(1000, 1);
}

/* -------- Student -------- */
class Student8 extends Human {

    void hasA(Bike1 obj) {
        System.out.println(obj.getBrand());
        System.out.println(obj.getPrice());
        System.out.println(obj.getColor());
    }

    void hasA(Book1 obj) {
        System.out.println(obj.getName());
        System.out.println(obj.getPrice());
    }
}

/* -------- Brain -------- */
class Brain1{
    int cells;
    int weight;

    public Brain1(int cells, int weight) {
        this.cells = cells;
        this.weight = weight;
    }

    public int getCells() {
        return cells;
    }

    public void setCells(int cells) {
        this.cells = cells;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

/* -------- Book -------- */
class Book1{
    String name;
    int price;

    public Book1(String name, int price) {   // FIXED constructor
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

/* -------- Bike -------- */
class Bike1{
    String brand;
    int price;
    String color;

    public Bike1(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
}

/* -------- Heart -------- */
class Heart1{
    int weight;
    String job;

    public Heart1(String job, int weight) {
        this.job = job;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String getJob() {
        return job;
    }
}
