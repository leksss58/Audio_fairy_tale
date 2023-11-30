package com.leksssapps.audiofairytale.presentation.models.home

import com.leksssapps.audiofairytale.presentation.fragments.home.enums.CategoryType

data class AllPresentationModel(
    val id: Int?,
    val name: String?,
    val time: String?,
    val imageUrl: String?,
    val audioUrl: String?,
    val category: CategoryType
)
