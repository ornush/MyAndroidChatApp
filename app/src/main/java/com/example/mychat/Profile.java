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
        msg.add(new Message("alice","bob","hello bob how are you?"));
//        msg.add(new Message("bob","alice","hello Alice"));
        msg.add(new Message("alice","bob","whats up?"));
//        msg.add(new Message("bob","alice","baruch hashem!"));
        adapter.setUsers(msg);










    }
}