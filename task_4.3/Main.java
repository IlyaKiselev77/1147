public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(1,1,11);
        Cat cat2 = new Cat(5,6,15);
        System.out.println(cat1.fight(cat2));
    }
}

class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Cat anotherCat) {
        int win = 0;
        if (this.age>anotherCat.age) win++;
        if (this.weight>anotherCat.weight) win++;
        if (this.strength>anotherCat.strength) win++;
        System.out.println();
        if (win>=1) return true;
        else return false;
    }
}
