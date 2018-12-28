package com.example.chhaihout.beloveplanb.activity;

import android.app.FragmentManager;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.chhaihout.beloveplanb.R;
import com.example.chhaihout.beloveplanb.fragment.BlankFragment;
import com.example.chhaihout.beloveplanb.fragment.PhotoFragment;

import java.util.ArrayList;
import java.util.List;

import link.fls.swipestack.SwipeStack;

public class SwipeActivity extends AppCompatActivity implements SwipeStack.SwipeStackListener, View.OnClickListener{
    private FloatingActionButton mFab;
    private ArrayList<String> mData;
    private SwipeStack mSwipeStack;
    private SwipeStackAdapter mAdapter;
    RelativeLayout mRoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe);

        mSwipeStack = findViewById(R.id.swipeStack);
        mRoot = findViewById(R.id.action_root);
        mFab = findViewById(R.id.fabAdd);
        mFab.setOnClickListener(this);

        mData = new ArrayList<>();
        mAdapter = new SwipeStackAdapter(mData);
        mSwipeStack.setAdapter(mAdapter);
        mSwipeStack.setListener(this);
        fillWithTestData();
        //Snackbar.make(R.id.action_root, "Lost Connection...",, Snackbar.LENGTH_INDEFINITE).show();
    }

    private void fillWithTestData() {
        for (int x = 0; x < 5; x++) {
            mData.add( "Test" + " " + (x + 1));
        }
    }

    @Override
    public void onViewSwipedToLeft(int position) {

    }

    @Override
    public void onViewSwipedToRight(int position) {

    }

    @Override
    public void onStackEmpty() {
        Toast.makeText(this, "Stack Empty", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        if (v.equals(mFab)){
            mData.add("Fab Test");
            mAdapter.notifyDataSetChanged();
        }
    }

    public class SwipeStackAdapter extends BaseAdapter {
        private List<String> mData;
        public SwipeStackAdapter(List<String> data) {
            this.mData = data;
        }

        @Override
        public int getCount() {
            return mData.size();
        }

        @Override
        public String getItem(int position) {
            return mData.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.card, parent, false);
            }
            return convertView;
        }
    }
}
