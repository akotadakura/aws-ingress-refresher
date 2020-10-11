package info.akotadakura;

// Java API
import java.lang.reflect.InvocationTargetException;

// akotadakura
import info.akotadakura.jobs.CloudJob;

public class App {

    public static void main(String[] args) {

        try {
            CloudJob job = (CloudJob)Class.forName("info.akotadakura.jobs.IngressJob").getDeclaredConstructor().newInstance();
            job.execute();
        }
        catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
