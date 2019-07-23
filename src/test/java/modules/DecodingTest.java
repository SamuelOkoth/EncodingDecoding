package modules;

import static org.junit.Assert.*;


import org.junit.Test;



    public class DecodingTest {
        Decoding testDecoding = new Decoding( 2, "UCO");
        @Test
        public void checkIfSavesInputText()
        {
            assertEquals("UCO", testDecoding.getInputText() );
        }

        @Test
        public void checkKeyIsSaved()
        {
            assertEquals(2,testDecoding.getKey());
        }

        @Test
        public void isValidInputText()
        {
            assertEquals(true, testDecoding.isValidInputText());
        }

        @Test
        public void isValidKey()
        {
            assertEquals(true, testDecoding.isValidKey());
        }

        @Test
        public void validDecoding()
        {
            assertEquals("SAM" , testDecoding.decode());
        }
    }



