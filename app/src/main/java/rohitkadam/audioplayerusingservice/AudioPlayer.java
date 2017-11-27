package rohitkadam.audioplayerusingservice;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by 170840521012 on 23-11-2017.
 */

public class AudioPlayer {
    public static final String KEY_ACTION="action";
    public static final int KEY_PLAY=1;
    public static final int KEY_PAUSE=2;
    public static final int KEY_STOP=3;
    Context context;
    MediaPlayer mediaPlayer;
    public AudioPlayer(Context context1){
        this.context=context1;
    }
    private void prepare(){
        mediaPlayer=MediaPlayer.create(context,R.raw.audio);
    }
    public  void  play(){
        prepare();
        mediaPlayer.start();
    }
    public  void  pause(){
        mediaPlayer.pause();
    }
    public void stop(){
        mediaPlayer.stop();
    }
}
