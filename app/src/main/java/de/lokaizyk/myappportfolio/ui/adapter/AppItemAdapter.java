package de.lokaizyk.myappportfolio.ui.adapter;

import de.lokaizyk.myappportfolio.BR;
import de.lokaizyk.myappportfolio.R;
import de.lokaizyk.myappportfolio.logic.BaseAppItem;

/**
 * Created by lars on 10.09.16.
 */
public class AppItemAdapter extends BaseBindableAdapter<BaseAppItem> {
    public AppItemAdapter() {
        super(R.layout.app_item, BR.appItem);
    }
}
