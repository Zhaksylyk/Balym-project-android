package com.zhaks.balym.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhaks.balym.R
import com.zhaks.balym.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}