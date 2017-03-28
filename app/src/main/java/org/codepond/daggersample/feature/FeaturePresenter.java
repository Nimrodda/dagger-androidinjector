package org.codepond.daggersample.feature;

import javax.inject.Inject;
import javax.inject.Named;

class FeaturePresenter {
    private FeatureView featureView;
    private String someId;

    @Inject
    public FeaturePresenter(FeatureView featureView, @Named("someId") String someId) {
        this.featureView = featureView;
        this.someId = someId;
    }

    public void doNothing() {
        featureView.doNothing();
    }
}
