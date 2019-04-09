package cipher;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class encryptTest {
    @Test
    public void encrypt_testWordEncryption_String() {
        encrypt testEncrypt = new encrypt();
        String expectedOutput = "bcd";
        assertEquals(expectedOutput, testEncrypt.encrypt("abc", 1));
    }
    @Test
    public void encrypt_testSentenceEncryption_String() {
        encrypt testEncrypt = new encrypt();
        String expectedOutput = "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD";
        assertEquals(expectedOutput, testEncrypt.encrypt("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", 23));
    }
}
