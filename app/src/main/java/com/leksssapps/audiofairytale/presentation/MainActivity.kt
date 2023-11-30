package com.leksssapps.audiofairytale.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.leksssapps.audiofairytale.R
import com.leksssapps.audiofairytale.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val navController by lazy { findNavController(R.id.nav_host_fragment) }
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)
            navController.navInflater.inflate(R.navigation.nav_graph).apply {
                setStartDestination(R.id.homeFragment)
            }
            mainBottomNavigationMenu.setupWithNavController(navController)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}