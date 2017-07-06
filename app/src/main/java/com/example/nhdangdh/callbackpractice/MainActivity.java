package com.example.nhdangdh.callbackpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Items>imageDetails = getListData();
        final ListView lvMain = (ListView) findViewById(R.id.lvMain);
        lvMain.setAdapter(new CustomListAdapter(imageDetails, this));
    }

    private List<Items>getListData(){
        List<Items> listItems = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            listItems.add(new Items(R.drawable.imghuong, "Lê Lý Mỹ Hương", "Diễn viên FapTV"));
        }
        return listItems;
    }
}
