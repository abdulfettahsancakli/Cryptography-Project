
public class Spy implements Listener {
    public Spy() {
        this.key = (byte) Math.floor(Math.random() * 256 - 128);
        decryption = Decryptor.getDecryptionByName("binary");
    }
    
    public void register(Encrypter encUser) {
        Encryption preferEncryption = Encrypter.getEncrpytionByName("binary");
        encUser.register(preferEncryption, key, this);
    }
    
    @Override
    public void update(String crypticText) {
        String resolvedText = decryption.decrypt(crypticText, key);
        
        System.out.println("Decrypted message with Spy : ");
        System.out.println(resolvedText);
    }
    
    private Decryption decryption;
    private byte key;
}
