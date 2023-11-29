package com.leksssapps.audiofairytale.presentation.models

import com.leksssapps.audiofairytale.presentation.fragments.home.enums.CategoryType

data class CategoriesPresentationModel(
    val id: Int,
    val name: String,
    val category: CategoryType
)
