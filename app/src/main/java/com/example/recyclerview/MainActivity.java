package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mrecyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass>userList;
    Adapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initRecyclerView();
    }

    private void initRecyclerView() {
        mrecyclerView=findViewById(R.id.RecyclerView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        mrecyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList);
        mrecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();




    }
    private void initData() {
        userList = new ArrayList<>();

        userList.add(new ModelClass(R.drawable.boy4,"Arif","Hello!How are you?","11:55 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.boy3,"Shamim","I am fine","12:08 pm","_______________________________________"));

        userList.add(new ModelClass(R.drawable.boy4,"Shibli","What about u","1:02 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.boy4,"Tanvir","Yes, a long time","12:55 pm","_______________________________________"));

        userList.add(new ModelClass(R.drawable.boy1,"Tamim","You are absolutely right","13:50 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.boy2,"Kader","I see.","1:08 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.boy3,"Samir","You Know this?","4:02 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.boy5,"Suny","How ?","11:55 pm","_______________________________________"));

        userList.add(new ModelClass(R.drawable.boy6,"Tanha","How are you?","10:45 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.boy7,"Tanvir","I am fine","15:08 pm","_______________________________________"));

        userList.add(new ModelClass(R.drawable.boy6,"Tamim","You Know?","1:02 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.boy5,"Feroz","How are you?","12:55 pm","_______________________________________"));

        userList.add(new ModelClass(R.drawable.boy7,"Selim","This is Easy","13:50 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.boy6,"Sajib","I must be off now","1:08 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.boy3,"Rana","You Know this?","4:02 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.boy7,"Ujjal","Thank you","11:55 pm","_______________________________________"));




    }


}