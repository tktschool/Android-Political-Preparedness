package com.example.android.politicalpreparedness.election;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f\u00a8\u0006\u0013"}, d2 = {"Lcom/example/android/politicalpreparedness/election/ElectionsViewModel;", "Lcom/example/android/politicalpreparedness/base/BaseViewModel;", "repository", "Lcom/example/android/politicalpreparedness/repository/ElectionRepository;", "application", "Landroid/app/Application;", "(Lcom/example/android/politicalpreparedness/repository/ElectionRepository;Landroid/app/Application;)V", "_isNetworkAvailable", "Landroidx/lifecycle/MutableLiveData;", "", "isNetworkAvailable", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "savedElections", "", "Lcom/example/android/politicalpreparedness/network/models/Election;", "getSavedElections", "upcomingElection", "getUpcomingElection", "app_debug"})
public final class ElectionsViewModel extends com.example.android.politicalpreparedness.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.android.politicalpreparedness.network.models.Election>> upcomingElection = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.android.politicalpreparedness.network.models.Election>> savedElections = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isNetworkAvailable = null;
    private final com.example.android.politicalpreparedness.repository.ElectionRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.android.politicalpreparedness.network.models.Election>> getUpcomingElection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.android.politicalpreparedness.network.models.Election>> getSavedElections() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isNetworkAvailable() {
        return null;
    }
    
    public ElectionsViewModel(@org.jetbrains.annotations.NotNull()
    com.example.android.politicalpreparedness.repository.ElectionRepository repository, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}