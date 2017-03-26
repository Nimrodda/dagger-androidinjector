package codepond.org.daggersample.feature;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent
public interface FeatureActivitySubComponent extends AndroidInjector<FeatureActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<FeatureActivity> {
    }
}
