package com.example.recipeapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import com.example.recipeapp.databinding.ActivityCategoryBinding
import com.example.recipeapp.databinding.ActivityHomeBinding

class CategoryActivity : AppCompatActivity() {
    private lateinit var rvAdapter: CategoryAdapter
    private lateinit var dataList: ArrayList<Recipe>
    private lateinit var binding: ActivityCategoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityCategoryBinding.inflate(layoutInflater)
        setContentView(binding.root)


        setupRecyclerView()
        binding.goback.setOnClickListener {
            finish()
        }
        title = intent.getStringExtra(("TITTLE"))

    }

    private fun setupRecyclerView() {
        dataList = ArrayList()
        // Setup layout manager
        binding.rvCatgeory.layoutManager =
            LinearLayoutManager(this)

        // Setup database
        val db = Room.databaseBuilder(this@CategoryActivity, AppDatabase::class.java, "db_name")
            .allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .createFromAsset("recipe.db")
            .build()

        // Get recipes
        val recipes = db.getDao().getAll()

        val daoObject = db.getDao()

        for (i in recipes!!.indices) {
            if (recipes[i]!!.category.contains(intent.getStringExtra("CATEGORY")!!)) {
                dataList.add(recipes[i]!!)
            }


            // Initialize adapter
            rvAdapter = CategoryAdapter(dataList, this)
            binding.rvCatgeory.adapter = rvAdapter
        }
    }
}

