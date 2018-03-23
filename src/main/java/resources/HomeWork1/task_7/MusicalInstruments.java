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

class StringedInstruments extends MusicalInstruments{ //наследование

    static {
        System.out.print("Stringed instruments → ");
    }

    public StringedInstruments(String color) {
        super(color);
    }

    public String sound() {
        return "Trinnn";
    }

    @Override
    String description() {
        return null;
    }

}

class Guitar extends StringedInstruments{ //наследование

    static {
        System.out.println("Guitar");
    }

    Guitar(String color) {
        super(color);
    }

    @Override
    public String sound() { //полиморфизм
        return "Trin-trin-trin";
    }

    private String defenition="The guitar is a fretted musical instrument that usually has six strings."; //инкапсуляция

    @Override
    public String description(){
        return this.defenition;
    }

}

class DrumsInstruments extends MusicalInstruments{ //наследование

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

class Drum extends DrumsInstruments{//наследование

    static {
        System.out.println("Drum");
    }

    Drum(String color) {
        super(color);
    }

}


class Main{
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