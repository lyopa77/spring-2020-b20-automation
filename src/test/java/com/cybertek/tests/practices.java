package com.cybertek.tests;

import java.lang.reflect.Array;
import java.util.*;

public class practices {
    public static void main(String[] args) {
        String name = "Lyopa";
      /*  String newname = "";
        for (int i = name.length()-1; i<=name.length(); i-- )
            newname += i;{
        System.out.println(newname);  */
        StringBuilder rev = new StringBuilder(name);
     //   rev.append(name);
        rev.reverse();
        System.out.println(rev);
}}

 /*  class practices2
{
    public static void main(String[] args) {
        String name = "Lyopa";
        StringBuffer rev = new StringBuffer(name);
        rev.reverse();
        System.out.println(rev);
    }
}  */
class prac {
     public static void main(String[] args) {
         Scanner name = new Scanner(System.in);
         System.out.println("enter name");
        String name1 = name.next();
       char [] rev = name1.toCharArray();
        for (int i = rev.length-1; i>=0;i-- ){
         System.out.print(rev[i]);}
         }

     }
class ReverseString {
    public static void main(String[] args)
    {
        String input = "Geeks For Geeks";
        char[] hello = input.toCharArray();
        List<Character> trial1 = new ArrayList<>();

        for (char c : hello)
            trial1.add(c);

        Collections.reverse(trial1);
       ListIterator<Character> li = trial1.listIterator();
        while (li.hasNext())
            System.out.print(li.next());
        System.out.println();
        System.out.println(trial1);
    }}
class rev1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("name");
        String name = input.nextLine();

        StringBuilder reverse = new StringBuilder(name);
        reverse.reverse();
        System.out.println("reversed name "+reverse);


    }
}
class rev2{
    public static void main(String[] args) {
      Scanner name = new Scanner(System.in);
        System.out.println("name?");
        String input = name.next();
        char [] ch = input.toCharArray();
       for (int i = ch.length-1; i>=0;i--){
       // for (int i:ch){
            System.out.print(ch[i]);
        }}}

class max {
    public static void main(String[] args) {
        Integer [] nums = {2,1,2,69,3,4,5};
        Arrays.sort(nums);
        System.out.println(nums[0]);
        System.out.println(nums[nums.length-1]);
        System.out.println();
    }
}
class max2{
    public static void main(String[] args) {
        Integer [] ints = {4,3,5,6,2,1,2};
        int max= Integer.MIN_VALUE;

        int num=0;
        System.out.println(ints.length);
       for (int i= ints.length; i>=max;i++){
        System.out.println(ints.length);}
    }
}
class cases {
    public static void main(String[] args) {
        int day = 5;
        switch (day
        )
        { case
                    4:
                System.out.println("Saturday");
                break;

            case
                    2:
                System.out.println("Sunday");

                break
                        ;

            default
                    :
                System.out.println("Weekend");
        }
    }
}