package javatraining.oletsky.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author O.Oletsky
 * Illustrating serialization
 */
public class Serializer {
    public static void main(String[] args) {
        final String FNAME ="serial";
        SerializedObject obj = new SerializedObject(10);
        try (FileOutputStream fos = new FileOutputStream(FNAME);
                ObjectOutputStream os = new ObjectOutputStream(fos)) {
            os.writeObject(obj);
            System.out.println("Object serialized");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
