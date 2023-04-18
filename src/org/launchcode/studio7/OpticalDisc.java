package org.launchcode.studio7;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public interface OpticalDisc {

    static final Map<String, Integer> CAPACITIES = new HashMap<>() {{
        put("CD", 700);
        put("DVD",17000);
    }};
    static final Map<String, Integer> SPEEDS = new HashMap<>() {{
       put("CD", 400);
       put("DVD", 1200);
    }};

    void spinDisc();

    void readData();

    void runFile(File file);

    void writeData(File file);

    void runFile(org.launchcode.studio7.File file);

    void writeData(org.launchcode.studio7.File file);
}
