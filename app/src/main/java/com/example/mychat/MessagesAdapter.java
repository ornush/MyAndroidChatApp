package com.example.mychat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

//hemi
public class MessagesAdapter extends RecyclerView.Adapter <MessagesAdapter.MessageViewHolder> {


    //    private String senderImg ,receiverImg;
    private Context context;


    class MessageViewHolder extends RecyclerView.ViewHolder {

        private final TextView txtMessage;
        //        private final TextView reciver;
        ConstraintLayout ccll;
        //  private final TextView tvContent;


        private MessageViewHolder(View itemView) {

            super(itemView);

            ccll = itemView.findViewById(R.id.ccLayout);
            txtMessage = itemView.findViewById(R.id.txtMessage);
//            reciver = itemView.findViewById(R.id.reciver);
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

        View itemView = mInflater.inflate(R.layout.message_layout, parent, false);
        return new MessageViewHolder(itemView);
        //  return null;

    }

    @Override
    public void onBindViewHolder(@NonNull MessageViewHolder holder, int position) {

        holder.txtMessage.setText(msg.get(position).getContent());
        ConstraintLayout constraintLayout = holder.ccll;

        if (msg.get(position).getSender().equals("alice")) {
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(constraintLayout);
            constraintSet.clear(R.id.profile_cardView, ConstraintSet.LEFT);
            constraintSet.clear(R.id.tvContent, ConstraintSet.LEFT);
            constraintSet.connect(R.id.profile_cardView, constraintSet.RIGHT, R.id.ccLayout, constraintSet.RIGHT, 0);


//        if(msg!=null){

//            final Message current = msg.get(position);
//            holder.sender.setText(current.getSender());
//            holder.reciver.setText(current.getReceiver());
            //  holder.tvContent.setText(current.getContent());

//        }
        }else{
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(constraintLayout);
            constraintSet.clear(R.id.profile_cardView, ConstraintSet.RIGHT);
            constraintSet.clear(R.id.tvContent, ConstraintSet.RIGHT);
            constraintSet.connect(R.id.profile_cardView, constraintSet.LEFT, R.id.ccLayout, constraintSet.RIGHT, 0);


        }


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




