import org.junit.*;

import static org.junit.Assert.*;

public class TestRandomCharacter {
    RandomCharacter rc;

    @Before
    public void init(){
        this.rc = new RandomCharacter();
    }

    @Test
    public void testGetRandomLowerCaseLetter(){
        assertTrue(Character.isLowerCase(rc.getRandomLowerCaseLetter()));
    }

    @Test
    public void testGetRandomUpperCaseLetter(){
        assertTrue(Character.isUpperCase(rc.getRandomUpperCaseLetter()));
    }

    @Test
    public void testGetRandomDigitCharacter(){
        assertTrue(Character.isDigit(rc.getRandomDigitCharacter()));
    }

    @Test
    public void testGetRandomCharacter(){
        assertTrue(Character.isAlphabetic(rc.getRandomCharacter()));
    }
}
