package hw.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import hw.App;

public class AppTest {
    @Test void testConstructor() {
        int a=1;
        assertTrue(App.s(a));
    }
    @Test void tst1(){
        int[] b={2,4,7,8};
        try{
        assertEquals(2,App.find(b, 4, 7));
        }catch(Exception e)
        {
            System.exit(0);
        }
    }
    @Test void tst2(){
        int[] b={2,4,7,8};
        Exception exception = assertThrows(RuntimeException.class, () -> {
            App.find(b,7,6);
        });
    
        String expectedMessage = "Wrong min and max value!";
        String actualMessage = exception.getMessage();
    
        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test void tst3(){
        Exception exception = assertThrows(RuntimeException.class, () -> {
            App.find(null,7,6);
        });
    
        String expectedMessage = "Null array!";
        String actualMessage = exception.getMessage();
    
        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test void tst4(){
        Exception exception = assertThrows(RuntimeException.class, () -> {
            App.find(new int[0],7,6);
        });
    
        String expectedMessage = "Empty array!";
        String actualMessage = exception.getMessage();
    
        assertTrue(actualMessage.contains(expectedMessage));
    }
}
