
public class BinaryEncryption implements Encryption {
    
    @Override
    public String encrypt(String text, byte key) {
    
        char[] encArr = text.toLowerCase().toCharArray();
        int j,size=encArr.length;
        
        for (j = 0; j < size; j++) {
            encArr[j] = (char) (encArr[j] ^ key);
        }
        
        String binaryencryptedTxt = String.copyValueOf(encArr);
        return binaryencryptedTxt;

    }
    
    @Override
    public String getName() {
        return "binary";
    }

}
