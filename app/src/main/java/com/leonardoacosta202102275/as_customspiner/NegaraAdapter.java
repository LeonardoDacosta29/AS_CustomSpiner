package com.leonardoacosta202102275.as_customspiner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class NegaraAdapter extends BaseAdapter {
    private Context context;
    private List<String> negaraList;

    public NegaraAdapter(Context _context, List<String> _negaraList) {
        this.context = _context;
        this.negaraList = _negaraList;
    }

    @Override
    public int getCount() {
        //return (negaraList != null) ? negaraList.size() : 0;

        if (negaraList != null) {
            return negaraList.size();
        }
        else {
            return 0;
        }
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
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.spinner_a, null);

        TextView textView1 = (TextView) view.findViewById(R.id.textView1);
        String negara = negaraList.get(i);
        textView1.setText(negara);

        ImageView imageView1 = (ImageView) view.findViewById(R.id.imageView1);
        
        return null;
    }

    @Override
    public

}
