package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onceSetBalanceBracketsReturnsCorrectTrue() { assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));}

    @Test
    public void emptyStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void wrongOrderBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void onlyOneBracket (){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void checkNested (){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]][]"));
    }

    @Test
    public void checkSpecialCharacters (){
        assertTrue(BalancedBrackets.hasBalancedBrackets("\n"));
    }

    @Test
    public void allLeadingBracket (){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[[[[[[[["));
    }
    @Test
    public void allTrailingBracket (){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]]]]]]]]]"));
    }

    @Test
    public void positiveTest (){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Hello World[]"));
    }

    @Test
    public void negativeTest (){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Hello World]["));
    }

    @Test
    public void onlyOneTrailingBracket (){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

}
