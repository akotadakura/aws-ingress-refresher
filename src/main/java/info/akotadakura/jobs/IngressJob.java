package info.akotadakura.jobs;

import static info.akotadakura.jobs.tasks.TaskGetIp.getGlobalIp;

public class IngressJob implements CloudJob{

    private IngressJob () {}

    public static CloudJob getInstance() {
        return new IngressJob();
    }

    @Override
    public void execute() {
        System.out.println("まずログをちゃんとしたまえ");
        return;
    }
}
