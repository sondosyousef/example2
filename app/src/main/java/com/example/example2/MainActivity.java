package com.example.example2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.AutoSizeableTextView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.app.ProgressDialog.show;
import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {
private EditText edtName;
private EditText edtPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName = findViewById(R.id.edtName);
        edtPass = findViewById(R.id.edtPass);
    }
    //todo onclick
    public void btnSubmitOnClick(View view){
        String name = edtName.getText().toString();
        String password = edtPass.getText().toString();
        String msg = "name"+name +"password"+password;

        Toast.makeText(this ,msg, LENGTH_SHORT).show();
    }
}