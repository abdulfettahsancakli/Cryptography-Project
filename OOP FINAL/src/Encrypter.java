import java.util.*;
public class Encrypter {
	 private static List<Encryption> encryptionAlgorithms;
	 private        List<Object[]>Listeners;
	 
    public static void InitializeEncryptions() {
    	encryptionAlgorithms = new ArrayList<>();
    	encryptionAlgorithms.add(new ShiftEncryption());
    	encryptionAlgorithms.add(new BinaryEncryption());
    }
     
    public void register(Encryption encryption, byte key, Listener listener) {
        Object[] aboutListener = new Object[3];
        aboutListener[0] = encryption;
        aboutListener[1] = key;
        aboutListener[2] = listener;
        Listeners.add(aboutListener);
    }
    
    
    public void readFile(String fName) {
        String text = "";
        
        try { text = new String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(fName))); } 
        
        catch (java.io.IOException e) 
        { System.err.println(e.getMessage()); }
        
        
        for (Object[] aboutListener : Listeners) {
            Encryption encryption = (Encryption) aboutListener[0];
            byte key = (Byte) aboutListener[1];
            Listener listener = (Listener)aboutListener[2];
            String crypticText = encryption.encrypt(text, key);
            listener.update(crypticText); } }
     
    public static Encryption getEncrpytionByName(String name) {
        for (Encryption enc : encryptionAlgorithms) {
            if (enc.getName().equals(name)) {
                return enc; } }
    
        return null;
    }
    
    public Encrypter() {
        Listeners = new ArrayList<>();
    }
}
