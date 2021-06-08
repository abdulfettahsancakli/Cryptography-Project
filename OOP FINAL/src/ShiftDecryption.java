
public class ShiftDecryption implements Decryption {
    @Override
    public String decrypt(String crypticText, byte key) {
        char[] shftdecArr = crypticText.toCharArray();
        int i,size=shftdecArr.length;

        for ( i = 0; i < size; i++) {
            if (shftdecArr[i] >= 97 && shftdecArr[i] <= 122) {
            	shftdecArr[i] = (char) ((((shftdecArr[i] - 97) - key + 26) % 26) + 97);
            }
        }
        
        String shfresolvedText = String.copyValueOf(shftdecArr);
        return shfresolvedText;
    }
    
    @Override
    public String getName() {
        return "shift";
    }
    
}
