package info.akotadakura;

import java.lang.reflect.InvocationTargetException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import info.akotadakura.jobs.CloudJob;

public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        try {
            CloudJob job = (CloudJob)Class.forName("info.akotadakura.jobs.IngressJob")
                                          .getDeclaredConstructor()
                                          .newInstance();
            logger.info("{} very well!!", "Logging!");
            logger.info("JP not allowed");
            job.execute();
        }
        catch (ClassNotFoundException | NoSuchMethodException | InstantiationException
                | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
