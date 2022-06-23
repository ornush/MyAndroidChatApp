package com.example.mychat;

import android.os.Bundle;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Profile extends AppCompatActivity {



        private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();
        setContentView(R.layout.activity_chat);


        RecyclerView lstMsg = findViewById(R.id.lstMsg);
        final MessagesAdapter adapter = new MessagesAdapter(this);
        lstMsg.setAdapter(adapter);
        lstMsg.setLayoutManager(new LinearLayoutManager(this));

        List<Message> msg = new ArrayList<>();
        msg.add(new Message("hi!!!!","bye####","hello"));
        msg.add(new Message("hi2222!!!!","bye####","hello"));
        msg.add(new Message("hi33333!!!!","bye####","hello"));

        adapter.setUsers(msg);










    }
}