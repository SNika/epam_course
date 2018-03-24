package main.java.epam_course.HomeWork1.task_7;

public class StringedInstruments extends MusicalInstruments{ //наследование

    static {
        System.out.print("Stringed instruments → ");
    }

    public StringedInstruments(String color) {

        super(color);
    }

    public String sound() {

        return "Trinnn";
    }

    String description() {
        return "This is Stringed Instruments";
    }

}
