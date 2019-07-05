/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Gradle.builds.Java.projects;

import java.util.LinkedList;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
    @Test
    public void testMockClass() throws Exception {
        // you can mock concrete classes, not only interfaces
        LinkedList mockedList = mock(LinkedList.class);

        // stubbing appears before the actual execution
        String value = "first";
         when(mockedList.get(0)).thenReturn(value);

         assertEquals(mockedList.get(0), value);
//        assertEquals(value, value);

    }
}