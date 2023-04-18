package org.launchcode.studio7;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        ArrayList<String> actors = new ArrayList<>();
        actors.add("Stephanie Beatriz");
        actors.add("Diane Guerrero");
        actors.add("Jessica Darrow");
        actors.add("John Leguizamo");

        DVD encanto = new DVD("Encanto", "Byron Howard, Jared Bush","DVD", actors);
        CD TheBlackParade = new CD("Emo", "The black parade", "My Chemical Romance", "CD");
        // TODO: Declare and initialize a CD and a DVD object.

        System.out.println(TheBlackParade);
        System.out.println(encanto);
        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}

