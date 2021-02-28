package com.zhaks.balym.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhaks.balym.R
import com.zhaks.balym.databinding.ActivityRestorePasswordBinding

class RestorePasswordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRestorePasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRestorePasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}