package com.example.houjie.newtocast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.houjie.newtoast.R;

public class MainActivity extends AppCompatActivity {
    private  Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.toast);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast =Toast.makeText(getApplicationContext(),
                        "helloword!",Toast.LENGTH_LONG);
                toast.setGravity(Gravity.BOTTOM,120,120);
                LinearLayout toastView = (LinearLayout) toast.getView();
                ImageView imageViewCode = new ImageView(MainActivity.this);
                imageViewCode.setImageResource(R.mipmap.ic_launcher);
                toastView.addView(imageViewCode,0);
                /**
                 * LinearLayout toastView = (LinearLayout) toast.getView(); 
                 *  ImageView imageCodeProject = new ImageView(MainActivity.this); 
                 *  imageCodeProject.setImageResource(R.drawable.icon); 
                 *  toastView.addView(imageCodeProject, 0); 
                 *  toast.show();

                 */
                toast.show();
            }
        });

    }
}
