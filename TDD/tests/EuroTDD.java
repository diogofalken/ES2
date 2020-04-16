import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EuroTDD {

    @BeforeEach
    void setUp() {
    }

    @AfterAll
    static void tearDown() {
        new End();
    }

    @Test
    void testEuroObjectCreation(){
        Euro tenEuros = new Euro(1000);
    }

    @Test
    void testEuroToString(){
        Euro twoEuros = new Euro(2);
        assertEquals("EUR 2.00", twoEuros.toString());

        twoEuros = new Euro(2.5);
        assertEquals("EUR 2.50", twoEuros.toString());
    }

    @Test
    void testEuroEquality() {
        Euro twoEuros = new Euro(200);
        Euro twoEuros2 = new Euro(200);

        assertTrue(twoEuros.equals(twoEuros2));
    }

    @Test
    void testEuroInequality() {
        Euro twoEuros = new Euro(300);
        Euro sixEuros = new Euro(600);

        assertFalse(twoEuros.equals(sixEuros));
    }

    @Test
    void testEuroEqualsDifferentObject() {
        Euro twoEuros = new Euro(200);
        Double twoEuros2 = 200d;

        assertFalse(twoEuros.equals(twoEuros2));
    }

    @Test
    void testSubtraction() {
        Euro twoEuros = new Euro(200);
        Euro oneEuro = new Euro(100);

        System.out.print(twoEuros.minus(oneEuro));

        assertTrue(new Euro(100).equals(twoEuros.minus(oneEuro)));
    }

    @Test
    void testEquivalence() {
        Euro euroCents = new Euro(61);
        Euro euroCents1 = new Euro(103);
        Euro euroCents2 = new Euro(42);


        assertTrue(euroCents.equals(euroCents1.minus(euroCents2)));
    }
}