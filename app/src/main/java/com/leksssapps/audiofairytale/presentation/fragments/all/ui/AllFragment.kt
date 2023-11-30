package com.leksssapps.audiofairytale.presentation.fragments.all.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.leksssapps.audiofairytale.R
import com.leksssapps.audiofairytale.databinding.FragmentAllBinding
import com.leksssapps.audiofairytale.presentation.fragments.all.adapter.AllRecyclerView
import com.leksssapps.audiofairytale.presentation.fragments.home.adapters.AllHomeRecyclerView
import com.leksssapps.audiofairytale.presentation.fragments.home.enums.CategoryType
import com.leksssapps.audiofairytale.presentation.models.all.AllFairyTalePresentationModel
import com.leksssapps.audiofairytale.presentation.models.home.AllPresentationModel

class AllFragment : Fragment(R.layout.fragment_all) {

    private var binding: FragmentAllBinding? = null
    private val allAdapter: AllRecyclerView by lazy { AllRecyclerView() }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentAllBinding.bind(view).apply {
            val allList: List<AllFairyTalePresentationModel> = listOf(
                AllFairyTalePresentationModel(
                    id = 1,
                    name = "Какая то интересная сказка",
                    time = "20:01",
                    imageUrl = "",
                    audioUrl = "",
                    category = CategoryType.NOISE,
                    description = "sadfsafsafsadfsadfsafsadfsafsa"
                ),
                AllFairyTalePresentationModel(
                    id = 2,
                    name = "Какая то интересная сказка",
                    time = "20:01",
                    imageUrl = "",
                    audioUrl = "",
                    category = CategoryType.ONE_TWO,
                    description = "sadfsafsafsadfsadfsafsadfsafsa"
                ),
                AllFairyTalePresentationModel(
                    id = 3,
                    name = "Какая то интересная сказка",
                    time = "20:01",
                    imageUrl = "",
                    audioUrl = "",
                    category = CategoryType.UA,
                    description = "sadfsafsafsadfsadfsafsadfsafsa"
                ),
                AllFairyTalePresentationModel(
                    id = 4,
                    name = "Какая то интересная сказка",
                    time = "5:01",
                    imageUrl = "",
                    audioUrl = "",
                    category = CategoryType.RU,
                    description = "sadfsafsafsadfsadfsafsadfsafsa"
                )
            )

            allRecyclerView.adapter = allAdapter
            allRecyclerView.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
            allAdapter.setList(allList)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}