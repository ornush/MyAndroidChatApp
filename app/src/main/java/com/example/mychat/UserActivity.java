package com.example.mychat;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class UserActivity extends AppCompatActivity {

    private  UsersListAdapter usersListAdapter;
    UsersListAdapter.OnUserClickListener onUserClickListener;


    private FloatingActionButton btnUser;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_layout);



      //  button
//        btnUser= findViewById(R.id.btnUser);
//        btnUser.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                Intent i = new Intent(view.getContext(),Profile.class);
////                startActivity(i);
//
//                Intent myIntent = new Intent(UserActivity.this, Profile.class);
////                myIntent.putExtra("key", value); //Optional parameters
//                UserActivity.this.startActivity(myIntent);
//
//            }
//        });


    }
}