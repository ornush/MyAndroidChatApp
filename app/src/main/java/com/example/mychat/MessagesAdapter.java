package com.example.mychat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

//hemi
public class MessagesAdapter extends RecyclerView.Adapter <MessagesAdapter.MessageViewHolder> {


    class MessageViewHolder extends RecyclerView.ViewHolder {

        private final TextView tvName;
        private final TextView tvEmail;
      //  private final TextView tvContent;


        private MessageViewHolder(View itemView) {

            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvEmail = itemView.findViewById(R.id.tvEmail);
           // tvContent = itemView.findViewById(R.id.tvContent);

        }

    }


    private final LayoutInflater mInflater;
    private List<Message> msg;

    public MessagesAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
    }



    @Override
    public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = mInflater.inflate(R.layout.message_layout,parent,false);
        return new MessageViewHolder(itemView);
        //  return null;

    }

    @Override
    public void onBindViewHolder(@NonNull MessageViewHolder holder, int position) {

//        if(msg!=null){

            final Message current = msg.get(position);
            holder.tvName.setText(current.getSender());
            holder.tvEmail.setText(current.getReceiver());
          //  holder.tvContent.setText(current.getContent());

//        }
    }


    public void setUsers(List<Message> m){
        msg=m;
        notifyDataSetChanged();

    }


    @Override
    public int getItemCount() {
        if(msg!=null) {
            return msg.size();
        }
        else
            return 0;
    }



    public List<Message> getUsers(){return msg;}

}



