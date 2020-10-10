package info.akotadakura.jobs.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import static info.akotadakura.consts.CloudConst.GET_GLOBAL_IP;

public class TaskGetIp {

    public static String getGlobalIp() {
        Runtime runtime = Runtime.getRuntime();
        try(InputStream stream = runtime.exec(GET_GLOBAL_IP).getInputStream()) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
            return reader.readLine();
        }
        catch (IOException e) {
            e.printStackTrace();
            // TODO implementation
            return "";
        }

    }
}
