package main.java.epam_course.HomeWork1.task_7;

public abstract class MusicalInstruments{

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


