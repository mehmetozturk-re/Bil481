/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package myDemoApp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test void increasingTest(){
        int[] arrayGiven = new int[]{1,2,9,8,7,6,5,4,3,10,11};
        int[] arrayExpect = new int[]{1,2,3,4,5,6,7,8,9,10,11};
        assertArrayEquals(arrayExpect, App.sortTheArrayBetweenIndexes(arrayGiven, 2, 8, false));
    }

    @Test void decreasingTest(){
        int[] arrayGiven = new int[]{1,2,3,4,5,6,7,8,9,10,11};
        int[] arrayExpect = new int[]{1,2,9,8,7,6,5,4,3,10,11};
        assertArrayEquals(arrayExpect, App.sortTheArrayBetweenIndexes(arrayGiven, 2, 8, true));
    }

    @Test void emptyBooleanTest(){
        int[] arrayGiven = new int[11];
        int[] arrayExpect = new int[11];
        assertArrayEquals(arrayExpect, App.sortTheArrayBetweenIndexes(arrayGiven, 2, 8, true));
    }

    @Test void negativeIndexTest(){
        int[] arrayGiven = new int[]{1,2,9,8,7,6,5,4,3,10,11};
        int[] arrayExpect = new int[]{1,2,3,4,5,6,7,8,9,10,11};
        assertArrayEquals(arrayExpect, App.sortTheArrayBetweenIndexes(arrayGiven, -2, 8, false));
    }

    @Test void greaterIndexThanArrayLengthTest(){
        int[] arrayGiven = new int[]{1,2,9,8,7,6,5,4,3,10,11};
        int[] arrayExpect = new int[]{1,2,3,4,5,6,7,8,9,10,11};
        assertArrayEquals(arrayExpect, App.sortTheArrayBetweenIndexes(arrayGiven, 2, 15, false));
    }

    @Test void switchedIndexTest(){
        int[] arrayGiven = new int[]{1,2,9,8,7,6,5,4,3,10,11};
        int[] arrayExpect = new int[]{1,2,3,4,5,6,7,8,9,10,11};
        assertArrayEquals(arrayExpect, App.sortTheArrayBetweenIndexes(arrayGiven, 8, 2, false));
    }
    
    @Test void zeroLengthBetweenIndexesTest(){
        int[] arrayGiven = new int[]{1,2,9,8,7,6,5,4,3,10,11};
        int[] arrayExpect = new int[]{1,2,9,8,7,6,5,4,3,10,11};
        assertArrayEquals(arrayExpect, App.sortTheArrayBetweenIndexes(arrayGiven, 2, 2, false));
    }

}
