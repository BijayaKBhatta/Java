package com.example.security;

import java.util.Base64;    
import javax.crypto.Cipher;  
import javax.crypto.KeyGenerator;   
import javax.crypto.SecretKey;  
public class EncryptionDecryptionAES {  
static Cipher cipher;  
public static SecretKey myprivateKey;

   public static void main(String[] args) throws Exception {
	//public static void mainM() throws Exception {
       KeyGenerator generateKey = KeyGenerator.getInstance("AES");
        generateKey.init(128); 
        SecretKey privateKey = generateKey.generateKey();
        myprivateKey = privateKey;
        System.out.println("privateKey:- "+privateKey);

        cipher = Cipher.getInstance("AES"); 
        String myPassword = "Cs}Tve2]0t"; // plain Text password
        System.out.println("Password before Encryption:- " + myPassword);

        String encryptedPassword = encrypt(myPassword, privateKey);
        System.out.println("Encrypted password:- " + encryptedPassword);

       String decryptedPassword = decrypt(encryptedPassword, privateKey);
        System.out.println("Decrypted Password:- " + decryptedPassword);
    }

    public static String encrypt(String myPassword, SecretKey privateKey)
            throws Exception {
        byte[] plainTextByte = myPassword.getBytes();
        cipher.init(Cipher.ENCRYPT_MODE, privateKey);
        byte[] encryptedByte = cipher.doFinal(plainTextByte);
        Base64.Encoder encoder = Base64.getEncoder();
        String encryptedText = encoder.encodeToString(encryptedByte);
        return encryptedText;
    }

    public static String decrypt(String encryptedPassword, SecretKey privateKey)
            throws Exception {
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] encryptedTextByte = decoder.decode(encryptedPassword);
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decryptedByte = cipher.doFinal(encryptedTextByte);
        String decryptedText = new String(decryptedByte);
        return decryptedText;
    }
}