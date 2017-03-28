package org.codepond.daggersample.feature;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = { FeatureModule.class })
public interface FeatureActivitySubComponent extends AndroidInjector<FeatureActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<FeatureActivity> {
    }
}
