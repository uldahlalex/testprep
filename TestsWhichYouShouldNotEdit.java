import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;





interface InterfaceWhichYouShouldNotEdit {
    int addTwoNumbers(int x, int y);
    default int returnTheLastNumberInArray(int[] array) {
        return array[0];
    }
    boolean doesStringContainExactlyTwoS(String s);
    String reverseString(String s);
    String combineTwoStringsButLeaveOutTheLastCharOfStringOne(String a, String b);
    boolean isArraySumEven(int[] array);
    boolean isPrime(int i);
}


public class TestsWhichYouShouldNotEdit {

    InterfaceWhichYouShouldNotEdit instance;// = new TheOnlyClassYouShouldAddCodeTo();

    @Test
    void addTwoNumbersTest() {
        Assertions.assertEquals(instance.addTwoNumbers(2,2), 4);
    }
    @Test
    void testLastNumberInArray() {
        Assertions.assertEquals(instance.returnTheLastNumberInArray(new int[] {1,2,3}), 3);
    }
    @Test
    void testTwoS1() {
        Assertions.assertEquals(instance.doesStringContainExactlyTwoS("yada"), false);
    }

    @Test
    void testTwoS2() {
        Assertions.assertEquals(instance.doesStringContainExactlyTwoS("sada"), false);
    }

    @Test
    void testTwoS3() {
        Assertions.assertEquals(instance.doesStringContainExactlyTwoS("sadas"), true);
    }
    @Test
    void testTwoS4() {
        Assertions.assertEquals(instance.doesStringContainExactlyTwoS("sadsas"), false);
    }
    @Test
    void reverseString() {
        Assertions.assertEquals(instance.reverseString("asd"), "dsa");
    }
    @Test
    void reverseString2() {
        Assertions.assertNotEquals(instance.reverseString("olo"), "lol");
    }
    @Test
    void combine1() {
        Assertions.assertEquals(instance.combineTwoStringsButLeaveOutTheLastCharOfStringOne("aba", "asd"), "abasd");
    }
    @Test
    void combine2() {
        Assertions.assertNotEquals(instance.combineTwoStringsButLeaveOutTheLastCharOfStringOne("aba", "asd"), "abaasd");
    }
    @Test
    void arraySumEven() {
        Assertions.assertEquals(instance.isArraySumEven(new int[] {2,5,7}), true);
    }
    @Test
    void arraySumEven2() {
        Assertions.assertEquals(instance.isArraySumEven(new int[] {2,5,8}), false);
    }
    @Test
    void isPrime() {
        Assertions.assertEquals(instance.isPrime(11), true);
    }
    @Test
    void isPrime2() {
        Assertions.assertEquals(instance.isPrime(42), false);
    }
    @Test
    void isPrime3() {
        Assertions.assertEquals(instance.isPrime(223), true);
    }
}
