package de.lokaizyk.myappportfolio.logic;

import android.content.Context;

import de.lokaizyk.myappportfolio.R;

/**
 * Created by lars on 10.09.16.
 */
public class ProjectFour extends BaseAppItem {
    public ProjectFour(Context context) {
        super(context, R.string.app_make_your_app_material);
    }

    @Override
    public void onAction(Context context) {
        showAppNameToast(context);
    }
}
