package com.example.pr_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class BananasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bananas);
        ListView BananasListView =(ListView) findViewById(R.id.my_banana);
        String [] bananas = getResources().getStringArray(R.array.SOBananas);
        ArrayAdapter<String> bananaAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,bananas);
        BananasListView.setAdapter(bananaAdapter);
        TextView selectedApple = findViewById(R.id.selected_bananas);
        BananasListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = bananas[position];
                selectedApple.setText(selectedItem);
            }
        });
    }
}
