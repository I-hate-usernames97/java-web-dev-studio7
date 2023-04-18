package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaesDisc implements OpticalDisc {

    private final String title;
    private final String author;
    private final String discType;
    private final int speed;
    private final int capacity;
    private ArrayList<File> files = new ArrayList<>();


    protected BaesDisc(String title, String author, String discType) {
        this.title = title;
        this.author = author;
        this.discType = discType;
        this.speed = SPEEDS.get(discType);
        this.capacity = CAPACITIES.get(discType);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDiscType() {
        return discType;
    }

    public int getSpeed() {
        return speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public String toString() {
        return "\n" + discType + ":" +
                "\nTitle: " + title +
                "\nAuthor: " + author  +
                "\nDiscType: " + discType +
                "\nSpeed: " + speed +
                "\nStorage Capacity: " + capacity;
    }

    public int getSpaceUsed() {
        int total = 0;
        for (File file : files) {
            total += file.getSize();
        }
        return total;
    }

    @Override
    public void spinDisc(){
        System.out.printf("the " + discType + " " + title + " is spinning at " + SPEEDS.get(discType) + " RPM." );
    }

    @Override
    public abstract void readData();

    @Override
    public void writeData(File file) {
        if (getSpaceUsed() + file.getSize() > capacity) {
            System.out.printf("Not enough space");
        } else {
            files.add(file);
        }
    }
}

