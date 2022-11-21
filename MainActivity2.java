package com.example.bai_kt1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ListView lvBongDa;
    ArrayList<BongDa> arrayBongDa;
    BongDaAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        AnhXa();
        adapter = new BongDaAdapter(this,R.layout.dong_trai_cay,arrayBongDa);
        lvBongDa.setAdapter(adapter);
        lvBongDa.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                XacNhanXoa(i);
                return false;
            }
        });

    }

    private void XacNhanXoa(int position) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("Thông báo");
        alertDialog.setIcon(R.drawable.ic_launcher_foreground);
        alertDialog.setMessage("Bạn có muốn xóa cái này không?");
        alertDialog.setPositiveButton("Có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                arrayBongDa.remove(position);
                adapter.notifyDataSetChanged();
            }
        });
        alertDialog.setNegativeButton("Không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alertDialog.show();
    }

    private void   AnhXa() {
        lvBongDa = (ListView) findViewById(R.id.listviewTraiCay);
        arrayBongDa = new ArrayList<>();
        arrayBongDa.add(new BongDa("Oloe Vera", "Lô Hội,Nha Đam ","Làm đẹp, chữa bệnh","Lá xanh có gai", R.drawable.nhadam));
        arrayBongDa.add(new BongDa("Mangifera indica", "Xoài","Cây thuộc dạng quả hạch,chín màu vàng","Lá non có màu đỏ thẩm khi già có màu xanh", R.drawable.xoai));
        arrayBongDa.add(new BongDa("Pinus", "Cây Thông","Họ thực vật trong bộ Thông","Thân cây to lá kim thường sống ở nơi lạnh", R.drawable.caythong));
        arrayBongDa.add(new BongDa("Ficus drupacea", "Cây Đa","Một loài cây thuộc họ Dâu tằm","Lá có màu xanh ", R.drawable.da));
        arrayBongDa.add(new BongDa("Eril ", "Việt Nam ","Ba Lan","LW9", R.drawable.lewando));
        arrayBongDa.add(new BongDa(" Neymar JR", " Vũ công samba Brazill","Brazill","N10", R.drawable.neymar));
        arrayBongDa.add(new BongDa(" Lewandowski", "Vua dội bom","Thụy Điển","MCK", R.drawable.lewando));
        adapter = new BongDaAdapter(MainActivity2.this, R.layout.dong_trai_cay, arrayBongDa);
        lvBongDa.setAdapter(adapter);
        lvBongDa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position==0){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity2.this,Listronaldo.class);
                    startActivity(intent);
                }
                if (position==1){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity2.this,Listmessi.class);
                    startActivity(intent);
                }
                if (position==2){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity2.this,Listkaka.class);
                    startActivity(intent);
                }
                if (position==3){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity2.this,Listramos.class);
                    startActivity(intent);
                }
            }
        });

    }
}