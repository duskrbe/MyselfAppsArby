package edu.arbyfebrian.myselfappsarby

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
//8 Juni 2023
//10120241
//Arby Febrian Saputro
//IF-6
class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        supportActionBar?.hide()

        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            val intent = Intent(this,WalkthroughActivity::class.java)
            startActivity(intent)
            finish()
        },3000)

    }
}