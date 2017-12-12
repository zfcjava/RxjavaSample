package com.javahe.rxjava.model;

import android.support.annotation.NonNull;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by zfc on 2017/12/5.
 */

@Data
@Accessors(prefix = "m")
public class AppInfo implements Comparable<Object> {
    long mFirstInstallTime;
    String mName;
    String mIcon;
    long mLastUpdateTime;

    public AppInfo(String name, String icon, long lastUpdateTime, long firstInstallTime) {
        this.mLastUpdateTime = lastUpdateTime;
        this.mName = name;
        this.mIcon = icon;
        mFirstInstallTime = firstInstallTime;
    }


    @Override
    public int compareTo(@NonNull Object o) {
        AppInfo f = (AppInfo) o;
        return getName().compareTo(f.getName());
    }
}
