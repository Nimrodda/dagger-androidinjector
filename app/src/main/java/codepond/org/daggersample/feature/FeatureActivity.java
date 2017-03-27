package codepond.org.daggersample.feature;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import codepond.org.daggersample.R;
import dagger.android.AndroidInjection;


public class FeatureActivity extends AppCompatActivity implements FeatureView {
    @Inject FeaturePresenter presenter;

    String someId;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        someId = "bla";
        presenter.doNothing();
    }

    @Override
    public void doNothing() {

    }
}
