package com.example.sudoku.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.sudoku.DAO.KiLucDAO;
import com.example.sudoku.JClass.KiLuc;
import com.example.sudoku.R;

import java.util.List;

public class KiLucDe1Adapter extends BaseAdapter {
    LayoutInflater inflater;
    Context context;
    List<KiLuc> de1s;

    public KiLucDe1Adapter(Context context, List<KiLuc> de1s) {
        this.context = context;
        this.de1s = de1s;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return de1s.size();
    }

    @Override
    public KiLuc getItem(int position) {
        return de1s.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.row_kl,null);
        TextView tv_name,tv_getTime;
        tv_name = convertView.findViewById(R.id.tv_name);
        tv_getTime = convertView.findViewById(R.id.tv_getTime);

        KiLuc kiLuc = de1s.get(position);
        tv_name.setText(kiLuc.getName());
        double time = kiLuc.getTime();
        int rounded = (int) Math.round(time);
        int seconds = ((rounded % 86400) % 3600) % 60;
        int minutes = ((rounded % 86400) % 3600) / 60;
        tv_getTime.setText(String.format("%02d",minutes) + " : " + String.format("%02d",seconds));
        return convertView;
    }
}
