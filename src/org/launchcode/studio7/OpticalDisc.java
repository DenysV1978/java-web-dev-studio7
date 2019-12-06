package org.launchcode.studio7;

public interface OpticalDisc {
    //here, in the interface, we will put all methods that a behavior common! So, if CD and DVD and car wheel are all can rotate, we can use this
    //interface to put this method in. However, if CD and DVD can hold data, but car wheel cannot, this interface will not hold keepData
    //method. However, in abstract class we will hold methods common for related classes.

    public static final double GI = 9.8; // constant values

    public void spinDisc(); //method signatures without parameters

    public void spinDiscInfo(String searchTerm); //method signatures with parameters NOT instance or class specific. They both cannot have bodies here

    public default String justFun() { //this method should not be posted here, because these methods (default) should be posted
        //in interfaces only when we NEED to add some method to classes without adding them specifically in classes but can just add them here anf
        //they will show up in classes by been implemented
        return "bla bla bla"
    }

    public static String fallOnTheGround() {
        return "boooooom...";
    }






}
