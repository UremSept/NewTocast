package com.example.houjie.mydaloge;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    private Button button1;
    private Button button2;
    private Button button3;
    private String[] sex={"男","女"};
    private int num = 0;
    private String[] like = {"LOL","梦幻西游","QQ飞车","Dota","CF"};




    private boolean[] blean =new boolean[like.length];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:btnClick();break;
            case R.id.button1:btn1Click();break;
            case R.id.button2:btn2Click();break;
            case R.id.button3:btn3Click();break;
            default:break;
        }
    }
    private void btnClick(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Dialog Test"); /* 设置标题 */
        builder.setMessage("这里是提示信息"); /* 设置提示信息 */
        builder.setIcon(R.mipmap.ic_launcher); /* 加载图标 */
        //builder.create(); /* 创建 */
        builder.show(); //* 显示给用户 */
    }
    private void btn1Click(){
        AlertDialog.Builder dialog =new AlertDialog.Builder(MainActivity.this);
        dialog.setTitle("Dialog测试");
        // dialog.setMessage("这里是Dialog测试的提示内容");
        dialog.setIcon(R.mipmap.ic_launcher);
        dialog.setSingleChoiceItems(sex,num, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "选中的性别为:"
                                + sex[which], Toast.LENGTH_SHORT).show();
                    }
                });
        dialog.setNeutralButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        dialog.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        dialog.create();
        dialog.show();
    }
    private void btn2Click(){
        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
        dialog.setTitle("请选择你喜欢的游戏");
        // dialog.setMessage("这里是Dialog测试的提示内容");
        dialog.setIcon(R.mipmap.ic_launcher);
        dialog.setMultiChoiceItems(like,blean, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                blean[which]=isChecked;
            }
        });
        dialog.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String likes ="";
                for(int i = 0;i<blean.length;i++){
                    if(blean[i]){
                        likes+=like[i];
                    }
                }
                Toast.makeText(getApplicationContext(),likes,Toast.LENGTH_LONG).show();
                for(int j=0;j<blean.length;j++){
                    blean[j] = false;
                }
            }
        });
        dialog.create();
        dialog.show();
    }
    private void btn3Click(){
        ProgressDialog pd = new ProgressDialog(MainActivity.this);
        pd.setTitle("文件下载中");
        pd.setIcon(R.mipmap.ic_launcher);
        pd.setMax(100);
        pd.setMessage("文件已下载");
        pd.setProgressStyle(ProgressDialog.
                STYLE_HORIZONTAL);
        pd.setCancelable(true);
        pd.show();
    }
    private  void init(){
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
    }
}
