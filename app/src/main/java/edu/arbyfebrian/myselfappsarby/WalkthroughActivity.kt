package edu.arbyfebrian.myselfappsarby

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
//9 Juni 2023
//10120241
//Arby Febrian Saputro
//IF-6
class WalkthroughActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_walkthrough)

        supportActionBar?.hide()

        val viewPager: ViewPager = findViewById(R.id.viewpager)
        val adapter = ViewPagerAdapter(supportFragmentManager)
        viewPager.adapter = adapter


    }
}