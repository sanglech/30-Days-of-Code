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
        int[][] arr = new int[6][6];
        int temp_max=0;
        int new_max=0;

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){
               temp_max=arr[i][j]+ arr[i][j+1] + arr[i][j+2] + 
                arr[i+1][j+1]+
                arr[i+2][j] + arr[i+2][j+1]+ arr[i+2][j+2];
                
               // System.out.println("TEMP MAX IS: "+ temp_max);
               // System.out.println(arr[i][j]+","+arr[i+1][j]+","+arr[i+2][j]);

                if(temp_max>new_max||i==0&&j==0){
                    new_max=temp_max;
                }
            }
        }

        System.out.println(new_max);
        scanner.close();
    }
}
