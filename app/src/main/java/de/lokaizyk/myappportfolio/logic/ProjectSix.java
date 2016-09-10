package de.lokaizyk.myappportfolio.logic;

import android.content.Context;

import de.lokaizyk.myappportfolio.R;

/**
 * Created by lars on 10.09.16.
 */
public class ProjectSix extends BaseAppItem {
    public ProjectSix(Context context) {
        super(context, R.string.app_capstone);
    }

    @Override
    public void onAction(Context context) {
        showAppNameToast(context);
    }
}
