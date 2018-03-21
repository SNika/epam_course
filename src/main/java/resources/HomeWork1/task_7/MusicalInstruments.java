package main.java.resources.HomeWork1.task_7;

abstract class MusicalInstruments{

    static {
        System.out.println("Musical instruments:");
    }

    MusicalInstruments(String color){
        System.out.println("The color is "+color);
    }

    abstract void sound();

    private void description(){ //инкапсуляция
        System.out.println("A musical instrument is an instrument created or adapted to make musical sounds. " +
                "In principle, any object that produces sound can be considered a musical instrument—" +
                "it is through purpose that the object becomes a musical instrument");
    }

}

class StringedInstruments extends MusicalInstruments{ //наследование

    static {
        System.out.print("Stringed instruments → ");
    }

    StringedInstruments(String color) {
        super(color);
    }

    void sound() {
        System.out.println("Melody: Trinnn");
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
    void sound() { //полиморфизм
        System.out.println("Melody: Trin-trin-trin");
    }

}

class DrumsInstruments extends MusicalInstruments{ //наследование

    static {
        System.out.print("Drums instruments → ");
    }

    DrumsInstruments(String color) {
        super("green");
    }

    void sound() {
        System.out.println("Melody: Bammm");
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
        guitar.sound();
        MusicalInstruments drum=new Drum("white");
        drum.sound();
    }
}