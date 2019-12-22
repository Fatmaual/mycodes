package day26;

import java.util.Arrays;

public class WarmUp {
    public static void main(String[] args) {
        String []name={"emma","jason"};

String temproray = name[0];
name[0]=name[1];
name[1]=temproray;
        System.out.println(Arrays.toString(name));
int[]numbers = {1,2,3,4};
int temp=numbers[0];
numbers[0]=numbers[3];
numbers[3]=temp;
        System.out.println(numbers[0]);
        System.out.println(numbers[3]);
        System.out.println(Arrays.toString(numbers));
        System.out.println("----");
        int temps1=numbers[2];
            numbers[2]=numbers[1];
            numbers[1]=temps1;
        System.out.println(Arrays.toString(numbers));









    }
}
