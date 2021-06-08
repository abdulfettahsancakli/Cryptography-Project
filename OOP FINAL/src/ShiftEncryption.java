
public class ShiftEncryption implements Encryption {
    
    @Override
    public String encrypt(String text, byte key) {
    	
        char[] shftencArr = text.toLowerCase().toCharArray();
        int i,size=shftencArr.length;
        
        for (i = 0; i < size; i++) {
            if (shftencArr[i] >= 97 && shftencArr[i] <= 122) {
            	shftencArr[i] = (char) ((((shftencArr[i] - 97) + key) % 26) + 97);
            }
        }
        
        String shiftencryptedTxt = String.copyValueOf(shftencArr);
        return shiftencryptedTxt;
    }
    @Override
    public String getName() {
        return "shift";
    }
}
