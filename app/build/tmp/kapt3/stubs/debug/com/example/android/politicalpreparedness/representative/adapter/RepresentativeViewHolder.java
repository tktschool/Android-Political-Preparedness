package com.example.android.politicalpreparedness.representative.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0016\u0010\u0016\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u0016\u0010\u0017\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u001a"}, d2 = {"Lcom/example/android/politicalpreparedness/representative/adapter/RepresentativeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/android/politicalpreparedness/databinding/ListItemRepresenttativeBinding;", "(Lcom/example/android/politicalpreparedness/databinding/ListItemRepresenttativeBinding;)V", "getBinding", "()Lcom/example/android/politicalpreparedness/databinding/ListItemRepresenttativeBinding;", "bind", "", "item", "Lcom/example/android/politicalpreparedness/representative/model/Representative;", "enableLink", "view", "Landroid/widget/ImageView;", "url", "", "getFacebookUrl", "channels", "", "Lcom/example/android/politicalpreparedness/network/models/Channel;", "getTwitterUrl", "setIntent", "showSocialLinks", "showWWWLinks", "urls", "Companion", "app_debug"})
public final class RepresentativeViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    @org.jetbrains.annotations.NotNull()
    private final com.example.android.politicalpreparedness.databinding.ListItemRepresenttativeBinding binding = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.android.politicalpreparedness.representative.adapter.RepresentativeViewHolder.Companion Companion = null;
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    com.example.android.politicalpreparedness.representative.model.Representative item) {
    }
    
    private final void showSocialLinks(java.util.List<com.example.android.politicalpreparedness.network.models.Channel> channels) {
    }
    
    private final void showWWWLinks(java.util.List<java.lang.String> urls) {
    }
    
    private final java.lang.String getFacebookUrl(java.util.List<com.example.android.politicalpreparedness.network.models.Channel> channels) {
        return null;
    }
    
    private final java.lang.String getTwitterUrl(java.util.List<com.example.android.politicalpreparedness.network.models.Channel> channels) {
        return null;
    }
    
    private final void enableLink(android.widget.ImageView view, java.lang.String url) {
    }
    
    private final void setIntent(java.lang.String url) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.politicalpreparedness.databinding.ListItemRepresenttativeBinding getBinding() {
        return null;
    }
    
    public RepresentativeViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.android.politicalpreparedness.databinding.ListItemRepresenttativeBinding binding) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/android/politicalpreparedness/representative/adapter/RepresentativeViewHolder$Companion;", "", "()V", "from", "Lcom/example/android/politicalpreparedness/representative/adapter/RepresentativeViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.android.politicalpreparedness.representative.adapter.RepresentativeViewHolder from(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}