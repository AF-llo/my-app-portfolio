package de.lokaizyk.myappportfolio.logic;

import android.content.Context;

import de.lokaizyk.myappportfolio.R;

/**
 * Created by lars on 10.09.16.
 */
public class ProjectOne extends BaseAppItem {

    public ProjectOne(Context context) {
        super(context, R.string.app_popular_movies);
    }

    @Override
    public void onAction(Context context) {
        showAppNameToast(context);
    }
}
