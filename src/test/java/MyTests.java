import org.junit.Assert;
import org.junit.Test;

public class MyTests {
    @Test
    public void test1(){
        Assert.assertEquals(true, Main.czyDwucykliczny("101101"));
        Assert.assertEquals(false, Main.czyDwucykliczny("0"));
        Assert.assertEquals(true, Main.czyDwucykliczny("10101010"));
        Assert.assertEquals(false, Main.czyDwucykliczny("110000"));
    }
}