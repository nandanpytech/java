package Oops5.Interface2;

public class CDplayer implements Media{

    @Override
    public void start() {
        System.out.println("start music");
    }

    @Override
    public void stop() {
        System.out.println("stop music");
    }
}
