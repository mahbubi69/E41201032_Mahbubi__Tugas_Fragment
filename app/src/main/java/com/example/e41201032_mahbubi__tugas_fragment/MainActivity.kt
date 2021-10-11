package com.example.e41201032_mahbubi__tugas_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.e41201032_mahbubi__tugas_fragment.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHost = Navigation.findNavController(this, R.id.fragment_controler)
        val navView = binding.btnNavigation

        NavigationUI.setupWithNavController(navView, navHost)
    }

}