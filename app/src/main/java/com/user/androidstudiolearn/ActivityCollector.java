package com.user.androidstudiolearn;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ShunZhang on 11/22/15.
 */
public class ActivityCollector {

    public static List<Activity> activities = new ArrayList<Activity>();

    public static void addActivity(Activity activity) {
        activities.add(activity);
    }

    public static void removeActivity(Activity activity) {
        activities.remove(activity);
    }

    public static void finishAll() {
        for (Activity activity : activities) {
            activity.finish();
        }
    }
}
