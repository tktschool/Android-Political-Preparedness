package com.example.android.politicalpreparedness.election.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/android/politicalpreparedness/election/adapter/ElectionListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/android/politicalpreparedness/network/models/Election;", "Lcom/example/android/politicalpreparedness/election/adapter/ElectionListAdapter$ElectionViewHolder;", "clickListener", "Lcom/example/android/politicalpreparedness/election/adapter/ElectionListener;", "(Lcom/example/android/politicalpreparedness/election/adapter/ElectionListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ElectionViewHolder", "app_debug"})
public final class ElectionListAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.android.politicalpreparedness.network.models.Election, com.example.android.politicalpreparedness.election.adapter.ElectionListAdapter.ElectionViewHolder> {
    private final com.example.android.politicalpreparedness.election.adapter.ElectionListener clickListener = null;
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.android.politicalpreparedness.election.adapter.ElectionListAdapter.ElectionViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.android.politicalpreparedness.election.adapter.ElectionListAdapter.ElectionViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public ElectionListAdapter(@org.jetbrains.annotations.NotNull()
    com.example.android.politicalpreparedness.election.adapter.ElectionListener clickListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/android/politicalpreparedness/election/adapter/ElectionListAdapter$ElectionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/android/politicalpreparedness/databinding/ListItemElectionBinding;", "(Lcom/example/android/politicalpreparedness/databinding/ListItemElectionBinding;)V", "bind", "", "clickListener", "Lcom/example/android/politicalpreparedness/election/adapter/ElectionListener;", "item", "Lcom/example/android/politicalpreparedness/network/models/Election;", "Companion", "app_debug"})
    public static final class ElectionViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.android.politicalpreparedness.databinding.ListItemElectionBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.example.android.politicalpreparedness.election.adapter.ElectionListAdapter.ElectionViewHolder.Companion Companion = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.android.politicalpreparedness.election.adapter.ElectionListener clickListener, @org.jetbrains.annotations.NotNull()
        com.example.android.politicalpreparedness.network.models.Election item) {
        }
        
        public ElectionViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.android.politicalpreparedness.databinding.ListItemElectionBinding binding) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/android/politicalpreparedness/election/adapter/ElectionListAdapter$ElectionViewHolder$Companion;", "", "()V", "from", "Lcom/example/android/politicalpreparedness/election/adapter/ElectionListAdapter$ElectionViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.android.politicalpreparedness.election.adapter.ElectionListAdapter.ElectionViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}