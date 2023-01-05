package com.nkechinnaji.buggypedia.data

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.nkechinnaji.buggypedia.ui.main.view.MainActivity
import com.nkechinnaji.daintydebugger.R
import com.nkechinnaji.daintydebugger.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        val sideAnimation = AnimationUtils.loadAnimation(this, R.anim.slide)
        viewBinding.splashImageView.startAnimation(sideAnimation)
        viewBinding.welcomeMsg.startAnimation(sideAnimation)

        loadSplashScreenGif()

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 3000) //delayed time in milliseconds
    }

    private fun loadSplashScreenGif() {
        Glide.with(this)
            .asGif() //Load as animated GIF
            .load("https://media.giphy.com/media/WPaWdPe5g88IevM2FF/giphy.gif") //Call GIF here
            .into(viewBinding.splashImageView)
    }
}