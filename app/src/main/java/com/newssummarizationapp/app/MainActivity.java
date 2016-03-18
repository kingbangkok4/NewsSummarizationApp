package com.newssummarizationapp.app;

import android.os.Bundle;
        import org.apache.cordova.DroidGap;

public class MainActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("http://www.newssummarization.com/admin");
        //super.loadUrl("http://www.google.com");
    }
}
