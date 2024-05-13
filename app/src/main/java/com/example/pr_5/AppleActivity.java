package com.example.pr_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class AppleActivity extends AppCompatActivity {
    ArrayList<String> apples = new ArrayList<String>();
    ArrayList<String> selectedApples = new ArrayList<String>();
    ArrayAdapter<String> applesAdapter;
    ListView ApplesListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple);
        String[] Apples =
                getResources().getStringArray(R.array.SOApple);
        // добавляем начальные элементы
        Collections.addAll(apples, Apples);
        ApplesListView = (ListView) findViewById(R.id.my_apple);
        applesAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_multiple_choice,
                apples);
        ApplesListView.setAdapter(applesAdapter);
        ApplesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // получаем нажатый элемент
                String user = applesAdapter.getItem(position);
                if (ApplesListView.isItemChecked(position))
                    selectedApples.add(user);
                else
                    selectedApples.remove(user);
            }
        });
    }
    public void add(View view){
        EditText userName = findViewById(R.id.Enter_apple);
        String user = userName.getText().toString();
        if(!user.isEmpty()){
            applesAdapter.add(user);
            userName.setText("");
            applesAdapter.notifyDataSetChanged();
        }
    }
    public void remove(View view){
        // получаем и удаляем выделенные элементы
        for(int i=0; i< selectedApples.size();i++){
            applesAdapter.remove(selectedApples.get(i));
        }
        // снимаем все ранее установленные отметки
        ApplesListView.clearChoices();
        // очищаем массив выбраных объектов
        selectedApples.clear();
        applesAdapter.notifyDataSetChanged();
    }
}
