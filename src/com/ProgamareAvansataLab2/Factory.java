package com.ProgamareAvansataLab2;

/**
 * Author: Sporniac Silviu
 */
public class Factory extends Source {
    static final String TYPE="Factory";

    public Factory(String name, int supply) {
        super(name, supply);
    }

    public String getType() {
        return TYPE;
    }
}
