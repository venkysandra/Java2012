package test.sorting;

import java.io.*;
public class RadixSort {

    public void sort(int a[],int rad,int max){
        int tmp[][]=new int[a.length][10];

        for(int i=0;i<max;i++){

            int c=0;
            for (int j=0;j<a.length;j++)
                for(int k=0;k<rad;k++)
                    tmp[j][k]=0;

            for(int k=0;k<a.length;k++){
                int d=(int)((a[k]/Math.pow(10,i))%10);
                tmp[k][d]=a[k];
            }

            for (int j=0;j<rad;j++)
                for(int k=0;k<a.length;k++)
                    if(tmp[k][j]!=0)
                        a[c++]=tmp[k][j];
        }

        disp(a);
    }

    public void input()throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter array size : ");
        int n=Integer.parseInt(br.readLine());
        int a[]=new int[n];
        System.out.println("Enter elements in array ------->");
        int max=0;
        for (int i = 0; i<n; i++) {
            System.out.print("Enter number : ");
            a[i]=Integer.parseInt(br.readLine());
            if(a[i]>max)
                max=a[i];
        }
        sort(a,10,digit_count(max));
     }

    int digit_count(int n){
        int d=0;
        while (n!=0) {
            d++;
            n/=10;
        }
        return d;
    }

    public void disp(int a[]){
        System.out.println("\nArray after sorting -------->");
        for (int i = 0; i<a.length; i++)
            System.out.print(a[i]+"  ");
    }

    public static void main(String[] args) throws Exception{
       new RadixSort().input();
       System.out.println( new RadixSort().digit_count(1000000000));
    	
    }
}