package Service;

import model.Employee;

import java.util.ArrayList;
import java.util.Random;



public class CredentialService {
    
    // generate email
    public String genEmail(Employee ob){
        return ob.getFirstName().toLowerCase()+"."+ob.getLastName().toLowerCase()+"@"+
        ob.getDepartment().replaceAll("\\s", "").toLowerCase()+".greatlearning.com";
    }


    // generate pw
    public String genPw(){
       String capLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       String smallLetters = "abcdefghijklmnopqrstuvwxyz";
       String numbers = "0123456789";
       String splChars = "!@#$%^&*()+?<>";

       Random rnOb = new Random();

       // we are generating a 8 char password that has 3 small numbers 2 caps 2 small 1 spl char

       char [] pw = new char[8];
       
       int count =0;
       
       // First Numbers
       for(;count<3;count++){
            pw[count] = numbers.charAt(rnOb.nextInt(numbers.length()));
       }

       
       // Second Caps
       for(;count<5;count++){
        pw[count] = capLetters.charAt(rnOb.nextInt(capLetters.length()));
        }

         // next small Caps
       for(;count<7;count++){
        pw[count] = smallLetters.charAt(rnOb.nextInt(smallLetters.length()));
        }
       
        // next spl char
       for(;count<8;count++){
        pw[count] = splChars.charAt(rnOb.nextInt(splChars.length()));
        }
        
        // To shuffle
        
        int tCount = 0;
        int index = 0;
        ArrayList<Character> pwIndex = new ArrayList<Character>(8);
        for(int i = 0; i<8;i++){
            pwIndex.add(pw[i]);
        }
        
        while(tCount<8){
            index = rnOb.nextInt(pwIndex.size());
            pw[tCount] = pwIndex.remove(index);
            tCount = tCount+1;
        }
       
        
       
       return String.valueOf(pw);
   }
}
