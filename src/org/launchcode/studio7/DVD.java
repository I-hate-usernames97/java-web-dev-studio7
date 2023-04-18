package org.launchcode.studio7;

import java.io.File;
import java.util.ArrayList;

public class DVD extends BaesDisc  implements OpticalDisc {

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.


    ArrayList<String> leadActors;

    protected DVD(String title, String author, String discType, ArrayList leadActors) {
        super(title, author, discType);
        this.leadActors = leadActors;
    }

    @Override
    public String toString() {
        return "\n" + this.getDiscType() + ":" +
                "\nTitle: " + this.getTitle() +
                "\nleadActors: " + leadActors  +
                "\nDiscType: " + this.getDiscType();
    }

    @Override
    public void readData() {

    }

    @Override
    public void runFile(File file) {

    }

    @Override
    public void writeData(File file) {

    }

    @Override
    public void runFile(org.launchcode.studio7.File file) {

    }


}
