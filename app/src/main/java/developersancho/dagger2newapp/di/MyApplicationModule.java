package developersancho.dagger2newapp.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import developersancho.dagger2newapp.MainActivity;

@Module
public abstract class MyApplicationModule {
    @ContributesAndroidInjector
    abstract MainActivity contributeActivityInjector();
}
