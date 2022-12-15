/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvidprototype;

import java.security.SecureRandom;


/**
 *
 * @author ca_ro
 */
public class PasswordGenerator {
    
public static String createPassword(int length)
{
    final String allowedChars = "abcdefghijklmnopqrstuvwABCDEFGHIJKLMNOP0123456789!§$%&?*+#";
    SecureRandom random = new SecureRandom();
    StringBuilder pass = new StringBuilder(length);
    
    for (int i = 0; i < length; i++) 
    {
        pass.append(allowedChars.charAt(random.nextInt(allowedChars.length())));
    }
    
    return pass.toString();
}
}

