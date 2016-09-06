package com.example.admin.listviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by admin on 2016/9/6.
 */
public class FruitAdapter extends ArrayAdapter<Fruit>{
    private int resourceID;
    public FruitAdapter(Context context, int resource, int textViewResourceId, List<Fruit> objects) {
        super(context, resource, textViewResourceId, objects);
        resourceID = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Fruit fruit = getItem(position);
        View view;
        if(convertView == null)
        {
            view = LayoutInflater.from(getContext()).inflate(resourceID, null);
        }
        else
        {
            view = convertView;
        }
        TextView fruitText = (TextView) view.findViewById(R.id.fruit_text);
        Button fruitButton = (Button) view.findViewById(R.id.fruit_button);
        fruitText.setText(fruit.getName());
        return view;
    }
}
