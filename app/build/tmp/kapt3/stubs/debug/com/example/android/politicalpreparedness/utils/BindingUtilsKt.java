package com.example.android.politicalpreparedness.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0016\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0007\u001a\n\u0010\r\u001a\u00020\t*\u00020\u000e\u00a8\u0006\u000f"}, d2 = {"setVisibility", "", "view", "Landroid/view/View;", "isVisible", "", "bindVisible", "Landroid/widget/TextView;", "status", "", "setElectionDate", "item", "Lcom/example/android/politicalpreparedness/network/models/Election;", "toFormatDateString", "Ljava/util/Date;", "app_debug"})
public final class BindingUtilsKt {
    
    @androidx.databinding.BindingAdapter(value = {"electionDateText"})
    public static final void setElectionDate(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setElectionDate, @org.jetbrains.annotations.NotNull()
    com.example.android.politicalpreparedness.network.models.Election item) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String toFormatDateString(@org.jetbrains.annotations.NotNull()
    java.util.Date $this$toFormatDateString) {
        return null;
    }
    
    @androidx.databinding.BindingAdapter(value = {"setVisibilityBinding"})
    public static final void setVisibility(@org.jetbrains.annotations.NotNull()
    android.view.View view, boolean isVisible) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"viewVisibility"})
    public static final void bindVisible(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$bindVisible, @org.jetbrains.annotations.Nullable()
    java.lang.String status) {
    }
}