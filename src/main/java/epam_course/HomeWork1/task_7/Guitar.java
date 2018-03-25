package main.java.epam_course.HomeWork1.task_7;

public class Guitar extends StringedInstruments{ //наследование

    static {
        System.out.println("Guitar");
    }

    public Guitar(String color) {
        super(color);
    }

    @Override
    public void sound() { //полиморфизм
        System.out.println("Trin-trin-trin");
    }

    private String defenition="The guitar is a fretted musical instrument that usually has six strings."; //инкапсуляция

    @Override
    public void description(){
        System.out.println(this.defenition);
    }

}
