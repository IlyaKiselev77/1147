import java.awt.*;
public class Main {
    public static void main(String[] args){
        Fox fox = new Fox("Лиса",10,Color.orange);
        System.out.println(fox.getName()+" "+fox.color);
    }
}

interface Animal {
    Color getColor();
}

class Fox implements Animal {
    String nickname;
    int age;
    Color color;

    public Fox(String nickname, int age, Color color) {
        this.nickname = nickname;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return "Fox";
    }

    @Override
    public Color getColor() {
        return color;
    }
}
