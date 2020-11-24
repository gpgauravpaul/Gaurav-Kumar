package Stringgames;

import java.util.Scanner;

public class FirstCharacterCaps {

    public static void main (String[] args) {
        System.out.println ("Enter a String");
        Scanner scan = new Scanner(System.in);
        System.out.println (func (scan.nextLine ()));
    }
    public static String func (String str) {
    String split[] = str.split (" "); String Main ="";int count = split.length;
    for(String word:split) { int wordcount = word.length ();
        String blank = ""; for (int j=0;j<wordcount;j++) { if (j==0) {
         blank = blank + Character.toUpperCase (word.charAt (j)); } else { blank = blank + word.charAt(j); }
        }Main = Main +" "+ blank; }return  Main; }}
