package five;

import javax.swing.*;
import java.io.PrintStream;

public enum Sport {

    ODBOJKA("Odbojka"),
    SAH("Sah"),
    KOSARKA("Kosarka"),
    SKIJANJE("Skijanje");


    private String name;

    private Sport(String name){
        this.name=name;

    }

    public String getName() {
        return name;
    }
}
