import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int maxOne=0;
        int potOne=0;

        String binNum=Integer.toBinaryString(n);

        for (int i=0;i<binNum.length();i++){
            //System.out.println(binNum);
            if(binNum.charAt(i)=='1'){
                potOne=1;
                //System.out.println("Character at i: "+binNum.charAt(i));
                if(i+1<binNum.length()){
                    for(int j=i+1;j<binNum.length();j++){
                        //System.out.println("Character at j: "+binNum.charAt(j));
                        if(binNum.charAt(j)=='1'){
                            potOne++;
                        }
                        else{
                            break;
                        }
                    }
                }
                if(potOne>maxOne){
                    maxOne=potOne;
                }
            }
        }
        System.out.println(maxOne);
        scanner.close();
    }
}
