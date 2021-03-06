package com.athbk;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.athbk.indicatorview.IndicatorView;
import com.athbk.indicatorview.model.Indicator;
import com.athbk.indicatorview.model.StyleIndicator;

public class IndicatorExampleActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private IndicatorView indicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        indicator = (IndicatorView) findViewById(R.id.indicator);
        ViewPagerAdapter adapter = new ViewPagerAdapter(3);
        viewPager.setAdapter(adapter);
        indicator.setType(StyleIndicator.SHAPE);
        indicator.setHeightShape(16);
        indicator.setWidthShape(50);
        indicator.setViewPager(viewPager);

        ///
    }
}

