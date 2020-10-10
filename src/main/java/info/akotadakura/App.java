package info.akotadakura;

import info.akotadakura.jobs.CloudJob;
import info.akotadakura.jobs.IngressJob;

public class App {

    public static void main(String[] args) {

        CloudJob job = IngressJob.getInstance();
        job.execute();
    }
}
