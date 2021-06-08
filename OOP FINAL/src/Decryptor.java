import java.util.*;
public class Decryptor {
	private static List<Decryption> DecryptionAlgorithms;
    public static void InitializeDecryptions() {
    	DecryptionAlgorithms = new ArrayList<>();
    	DecryptionAlgorithms.add(new ShiftDecryption());
    	DecryptionAlgorithms.add(new BinaryDecryption());
    }
    
    public static Decryption getDecryptionByName(String name) {
        for (Decryption dcrpyt : DecryptionAlgorithms) {
            if (dcrpyt.getName().equals(name)) {
                return dcrpyt;
            }
        }
        return null;
    }
}
