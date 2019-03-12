package com.example.coderswag.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.coderswag.Model.Category
import com.example.coderswag.R
import kotlinx.android.synthetic.main.category_list_item.view.*

class CategoryRecycleAdapter(val context : Context, val categories : List<Category>, val itemClick : (Category)-> Unit) : RecyclerView.Adapter<CategoryRecycleAdapter.Holder>(){
    override fun onCreateViewHolder(position: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.category_list_item, position, false)
        return Holder(view,itemClick)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindHolder(context, categories[position])
    }

    inner class Holder(itemView: View, val itemClick: (Category) -> Unit) : RecyclerView.ViewHolder(itemView) {

        val categoryImage = itemView.categoryImage
        val categoryName = itemView.categoryName

        fun bindHolder(context: Context, category: Category){
            val resourcesId = context.resources.getIdentifier(category.image,"drawable", context.packageName)
            categoryImage.setImageResource(resourcesId)
            categoryName.text = category.title
            itemView.setOnClickListener({itemClick(category)})
        }

    }
}