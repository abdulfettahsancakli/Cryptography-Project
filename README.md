# Cryptography-Project
## Encryption &amp;Decryption Implementations

- The program first initializes the encryption/decryption lists statically.
 And then, it creates an Encryptor object.
 Then, it registers a number if General and Spy type listeners in it. 
 Then it asks a file name.
 When a file name is given in the console, it reads it's contents, encrypts it for each listener and update them.
 Then it asks for a file name again, repeating the process.

- I would like to explain the most important classes so that each user reviewing the program understands the features applied in the classes.

# Example of Working
![Exampleofworking](https://github.com/abdulfettahsancakli/Cryptography-Project/blob/main/howtoworks.JPG)

 # Main Class 
- In this class, we first take the file received from the user and start reading it. To use the program, we create an object from the encrypter class and save it with the register method in the general and spy classes.When the class first registers, we initially start the encryption and decryption algorithms so that other classes can function.

# Encrypter
- In this example, you can use the encryption algorithm to create a new encryption algorithm.
These members are stored in a list called Listeners.
As a user, we will give you the name of a file.
It will read the contents of the file and remove it from the list of individual members of the class, 
then find the type of encryption that the listener wants, 
then use the key that it reads from the file with the encryption that it will also use when it becomes a member.
Then the program will send this to the audience.

# General Class 
- Our general class implements the listener class.When the constructor function is executed, 
it generates a random number between 1 and 25 and keeps it in its key.It uses the shift algorithm and reads the encrypted text.

# Spy Class 
- They implement the listener class in our Spy class.They behave similar to the general class, but they are completely different from each other. 
When the constructor function is executed, it generates a random number between 1 and 25 and keeps it in its key.
It reads the incoming encrypted text using the binary algorithm.

# Shift Encryption/Decryption classes 
- In the Shift encryption and decryption classes, the text that is read from the file in brief is encrypted by shifting the value of the key by the value of the key,
 and when we do this backwards, we read the first text in the file.

# Binary Encryption/Decryption classes 
- In binary encryption and decryption classes, the text that is read from the file is encrypted with the xor operation after the text is converted to binary format with the value of the key, 
 and we read the first text in the file when we do this backwards.
