package problems;

import java.util.Scanner;

/**
 * Created by mrahman on 4/9/16.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".


            Boolean FLAG=true;

            Scanner sc= new Scanner(System.in);

            System.out.println("Enter 1st string");

            String s1=sc.nextLine();

            System.out.println("Enter 2nd string");

            String s2=sc.nextLine();

            int i,j;
            i=s1.length();
            j=s2.length();

            if(i==j)
            {
                for(int k=0;k<i;k++)
                {
                    for(int l=0;l<i;l++)
                    {
                        if(s1.charAt(k)==s2.charAt(l))
                        {
                            FLAG=true;
                            break;
                        }
                        else
                            FLAG=false;
                    }
                }
            }
            else
                FLAG=false;
            if(FLAG)
                System.out.println("Given Strings are anagrams");
            else
                System.out.println("Given Strings are not anagrams");
        }
    }


