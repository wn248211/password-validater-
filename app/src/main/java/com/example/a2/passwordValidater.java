package com.example.a2; /**
 * Created by Wenlong on 2017/5/26.
 */

import java.util.Scanner;
public class passwordValidater {
    public static void main(String[] args){
        Scanner kbd = new Scanner(System.in);
        String password = "";
        System.out.println("Enter your password: ");
        password = kbd.nextLine();
        if(isInsensitive(password)==false){
            System.out.println("case insensitive.");
            System.exit(0);
        }
        else if(isShort(password)==false){
            System.out.println("you need enter at least 8 characters long.");
            System.exit(0);
        }
        else if(isUpperCase(password)==false){
            System.out.println("your password must include at least one capital letter.");
            System.exit(0);
        }
        else if(isMix(password)==false){
            System.out.println("your password must include number and letters.");
            System.exit(0);
        }
        else if(includeIllegal(password)==false){
            System.out.println("your password cannot include !, @, #, $, %, ^, &, *, (, )");
            System.exit(0);
        }
        System.out.println("your password has been set successfully!");
    }
    public static boolean isInsensitive(String s)
    {
        if(s.equals("password"))
            return false;
        else
            return true;
    }

    public static boolean isShort(String s)
    {
        if(s.length() < 8)
            return false;
        else
            return true;
    }

    public static boolean isUpperCase(String s)
    {
        for (int i=0; i<s.length(); i++)
        {
            if (Character.isUpperCase(s.charAt(i)))
            {
                return true;
            }
        }
        return false;
    }
    public static boolean isMix(String s)
    {
        boolean includeNumber = false;
        boolean includeLetter = false;
        for (int i=0; i<s.length(); i++)
        {
            if (Character.isDigit(s.charAt(i)))
            {
                includeNumber=true;
            }
            if (Character.isAlphabetic(s.charAt(i)))
            {
                includeLetter=true;
            }
        }
        return (includeNumber&&includeLetter);
    }
    public static boolean includeIllegal(String s)
    {
        boolean result=true;
        char illegal[] = {'!','@','#','$','%','^','&','*','(',')'};
        for (int i=0; i<s.length(); i++)
        {
            for(int j=0; j<illegal.length;j++){
                if (s.charAt(i)==(illegal[j]))
                {
                    result = false;
                }
            }
        }
        return result;
    }
}