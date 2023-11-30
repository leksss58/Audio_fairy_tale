package com.leksssapps.audiofairytale.presentation.fragments.settings.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.leksssapps.audiofairytale.R
import com.leksssapps.audiofairytale.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment(R.layout.fragment_settings) {
    private var binding: FragmentSettingsBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSettingsBinding.bind(view).apply {
            shareButton.setOnClickListener { shareApp() }
            privatePolicyTextView.setOnClickListener { openPrivatePolicy() }
            aboutTextView.setOnClickListener { openAbout() }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    private fun shareApp() {

    }

    private fun openPrivatePolicy() {

    }

    private fun openAbout() {

    }
}
