# 🍽️ RecipeApp

**RecipeApp** is a beautiful and functional Android application built using **Kotlin**, designed to help users browse and explore various recipes across categories like Salads, Main Dishes, Drinks, and Desserts. Users can also search for recipes and view detailed instructions for each one.

---

## 📱 Features

- 🏠 **Home Screen**: Displays popular recipes with category shortcuts.
- 🔍 **Search**: Allows users to search for recipes by name.
- 🍲 **Categories**: Browse recipes by category like Salad, Main Dish, Drinks, Desserts.
- ⭐ **Popular Section**: Shows trending or highly-rated recipes.
- 📋 **Recipe Details**: View full recipe details, ingredients, and steps.
- 📦 **Room Database**: Offline-first experience using Room database.
- 📃 **Bottom Sheet Dialog**: Display additional options using a bottom sheet.

---

## 💻 Tech Stack

| Tech         | Description                          |
|--------------|--------------------------------------|
| Kotlin       | Primary language                     |
| Android SDK  | Android development framework        |
| Room         | Local database for recipes           |
| ViewBinding  | Type-safe view access                |
| RecyclerView | For displaying recipe lists          |
| Material UI  | Beautiful modern components          |

---


## Setup
- Clone the repo
- Open in Android Studio
- Sync Gradle
- Run on device/emulator




📁 Project Structure
bash
Copy
Edit
com.example.recipeapp/
├── MainActivity.kt
├── HomeActivity.kt
├── CategoryActivity.kt
├── SearchActivity.kt
├── PopularAdapter.kt
├── Recipe.kt
├── AppDatabase.kt
├── dao/RecipeDao.kt
├── res/
│   ├── layout/
│   ├── drawable/
│   └── values/
├── assets/
│   └── recipe.db
└── AndroidManifest.xml





📝 TODO (Future Features)
❤️ Favorite recipes functionality

☁️ Cloud sync

👤 User login & profile

🧪 Unit testing

🌐 API integration for dynamic data

