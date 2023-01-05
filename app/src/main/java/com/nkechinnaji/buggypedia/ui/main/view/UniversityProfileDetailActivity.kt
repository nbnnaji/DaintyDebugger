package com.nkechinnaji.buggypedia.ui.main.view

import android.os.Bundle
import android.view.KeyEvent
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.nkechinnaji.buggypedia.data.model.DataConfig
import com.nkechinnaji.daintydebugger.databinding.ActivityUniversityProfileDetailBinding


class UniversityProfileDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUniversityProfileDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUniversityProfileDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var webSettings = binding.webview.settings
        webSettings.javaScriptEnabled = true

        binding.webview.webViewClient = WebViewClient()
        binding.webview.loadUrl(DataConfig.selectedSchoolWebsite ?: "")
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK && binding.webview.canGoBack()) {
            binding.webview.goBack()
            return true
        }
        return super.onKeyDown(keyCode, event)
    }


}