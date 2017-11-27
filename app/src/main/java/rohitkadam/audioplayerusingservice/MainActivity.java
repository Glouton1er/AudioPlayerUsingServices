package rohitkadam.audioplayerusingservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonPlay,buttonPause,buttonStop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPlay=findViewById(R.id.buttonPlay);
        buttonPause=findViewById(R.id.buttonPause);
        buttonStop=findViewById(R.id.buttonStop);

        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,AudioService.class);
                intent.putExtra(AudioPlayer.KEY_ACTION,AudioPlayer.KEY_PLAY);
                startService(intent);
            }
        });

        buttonPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,AudioService.class);
                intent.putExtra(AudioPlayer.KEY_ACTION,AudioPlayer.KEY_PAUSE);
                startService(intent);

            }
        });

        buttonStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,AudioService.class);
                intent.putExtra(AudioPlayer.KEY_ACTION,AudioPlayer.KEY_STOP);
                startService(intent);
            }
        });
    }


}
