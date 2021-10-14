import java.io.IOException;
import java.io.File;
public class GarbageCollectionAndRuntimeClass  {
    public void finalize(){
        System.out.println("Garbage collected.....");
    }
    public static void main(String[] args) throws Exception{
        Q7_GarbageCollectionAndRuntimeClass test = new  Q7_GarbageCollectionAndRuntimeClass();
        test = null;
        System.gc();
        Runtime.getRuntime().exec("notepad");
        new File("mythread.java").createNewFile();
    }
}