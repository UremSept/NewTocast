package com.example.houjie.newtoast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  Button button;
    private  int i=0;
    private int[] image = {R.mipmap.ic_launcher,R.mipmap.helloword};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.toast);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                LayoutInflater inflater = getLayoutInflater();
//                View layout = inflater.inflate(R.layout.custom,null);
//                ImageView image = (ImageView) layout.findViewById(R.id.tvImageToast);
//                image.setImageResource(R.mipmap.shanshui1);
//                TextView title = (TextView) layout.findViewById(R.id.tvTitleToast);
//                title.setText("Attention");
//                TextView text = (TextView) layout.findViewById(R.id.tvTextToast);
//                text.setText("完全自定义Toast");
//                Toast toast = new Toast(getApplicationContext());
//                toast.setGravity(Gravity.CENTER| Gravity.CENTER, 12, 40);
//                toast.setDuration(Toast.LENGTH_LONG);
//                toast.setView(layout);

                if(i>=image.length){
                    i=0;
                }
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.toast,null);
                ImageView imageView = (ImageView) layout.findViewById(R.id.imageView);
                imageView.setImageResource(image[i]);
                Toast toast = new Toast(getApplicationContext());
                //toast.setText("你好");
                toast.setGravity(Gravity.CENTER,0,0);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(layout);
                toast.show();
                i++;
            }
        });

    }
}
