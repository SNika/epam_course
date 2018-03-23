package main.java.resources.HomeWork1.task_7;

abstract class MusicalInstruments{

    static {
        System.out.println("Musical instruments:");
    }

    MusicalInstruments(String color){
        System.out.println("The color is "+color);
    }

    abstract String sound();

    abstract String description();

    public int price(int price){
        return price;
    }

}


