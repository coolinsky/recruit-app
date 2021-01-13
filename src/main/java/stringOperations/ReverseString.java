package main.java.stringOperations;

public class ReverseString {

    protected String reverseString(String str) {
        if (str.length() == 0) {
            return null;
        }
        if (str.length() == 1) {
            return str;
        }
        return str.charAt(0) + reverseString(str.substring(1, str.length()-1));
    }

}
