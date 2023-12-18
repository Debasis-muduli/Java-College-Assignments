//Write a java program to read an array of integers and search an element in that array
package self;

import java.util.Scanner;

public class array {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size=sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements in the array are:");
          for(int i=0;i<size;i++){
            System.out.print("\t"+arr[i]);
        }
        search(arr,sc);
    }

    public static void search(int array[],Scanner sc){
        System.out.print("Enter the elements you want to search:");
        int x=sc.nextInt();
        boolean found=false;
        for(int i=0;i<array.length;i++){
            if(array[i]==x){
                System.out.println("Element is found at position:"+(i+1));
                found=true;
            }
        }
    if(!found){
        System.out.println("Element not found");
    }
    }
}