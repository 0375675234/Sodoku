package com.example.sudoku.Adapter;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.sudoku.DAO.NguoiDungDAO;
import com.example.sudoku.JClass.NguoiDung;
import com.example.sudoku.R;

import java.util.List;

public class NguoiDungAdapter extends BaseAdapter {
    List<NguoiDung> dsND;
    Context context;
    LayoutInflater inflater;
    NguoiDungDAO nguoiDungDAO;
    public NguoiDungAdapter(List<NguoiDung> dsND, Context context) {
        this.dsND = dsND;
        this.context = context;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        nguoiDungDAO = new NguoiDungDAO(context);
    }

    @Override
    public int getCount() {
        return dsND.size();
    }

    @Override
    public NguoiDung getItem(int position) {
        return dsND.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.row_nd,null);
        TextView tvID,tvName;
        LinearLayout lnAdapter;
        ImageView imgXoa,imgAvt;

        tvID = convertView.findViewById(R.id.id);
        tvName = convertView.findViewById(R.id.name);
        imgXoa = convertView.findViewById(R.id.imgXoa);
        imgAvt = convertView.findViewById(R.id.imgAvt);
        lnAdapter = convertView.findViewById(R.id.lnAdapter);

        if (position%2==0){
            imgAvt.setImageResource(R.drawable.avt_user2);
            lnAdapter.setBackgroundResource(R.drawable.drawable_setbackground);
        }

        NguoiDung nd = dsND.get(position);
        tvID.setText(nd.getId());
        tvName.setText(nd.getName());

        imgXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                nguoiDungDAO.xoaNguoiDung(dsND.get(position).getId());
//                dsND.remove(position);
//                notifyDataSetChanged();
                show_dialog_xoa_nguoi_dung(position);
            }
        });
        return convertView;
    }
    void show_dialog_xoa_nguoi_dung(final int position){
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.dialog_xoa_nguoi_dung);

        Button btn_huy = dialog.findViewById(R.id.btn_huy);
        Button btn_xoa = dialog.findViewById(R.id.btn_xoa);

        btn_xoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nguoiDungDAO.xoaNguoiDung(dsND.get(position).getId());
                dsND.remove(position);
                notifyDataSetChanged();
                dialog.dismiss();
            }
        });

        btn_huy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }
}
