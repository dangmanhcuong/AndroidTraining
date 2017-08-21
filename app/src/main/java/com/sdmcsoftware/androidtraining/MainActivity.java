package com.sdmcsoftware.androidtraining;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private View.OnClickListener clickListenner = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
           switch (view.getId()){
               case R.id.btid:
                   Toast.makeText(MainActivity.this,"click button",Toast.LENGTH_LONG).show();
               break;
               default: break;
           }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.btid);
        button.setOnClickListener(clickListenner);

    }


}
