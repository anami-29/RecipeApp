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

## 📸 Screenshots

### 🏠 Home Screen
![Home](\screenshots/Home.png)

### 🍽️ Splash Screen
![Category](screenshots/Splash.png)

### 🔍 Search Screen
![Search](screenshots/Search.png)

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

