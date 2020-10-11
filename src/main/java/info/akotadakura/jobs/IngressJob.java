package info.akotadakura.jobs;

import static info.akotadakura.jobs.tasks.TaskGetIp.getGlobalIp;

public class IngressJob implements CloudJob{

    public IngressJob () {}

    @Override
    public void execute() {
        System.out.println("まずログをちゃんとしたまえ");
        return;
    }
}
