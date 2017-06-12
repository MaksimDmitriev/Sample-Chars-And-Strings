package ru.maksim;

public class Main {

    public static void main(String[] args) {
        // Three bytes
        String str = new String(new byte[]{-32, -92, -99});
        System.out.println(str.charAt(0));


        // charAt(0) returns a char (that is 2 bytes long) and prints the symbol which needs three bytes to be stored
        // TODO: how is it possible?
    }
}
