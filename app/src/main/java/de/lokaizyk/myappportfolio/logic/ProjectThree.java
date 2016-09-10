package de.lokaizyk.myappportfolio.logic;

import android.content.Context;

import de.lokaizyk.myappportfolio.R;

/**
 * Created by lars on 10.09.16.
 */
public class ProjectThree extends BaseAppItem {
    public ProjectThree(Context context) {
        super(context, R.string.app_built_it_bigger);
    }

    @Override
    public void onAction(Context context) {
        showAppNameToast(context);
    }
}
