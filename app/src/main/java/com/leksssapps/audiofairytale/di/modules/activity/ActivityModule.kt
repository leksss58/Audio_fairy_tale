package com.leksssapps.audiofairytale.di.modules.activity

import com.leksssapps.audiofairytale.presentation.MainActivity
import com.leksssapps.audiofairytale.presentation.onboarding.OnBoardingActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity

    @ContributesAndroidInjector
    abstract fun contributeOnBoardingActivity(): OnBoardingActivity

}