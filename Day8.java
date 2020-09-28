//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        HashMap<String,Integer> pBook = new HashMap<String,Integer>();
        int n = in.nextInt();
        int pNum=0;
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            pBook.put(name,phone);
        }
      //  for (Map.Entry me : pBook.entrySet()) {
       //   System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
       // }
        while(in.hasNext()){
            String s = in.next();
            // Write code here

            if(pBook.get(s)!=null){
                System.out.println(s+"="+pBook.get(s));
            }
            else{
                System.out.println("Not found");
            }

        }
        in.close();
    }
}