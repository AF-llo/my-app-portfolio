package de.lokaizyk.myappportfolio.ui.activities;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableField;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;

import de.lokaizyk.myappportfolio.R;
import de.lokaizyk.myappportfolio.databinding.ActivityMainBinding;
import de.lokaizyk.myappportfolio.logic.BaseAppItem;
import de.lokaizyk.myappportfolio.logic.ProjectFive;
import de.lokaizyk.myappportfolio.logic.ProjectFour;
import de.lokaizyk.myappportfolio.logic.ProjectOne;
import de.lokaizyk.myappportfolio.logic.ProjectSix;
import de.lokaizyk.myappportfolio.logic.ProjectThree;
import de.lokaizyk.myappportfolio.logic.ProjectTwo;
import de.lokaizyk.myappportfolio.ui.adapter.AppItemAdapter;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ActivityMainBinding mMainBinding;

    public ObservableField<AppItemAdapter> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mMainBinding.setMainActivity(this);
        mAdapter = new ObservableField<>(new AppItemAdapter());

        ArrayList<BaseAppItem> items = new ArrayList<>();
        items.add(new ProjectOne(this));
        items.add(new ProjectTwo(this));
        items.add(new ProjectThree(this));
        items.add(new ProjectFour(this));
        items.add(new ProjectFive(this));
        items.add(new ProjectSix(this));

        ObservableArrayList<BaseAppItem> itemsList = new ObservableArrayList<>();
        itemsList.addAll(items);
        mAdapter.get().setItems(itemsList);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        mAdapter.get().getItem(i).onAction(this);
    }
}
