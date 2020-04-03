import com.es2.decorator.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestDecorator {

    @AfterAll
    static void tearDown() {
        End e = new End();
    }

    @Test
    public void auth_UsernameRightAndPasswordRight_NoException() {
        AuthInterface auth = new Auth();
        assertDoesNotThrow(() -> {
            auth.auth("admin", "admin");
        });
    }

    @Test
    public void auth_UsernameRightAndPasswordWrong_ThrowsException() {
        AuthInterface auth = new Auth();

        assertThrows(AuthException.class, () ->{
            auth.auth("admin", "falso");
        });
    }


    @Test
    public void auth_UsernameWrongAndPasswordRight_ThrowsException() {
        AuthInterface auth = new Auth();

        assertThrows(AuthException.class, () ->{
            auth.auth("falso", "admin");
        });
    }

    @Test
    public void auth_UsernameWrongAndPasswordWrong_ThrowsException() {
        AuthInterface auth = new Auth();

        assertThrows(AuthException.class, () ->{
            auth.auth("falso", "falso");
        });
    }

    @Test
    public void auth_ValidCommonWord_NoException() {
        AuthInterface auth = new CommonWordsValidator(new Auth());

        assertDoesNotThrow(() -> {
            auth.auth("admin", "admin");
        });
    }

    @Test
    public void auth_InvalidCommonWord_ThrowsException() {
        AuthInterface auth = new CommonWordsValidator(new Auth());

        assertThrows(AuthException.class, () -> {
            auth.auth("admin", "qwe");
        });
    }
}
