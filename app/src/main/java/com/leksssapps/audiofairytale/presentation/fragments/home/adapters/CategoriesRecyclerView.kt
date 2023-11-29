package com.leksssapps.audiofairytale.presentation.fragments.home.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.leksssapps.audiofairytale.R
import com.leksssapps.audiofairytale.databinding.ItemFourSixBinding
import com.leksssapps.audiofairytale.databinding.ItemNoiseBinding
import com.leksssapps.audiofairytale.databinding.ItemOldRuBinding
import com.leksssapps.audiofairytale.databinding.ItemOneTwoBinding
import com.leksssapps.audiofairytale.databinding.ItemRuBinding
import com.leksssapps.audiofairytale.databinding.ItemTwoFourBinding
import com.leksssapps.audiofairytale.databinding.ItemUaBinding
import com.leksssapps.audiofairytale.presentation.fragments.home.enums.CategoryType
import com.leksssapps.audiofairytale.presentation.models.CategoriesPresentationModel

class CategoriesRecyclerView : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var listCategories: List<CategoriesPresentationModel> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        when (viewType) {
            CategoryType.ONE_TWO.ordinal -> OneTwoViewHolder(
                ItemOneTwoBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )

            CategoryType.TWO_FOUR.ordinal -> TwoFourViewHolder(
                ItemTwoFourBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )

            CategoryType.FOUR_SIX.ordinal -> FourSixViewHolder(
                ItemFourSixBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )

            CategoryType.RU.ordinal -> RuViewHolder(
                ItemRuBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )

            CategoryType.UA.ordinal -> UaViewHolder(
                ItemUaBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )

            CategoryType.OLD_RU.ordinal -> OldRuViewHolder(
                ItemOldRuBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )

            CategoryType.NOISE.ordinal -> NoiseViewHolder(
                ItemNoiseBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )

            else -> throw IllegalArgumentException("Unsupported viewType")
        }

    override fun getItemCount(): Int = listCategories.size

    override fun getItemViewType(position: Int): Int = listCategories[position].category.ordinal


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is OneTwoViewHolder -> holder.bind(listCategories[position])
            is TwoFourViewHolder -> holder.bind(listCategories[position])
            is FourSixViewHolder -> holder.bind(listCategories[position])
            is RuViewHolder -> holder.bind(listCategories[position])
            is UaViewHolder -> holder.bind(listCategories[position])
            is OldRuViewHolder -> holder.bind(listCategories[position])
            is NoiseViewHolder -> holder.bind(listCategories[position])
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(listCategories: List<CategoriesPresentationModel>) {
        this.listCategories = listCategories
        notifyDataSetChanged()
    }

    inner class OneTwoViewHolder(private val binding: ItemOneTwoBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(allHomeFairyTale: CategoriesPresentationModel) {
            with(binding) {
                titleTextView.text = allHomeFairyTale.name
            }
        }
    }

    inner class TwoFourViewHolder(private val binding: ItemTwoFourBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(allHomeFairyTale: CategoriesPresentationModel) {
            with(binding) {
                titleTextView.text = allHomeFairyTale.name
            }
        }
    }

    inner class FourSixViewHolder(private val binding: ItemFourSixBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(allHomeFairyTale: CategoriesPresentationModel) {
            with(binding) {
                titleTextView.text = allHomeFairyTale.name
            }
        }
    }

    inner class RuViewHolder(private val binding: ItemRuBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(allHomeFairyTale: CategoriesPresentationModel) {
            with(binding) {
                titleTextView.text = allHomeFairyTale.name
            }
        }
    }

    inner class UaViewHolder(private val binding: ItemUaBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(allHomeFairyTale: CategoriesPresentationModel) {
            with(binding) {
                titleTextView.text = allHomeFairyTale.name
            }
        }
    }

    inner class OldRuViewHolder(private val binding: ItemOldRuBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(allHomeFairyTale: CategoriesPresentationModel) {
            with(binding) {
                titleTextView.text = allHomeFairyTale.name
            }
        }
    }

    inner class NoiseViewHolder(private val binding: ItemNoiseBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(allHomeFairyTale: CategoriesPresentationModel) {
            with(binding) {
                titleTextView.text = allHomeFairyTale.name
            }
        }
    }
}