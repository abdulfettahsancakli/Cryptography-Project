
public class General implements Listener {
		private Decryption decryption;
	    private byte key;
	    
    public General() {
        this.key = (byte) Math.floor(Math.random() * 25 + 1);
        decryption = Decryptor.getDecryptionByName("shift");
    }
    
    public void register(Encrypter encUser) {
        Encryption preferEncrpytion= Encrypter.getEncrpytionByName("shift");
        encUser.register(preferEncrpytion, key, this);
    }
    
    @Override
    public void update(String crypticText) {
        String decryptedText = decryption.decrypt(crypticText, key);
        
        System.out.println("Decrypted message with General: ");
        System.out.println(decryptedText);
    }
}
