package com.example.chhaihout.beloveplanb.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.chhaihout.beloveplanb.R;
import com.example.chhaihout.beloveplanb.adapter.ReyclerViewAdapter;

public class PhotoFragment extends Fragment {
    private RecyclerView mRecyclerview;
    private int[] mData = {R.drawable.image1, R.drawable.images2};
    ReyclerViewAdapter adapter;

    public PhotoFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup con,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_photo, con, false);
//        mRecyclerview = view.findViewById(R.id.recyclerV);
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
//        mRecyclerview.setLayoutManager(layoutManager);
//        adapter = new ReyclerViewAdapter(getContext(), mData);
//        mRecyclerview.setAdapter(adapter);
        view.findViewById(R.id.Frame).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Click", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("Swipe", "onViewCreated: ");
        Toast.makeText(getContext(), "Create", Toast.LENGTH_SHORT).show();
    }
}
