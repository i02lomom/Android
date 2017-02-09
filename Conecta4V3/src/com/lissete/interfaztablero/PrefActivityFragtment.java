package com.example.mike.conecta4v3;

import android.os.Bundle;
import android.preference.PreferenceFragment;

public class PrefActivityFragtment extends PreferenceFragment{

    public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preferences);
    }
}
