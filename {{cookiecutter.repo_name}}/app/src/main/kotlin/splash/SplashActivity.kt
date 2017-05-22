package {{ cookiecutter.package_name }}.splash

import {{ cookiecutter.package_name }}.main.MainActivity
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.os.Bundle
import {{ cookiecutter.package_name }}.base.BaseActivity


class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}