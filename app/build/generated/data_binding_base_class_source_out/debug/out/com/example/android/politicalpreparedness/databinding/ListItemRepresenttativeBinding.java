// Generated by data binding compiler. Do not edit!
package com.example.android.politicalpreparedness.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.android.politicalpreparedness.R;
import com.example.android.politicalpreparedness.representative.model.Representative;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ListItemRepresenttativeBinding extends ViewDataBinding {
  @NonNull
  public final ImageView facebookIcon;

  @NonNull
  public final TextView partyName;

  @NonNull
  public final TextView representativeName;

  @NonNull
  public final ImageView representativePhoto;

  @NonNull
  public final TextView representativeTitle;

  @NonNull
  public final ImageView twitterIcon;

  @NonNull
  public final ImageView wwwIcon;

  @Bindable
  protected Representative mRepresentative;

  protected ListItemRepresenttativeBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ImageView facebookIcon, TextView partyName, TextView representativeName,
      ImageView representativePhoto, TextView representativeTitle, ImageView twitterIcon,
      ImageView wwwIcon) {
    super(_bindingComponent, _root, _localFieldCount);
    this.facebookIcon = facebookIcon;
    this.partyName = partyName;
    this.representativeName = representativeName;
    this.representativePhoto = representativePhoto;
    this.representativeTitle = representativeTitle;
    this.twitterIcon = twitterIcon;
    this.wwwIcon = wwwIcon;
  }

  public abstract void setRepresentative(@Nullable Representative representative);

  @Nullable
  public Representative getRepresentative() {
    return mRepresentative;
  }

  @NonNull
  public static ListItemRepresenttativeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_representtative, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemRepresenttativeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItemRepresenttativeBinding>inflateInternal(inflater, R.layout.list_item_representtative, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemRepresenttativeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_representtative, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemRepresenttativeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemRepresenttativeBinding>inflateInternal(inflater, R.layout.list_item_representtative, null, false, component);
  }

  public static ListItemRepresenttativeBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ListItemRepresenttativeBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ListItemRepresenttativeBinding)bind(component, view, R.layout.list_item_representtative);
  }
}
