import java.io.*;
import java.util.*;

public class Person {
    private int age;	
  
	public Person(int initialAge) {
  		// Add some more code to run some checks on initialAge
          this.age=initialAge;

          if (initialAge<0){
              System.out.println("Age is not valid, setting age to 0.");
              this.age=0;
          }
	}

	public void amIOld() {

        String res="";

        if(age<13){
            res="You are young.";
        }
        else if(age>=13&&age<18){
            res= "You are a teenager.";
        }
        else{
            res="You are old.";
        }
  		// Write code determining if this person's age is old and print the correct statement:
        System.out.println(res);
	}

	public void yearPasses() {
  		// Increment this person's age.
          this.age++;
	}

	public static void main(String[] args) {