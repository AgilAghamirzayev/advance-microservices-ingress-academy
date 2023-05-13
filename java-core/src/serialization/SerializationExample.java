package serialization;

import java.io.*;

public class SerializationExample {
    public static void main(String[] args) {
        // Serialize an object
        Person obj = new Person();
        obj.setName("John");
        obj.setAge(30);

        try (FileOutputStream fos = new FileOutputStream("data.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(obj);
            System.out.println("Object serialized successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object
        try (FileInputStream fis = new FileInputStream("data.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Person deserializedObj = (Person) ois.readObject();
            System.out.println("Object deserialized successfully");
            System.out.println("Name: " + deserializedObj.getName());
//            System.out.println("Age: " + deserializedObj.getAge());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
