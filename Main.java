package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String str="GoodMorning";
        char ch1[]=str.toCharArray();
        toUpperCase(ch1);
    }
    public static void toUpperCase(char arr[])
    {
        String s="";
        for (int i = 0; i < arr.length; ++i) {
            if(Character.isLowerCase(arr[i])&& Character.isAlphabetic(arr[i]))
            {
                arr[i]=(char) (arr[i]-32);
            }
            s+=arr[i];
        }
        System.out.println(s);
    }
}
