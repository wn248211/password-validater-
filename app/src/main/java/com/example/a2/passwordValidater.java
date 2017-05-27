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

}