package main.java.epam_course.HomeWork1.task_7;

public class App{
    public static void main (String [] args){
        Guitar guitar=new Guitar("blue");
        guitar.description();
        guitar.sound();
        guitar.price(200);
        MusicalInstruments drum=new Drum("white");
        drum.description();
        drum.sound();
        drum.price(500);
    }
}
