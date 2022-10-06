package Oops5.Interface2;

import Oops5.Interface.Engine;

public class POWERENGINE implements Engine {
    @Override
    public void start() {
        System.out.println("engine start");
    }

    @Override
    public void stop() {
        System.out.println("engine stop");
    }
}
