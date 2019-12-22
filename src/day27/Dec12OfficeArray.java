package day27;

public class Dec12OfficeArray {
    public static void main(String[] args) {
        int[]grades = {1,2,3,4,5,6,7,8};
        //find second max expected 7!
        int max = grades[0];
        for(int eacGrade:grades){
            if(eacGrade>max){
            max =eacGrade;
        }
    }
        System.out.println(max);
        int secondMax = grades[0];
        for(int eachGrade : grades){
            if(eachGrade==max){
                continue;
            }
            if(eachGrade>secondMax){
                secondMax=eachGrade;
            }
        }
        System.out.println("secondMax = " + secondMax);
        //SWAP11111 WITHOUT USING TEMPRORARY VARIABLE!!!!
        int a=10, b=20;
        //expected result : a=20 b=10
       a=a+b; //10+20=30
        b=a-b; //30-20
        a= a-b;//a=30 b=20
        System.out.println(a+" "+b);
    }
}