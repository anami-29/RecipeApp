package com.example.recipeapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recipeapp.databinding.PopularRvBinding

class PopularAdapter(
    private val dataList: ArrayList<Recipe>,
    private val context: Context
) : RecyclerView.Adapter<PopularAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: PopularRvBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = PopularRvBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val recipe = dataList[position]

        Glide.with(context)
            .load(recipe.img)
            .into(holder.binding.popularImg)

        holder.binding.popularTxt.text = recipe.tittle

        val ingredients = recipe.ing.split("\n").filter { it.isNotBlank() }
        holder.binding.popularTime.text = ingredients.getOrNull(0) ?: "N/A"

        holder.itemView.setOnClickListener {
            var intent = Intent(context, RecipeActivity::class.java)
            intent.putExtra("img", dataList.get(position).img)
            intent.putExtra("tittle", dataList.get(position).tittle)
            intent.putExtra("des", dataList.get(position).des)
            intent.putExtra("ing", dataList.get(position).ing)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            context.startActivity(intent)
        }
    }
}
