import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EncryptTest {
    @Test
    public  void  encrypt_encryptText(){
        Encrypt testEncrypt = new Encrypt("w",2);
        String expectedOutput = "y";
        assertEquals(expectedOutput,testEncrypt.encrypt());
    }
    @Test
    public  void  decrypt_decryptText(){
        Encrypt testDecrypt = new Encrypt("y",2);
        String expectedOutput = "w";
        assertEquals(expectedOutput,testDecrypt.decrypt());
    }
}
