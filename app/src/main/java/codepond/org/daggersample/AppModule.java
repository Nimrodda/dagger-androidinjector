package codepond.org.daggersample;

import android.app.Application;
import android.content.Context;

import codepond.org.daggersample.feature.FeatureActivitySubComponent;
import dagger.Module;
import dagger.Provides;

@Module(subcomponents = { FeatureActivitySubComponent.class })
public class AppModule {
    private Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides Context provideContext() {
        return application;
    }
}
