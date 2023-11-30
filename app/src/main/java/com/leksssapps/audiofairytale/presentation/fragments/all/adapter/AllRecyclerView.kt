package com.leksssapps.audiofairytale.presentation.fragments.all.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.leksssapps.audiofairytale.R
import com.leksssapps.audiofairytale.databinding.ItemAllBinding
import com.leksssapps.audiofairytale.presentation.fragments.home.enums.CategoryType
import com.leksssapps.audiofairytale.presentation.models.all.AllFairyTalePresentationModel

@SuppressLint("NotifyDataSetChanged")
class AllRecyclerView : RecyclerView.Adapter<AllRecyclerView.ViewHolder>() {

    private var allFairyTaleList = listOf<AllFairyTalePresentationModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        ItemAllBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    )

    override fun getItemCount(): Int = allFairyTaleList.size

    override fun onBindViewHolder(holder: AllRecyclerView.ViewHolder, position: Int) {
        holder.bind(allFairyTaleList[position])
    }

    fun setList(allFairyTaleList: List<AllFairyTalePresentationModel>) {
        this.allFairyTaleList = allFairyTaleList
        notifyDataSetChanged()
    }

    inner class ViewHolder(private val binding: ItemAllBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(allFairyTale: AllFairyTalePresentationModel) {
            with(binding) {
                var isOpenedDescription = false

                titleTextView.text = allFairyTale.name
                period.periodTextView.text = allFairyTale.time
                category.categoryTextView.text = "Тест ляляля"
                descriptionTextView.text = allFairyTale.description
                category.root.background = when (allFairyTale.category) {
                    CategoryType.ONE_TWO -> AppCompatResources.getDrawable(root.context, R.drawable.gradient_one_two)
                    CategoryType.TWO_FOUR -> AppCompatResources.getDrawable(root.context, R.drawable.gradient_two_four)
                    CategoryType.FOUR_SIX -> AppCompatResources.getDrawable(root.context, R.drawable.gradient_four_six)
                    CategoryType.RU -> AppCompatResources.getDrawable(root.context, R.drawable.gradient_ru)
                    CategoryType.UA -> AppCompatResources.getDrawable(root.context, R.drawable.gradient_ua)
                    CategoryType.OLD_RU -> AppCompatResources.getDrawable(root.context, R.drawable.gradient_old_ru)
                    CategoryType.NOISE -> AppCompatResources.getDrawable(root.context, R.drawable.gradient_noise)
                }
                rightArrowImageView.setImageDrawable(AppCompatResources.getDrawable(root.context, R.drawable.ic_right_arrow))

                rightArrowImageView.setOnClickListener {
                    if (!isOpenedDescription) {
                        descriptionTextView.isVisible = true
                        isOpenedDescription = true
                        rightArrowImageView.setImageDrawable(
                            AppCompatResources.getDrawable(
                                root.context,
                                R.drawable.ic_right_arrow_down
                            )
                        )
                    } else {
                        descriptionTextView.isVisible = false
                        isOpenedDescription = false
                        rightArrowImageView.setImageDrawable(
                            AppCompatResources.getDrawable(
                                root.context,
                                R.drawable.ic_right_arrow
                            )
                        )
                    }
                }
            }
        }
    }
}