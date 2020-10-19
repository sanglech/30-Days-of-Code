import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t= scan.nextInt();
        boolean prime=true;
        int num=0;
        int sqrtNum=0;
        try{
             for (int i=1;i<=t;i++){
                prime=true;
                num=scan.nextInt();
                sqrtNum=(int)Math.sqrt(num);
                for(int j=2;j<=sqrtNum;j++){
                    if(num%j==0){
                        prime=false;
                        break;
                    }
                }
                if(prime&&num!=1){
                    System.out.println("Prime");
                }else{
                    System.out.println("Not prime");
                }

            }           
        }catch(Exception e){
            System.out.println("Invalid input");
        }
        scan.close();
    }
}