public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Жужик");
        System.out.println(cat.getName());
    }
}
class Cat {
    private String name = "безымянный кот";
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
}
