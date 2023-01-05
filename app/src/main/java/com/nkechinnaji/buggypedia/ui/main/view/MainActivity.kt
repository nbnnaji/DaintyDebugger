package com.nkechinnaji.buggypedia.ui.main.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.nkechinnaji.buggypedia.data.api.ApiService
import com.nkechinnaji.buggypedia.data.api.RetrofitBuilders
import com.nkechinnaji.buggypedia.data.model.DataConfig.universityList
import com.nkechinnaji.daintydebugger.databinding.ActivityMainBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)


        val bugApi = RetrofitBuilders.getUniversitysRetrofitInstance().create(ApiService::class.java)

        GlobalScope.launch {

            var response = bugApi.getUniversityData("United States")
            universityList = response.body() ?: arrayListOf()

        }


        setContentView(binding.root)

                Glide.with(applicationContext)
                    .asGif() //Load as animated GIF
                    .load("https://media.giphy.com/media/WPaWdPe5g88IevM2FF/giphy.gif") //Call GIF here
                    .into(binding.homepageImage)

        binding.universitySearchCardview.setOnClickListener{
            showUniversityList()
        }
    }


    private fun showUniversityList(){
        val bottomSheet = UniversityListFragment()
        bottomSheet.show(supportFragmentManager, bottomSheet.tag)
    }



}