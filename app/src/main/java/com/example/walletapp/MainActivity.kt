package com.example.walletapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navigation = findNavController(R.id.fragment)
        val bottomAppbar = findViewById<BottomNavigationView>(R.id.bottomNavigationView2)
        NavigationUI.setupWithNavController(
            bottomAppbar,
            navigation
        )
        navigation.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.introFragment -> bottomAppbar.visibility = View.GONE
                R.id.homeFragment -> bottomAppbar.visibility = View.VISIBLE
            }
        }
    }
}