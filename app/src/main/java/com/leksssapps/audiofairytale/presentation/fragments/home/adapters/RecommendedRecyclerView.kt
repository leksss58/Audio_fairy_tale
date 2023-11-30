package com.leksssapps.audiofairytale.presentation.fragments.home.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.leksssapps.audiofairytale.databinding.ItemRecommendedBinding
import com.leksssapps.audiofairytale.presentation.models.home.RecommendedPresentationModel

class RecommendedRecyclerView : RecyclerView.Adapter<RecommendedRecyclerView.ViewHolder>() {

    private var listRecommendedFairyTale: List<RecommendedPresentationModel> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        ItemRecommendedBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    )

    override fun getItemCount(): Int = listRecommendedFairyTale.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listRecommendedFairyTale[position])
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(listAllHomeFairyTale: List<RecommendedPresentationModel>) {
        this.listRecommendedFairyTale = listAllHomeFairyTale
        notifyDataSetChanged()
    }

    inner class ViewHolder(private val binding: ItemRecommendedBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(allHomeFairyTale: RecommendedPresentationModel) {
            with(binding) {
                titleTextView.text = allHomeFairyTale.name
                period.periodTextView.text = allHomeFairyTale.time
            }
        }
    }

    private companion object {

    }
}