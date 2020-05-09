package javatraining.oletsky.io;

import java.io.Serializable;

public class SerializedObject implements Serializable {
    private int n;

    public SerializedObject(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }
}
