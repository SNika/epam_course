package java.epam_course.HomeWork1.task_7;

import main.java.epam_course.HomeWork1.task_7.*;

import org.junit.Before;
import org.junit.Test;

import static main.java.epam_course.HomeWork1.task_7.MusicalInstruments.currencyRate;
import static org.junit.Assert.assertEquals;


public class GuitarTest {
    private Guitar guitar;

    @Before
    public void setUp() {
        guitar=new Guitar("white");
    }

    @Test
    public void checkedMethodSoundReturnedString() {
        assertEquals("Trin-trin-trin", guitar.sound());
    }

    @Test
    public void checkMethodDescriptionReturnedString(){
        assertEquals("The guitar is a fretted musical instrument that usually has six strings.",
                guitar.description());
    }

    @Test
    public void checkMethodPriceReturnedInt(){
        assertEquals(400*currencyRate, guitar.priceInRubles(400));
    }

}