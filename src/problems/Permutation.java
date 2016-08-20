package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "abc" "bac" "bca" "acb" "cab" "cba".
         * Write Java program to compute all Permutation of a String
         *
         */
        String str;
        System.out.println("Enter the string");

        Scanner sc = new Scanner(System.in);
        str = sc.next();

        char arr[] = str.toCharArray();

        List<String> perms = new Permutation().permute(arr);

        System.out.println("Permutations of "+str);

        for(int i=0;i<perms.size();i++)
            System.out.println(perms.get(i));
    }


    List<String> permute(char arr[])
    {
        List<String> perm = new ArrayList<String>() ;
        int l=0;

        if(arr.length==1)
            perm.add(""+arr[0]);
        else
        {
            char arr1[]=new char[arr.length];
            char temp;

                for(int i=0;i<arr.length;i++)
            {
                System.arraycopy(arr, 0, arr1, 0, arr.length);

                temp = arr1[0];
                arr1[0] = arr1[i];
                arr1[i] = temp;

                List<String> tempperm;
                tempperm=permute(Arrays.copyOfRange(arr1, 1, arr1.length));


                for(int j=0;j<tempperm.size();j++)
                {
                    String s = tempperm.get(j);
                    perm.add(l++, arr1[0]+s);
                }
            }

        }
        return perm;
    }
}


