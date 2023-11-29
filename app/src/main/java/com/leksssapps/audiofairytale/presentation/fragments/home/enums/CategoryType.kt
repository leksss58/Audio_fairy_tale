package com.leksssapps.audiofairytale.presentation.fragments.home.enums

enum class CategoryType(val value : Int) {
    ONE_TWO(0),
    TWO_FOUR(1),
    FOUR_SIX(2),
    RU(3),
    UA(4),
    OLD_RU(5),
    NOISE(6);

    companion object {
        fun value(findValue: Int): CategoryType = values().first { it.value == findValue }
    }
}