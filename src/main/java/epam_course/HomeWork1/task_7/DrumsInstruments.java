package main.java.epam_course.HomeWork1.task_7;

public class DrumsInstruments extends MusicalInstruments{ //наследование

    static {
        System.out.print("Drums instruments → ");
    }

    DrumsInstruments(String color) {
        super("green");
    }

    public String sound() {
        return "Bammm";
    }

    private String definition="Drums are the world's oldest and most ubiquitous musical instruments, " +
            "and the basic design has remained virtually unchanged for thousands of years."; //инкапсуляция

    @Override
    String description() {
        return this.definition;
    }

}
