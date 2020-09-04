package com.company.gogagademo.database;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.company.gogagademo.R;
import com.company.gogagademo.database.model.Chats;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.VH> {
    private ArrayList<Chats> list;
    private Context context;

    public ChatAdapter(Context context, ArrayList<Chats> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_chats, parent, false);
        return new VH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, final int position) {
        Glide.with(context)
                .load(list.get(position).getProfile())
                .into(holder.ivProfile);
        String unread = list.get(position).getUnRead();
        if (unread.equals("") || unread.isEmpty()) {
            holder.tvUnread.setVisibility(View.GONE);
        }
        else {
            holder.tvUnread.setText(unread);
        }
        holder.tvMessage.setText(list.get(position).getMessage());
        holder.tvuserName.setText(list.get(position).getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, list.get(position).getName() +": "+ list.get(position).getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class VH extends RecyclerView.ViewHolder {
        private TextView tvuserName, tvMessage, tvTime, tvUnread;
        private ImageView ivProfile;

        public VH(@NonNull View itemView) {
            super(itemView);
            tvuserName = itemView.findViewById(R.id.tv_chat_username);
            tvMessage = itemView.findViewById(R.id.tv_chat_message);
//            tvTime = itemView.findViewById(R.id.tv_chat_username);
            tvUnread = itemView.findViewById(R.id.tv_chat_unread);
            ivProfile = itemView.findViewById(R.id.chat_user);
        }
    }
}
