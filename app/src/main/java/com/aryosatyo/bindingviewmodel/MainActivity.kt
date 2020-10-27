package com.aryosatyo.bindingviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.aryosatyo.bindingviewmodel.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.score = viewModel.score
        buttonTeamA.setOnClickListener { viewModel.updateTeamA() }
        buttonTeamB.setOnClickListener { viewModel.updateTeamB() }
        buttonReset.setOnClickListener { viewModel.reset() }
    }

    private val viewModel: ScoreViewModel by lazy {
        val factory = ScoreViewModel.Factory(10, 11)
        ViewModelProviders.of(this, factory).get(ScoreViewModel::class.java)
    }
}