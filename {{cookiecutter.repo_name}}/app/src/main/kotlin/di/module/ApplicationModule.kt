package {{ cookiecutter.package_name }}.di.module

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import {{ cookiecutter.package_name }}.Application
import {{ cookiecutter.package_name }}.utils.RxBus
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(var app: Application) {


    @Provides
    @Singleton
    fun provideApp(): Application = app

    @Provides
    @Singleton
    fun provideContext(): Context = app.applicationContext

    @Provides
    @Singleton
    fun provideSharedPreferences(): SharedPreferences = PreferenceManager.getDefaultSharedPreferences(app)

    @Provides
    @Singleton
    fun provideBus(): RxBus = RxBus()
}
