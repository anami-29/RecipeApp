

package com.example.recipeapp

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "recipe")
data class Recipe(
    val img: String,
    val tittle: String,
    val des: String,
    val ing: String,
    val category: String,
    @PrimaryKey(autoGenerate = true)
    val uid: Int = 0
)
