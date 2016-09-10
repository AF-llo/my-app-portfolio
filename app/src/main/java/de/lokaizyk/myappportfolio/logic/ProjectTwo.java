package de.lokaizyk.myappportfolio.logic;

import android.content.Context;

import de.lokaizyk.myappportfolio.R;

/**
 * Created by lars on 10.09.16.
 */
public class ProjectTwo extends BaseAppItem {
    public ProjectTwo(Context context) {
        super(context, R.string.app_stock_hawk);
    }

    @Override
    public void onAction(Context context) {
        showAppNameToast(context);
    }
}
