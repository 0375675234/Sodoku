package com.example.sudoku.JClass;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;

import com.example.sudoku.MainActivity;
import com.example.sudoku.ManHinhChaoClickActivity;
import com.example.sudoku.R;

import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

public class Play {
    public static void gamePlay(int dong, int cot, TextView[][] dsView, TextView[] dsNum, ImageView imgXoa){
        HashMap<String,Object> hashMap = new HashMap<String,Object>();
        hashMap.put("dong", dong);
        hashMap.put("cot", cot);
        dsView[dong][cot].setTag(hashMap);
        if (dsView[dong][cot].getText().equals("")){
            dsView[dong][cot].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    HashMap<String,Object> hashMap= (HashMap<String, Object>) v.getTag();
                    final int dong = (int) hashMap.get("dong");
                    final int cot = (int) hashMap.get("cot");
                    for (int z = 0;z<6;z++){
                        for (int x=0;x<6;x++){
                            dsView[z][x].setBackgroundResource(R.drawable.drawable_background);
                            dsView[z][cot].setBackgroundResource(R.drawable.drawable_test);
                            dsView[dong][x].setBackgroundResource(R.drawable.drawable_test);
                            dsView[dong][cot].setBackgroundResource(R.drawable.drawable_setbackground);
                        }
                    }

                    for (int i = 0;i<6;i++){
                        dsNum[i].setTag((i+1));
                        dsNum[i].setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                dsView[dong][cot].setText(""+v.getTag());
                            }
                        });
                    }
                    imgXoa.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dsView[dong][cot].setText("");
                        }
                    });
                }
            });
        }
    }
    public static void gamePlay2(int dong, int cot, TextView[][] dsView, TextView[] dsNum, ImageView imgXoa){
        HashMap<String,Object> hashMap = new HashMap<String,Object>();
        hashMap.put("dong", dong);
        hashMap.put("cot", cot);
        dsView[dong][cot].setTag(hashMap);
        if (dsView[dong][cot].getText().equals("")){
            dsView[dong][cot].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    HashMap<String,Object> hashMap= (HashMap<String, Object>) v.getTag();
                    final int dong = (int) hashMap.get("dong");
                    final int cot = (int) hashMap.get("cot");
                    for (int z = 0;z<9;z++){
                        for (int x=0;x<9;x++){
                            dsView[z][x].setBackgroundResource(R.drawable.drawable_background);
                            dsView[z][cot].setBackgroundResource(R.drawable.drawable_test);
                            dsView[dong][x].setBackgroundResource(R.drawable.drawable_test);
                            dsView[dong][cot].setBackgroundResource(R.drawable.drawable_setbackground);
                        }
                    }

                    for (int i = 0;i<9;i++){
                        dsNum[i].setTag((i+1));
                        dsNum[i].setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                dsView[dong][cot].setText(""+v.getTag());
                            }
                        });
                    }
                    imgXoa.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dsView[dong][cot].setText("");
                        }
                    });
                }
            });
        }
    }
    public static void dialog_ht(Context context){
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.dialog_hoan_thanh);
        Button btn_tiep = dialog.findViewById(R.id.btn_tiep);

        btn_tiep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)context).finish();
            }
        });
        dialog.show();
    }

    public static final String formatTime(int seconds, int minutes) {
        return String.format("%02d",minutes) + " : " + String.format("%02d",seconds);
    }
}
