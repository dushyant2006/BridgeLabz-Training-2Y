class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Woof Woof");
    }
}

class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Meow Meow");
    }
}

class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Chirp Chirp");
    }
}

public class AnimalHierarchyDemo {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog("Tommy", 3),
            new Cat("Kitty", 2),
            new Bird("Tweety", 1)
        };

        for (Animal a : animals) {
            System.out.println(a.name + " says: ");
            a.makeSound();
        }
    }
}
