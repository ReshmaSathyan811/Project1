package com.resh.myapplicationmarch;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    int foodimages[];
    String foodnames[];
    LayoutInflater inflater;


    public CustomAdapter(Context applicationContext, String[] foodnames, int[] foodimages) {

        context=applicationContext;
                this.foodimages=foodimages;
                this.foodnames=foodnames;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {

         return null;
    }

    @Override
    public long getItemId(int i) {

        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        //oru layoutliku mattoru layoutne combine cheyyan use cheyyunnathanu LAYOUT INFLATER
        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);//Inflaternte akathu inflaternte service eduthu vachu.
        view= inflater.inflate(R.layout.secondlayout, null);//ethu layout anennu specify cheyathathukondu null ennu koduthathu, constructor vazhi anu pass cheyyunne

        TextView tv= (TextView)view.findViewById(R.id.food);
        ImageView im=(ImageView)view.findViewById(R.id.foodimage);
        tv.setText(foodnames[i]);
        im.setImageResource(foodimages[i]);
        return view;

    }
}
