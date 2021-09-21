public class Main {
    public static void main(String[] args) {
        Dog Dog1 = new Dog();
        Dog1.setName("Бобик");
        Dog1.setAge(7);
        System.out.println("Кличка: "+Dog1.getName()+" Возраст: "+ Dog1.getAge());
    }
}
class Dog {
    String name;
    int age;
    String getName(){
    return this.name;
    }
        int getAge(){
        return age;
}
void setName(String dogName) {
    name = dogName;
}
        void setAge(int dogAge){
            age=dogAge;
    }

}
