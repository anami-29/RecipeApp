// Generated by view binder compiler. Do not edit!
package com.example.recipeapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.recipeapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySearchBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imgArrow;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final RecyclerView rvSearch;

  @NonNull
  public final EditText search;

  private ActivitySearchBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView imgArrow,
      @NonNull ConstraintLayout main, @NonNull RecyclerView rvSearch, @NonNull EditText search) {
    this.rootView = rootView;
    this.imgArrow = imgArrow;
    this.main = main;
    this.rvSearch = rvSearch;
    this.search = search;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySearchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_search, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySearchBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.img_arrow;
      ImageView imgArrow = ViewBindings.findChildViewById(rootView, id);
      if (imgArrow == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.rv_search;
      RecyclerView rvSearch = ViewBindings.findChildViewById(rootView, id);
      if (rvSearch == null) {
        break missingId;
      }

      id = R.id.search;
      EditText search = ViewBindings.findChildViewById(rootView, id);
      if (search == null) {
        break missingId;
      }

      return new ActivitySearchBinding((ConstraintLayout) rootView, imgArrow, main, rvSearch,
          search);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
