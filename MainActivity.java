package com.example.bai_kt1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    EditText edtuser, edtpassword ;
    Button btndangnhap,btndangky;
    String ten, mk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        TextView btn = findViewById(R.id.textViewSignUp);
        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtuser.getText().length() !=0 && edtpassword.getText().length()!=0 ){
                    if (edtuser.getText().toString().equals(ten) && edtpassword.getText().toString().equals(mk)){
                        Toast.makeText(MainActivity.this, "Ban da dang nhap thanh cong", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, Home.class);
                        startActivity(intent);

                    }else if (edtuser.getText().toString().equals("hieu")&& edtpassword.getText().toString().equals("hieu6502")){
                        Toast.makeText(MainActivity.this, "Ban da dang nhap thanh cong", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, Home.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(MainActivity.this, "Dang nhap khong thanh cong", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Moi ban nhap du thong tin", Toast.LENGTH_SHORT).show();
                }
            }
        });
      /*  btndangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setTitle("Hop thoai dang ky");
                dialog.setCancelable(false);
                dialog.setContentView(R.layout.activity_sign_up);

            }
        });*/
    }

    private void Anhxa() {
        edtuser = (EditText) findViewById(R.id.username);
        edtpassword = (EditText) findViewById(R.id.inputpassword);
        btndangnhap =(Button) findViewById(R.id.btnlogin);

    }
}