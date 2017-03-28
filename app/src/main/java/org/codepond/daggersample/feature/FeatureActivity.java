package org.codepond.daggersample.feature;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import org.codepond.daggersample.R;
import dagger.android.AndroidInjection;


public class FeatureActivity extends AppCompatActivity implements FeatureView {
    @Inject FeaturePresenter presenter;

    String someId;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        someId = "bla";
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter.doNothing();
    }

    @Override
    public void doNothing() {

    }
}
