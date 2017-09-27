import org.junit.Assert;
import org.junit.Test;

public class MyStringUtilsTest {
    @Test
    public void reverseTest() {
        String s = "chris";
        String newString = MyStringUtils.reverse(s);
        Assert.assertEquals("sirhc", newString);
    }

    @Test
    public void isPalindromeTest() {
        String s = "racecar";
        Assert.assertTrue(MyStringUtils.isPalindrome(s));
    }

    @Test
    public void countOfVowelsTest() {
        String s = "AUDIOS";
        Assert.assertEquals(4, MyStringUtils.countOfVowels(s));
    }

    @Test
    public void oddContainsTest() {
        Assert.assertTrue(MyStringUtils.oddContains("abcdefg", "aceg"));
    }
}
