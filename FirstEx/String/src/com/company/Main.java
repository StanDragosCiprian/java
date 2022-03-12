package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

      
        char x='a';
        char z='z';
        int a=x;
        int z1=z;
        char nim;
            String vid="";

          String arry[]={"","","",""};
          char[] voc={'a','e','i','o','u',' '};
            for(int i=a;i<='z';i++)
            {

                vid=vid+(char)i;
            }
            for(int i='A';i<='Z';i++)
            {

                vid=vid+(char)i;
            }
            for(int i=0;i<5;i++){
                for(int j=0;j<=51;j++){
                    if((vid.charAt(j)>=voc[i])&&(vid.charAt(j)<=voc[i+1])){
                        arry[i]=arry[i]+vid.charAt(j);
                    }
                }
            }
for(int i=0;i<=arry.length;i++)
{
    System.out.println(arry[i]);
}
    }


    }
