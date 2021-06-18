package com.example.android.politicalpreparedness.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u0011\u0010!\u001a\u00020\u0018H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J!\u0010#\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u0019\u0010\'\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006("}, d2 = {"Lcom/example/android/politicalpreparedness/repository/ElectionRepository;", "", "database", "Lcom/example/android/politicalpreparedness/database/ElectionDatabase;", "(Lcom/example/android/politicalpreparedness/database/ElectionDatabase;)V", "_representatives", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/android/politicalpreparedness/representative/model/Representative;", "_upcomingElections", "Lcom/example/android/politicalpreparedness/network/models/Election;", "_voterInfo", "Lcom/example/android/politicalpreparedness/network/models/VoterInfoResponse;", "representatives", "Landroidx/lifecycle/LiveData;", "getRepresentatives", "()Landroidx/lifecycle/LiveData;", "savedElections", "getSavedElections", "upcomingElection", "getUpcomingElection", "voterInfo", "getVoterInfo", "followElection", "", "election", "(Lcom/example/android/politicalpreparedness/network/models/Election;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasElection", "", "refreshRepresentatives", "address", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshUpcomingElections", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshVoterInfo", "electionId", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unfollowElection", "app_debug"})
public final class ElectionRepository {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.android.politicalpreparedness.network.models.Election>> _upcomingElections = null;
    private final androidx.lifecycle.MutableLiveData<com.example.android.politicalpreparedness.network.models.VoterInfoResponse> _voterInfo = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.android.politicalpreparedness.representative.model.Representative>> _representatives = null;
    private final com.example.android.politicalpreparedness.database.ElectionDatabase database = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.android.politicalpreparedness.network.models.Election>> getUpcomingElection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.android.politicalpreparedness.network.models.Election>> getSavedElections() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.android.politicalpreparedness.network.models.VoterInfoResponse> getVoterInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.android.politicalpreparedness.representative.model.Representative>> getRepresentatives() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object followElection(@org.jetbrains.annotations.NotNull()
    com.example.android.politicalpreparedness.network.models.Election election, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object unfollowElection(@org.jetbrains.annotations.NotNull()
    com.example.android.politicalpreparedness.network.models.Election election, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object hasElection(@org.jetbrains.annotations.NotNull()
    com.example.android.politicalpreparedness.network.models.Election election, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object refreshUpcomingElections(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object refreshRepresentatives(@org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object refreshVoterInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String address, int electionId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    public ElectionRepository(@org.jetbrains.annotations.NotNull()
    com.example.android.politicalpreparedness.database.ElectionDatabase database) {
        super();
    }
}