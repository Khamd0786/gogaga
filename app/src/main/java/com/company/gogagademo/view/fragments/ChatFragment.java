package com.company.gogagademo.view.fragments;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.company.gogagademo.R;
import com.company.gogagademo.database.ChatAdapter;
import com.company.gogagademo.database.Data;

/**
 * Created by Hammad Khan on 1, Sep 2020
 */
public class ChatFragment extends BaseFragment{
    private RecyclerView recyclerView;
    private ChatAdapter adapter;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_chat;
    }

    @Override
    public void init() {
        recyclerView =  rootView.findViewById(R.id.chat_recycler_view);
        RecyclerView.LayoutManager mlayout= new LinearLayoutManager(requireContext());
        recyclerView.setLayoutManager(mlayout);
        adapter = new ChatAdapter(requireContext(), Data.getAllList());
        recyclerView.setAdapter(adapter);
    }
}
