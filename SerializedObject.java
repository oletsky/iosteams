package javatraining.oletsky.io;

import java.io.Serializable;

public class SerializedObject implements Serializable {
    private int n;

    public SerializedObject(int n) {
        this.n = n;
        System.out.println("Constructor called");
    }

    public int getN() {
        return n;
    }
}
