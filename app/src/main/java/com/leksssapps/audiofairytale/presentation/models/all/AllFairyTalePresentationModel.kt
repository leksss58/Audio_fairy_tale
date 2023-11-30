package com.leksssapps.audiofairytale.presentation.models.all

import com.leksssapps.audiofairytale.presentation.models.enums.CategoryType

data class AllFairyTalePresentationModel(
    val id: Int?,
    val name: String?,
    val time: String?,
    val imageUrl: String?,
    val audioUrl: String?,
    val description: String?,
    val category: CategoryType
)
