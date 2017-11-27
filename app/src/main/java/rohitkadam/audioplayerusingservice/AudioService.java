package rohitkadam.audioplayerusingservice;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class AudioService extends Service {

    AudioPlayer audioPlayer;
    public AudioService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("AudioService","This is On create");
        audioPlayer=new AudioPlayer(getApplicationContext());
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("AudioService","This is On Start Command");

        int actioncode=intent.getIntExtra(AudioPlayer.KEY_ACTION,AudioPlayer.KEY_PLAY);


        switch (actioncode){
            case AudioPlayer.KEY_PLAY:
                play();
                break;
            case  AudioPlayer.KEY_PAUSE:
                pause();
                break;
            case AudioPlayer.KEY_STOP:
                stop();
                break;
        }

        return super.onStartCommand(intent, flags, startId);


    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("AudioService","This is On destroy");
    }
    public void play(){
        audioPlayer.play();
    }
    public void pause(){
        audioPlayer.pause();
    }
    public void stop(){
        audioPlayer.stop();
    }
}
