package com.example.mychat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText edtUsername, edtPassword1,edtPassword2, edtNick;
    private Button btnSubmit,btnPic;
    private TextView txtLoginInfo, errMsg;


    //checking in which page we are
    private boolean isSigningUp = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUsername= findViewById(R.id.edtUsername);
        edtNick = findViewById(R.id.edtNick);
        edtPassword1 = findViewById(R.id.edtPassword1);
        edtPassword2 = findViewById(R.id.edtPassword2);
        btnPic = findViewById(R.id.btnPic);

        errMsg= findViewById(R.id.errMsg);
        errMsg.setVisibility(View.GONE);



        //button
        btnSubmit= findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(edtNick.getText().toString().isEmpty() || edtPassword1.getText().toString().isEmpty()){
                    if(isSigningUp && edtUsername.getText().toString().isEmpty() &&
                            edtNick.getText().toString().isEmpty()){

                        ///print error
                        errMsg.setVisibility(View.VISIBLE);
                    }
                }else{
                  Intent i = new Intent(view.getContext(),ListActivity.class);
                    startActivity(i);
                //    Intent intent = new Intent(getApplicationContext(),UsersListHActivity.class);
                //    startActivity(intent);
                }
            }
        });



        //text
        txtLoginInfo= findViewById(R.id.txtLoginInfo);

        //checking in which page we are- function
        txtLoginInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isSigningUp){
                    isSigningUp=false;
                    edtNick.setVisibility(View.GONE);
                    btnPic.setVisibility(View.GONE);
                    btnSubmit.setText("Log in");
                    txtLoginInfo.setText("Don't have an account? Sign up");
                }else{

                    isSigningUp=true;
                    edtUsername.setVisibility(View.VISIBLE);
                    btnSubmit.setText("Sign up");
                    txtLoginInfo.setText("Already have an account? Log in");
                }
            }
        });



    }
}