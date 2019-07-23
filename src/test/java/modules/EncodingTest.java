package modules;
import org.junit.Test;

import static org.junit.Assert.*;

public class EncodingTest {
    Encoding testEncoding = new Encoding("SAM", 2);
    @Test
    public void checkIfItCreatesInstance()
    {
        assertEquals(true, testEncoding instanceof Encoding);
    }

    @Test
    public void checkIfSavesInputText()
    {
        assertEquals("SAM", testEncoding.getInputText() );
    }

    @Test
    public void checkKeyIsSaved()
    {
        assertEquals(2,testEncoding.getKey());
    }

    @Test
    public void isNotEmpty()
    {
        assertEquals(true,testEncoding.isNotEmpty());
    }

    @Test
    public void isValidInputText()
    {
        assertEquals(true, testEncoding.isValidInputText());
    }

    @Test
    public void isValidKey()
    {
        assertEquals(true, testEncoding.isValidKey());
    }

    @Test
    public void validEncoding()
    {
        assertEquals("UCO" , testEncoding.encode());
    }


}
hgdfhdkjhdvhhdchd