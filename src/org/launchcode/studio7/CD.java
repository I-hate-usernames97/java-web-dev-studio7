package org.launchcode.studio7;

import java.io.File;

public class CD extends BaesDisc  implements OpticalDisc{

    // TODO: Implement your custom interface.
    private String genre;
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    protected CD(String genre, String title, String author, String discType) {
        super(title, author, discType);
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "\n" + this.getDiscType() + ":" +
                "\nTitle: " + this.getTitle() +
                "\nArtists: " + this.getAuthor()  +
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
