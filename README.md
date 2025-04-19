# RecipeApp

# 🍲 Recipe App

A modern and elegant Android application built with **Kotlin**, using **Room Database**, **Glide**, **RecyclerView**, and **Koral GIF Drawable** for a delightful animated splash screen experience. Users can explore, save, and view delicious recipes with a user-friendly interface.

---

## 🚀 Features

- 🔍 **Search Recipes** (locally stored)
- 🧾 **Detailed Recipe View** with ingredients and instructions
- ❤️ **Save Favorite Recipes** locally
- 📁 **Offline Access** with Room Database
- 🖼️ **Smooth Image Loading** using Glide
- 🎞️ **Animated Splash Screen** using Koral GIF Drawable
- 🧹 **Clean & Modern UI** with RecyclerView

---

## 🛠️ Tech Stack

| Tech / Library         | Purpose                                 |
|------------------------|------------------------------------------|
| **Kotlin**             | Programming language                     |
| **Room Database**      | Local data persistence                   |
| **Glide**              | Image loading and caching                |
| **RecyclerView**       | Displaying lists of recipes              |
| **Koral GIF Drawable** | Animated splash screen using GIF         |

---

## 📸 Screenshots

> 📌 Add screenshots in the `screenshots/` folder and reference them here

| Splash Screen | Home | Recipe Details |
|---------------|------|----------------|
| ![Splash](https://github.com/Mayank-Rai94/RecipeApp/blob/8c0e2a04b81b08d1f875597f6ae96c9a9d786050/Recipe4.jpg) | ![Home](https://github.com/Mayank-Rai94/RecipeApp/blob/8c0e2a04b81b08d1f875597f6ae96c9a9d786050/Recipe3.jpg) | ![Details](https://github.com/Mayank-Rai94/RecipeApp/blob/8c0e2a04b81b08d1f875597f6ae96c9a9d786050/Recipe5.jpg) |

---

## 📦 Dependencies

```kotlin
// Room
implementation "androidx.room:room-runtime:2.6.1"
kapt "androidx.room:room-compiler:2.6.1"

// Glide
implementation 'com.github.bumptech.glide:glide:4.16.0'
kapt 'com.github.bumptech.glide:compiler:4.16.0'

// RecyclerView
implementation 'androidx.recyclerview:recyclerview:1.3.2'

// Koral GIF Drawable
implementation 'pl.droidsonroids.gif:android-gif-drawable:1.2.27'

```
## 📦 Project Structure
com.yourname.recipeapp/
├── data/                 # Room entities, DAO, database
├── ui/                   # Activities, adapters, splash, main UI
├── model/                # Data classes (Recipe, Ingredient)
├── utils/                # Constants, helpers
├── res/
│   └── drawable/         # GIFs, images
└── AndroidManifest.xml


