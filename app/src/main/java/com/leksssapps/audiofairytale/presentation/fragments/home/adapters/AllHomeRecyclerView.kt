package com.leksssapps.audiofairytale.presentation.fragments.home.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.RecyclerView
import com.leksssapps.audiofairytale.R
import com.leksssapps.audiofairytale.databinding.ItemHomeAllBinding
import com.leksssapps.audiofairytale.presentation.models.enums.CategoryType
import com.leksssapps.audiofairytale.presentation.models.home.AllPresentationModel

class AllHomeRecyclerView : RecyclerView.Adapter<AllHomeRecyclerView.ViewHolder>() {

    private var listAllHomeFairyTale: List<AllPresentationModel> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        ItemHomeAllBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    )

    override fun getItemCount(): Int = listAllHomeFairyTale.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listAllHomeFairyTale[position])
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(listAllHomeFairyTale: List<AllPresentationModel>) {
        this.listAllHomeFairyTale = listAllHomeFairyTale
        notifyDataSetChanged()
    }

    inner class ViewHolder(private val binding: ItemHomeAllBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(allHomeFairyTale: AllPresentationModel) {
            with(binding) {
                titleTextView.text = allHomeFairyTale.name
                period.periodTextView.text = allHomeFairyTale.time
                category.categoryTextView.text = "Тест ляляля"
                category.root.background = when(allHomeFairyTale.category) {
                    CategoryType.ONE_TWO -> AppCompatResources.getDrawable(root.context, R.drawable.gradient_one_two)
                    CategoryType.TWO_FOUR -> AppCompatResources.getDrawable(root.context, R.drawable.gradient_two_four)
                    CategoryType.FOUR_SIX -> AppCompatResources.getDrawable(root.context, R.drawable.gradient_four_six)
                    CategoryType.RU -> AppCompatResources.getDrawable(root.context, R.drawable.gradient_ru)
                    CategoryType.UA -> AppCompatResources.getDrawable(root.context, R.drawable.gradient_ua)
                    CategoryType.OLD_RU -> AppCompatResources.getDrawable(root.context, R.drawable.gradient_old_ru)
                    CategoryType.NOISE -> AppCompatResources.getDrawable(root.context, R.drawable.gradient_noise)
                }
            }
        }
    }

    private companion object {

    }
}