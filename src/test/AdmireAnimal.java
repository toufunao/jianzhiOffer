package test;

import java.util.Arrays;
import java.util.Scanner;

public class AdmireAnimal {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] animal=new int[n+1];
        int[] admire=new int[n+1];
        Arrays.fill(animal,1);
        for (int i=1;i<n+1;i++){
            admire[i]=scanner.nextInt();
        }
        for (int i=n;i>=1;i--){
            if (admire[i]!=0){
                animal[admire[i]]++;
                animal[admire[i]]+=animal[i];
            }
        }
        for (int i=1;i<n+1;i++){
            System.out.println(animal[i]);
        }
    }
}
