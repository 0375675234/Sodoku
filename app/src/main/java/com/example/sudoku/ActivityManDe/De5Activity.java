package com.example.sudoku.ActivityManDe;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sudoku.DAO.KiLucDAO;
import com.example.sudoku.JClass.KiLuc;
import com.example.sudoku.JClass.Play;
import com.example.sudoku.JClass.Val;
import com.example.sudoku.R;


import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

public class De5Activity extends AppCompatActivity {
    LinearLayout ln_top,ln_icon,ln_num;
    TableLayout tbl;
    TextView tv_start,tv_er,tv_time;
    TextView[][] dsView;
    TextView[] dsNum;
    ImageView imgCheck;
    ImageView imgXoa;
    TimerTask timerTask;
    Timer timer;
    Double time = 0.0;
    Boolean ketqua = true;
    KiLucDAO kiLucDAO;
    String name;
    int e=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_de5);

        getSupportActionBar().hide();
        anhXa();
        ln_top.setVisibility(View.INVISIBLE);
        ln_num.setVisibility(View.INVISIBLE);
        ln_icon.setVisibility(View.INVISIBLE);
        tbl.setVisibility(View.INVISIBLE);
        Intent intent=getIntent();
        name =intent.getStringExtra("name");
        for (int i = 0;i<6;i++){
            for (int j=0;j<6;j++){
                Play.gamePlay(i,j, dsView, dsNum, imgXoa);
            }
        }
        start();
        imgCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0;i<6;i++)
                    for (int j = 0;j<6;j++){
                        dsView[i][j].setBackgroundResource(R.drawable.drawable_background);
                    }
                check();
                if (ketqua==false){
                    e++;
                    tv_er.setText("L???i: "+e+"/3");
                }
                if (ketqua==true){
                    timerTask.cancel();
                    if (name == null) {
                        Toast.makeText(getApplicationContext(),"B???n c???n ????ng nh???p ????? l??u k??? l???c",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        KiLuc kiLuc = new KiLuc((int) System.currentTimeMillis(),time,name);
                        if (kiLucDAO.addKiLucDe5(kiLuc)>0){
                            Toast.makeText(getApplicationContext(),"K??? l???c ???? ???????c l??u",Toast.LENGTH_SHORT).show();
                        }
                        else {
                        }
                    }

                    Play.dialog_ht(De5Activity.this);

                }
                if (e==3){
                    dialog_tb();
                }
            }
        });
    }
    void start(){
        new CountDownTimer(4000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                tv_start.setText(""+millisUntilFinished / 1000);
            }

            @Override
            public void onFinish() {
                tv_start.setText("Start");
                ln_top.setVisibility(View.VISIBLE);
                ln_num.setVisibility(View.VISIBLE);
                ln_icon.setVisibility(View.VISIBLE);
                tbl.setVisibility(View.VISIBLE);
                tv_start.setVisibility(View.INVISIBLE);
                startTimer();
            }
        }.start();
    }
    void anhXa(){
        dsNum = new TextView[6];
        dsView = new TextView[6][6];
        for (int i = 0;i<6;i++){
            for (int j = 0;j<6;j++){
                dsView[i][j] = findViewById(getResources().getIdentifier("r"+(i+1)+"c"+(j+1),"id",getPackageName()));
                Log.d("zzzzz", dsView[i][j].getText().toString());
            }
        }

        for (int i = 0;i<6;i++){
            dsNum[i] = findViewById(getResources().getIdentifier("ip"+(i+1),"id",getPackageName()));
        }
        kiLucDAO= new KiLucDAO(this);
        imgXoa = findViewById(R.id.imgXoa);
        ln_icon = findViewById(R.id.ln_icon);
        ln_num = findViewById(R.id.ln_num);
        ln_top = findViewById(R.id.ln_text);
        tbl = findViewById(R.id.tbl_play);
        tv_start = findViewById(R.id.tv_start);
        imgCheck = findViewById(R.id.imgCheck);
        tv_er =findViewById(R.id.er);
        tv_time = findViewById(R.id.tv_time);
        timer = new Timer();

    }
//    void gamePlay(int dong,int cot){
//        HashMap<String,Object> hashMap = new HashMap<String,Object>();
//        hashMap.put("dong", dong);
//        hashMap.put("cot", cot);
//        dsView[dong][cot].setTag(hashMap);
//        if (dsView[dong][cot].getText().equals("")){
//            dsView[dong][cot].setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    HashMap<String,Object> hashMap= (HashMap<String, Object>) v.getTag();
//                    final int dong = (int) hashMap.get("dong");
//                    final int cot = (int) hashMap.get("cot");
//                    for (int z = 0;z<6;z++){
//                        for (int x=0;x<6;x++){
//                            dsView[z][x].setBackgroundResource(R.drawable.drawable_background);
//                            dsView[z][cot].setBackgroundResource(R.drawable.drawable_test);
//                            dsView[dong][x].setBackgroundResource(R.drawable.drawable_test);
//                            dsView[dong][cot].setBackgroundResource(R.drawable.drawable_setbackground);
//                        }
//                    }
//
//                    for (int i = 0;i<6;i++){
//                        dsNum[i].setTag((i+1));
//                        dsNum[i].setOnClickListener(new View.OnClickListener() {
//                            @Override
//                            public void onClick(View v) {
//                                dsView[dong][cot].setText(""+v.getTag());
//                            }
//                        });
//                    }
//                    imgXoa.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            dsView[dong][cot].setText("");
//                        }
//                    });
//                }
//            });
//        }
//    }
    private void startTimer() {
        timerTask = new TimerTask()
        {
            @Override
            public void run()
            {
                runOnUiThread(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        time++;
                        tv_time.setText(getTimerText());
                    }
                });
            }

        };
        timer.scheduleAtFixedRate(timerTask, 0 ,1000);
    }
    private String getTimerText() {
        int rounded = (int) Math.round(time);
        int seconds = ((rounded % 86400) % 3600) % 60;
        int minutes = ((rounded % 86400) % 3600) / 60;

        return formatTime(seconds, minutes);
    }
    private String formatTime(int seconds, int minutes) {
        return String.format("%02d",minutes) + " : " + String.format("%02d",seconds);
    }
    void check(){
        int k = 0; int h = 0;
        while (k<6&&h<6){
            if (!dsView[k][h].getText().equals(Val.de_5[k][h])){
                dsView[k][h].setBackgroundResource(R.drawable.drawable_check);
            }
            h++;
            if (h==6){
                h=0;
                k++;
            }
        }

        for (int i=0;i<6;i++){
            for (int j = 0;j<6;j++){
                if (!dsView[i][j].getText().equals(Val.de_5[i][j])){
                    ketqua = false;
                    break;
                }
                else ketqua = true;
            }
            if (ketqua == false){
                break;
            }
        }

    }
    //
    public void dialog_tb(){
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_that_bai);
        Button btn_thoat = dialog.findViewById(R.id.btn_thoat);
        Button btn_choi_lai = dialog.findViewById(R.id.btn_choi_lai);

        btn_thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btn_choi_lai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(getApplicationContext(),De1Activity.class));
            }
        });
        dialog.show();
    }
}