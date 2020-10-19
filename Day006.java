import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

         // Create a Scanner object to read input from stdin.
        Scanner scan = new Scanner(System.in); 
        ArrayList<Character> oddList=new ArrayList<Character>();
        ArrayList<Character> evenList=new ArrayList<Character>();
        char[] ch={};

        // Read a full line of input from stdin and save it to our variable, inputString.

        int numLines = scan.nextInt();
        String inputLine="";
        for(int i=0;i<=numLines;i++){
            inputLine=scan.nextLine();
            ch = inputLine.toCharArray();
            for(int j=0;j<ch.length;j++){
                if(j%2==0||j==0){
                    evenList.add(ch[j]);
                }
                else{
                    oddList.add(ch[j]);
                }
            }
            for (char c: evenList){
                System.out.print(c);
            }

          for (int x = 0; x < oddList.size(); x++) {
              if(x==0){
                  System.out.print(" ");
              }
              System.out.print(oddList.get(x));

              if(x==oddList.size()-1){
                  System.out.print("\n");
              }
        }

            oddList.clear();
            evenList.clear();
        }

        // Close the scanner object, because we've finished reading 
        // all of the input from stdin needed for this challenge.
        scan.close(); 
        
    }
}
