package day60.exeptions;

import day60.MyOwnCheckedException;

class Main {


    public static void main(String[] args) {


//        throw new BreakTimeException();
        try {
            throw new MyOwnCheckedException();
        } catch (MyOwnCheckedException e) {
            System.out.println("WOLA MY OWN THING CAUGHT!!!");
        }

    }


}