package com.example.mychat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

//hemi
public class UsersListAdapter extends RecyclerView.Adapter <UsersListAdapter.UserViewHolder> {



    class UserViewHolder extends RecyclerView.ViewHolder {

        private final TextView tvName;
        private final TextView tvEmail;
        private final ImageView ivPic;


        private UserViewHolder(View itemView) {

            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvEmail = itemView.findViewById(R.id.tvEmail);
            ivPic = itemView.findViewById(R.id.ivPic);





//
//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    OnUserClickListener.onUserClicked(getAdapterPosition());
//
//                }
//            });


        }

    }



    private final LayoutInflater mInflater;
    private List<User> users;
    private Context context;
    OnUserClickListener onUserClickListener;
    private static Context mContext;

    public UsersListAdapter(LayoutInflater mInflater, List<User> users, Context context, OnUserClickListener onUserClickListener) {
        this.mInflater = mInflater;
        this.users = users;
        this.context = context;
        this.onUserClickListener = onUserClickListener;
    }

    public static Context getContext() {
        //  return instance.getApplicationContext();
        return mContext;
    }

    interface OnUserClickListener{
        void onUserClicked(int position);
    }

    public UsersListAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
    }



    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = mInflater.inflate(R.layout.user_layout,parent,false);
//        View btnUser = itemView.findViewById(R.id.btnUser);
//
//        btnUser.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(mContext,Profile.class);
//                mContext.startActivity(i);
//            }
//        });
        return new UserViewHolder(itemView);
        //  return null;

    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {

        if(users!=null){

          final User current = users.get(position);
          holder.tvName.setText(current.getUsername());
          holder.tvEmail.setText(current.getEmail());
          holder.ivPic.setImageResource(current.getProfilePicture());

        }
    }


    public void setUsers(List<User> u){
        users=u;
        notifyDataSetChanged();

    }


    @Override
    public int getItemCount() {
        if(users!=null) {
            return users.size();
        }
        else
             return 0;
    }



    public List<User> getUsers(){


        return users;}

}



