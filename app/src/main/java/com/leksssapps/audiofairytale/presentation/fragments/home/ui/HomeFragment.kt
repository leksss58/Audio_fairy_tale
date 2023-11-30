package com.leksssapps.audiofairytale.presentation.fragments.home.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.leksssapps.audiofairytale.R
import com.leksssapps.audiofairytale.databinding.FragmentHomeBinding
import com.leksssapps.audiofairytale.presentation.fragments.home.adapters.AllHomeRecyclerView
import com.leksssapps.audiofairytale.presentation.fragments.home.adapters.CategoriesRecyclerView
import com.leksssapps.audiofairytale.presentation.fragments.home.adapters.RecommendedRecyclerView
import com.leksssapps.audiofairytale.presentation.models.enums.CategoryType
import com.leksssapps.audiofairytale.presentation.fragments.home.viewmodel.HomeViewModel
import com.leksssapps.audiofairytale.presentation.models.home.AllPresentationModel
import com.leksssapps.audiofairytale.presentation.models.home.CategoriesPresentationModel
import com.leksssapps.audiofairytale.presentation.models.home.RecommendedPresentationModel

class HomeFragment : Fragment(R.layout.fragment_home) {

    private var binding: FragmentHomeBinding? = null
    private val homeViewModel: HomeViewModel by viewModels()
    private val allHomeAdapter: AllHomeRecyclerView by lazy { AllHomeRecyclerView() }
    private val recommendedAdapter: RecommendedRecyclerView by lazy { RecommendedRecyclerView() }
    private val newAdapter: CategoriesRecyclerView by lazy { CategoriesRecyclerView() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view).apply {
            //searchView.editText.isFocusable = false
            val allList: List<AllPresentationModel> = listOf(
                AllPresentationModel(
                    id = 1,
                    name = "Какая то интересная сказка",
                    time = "20:01",
                    imageUrl = "",
                    audioUrl = "",
                    category = CategoryType.NOISE
                ),
                AllPresentationModel(
                    id = 2,
                    name = "Какая то интересная сказка",
                    time = "20:01",
                    imageUrl = "",
                    audioUrl = "",
                    category = CategoryType.ONE_TWO
                ),
                AllPresentationModel(
                    id = 3,
                    name = "Какая то интересная сказка",
                    time = "20:01",
                    imageUrl = "",
                    audioUrl = "",
                    category = CategoryType.UA
                ),
                AllPresentationModel(
                    id = 4,
                    name = "Какая то интересная сказка",
                    time = "5:01",
                    imageUrl = "",
                    audioUrl = "",
                    category = CategoryType.RU
                )
            )

            val recList: List<RecommendedPresentationModel> = listOf(
                RecommendedPresentationModel(
                    id = 1,
                    name = "Черная шапочка",
                    time = "20:01",
                    imageUrl = "",
                    audioUrl = ""
                ),
                RecommendedPresentationModel(
                    id = 2,
                    name = "Просто негр",
                    time = "20:01",
                    imageUrl = "",
                    audioUrl = ""
                ),
                RecommendedPresentationModel(
                    id = 3,
                    name = "Еще один негр",
                    time = "20:01",
                    imageUrl = "",
                    audioUrl = ""
                )
            )

            val newList: List<CategoriesPresentationModel> = listOf(
                CategoriesPresentationModel(
                    id = 1,
                    name = "1-2 года",
                    category = CategoryType.ONE_TWO
                ),
                CategoriesPresentationModel(
                    id = 2,
                    name = "2-4 года",
                    category = CategoryType.TWO_FOUR
                ),
                CategoriesPresentationModel(
                    id = 3,
                    name = "4-6 лет",
                    category = CategoryType.FOUR_SIX
                ),
                CategoriesPresentationModel(
                    id = 4,
                    name = "Русские",
                    category = CategoryType.RU
                ),
                CategoriesPresentationModel(
                    id = 5,
                    name = "Зарубежные",
                    category = CategoryType.UA
                ),
                CategoriesPresentationModel(
                    id = 6,
                    name = "Соетские",
                    category = CategoryType.OLD_RU
                ),
                CategoriesPresentationModel(
                    id = 7,
                    name = "Шумы",
                    category = CategoryType.NOISE
                )

            )


            allRecyclerView.adapter = allHomeAdapter
            allRecyclerView.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)

            recommendedRecyclerView.adapter = recommendedAdapter
            recommendedRecyclerView.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)

            categoryRecyclerView.adapter = newAdapter
            categoryRecyclerView.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)

            allHomeAdapter.setList(allList)
            recommendedAdapter.setList(recList)
            newAdapter.setList(newList)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}