package com.leksssapps.audiofairytale.presentation.fragments.all

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.leksssapps.audiofairytale.R
import com.leksssapps.audiofairytale.databinding.FragmentAllBinding

class AllFragment : Fragment(R.layout.fragment_all) {

    private var binding: FragmentAllBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentAllBinding.bind(view).apply {

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}