📓import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int x=sc.nextInt();
            int y=sc.nextInt();
            System.out.println(x/y);
        }
        catch(InputMismatchException ie){
            System.out.println(ie.getClass().getName());
        }
        catch(ArithmeticException ie){
         System.out.println(ie.getClass().getName()+": "+ie.getMessage());
        }
    }
}
