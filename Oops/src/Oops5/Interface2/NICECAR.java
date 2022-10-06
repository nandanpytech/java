package Oops5.Interface2;

public class NICECAR  {
    private Media music=new CDplayer();
    private Engine engine= (Engine) new POWERENGINE();

    public void startmusic(){
        music.start();
    }
    public void enginestart(){
        engine.start();
    }
}


