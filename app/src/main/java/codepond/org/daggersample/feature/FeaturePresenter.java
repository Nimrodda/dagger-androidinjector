package codepond.org.daggersample.feature;

import javax.inject.Inject;

class FeaturePresenter {
    private FeatureView featureView;

    @Inject
    public FeaturePresenter(FeatureView featureView) {
        this.featureView = featureView;
    }

    public void doNothing() {
        featureView.doNothing();
    }
}
