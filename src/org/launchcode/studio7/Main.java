package org.launchcode.studio7;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args){
        public ArrayList<String> contents = new ArrayList<String>();
        CD cd = new CD("CD example", 64, 32, contents);
        //DVD dvd = new DVD("DVD example", 4700, "DVD-R", 1450);

        // TODO: Call each CD and DVD method to verify that they work as expected.
        cd.spinDisc();
        //dvd.spinDisc();

        cd.readData();
        //dvd.readData();
    }
}
/*Interface should have
* Spin Disk, Read Disk, Write Disk
* */

/* Abstract
Name, MaxStorage, RemainingStorage, Contents
* */