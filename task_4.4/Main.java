public class Main {
    public static void main(String[] args) {
        Mouse Mouse = new Mouse("Jerry", 12, 5);
        Dog Dog = new Dog("Spike",8,27);
        Cat Cat = new Cat("Tom",5,"Old lady");
    }
}
class Mouse {
    String name;
    int height;
    int tail;

    public Mouse(String name, int height, int tail) {
        this.name = name;
        this.height = height;
        this.tail = tail;
    }
}
class Dog {
    String name;
    int age;
    int weight;

    public Dog(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
}
class Cat {
    String name;
    int age;
    String owner;

    public Cat(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }
}
