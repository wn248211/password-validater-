package com.example.a2; /**
 * Created by Wenlong on 2017/5/26.
 */

public class passwordValidater {

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





