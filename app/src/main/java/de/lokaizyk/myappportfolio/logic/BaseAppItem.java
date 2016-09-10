package de.lokaizyk.myappportfolio.logic;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by lars on 10.09.16.
 */
public abstract class BaseAppItem {

    private String appName = "";

    public BaseAppItem(Context context, int nameRessourceId) {
        if (context != null && nameRessourceId != 0) {
            appName = context.getString(nameRessourceId);
        }
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public abstract void onAction(Context context);

    protected void showAppNameToast(Context context) {
        if (context != null) {
            Toast.makeText(context, appName, Toast.LENGTH_SHORT).show();
        }
    }

}
