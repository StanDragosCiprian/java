import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Random rand=new Random();
        int x[]=new int[10];
        //Random vector
        for(int i=0;i<x.length;i++)
        {
            x[i]=rand.nextInt(20);
        }
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        int suma=0;
        int suma2=0;
        double z=1;
        double sumgeo=0;
        int med=0;
        int iz=0;
        //Sum
        for (int i = 0; i < x.length; i++) {
            suma+=x[i];
        }
        System.out.print("Suma Este:");
        System.out.print(suma);
        //x1 – x2 + x3 – x4 ... xn
        for (int i = 0; i < x.length; i+=2) {
            suma2+=x[i]-x[i+1];
        }
        System.out.println();
        System.out.print("Suma2 Este:");
        System.out.print(suma2);
        //geometric mean
        for (int i = 0; i < 9; i++) {
            z*=x[i];

        }
        sumgeo=Math.sqrt(z);
        System.out.println();
        System.out.print("Sumgeo Este:");
        System.out.print(sumgeo);
        for (int i =x.length-1; i>0; i--) {
            med+=x[iz]*x[i];
            iz++;
        }
         int arry[]=new int[10];
        for (int i = 0; i < x.length; i++) {
            arry[i]=x[i];
        }
        System.out.println();
        System.out.print("Med Este:");
        System.out.print(med);
        int t=0;
        for (int i = 0; i < 9; i++) {
            for (int j = i+1; j < 10; j++) {
                if(arry[j]<arry[i])
                {
                 t=arry[i];
                 arry[i]=arry[j];
                 arry[j]=t;
                }
            }


        }
        for (int j = 0; j < x.length; j++) {
            System.out.println(arry[j]);
        }
        }
    }
