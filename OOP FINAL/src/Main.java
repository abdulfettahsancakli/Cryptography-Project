
import java.util.*;
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        Encrypter.InitializeEncryptions();
        Decryptor.InitializeDecryptions();
  
        Encrypter encUser = new Encrypter();
        new General().register(encUser);
        new Spy().register(encUser);
        
        System.out.print("Please enter the name of the file to read: ");
        encUser.readFile(sc.nextLine());
    }
}
