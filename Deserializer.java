package javatraining.oletsky.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author O.Oletsky
 * Illustrating deserialization
 * This also discovers the following:
 * - whether the constructor would be called on deserializing;
 * - should all fields of the serialized object should be Serializable as well;
 * - would the constructor of the superclass be called
 */
public class Deserializer {
    public static void main(String[] args) {
        final String FNAME="serial";
        try (FileInputStream fis = new FileInputStream(FNAME);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            SerializedObject newObj = (SerializedObject)
                    ois.readObject();
            System.out.println("Object deserialized");
            System.out.println(newObj.getN());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
