// Generated by data binding compiler. Do not edit!
package com.example.android.politicalpreparedness.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.android.politicalpreparedness.R;
import com.example.android.politicalpreparedness.election.adapter.ElectionListener;
import com.example.android.politicalpreparedness.network.models.Election;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ListItemElectionBinding extends ViewDataBinding {
  @NonNull
  public final TextView electionDate;

  @NonNull
  public final TextView electionName;

  @Bindable
  protected Election mElection;

  @Bindable
  protected ElectionListener mClickListener;

  protected ListItemElectionBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView electionDate, TextView electionName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.electionDate = electionDate;
    this.electionName = electionName;
  }

  public abstract void setElection(@Nullable Election election);

  @Nullable
  public Election getElection() {
    return mElection;
  }

  public abstract void setClickListener(@Nullable ElectionListener clickListener);

  @Nullable
  public ElectionListener getClickListener() {
    return mClickListener;
  }

  @NonNull
  public static ListItemElectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_election, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemElectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItemElectionBinding>inflateInternal(inflater, R.layout.list_item_election, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemElectionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_election, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemElectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemElectionBinding>inflateInternal(inflater, R.layout.list_item_election, null, false, component);
  }

  public static ListItemElectionBinding bind(@NonNull View view) {
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
  public static ListItemElectionBinding bind(@NonNull View view, @Nullable Object component) {
    return (ListItemElectionBinding)bind(component, view, R.layout.list_item_election);
  }
}