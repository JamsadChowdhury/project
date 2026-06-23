class Jannat {

    void message() {
        System.out.println("This is the Parent Class.");
    }
}

class Chowdhury extends Jannat {

    void display() {
        System.out.println("This is the Child Class.");
    }
}

public class Main {

    public static void main(String[] args) {

        Chowdhury obj = new Chowdhury();

        obj.message();
        obj.display();
    }
}
