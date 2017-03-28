package org.codepond.daggersample.feature;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class FeatureModule {
    @Provides @Named("someId") String provideSomeId(FeatureActivity featureActivity) {
        return featureActivity.someId;
    }
}
