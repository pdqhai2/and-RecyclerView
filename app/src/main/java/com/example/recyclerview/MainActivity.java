package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview.adapter.CharacterAdapter;
import com.example.recyclerview.modle.Character;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvChar;
    private List<Character> mlistChar;
    private CharacterAdapter CharAdap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvChar = findViewById(R.id.rcv_char);
        CharAdap = new CharacterAdapter(this);

        LinearLayoutManager llm = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rcvChar.setLayoutManager(llm);

        CharAdap.setData(getListChar());
        rcvChar.setAdapter(CharAdap);
    }

    private List<Character> getListChar()
    {
        List<Character> list = new ArrayList<>();
        list.add(new Character(R.drawable.img0,"Quang Hải"));
        list.add(new Character(R.drawable.img1,"Raiden Shogun"));
        list.add(new Character(R.drawable.img2,"Zhongli"));
        list.add(new Character(R.drawable.img3,"Venti"));
        return list;
    }
}