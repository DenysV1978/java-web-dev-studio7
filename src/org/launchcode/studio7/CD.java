package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc {
    String nameOfCd; // here I will give the name of CD, kind of Scorpions and os on...

    public CD(String nameOfCd, String name, String typeOfData, boolean couldBeReadByLaser, boolean couldBeWrittenByLaser, ArrayList<String> data) {
        super.(name, typeOfData, couldBeReadByLaser, couldBeWrittenByLaser, data);
        this.nameOfCd = nameOfCd;

    }

    public CD(String name, String typeOfData, boolean couldBeReadByLaser, boolean couldBeWrittenByLaser, ArrayList<String> data) {
        super.(String name, String typeOfData, boolean couldBeReadByLaser, boolean couldBeWrittenByLaser, ArrayList<String> data);
        this.nameOfCd = "Music";
    }

    //those methods that should be Overridden because of interface implementation

    @Override
    public void spinDisc() {
        System.out.println("CD makes sound gggggggg");
    }

    public void spinDiscInfo(String searchTerm) {
        System.out.println(this.getName() + " " + this.nameOfCd + "makes 1000 rpm.");
    }






    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
