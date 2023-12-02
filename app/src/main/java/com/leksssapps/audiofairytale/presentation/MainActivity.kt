package com.leksssapps.audiofairytale.presentation

import android.os.Bundle
import android.widget.PopupMenu
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.leksssapps.audiofairytale.R
import com.leksssapps.audiofairytale.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val navController by lazy { findNavController(R.id.nav_host_fragment) }
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)
            setupBottomMenu(this)
            navController.navInflater.inflate(R.navigation.nav_graph).apply {
                setStartDestination(R.id.homeFragment)
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    private fun setupBottomMenu(binding: ActivityMainBinding) {
        val popupMenu = PopupMenu(applicationContext, null)
        popupMenu.inflate(R.menu.bottom_navigation_menu)
        binding.bottomBar.setupWithNavController(popupMenu.menu, navController)
    }
}