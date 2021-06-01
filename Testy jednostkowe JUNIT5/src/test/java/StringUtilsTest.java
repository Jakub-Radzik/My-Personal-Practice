import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void testMethod1(){
        Assert.assertEquals("DCBA", StringUtils.reverse("ABCD"));
    }

    @Test
    public void testMethod2(){
        Assert.assertEquals("tnedutS", StringUtils.reverse("Student"));
    }

    @Test
    public void testMethod3(){
        Assert.assertNull(StringUtils.reverse(null));
    }

    @Test
    public void testMethod4(){
        Assert.assertNull(StringUtils.reverse(""));
    }

}
