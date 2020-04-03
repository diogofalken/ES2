import com.es2.whiteboxconditions.Rating;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestWhiteBoxCondition {

    @AfterAll
    static void tearDown() {
        End e = new End();
    }

    @Test
    public void evaluateScoreTemperature_TrueTrue_ItsHotOutAndSoAmI() {
        Rating rating = new Rating();

        assertEquals("It's hot out, and so am I", rating.evaluateScoreTemperature(10,35));
    }

    @Test
    public void evaluateScoreTemperature_TrueFalse_ImInABadMood() {
        Rating rating = new Rating();

        assertEquals("I'm in a bad mood", rating.evaluateScoreTemperature(10,20));
    }

    @Test
    public void evaluateScoreTemperature_FalseFalse_ImBalanced() {
        Rating rating = new Rating();

        assertEquals("I'm balanced", rating.evaluateScoreTemperature(7,22));
    }

    @Test
    public void evaluateScoreTemperature_FalseFalseSecond_ImBalanced() {
        Rating rating = new Rating();

        assertEquals("I'm in a bad mood", rating.evaluateScoreTemperature(4,22));
    }

    @Test
    public void evaluateIfCouldBeAcceptedAtDisco_TrueFalse_NotAccepted() {
        Rating rating = new Rating();

        assertEquals("Not Accepted", rating.evaluateIfCouldBeAcceptedAtDisco(9,4));
    }

    @Test
    public void evaluateIfCouldBeAcceptedAtDisco_FalseTrue_NotAccepted() {
        Rating rating = new Rating();

        assertEquals("Not Accepted", rating.evaluateIfCouldBeAcceptedAtDisco(7,5));
    }

    @Test
    public void evaluateIfCouldBeAcceptedAtDisco_TrueTrue_Accepted() {
        Rating rating = new Rating();

        assertEquals("Accepted", rating.evaluateIfCouldBeAcceptedAtDisco(8,5));
    }
}
