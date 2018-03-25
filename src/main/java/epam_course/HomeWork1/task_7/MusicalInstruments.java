package main.java.epam_course.HomeWork1.task_7;

public abstract class MusicalInstruments{

    static {
        System.out.println("Musical instruments:");
    }

    MusicalInstruments(String color){
        System.out.println("The color is "+color);
    }

    abstract void sound();

    abstract void description();

    public static final double currencyRate=68.7;
    public void priceInRubles(double priceInDollars){
        double priceInRubbles;
        priceInRubbles=priceInDollars*currencyRate;
        System.out.println("Price: "+priceInRubbles+" RUB");
    }

}


