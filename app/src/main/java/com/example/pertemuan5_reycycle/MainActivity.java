package com.example.pertemuan5_reycycle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recylerView;
    String s1[], s2[],s3[];
    int images[] =
            {R.drawable.kaos1,R.drawable.kaos2,R.drawable.kaos1,R.drawable.jaket1};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recylerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.mobil);
        s2 = getResources().getStringArray(R.array.penjelasan);
        s3 = getResources().getStringArray(R.array.bintang);
        ItemAdapter appAdapter = new ItemAdapter(this,s1,s2,s3,images);
        recylerView.setAdapter(appAdapter);
//        recylerView.setLayoutManager(new LinearLayoutManager(this));

        LinearLayoutManager layoutManager = new LinearLayoutManager((this),
        LinearLayoutManager.HORIZONTAL,false);
        recylerView.setLayoutManager(layoutManager);
        recylerView.setItemAnimator(new DefaultItemAnimator());



    }
}
