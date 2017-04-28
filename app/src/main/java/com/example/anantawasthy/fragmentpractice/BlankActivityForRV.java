package com.example.anantawasthy.fragmentpractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.anantawasthy.fragmentpractice.adapter.CustomAdpater;
import com.example.anantawasthy.fragmentpractice.adapter.Model;

import java.util.ArrayList;
import java.util.List;

public class BlankActivityForRV extends AppCompatActivity {

    private RecyclerView rv_main;
    private Button btn_send;
    private List<Model> modelList;
    private EditText in_msg;
    private CustomAdpater adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blank_for_rv);
        getRV();
        btnSend();
    }

    private void btnSend() {
        btn_send= (Button)findViewById(R.id.btn_send);
        in_msg = (EditText)findViewById(R.id.in_msg);
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message = in_msg.getText().toString();
                Model model = new Model(message);

                adapter.addItemtoTheList(model);

                rv_main.scrollToPosition(0);
            }
        });
    }

    private void getRV() {
        rv_main = (RecyclerView)findViewById(R.id.rv_main);
        modelList =new ArrayList<>();

        rv_main.setHasFixedSize(true);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setStackFromEnd(true);
        manager.setReverseLayout(true);

        rv_main.setLayoutManager(manager);

        for (int i = 0; i < 2; i++) {
            Model model = new Model("Msg " +  (i+1));
            modelList.add(model);
        }

        adapter = new CustomAdpater(this,modelList);

        rv_main.setAdapter(adapter);
    }



}
