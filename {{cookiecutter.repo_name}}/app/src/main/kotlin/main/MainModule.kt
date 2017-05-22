package {{ cookiecutter.package_name }}.main

import {{ cookiecutter.package_name }}.di.scope.ActivityScope
import dagger.Module
import dagger.Provides


@Module
class MainModule(private val view: IMainView) {

    @Provides
    @ActivityScope
    internal fun provideView(): IMainView {
        return view
    }
}