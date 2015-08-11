package com.chiemy.widget.blurview;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        final BlurringView blurringView = (BlurringView) findViewById(R.id.blurringView);
        blurringView.setOverlayColor(Color.TRANSPARENT);
        View blurredView = findViewById(R.id.blurredView);
        blurringView.setBlurredView(blurredView);
        findViewById(R.id.btn_blur).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(blurringView.isShown()){
                    blurringView.setVisibility(View.GONE);
                }else{
                    blurringView.setVisibility(View.VISIBLE);
                }
            }
        });
    }

}
