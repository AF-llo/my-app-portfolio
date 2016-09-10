package de.lokaizyk.myappportfolio.logic;

import android.content.Context;

import de.lokaizyk.myappportfolio.R;

/**
 * Created by lars on 10.09.16.
 */
public class ProjectFive extends BaseAppItem {
    public ProjectFive(Context context) {
        super(context, R.string.app_go_ubiquitous);
    }

    @Override
    public void onAction(Context context) {
        showAppNameToast(context);
    }
}
