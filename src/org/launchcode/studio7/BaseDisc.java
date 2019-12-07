package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {

    private String name;
    private String typeOfData;
    private boolean couldBeReadByLaser;
    private boolean couldBeWrittenByLaser;
    private ArrayList<String> data;

    // constructor

    public BaseDisc(String name, String typeOfData, boolean couldBeReadByLaser, boolean couldBeWrittenByLaser, ArrayList<String> data) {
        this.name = name; //this is will be CD1, CD2, and so on... this is just studio....
        this.typeOfData = typeOfData;
        this.couldBeReadByLaser = couldBeReadByLaser;
        this.couldBeWrittenByLaser = couldBeWrittenByLaser;
        this.data = data;
    }

    //Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfData() {
        return typeOfData;
    }

    public void setTypeOfData(String typeOfData) {
        this.typeOfData = typeOfData;
    }

    public boolean isCouldBeReadByLaser() {
        return couldBeReadByLaser;
    }

    public void setCouldBeReadByLaser(boolean couldBeReadByLaser) {
        this.couldBeReadByLaser = couldBeReadByLaser;
    }

    public boolean isCouldBeWrittenByLaser() {
        return couldBeWrittenByLaser;
    }

    public void setCouldBeWrittenByLaser(boolean couldBeWrittenByLaser) {
        this.couldBeWrittenByLaser = couldBeWrittenByLaser;
    }

    public ArrayList<String> getData() {
        return data;
    }

    public void setData(ArrayList<String> data) {
        this.data = data;
    }

    //methods CD and DVD specific

    public abstract void putInPlayer(); //I assign both CD and DVD to apply this method and this method will be "opened"
    // in both classes differently

    public void recycle() { //I have this method to use for both CD and DVD. It will not be overridden
        System.out.println("Disc is recycled as plastic");
    }


    @Override //here we override toString that will be transferred to children
        public String toString() {
        return "Name: " + this.getName() + "\n" +
                "Type of data: " + this.getTypeOfData() + "\n" +
                "Could be read by laser: " + this.isCouldBeReadByLaser() +
                "Could be written by laser: " + this.isCouldBeWrittenByLaser() +
                "Data: " + this.getData();

    }


}
