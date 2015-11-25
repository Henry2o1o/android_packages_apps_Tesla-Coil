package com.tesla.teslacoil.fragments;

import android.os.Bundle;
import android.preference.Preference;

import com.android.settings.SettingsPreferenceFragment;
import com.android.settings.R;

import com.android.internal.logging.MetricsLogger;

public class BreathingNotifications extends SettingsPreferenceFragment {

    @Override
    protected int getMetricsCategory() {
       return MetricsLogger.TESLACOIL;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.breathing_notifications);
    }
}
