package com.sush.test;

public class Password {
    public static void main(String[] args) {
        String password = "kallu@22";
        System.out.println(isValidPassword(password));
    }
    public static String isValidPassword(String password) {
        char[] passwd = password.toCharArray();

        if (password.length() >= 6 && password.length() <= 20){
            int lowerCount = 0, upperCount = 0, numberCount = 0, specialCharCount = 0;

            for (char chr : passwd){
                if(Character.isLowerCase(chr))
                    lowerCount++;
                else if(Character.isUpperCase(chr))
                    upperCount++;
                else if(Character.isDigit(chr))
                    numberCount++;
                else if(password.contains("@") || password.contains("$") || password.contains("&"))
                    specialCharCount++;

            }
            if(lowerCount > 0 && upperCount > 0 && numberCount > 0 && specialCharCount > 0) {
                return "Valid";
            }
        }
        return "invalid";
    }
}
