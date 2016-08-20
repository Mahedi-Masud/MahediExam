package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by mrahman on 4/9/16.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

       //' String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        System.out.print("Enter string to analyse: \n");

        Scanner sn = new Scanner(System.in);

        String s1 = sn.nextLine();


        String s2=s1.replace(" ","");
        char [] ch=s2.toCharArray();

        int counter=0;

        //for-loop tocompare first character with the whole character array

        for(int i=0;i<ch.length;i++)
        {
            int count=0;

            for(int j=0;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                    count++; //if character is matching with others
            }
            if(count>1)
            {
                boolean flag=false;

                //for-loop to check whether the character is already refferenced or not
                for (int k=i-1;k>=0 ;k-- )
                {
                    if(ch[i] == ch[k] ) //if the character is already refferenced
                        flag=true;
                }
                if( !flag ) //if(flag==false)
                    counter=counter+1;
            }
        }
        if(counter > 0) //if there is/are any repeating characters
            System.out.println("Number of repeating charcters in the given string is/are " +counter);
        else
            System.out.println("Sorry there is/are no repeating charcters in the given string");
    }
}
