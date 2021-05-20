package com.example.android.politicalpreparedness.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/android/politicalpreparedness/repository/ElectionRepository;", "", "database", "Lcom/example/android/politicalpreparedness/database/ElectionDatabase;", "(Lcom/example/android/politicalpreparedness/database/ElectionDatabase;)V", "_upcomingElections", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/android/politicalpreparedness/network/models/Election;", "upcomingElection", "Landroidx/lifecycle/LiveData;", "getUpcomingElection", "()Landroidx/lifecycle/LiveData;", "refreshUpcomingElections", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ElectionRepository {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.android.politicalpreparedness.network.models.Election>> _upcomingElections = null;
    private final com.example.android.politicalpreparedness.database.ElectionDatabase database = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.android.politicalpreparedness.network.models.Election>> getUpcomingElection() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object refreshUpcomingElections(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    public ElectionRepository(@org.jetbrains.annotations.NotNull()
    com.example.android.politicalpreparedness.database.ElectionDatabase database) {
        super();
    }
}