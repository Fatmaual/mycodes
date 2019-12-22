package day21;

public class DenemeyeDevam {
    public static void main(String[] args) {
        String name ="Ayse Kubra";
        for (int x = 0; x <name.length() ; x++) {
            if(name.substring(x,x+1).equalsIgnoreCase("b")){
                System.out.println("boom!!you got this!!");
            }
            System.out.println(name.substring(x,x+1)+" ");
        }
    }
}
