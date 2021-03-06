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
import androidx.recyclerview.widget.RecyclerView;
import com.example.android.politicalpreparedness.R;
import com.example.android.politicalpreparedness.election.ElectionsViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentElectionBinding extends ViewDataBinding {
  @NonNull
  public final ImageView connectionErrorImage;

  @NonNull
  public final RecyclerView saveElectionRecyclerView;

  @NonNull
  public final TextView saveElectionsTextview;

  @NonNull
  public final RecyclerView upComingRecyclerView;

  @NonNull
  public final TextView upcomingElectionsTextview;

  @Bindable
  protected ElectionsViewModel mElectionViewModel;

  protected FragmentElectionBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView connectionErrorImage, RecyclerView saveElectionRecyclerView,
      TextView saveElectionsTextview, RecyclerView upComingRecyclerView,
      TextView upcomingElectionsTextview) {
    super(_bindingComponent, _root, _localFieldCount);
    this.connectionErrorImage = connectionErrorImage;
    this.saveElectionRecyclerView = saveElectionRecyclerView;
    this.saveElectionsTextview = saveElectionsTextview;
    this.upComingRecyclerView = upComingRecyclerView;
    this.upcomingElectionsTextview = upcomingElectionsTextview;
  }

  public abstract void setElectionViewModel(@Nullable ElectionsViewModel electionViewModel);

  @Nullable
  public ElectionsViewModel getElectionViewModel() {
    return mElectionViewModel;
  }

  @NonNull
  public static FragmentElectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_election, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentElectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentElectionBinding>inflateInternal(inflater, R.layout.fragment_election, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentElectionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_election, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentElectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentElectionBinding>inflateInternal(inflater, R.layout.fragment_election, null, false, component);
  }

  public static FragmentElectionBinding bind(@NonNull View view) {
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
  public static FragmentElectionBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentElectionBinding)bind(component, view, R.layout.fragment_election);
  }
}
