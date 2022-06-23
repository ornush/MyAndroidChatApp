package com.example.mychat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

///youtube
public class ListActivity extends AppCompatActivity {


//    List<String> list;
//    private RecyclerView recyclerView;
//    private ArrayList<User> users;
//    private ProgressBar progressBar;
//    private UsersAdapter usersAdapter;
      private  UsersListAdapter usersListAdapter;
      UsersListAdapter.OnUserClickListener onUserClickListener;


    private SwipeRefreshLayout swipeRefreshLayout;
    private FloatingActionButton btnAdd;
    private FloatingActionButton btnUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        RecyclerView lstUsers = findViewById(R.id.lstUsers);
        final UsersListAdapter adapter = new UsersListAdapter(this);
        lstUsers.setAdapter(adapter);
        lstUsers.setLayoutManager(new LinearLayoutManager(this));

        List<User>users = new ArrayList<>();
        users.add(new User("Alice","whats up?",R.drawable.pic1));
        users.add(new User("Bob","talk with me, please",R.drawable.man1));
        users.add(new User("Eliyahu","hahahahah",R.drawable.man2));
        users.add(new User("Shira","at 4pm",R.drawable.woman2));
        users.add(new User("Dana","i will see you in the uni",R.drawable.woman3));
        users.add(new User("Israel","no matter",R.drawable.man3));
        users.add(new User("Yaakov","what????",R.drawable.man4));
        users.add(new User("Yinon","so??",R.drawable.ic_person));

        adapter.setUsers(users);



        //button
        btnAdd= findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(),Profile.class);
                startActivity(i);
            }
        });


        //button
//        btnUser= findViewById(R.id.btnUser);
//        btnUser.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(view.getContext(),Profile.class);
//                startActivity(i);
//            }
//        });


//     onUserClickListener = new UsersListAdapter.OnUserClickListener() {
//      @Override
//      public void onUserClicked(int position) {
//          Toast.makeText(ListActivity.this,"tapped on user"+users.get(position).getUsername(),Toast.LENGTH_SHORT).show();
//
//
//      }
//  };






//        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
//            @Override
//            public void onRefresh() {
//
//                users.add(new User("bobb","ttt2mail,com",R.drawable.pic1));
//                users.add(new User("bobb2","ttt2mail,com",R.drawable.pic1));
//                swipeRefreshLayout.setRefreshing(false);
//
//            }
//        });




//    progressBar = findViewById(R.id.progressBar);
//    users = new ArrayList<>();
//    recyclerView = findViewById(R.id.recycler);

//    onUserClickListener = new UsersAdapter.OnUserClickListener() {
//        @Override
//        public void onUserClicked(int position) {
//            Toast.makeText(ListActivity.this,"tapped on user"+users.get(position).getUsername(),Toast.LENGTH_SHORT).show();
//        }
//    };


   // getUsers();

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.profile_menu,menu);
//        return  super.onCreateOptionsMenu(menu);
//    }

//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        if(item.getItemId() == R.id.menu_item_profile){
//
//            startActivity(new Intent(ListActivity.this,Profile.class));
//        }
//        return super.onOptionsItemSelected(item);
//    }


//    private void getUsers(){
//
//        usersAdapter=new UsersAdapter(users,ListActivity.this,onUserClickListener);
//        recyclerView.setLayoutManager(new LinearLayoutManager(ListActivity.this));
//        recyclerView.setVisibility(View.GONE);
//        recyclerView.setVisibility(View.VISIBLE);
//    }







}