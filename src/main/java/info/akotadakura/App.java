package info.akotadakura;

import java.lang.reflect.InvocationTargetException;

import net.logstash.logback.encoder.LogstashEncoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import info.akotadakura.jobs.CloudJob;

public class App {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(LogstashEncoder.class);

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
