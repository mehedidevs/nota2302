package com.mehedi.nota2302.demo

import android.app.Activity
import android.app.Application.ActivityLifecycleCallbacks
import android.os.Bundle
import android.util.Log
import javax.annotation.Nullable


class MyActivityLifecycleCallbacks : ActivityLifecycleCallbacks {
    override fun onActivityCreated(activity: Activity, @Nullable savedInstanceState: Bundle?) {
        val activityName = activity.javaClass.simpleName
        Log.d("CurrentActivity", "Activity Created: $activityName")
    }

    override fun onActivityStarted(activity: Activity) {}
    override fun onActivityResumed(activity: Activity) {
        val activityName = activity.javaClass.simpleName
        Log.d("CurrentActivity", "Activity Resumed: $activityName")
    }

    override fun onActivityPaused(activity: Activity) {}
    override fun onActivityStopped(activity: Activity) {}
    override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {}
    override fun onActivityDestroyed(activity: Activity) {}
}