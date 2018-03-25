package main.java.epam_course.HomeWork1.task_7;

public class StringedInstruments extends MusicalInstruments{ //наследование

    static {
        System.out.print("Stringed instruments → ");
    }

    public StringedInstruments(String color) {
        super(color);
    }

    public void sound() {
        System.out.println("Trinnn");
    }

    public void description() {
        System.out.println("This is a class of Stringed Instruments");
    }

}
