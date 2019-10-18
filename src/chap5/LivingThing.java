package chap5;

public class LivingThing {

    protected String name = "LivingThing";

    public void grow() {
        System.out.println("LivingThing : grow");
    }

    public void reproduce() {
        System.out.println("LivingThing : reproduce");

    }
}

class plant extends LivingThing {

}//end class

class Animal extends LivingThing {

    private String color;
    protected int leg;

    public void move() {
        System.out.println("Animail move()");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}//end class Animal

class Dog extends Animal {

    protected int leg;

    public void bark() {
        System.out.println("Dog bark()");
    }

    @Override
    public void move() {
        System.out.println("Dog : Walk and Run");
    }
}

class CallDog {

    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.move();
    }
}
