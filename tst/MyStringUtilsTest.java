import org.junit.Assert;
import org.junit.Test;

public class MyStringUtilsTest {
    @Test
    public void reverseTest() {
        Assert.assertEquals("sirhc", MyStringUtils.reverse("chris"));
        Assert.assertEquals("esrever", MyStringUtils.reverse("reverse"));
        Assert.assertEquals("emordnilap", MyStringUtils.reverse("palindrome"));
    }

    @Test
    public void isPalindromeTest() {
        Assert.assertTrue(MyStringUtils.isPalindrome("racecar"));
        Assert.assertTrue(MyStringUtils.isPalindrome("noon"));
        Assert.assertFalse(MyStringUtils.isPalindrome("music"));
    }

    @Test
    public void countOfVowelsTest() {
        Assert.assertEquals(4, MyStringUtils.countOfVowels("AUDIOS"));
        Assert.assertEquals(3, MyStringUtils.countOfVowels("ELLIOT"));
        Assert.assertEquals(3, MyStringUtils.countOfVowels("CHRISTOPHER"));
    }

    @Test
    public void oddContainsTest() {
        Assert.assertTrue(MyStringUtils.oddContains("abcdefg", "aceg"));
        Assert.assertTrue(MyStringUtils.oddContains("abcdefghi", "acegi"));
        Assert.assertFalse(MyStringUtils.oddContains("abcdefg", "ab"));
    }
}
