package main.java.epam_course.HomeWork1.task_7;

public class Drum extends DrumsInstruments{//наследование

    static {
        System.out.println("Drum");
    }

    public Drum(String color) {
        super(color);
    }

    @Override
    public void sound(){
        System.out.println("Bam-bam-bam");
    }

}
