import com.es2.singleton.End;
import com.es2.singleton.Registry;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestSingleton {

    @AfterAll
    static void tearDown() {
        End e = new End();
    }

    @Test
    public void setPath_CorrectPath_True()  {
       Registry.getInstance().setPath("teste");

       assertEquals("teste", Registry.getInstance().getPath());
    }

    @Test
    public void setConnectionString_CorrectConnectionString_True()  {
        Registry.getInstance().setConnectionString("teste");

        assertEquals("teste", Registry.getInstance().getConnectionString());
    }

    @Test
    public void setPath_SendNullPath_Null()  {
        Registry.getInstance().setPath(null);

        assertEquals(null, Registry.getInstance().getPath());
    }

    @Test
    public void getConnectionString_SendNullConnectionString_Null()  {
        Registry.getInstance().setConnectionString(null);

        assertEquals(null, Registry.getInstance().getConnectionString());
    }

    @Test
    public void singleton_CheckConstructorPrivate_True() throws NoSuchMethodException, SecurityException {
        assertTrue(Modifier.isPrivate(Registry.class.getDeclaredConstructor().getModifiers()));
    }


}
