import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        int retDate[]= new int[3];
        int expDate[]= new int [3];
        int fine=0;

        Scanner scan = new Scanner(System.in);
        for(int i=0;i<3;i++){
            retDate[i]=scan.nextInt();
        }

        for(int i=0;i<3;i++){
            expDate[i]=scan.nextInt();
        }
        scan.close();

        if(retDate[2]>expDate[2]){
            fine=10000;
        }
        else{
            if(retDate[1]>expDate[1]&&retDate[2]<=expDate[2]){
                if(retDate[1]-expDate[1]>=10){
                    fine =0;
                }
                else if(retDate[2]-expDate[2]<0){
                    fine=0;
                }
                else{
                    fine = 500*(retDate[1]-expDate[1]);
                }
            }
            else{
                if(retDate[0]>expDate[0]&&retDate[1]<=expDate[1]){
                    fine = 15* (retDate[0]-expDate[0]);
                }
            }
        }


        System.out.println(fine);
    }
}
