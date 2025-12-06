// Superclass
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Interface
interface Worker {
    void performDuties();
}

// Subclass Chef
class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is preparing food.");
    }
}

// Subclass Waiter
class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers.");
    }
}

// Demo
public class RestaurantDemo {
    public static void main(String[] args) {
        Worker[] staff = {
            new Chef("Alice", 101),
            new Waiter("Bob", 102)
        };

        for (Worker w : staff) {
            w.performDuties();
        }
    }
}

