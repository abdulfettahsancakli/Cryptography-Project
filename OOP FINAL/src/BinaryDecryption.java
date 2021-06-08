
public class BinaryDecryption implements Decryption {
    @Override
    public String decrypt(String crypticText, byte key) {
        char[] bindecArr = crypticText.toCharArray();
        int i,size=bindecArr.length;
        
        for (i = 0; i < size; i++) {
        	bindecArr[i] = (char) (bindecArr[i] ^ key);
        }
        
        String binresolvedText = String.copyValueOf(bindecArr);
        return binresolvedText;
    }
    
    
    @Override
    public String getName() {
        return "binary";
    }
    
}
