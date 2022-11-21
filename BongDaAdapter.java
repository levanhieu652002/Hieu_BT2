package com.example.bai_kt1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class BongDaAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<BongDa> bongDaList;

    public BongDaAdapter(Context context, int layout, List<BongDa> traiCayList) {
        this.context = context;
        this.layout = layout;
        this.bongDaList = traiCayList;
    }

    @Override
    public int getCount() {
        return bongDaList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View converView, ViewGroup viewGroup) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
         converView  = inflater.inflate(layout, null);
        //ánh xạ view
        TextView txtTen=(TextView) converView.findViewById(R.id.textviewTen);
        TextView txtMota= (TextView) converView.findViewById(R.id.textMoTa);
        TextView txtQuocGia= (TextView) converView.findViewById(R.id.textQuocGia);
        TextView txtNgheDanh= (TextView) converView.findViewById(R.id.textNgheDanh);
        ImageView imgHinh= (ImageView) converView.findViewById(R.id.imageviewHinh);
        //gán giá trị
        BongDa bongDa =bongDaList.get(i);
        txtTen.setText(bongDa.getTen());
        txtMota.setText(bongDa.getMoTa());
        txtQuocGia.setText(bongDa.getQuocGia());
        txtNgheDanh.setText(bongDa.getNgheDanh());
        imgHinh.setImageResource(bongDa.getHinh());
        return converView;
    }
}
