package task_7;

abstract class MusicalInstruments{

    static {
        System.out.print("Musical instruments → ");
    }

    protected MusicalInstruments(String color){
       System.out.println(color);
    }

    void sound(){
        System.out.println("Tadammm");
    }
}

class StringedInstruments extends MusicalInstruments{ //наследование

    static {
        System.out.print("Stringed instruments → ");
    }

    StringedInstruments(String color) {
        super(color);
    }

    @Override
    void sound() {
        System.out.println("Trinnn");
    }
}

class Guitar extends StringedInstruments{ //наследование
static {
    System.out.println("Guitar");
}

    Guitar(String color) {
        super(color);
    }
}

class DrumsInstruments extends MusicalInstruments{ //наследование
    static {
        System.out.print("Drums instruments → ");
    }

    DrumsInstruments(String color) {
        super("green");
    }

    @Override
    void sound() {
        System.out.println("Bammm");
    }
}

class Drum extends DrumsInstruments{//наследование
    Drum(String color) {
        super("yellow");
    }

}
class Main{
    public static void main (String [] args){
        Guitar guitar=new Guitar("white");
        guitar.sound();
        MusicalInstruments drum=new Drum("white");
        drum.sound();
    }
}