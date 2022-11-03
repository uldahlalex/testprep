import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyClassWhichImplementsTheInterface implements InterfaceWhichYouShouldNotEdit {

    @Override
    public int addTwoNumbers(int x, int y) {
        return x+y;
    }

    @Override
    public int returnTheLastNumberInArray(int[] array) {
        return array[array.length-1];
    }

    @Override
    public boolean doesStringContainExactlyTwoS(String s) {
        int numOfS = 0;
        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i)=='s') {
                numOfS = numOfS+1;
            }
        }
        return numOfS==2;
    }

    @Override
    public String reverseString(String s) {
        String reversed = "";
        for(int i = s.length()-1; i>-1; i--) {
            reversed = reversed+s.charAt(i);
        }
        return reversed;
    }

    @Override
    public String combineTwoStringsButLeaveOutTheLastCharOfStringOne(String a, String b) {
        return a.substring(0,a.length()-1)+b;
    }

    @Override
    public boolean isArraySumEven(int[] array) {
        int sum = 0;
        for(var i = 0; i<array.length; i++) {
            sum = sum+array[i];
        }
        return sum%2==0;
    }

    @Override
    public boolean isPrime(int candidateToPrime) {
        for(var i = 2; i<candidateToPrime/2; i++ ) {
            if(candidateToPrime%i==0) {
                return false;
            }
        }
        return true;
    }
}



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

    InterfaceWhichYouShouldNotEdit instance = new MyClassWhichImplementsTheInterface();

    @Test
    void addTwoNumbersTest() {
        Assertions.assertEquals(instance.addTwoNumbers(2,2), 4);
    }
    @Test
    void testLastNumberInArray() {
        Assertions.assertEquals(instance.returnTheLastNumberInArray(new int[] {1,2,3}), 3);
    }



    @Test
    void testTwoS3() {
        Assertions.assertEquals(instance.doesStringContainExactlyTwoS("sadas"), true);
    }

    @Test
    void reverseString() {
        Assertions.assertEquals(instance.reverseString("asd"), "dsa");
    }

    @Test
    void combine1() {
        Assertions.assertEquals(instance.combineTwoStringsButLeaveOutTheLastCharOfStringOne("aba", "asd"), "abasd");
    }
    @Test
    void arraySumEven() {
        Assertions.assertEquals(instance.isArraySumEven(new int[] {2,5,7}), true);
    }

    @Test
    void isPrime() {
        Assertions.assertEquals(instance.isPrime(11), true);
    }

    @Test
    void isPrime3() {
        Assertions.assertEquals(instance.isPrime(223), true);
    }
}
