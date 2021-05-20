package com.example.android.politicalpreparedness.network;

import java.lang.System;

/**
 * Documentation for the Google Civics API Service can be found at https://developers.google.com/civic-information/docs/v2
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ%\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/android/politicalpreparedness/network/CivicsApiService;", "", "getElections", "Lcom/example/android/politicalpreparedness/network/models/ElectionResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRepresentatives", "Lcom/example/android/politicalpreparedness/network/models/RepresentativeResponse;", "address", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVoterInfo", "Lcom/example/android/politicalpreparedness/network/models/VoterInfoResponse;", "electionId", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface CivicsApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "elections")
    public abstract java.lang.Object getElections(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.android.politicalpreparedness.network.models.ElectionResponse> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "voterinfo")
    public abstract java.lang.Object getVoterInfo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "address")
    java.lang.String address, @retrofit2.http.Query(value = "electionId")
    int electionId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.android.politicalpreparedness.network.models.VoterInfoResponse> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "representatives")
    public abstract java.lang.Object getRepresentatives(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "address")
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.android.politicalpreparedness.network.models.RepresentativeResponse> p1);
}