package com.example.admin.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<Fruit>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        initFruits();
        FruitAdapter adapter = new FruitAdapter(MainActivity.this, android.R.layout.simple_expandable_list_item_1, R.layout.fruit_item, fruitList);


        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }

    private void initFruits() {
        Fruit apple = new Fruit("Apple", 2);

        Fruit apple2 = new Fruit("Apple2", 2);
        Fruit apple3 = new Fruit("Apple3", 2);
        fruitList.add(apple);
        fruitList.add(apple2);
        fruitList.add(apple3);
    }
}
