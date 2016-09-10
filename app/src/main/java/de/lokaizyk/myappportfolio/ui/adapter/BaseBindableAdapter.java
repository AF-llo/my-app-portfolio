package de.lokaizyk.myappportfolio.ui.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ViewDataBinding;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by lars on 10.09.16.
 */
public abstract class BaseBindableAdapter<T> extends BaseAdapter {

    private ObservableArrayList<T> mItems = new ObservableArrayList<>();

    private int mLayoutId;

    private int mItemId;

    public BaseBindableAdapter(int layoutId, int itemId) {
        mLayoutId = layoutId;
        mItemId = itemId;
    }

    public void setItems(ObservableArrayList<T> items) {
        if (items != null) {
            mItems = items;
            notifyDataSetInvalidated();
        }
    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public T getItem(int i) {
        return mItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            ViewDataBinding viewBinding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), mLayoutId, viewGroup, false);
            viewBinding.setVariable(mItemId, mItems.get(i));
            view = viewBinding.getRoot();
        }
        return view;
    }
}
