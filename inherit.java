class Jamsad {

    void show() {
        System.out.println("This is Parent Class");
    }
}

class Mahin extends Jamsad {

    void display() {
        System.out.println("This is Child Class");
    }
}

public class Main {
    public static void main(String[] args) {

        Mahin obj = new Mahin();

        obj.show();
        obj.display();
    }
}
