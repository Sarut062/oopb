package chap6;

public abstract class ElecticAppliance {

    public abstract void on();

    public abstract void off();

    public abstract void work();

}//end

abstract class Fan1 extends ElecticAppliance {

    @Override
    public void on() {
        System.out.println("Fan : on()");
    }

    @Override
    public void off() {
        System.out.println("Fan : off()");
    }
}//end class

class Fan2 extends Fan1 {

    @Override
    public void work() {
        System.out.println("Fan : work()");
    }
}
