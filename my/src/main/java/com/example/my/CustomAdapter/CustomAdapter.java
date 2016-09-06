package com.example.my.CustomAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.my.R;

import java.util.List;

/**
 * Created by Administrator on 2016/9/6.
 */
public class CustomAdapter extends BaseAdapter {
    private final LayoutInflater mInflater;
    private final List<String> date;
    private final int resLayoutId;
    private final Context context;

    public CustomAdapter(List<String> date, int resLayoutId, Context context){
        this.date = date;
        this.resLayoutId = resLayoutId;
        this.context = context;
        //将布局的id渲染成一个view
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return date.size();
    }

    @Override
    public Object getItem(int position) {
        return date.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return  createViewFromResource(mInflater, position, convertView, parent, resLayoutId);
    }

    private View createViewFromResource(LayoutInflater mInflater, int position, View convertView, ViewGroup parent, int resLayoutId) {
        View v;
        if (convertView == null) {
            v = mInflater.inflate(resLayoutId, parent, false);
        } else {
            v = convertView;
        }

        bindView(position, v);

        return v;
    }

    private void bindView(int position, View v) {
       TextView textView = (TextView) v.findViewById(R.id.text);
        textView.setText(date.get(position));
    }
}
