package org.launchcode.studio7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        CD cd1 = new CD("cd1", "info", true, true, new ArrayList<>(Arrays.asList("music, videos, pictures")));
        System.out.println(cd1.getName());
        System.out.println(cd1.getNameOfCd());
        System.out.println(cd1.toString());
        cd1.spinDisc();
        cd1.spinDiscInfo("BDBDBD");
        System.out.println(cd1.justFun());



        System.out.println("stop");

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
