package de.lokaizyk.myappportfolio.util;

import android.databinding.BindingAdapter;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

/**
 * Created by lars on 10.09.16.
 */
public class ListViewBinding {

    @BindingAdapter({"bind:adapter", "bind:itemClickListener"})
    public static void setItemClickListener(ListView listView, BaseAdapter adapter, AdapterView.OnItemClickListener onItemClickListener) {
        listView.setOnItemClickListener(onItemClickListener);
        listView.setAdapter(adapter);
    }

}
