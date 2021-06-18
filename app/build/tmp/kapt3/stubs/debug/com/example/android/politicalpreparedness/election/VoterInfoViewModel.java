package com.example.android.politicalpreparedness.election;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010*\u001a\u00020-H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J\u0011\u0010/\u001a\u00020-H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J\u0006\u00100\u001a\u00020-J\u0006\u00101\u001a\u00020-J\u0006\u00102\u001a\u00020-R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0019\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0019\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0019\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00148F\u00a2\u0006\u0006\u001a\u0004\b%\u0010\u0016R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00148F\u00a2\u0006\u0006\u001a\u0004\b\'\u0010\u0016R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0016R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00148F\u00a2\u0006\u0006\u001a\u0004\b,\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00063"}, d2 = {"Lcom/example/android/politicalpreparedness/election/VoterInfoViewModel;", "Lcom/example/android/politicalpreparedness/base/BaseViewModel;", "repository", "Lcom/example/android/politicalpreparedness/repository/ElectionRepository;", "followString", "", "unfollowString", "election", "Lcom/example/android/politicalpreparedness/network/models/Election;", "app", "Landroid/app/Application;", "(Lcom/example/android/politicalpreparedness/repository/ElectionRepository;Ljava/lang/String;Ljava/lang/String;Lcom/example/android/politicalpreparedness/network/models/Election;Landroid/app/Application;)V", "_errorOnFetchingNetwork", "Landroidx/lifecycle/MutableLiveData;", "", "_followButtonState", "_showBallotInformation", "_showVotingLocations", "_voterInfoFetched", "correspondenceAddress", "Landroidx/lifecycle/LiveData;", "getCorrespondenceAddress", "()Landroidx/lifecycle/LiveData;", "errorOnFetchingNetwork", "getErrorOnFetchingNetwork", "followButtonState", "getFollowButtonState", "hasBallotInfo", "getHasBallotInfo", "hasCorrespondenceInformation", "Lcom/example/android/politicalpreparedness/network/models/Address;", "getHasCorrespondenceInformation", "hasElectionInfo", "getHasElectionInfo", "hasVotingLocationsInfo", "getHasVotingLocationsInfo", "showBallotInformation", "getShowBallotInformation", "showVotingLocations", "getShowVotingLocations", "voterInfo", "Lcom/example/android/politicalpreparedness/network/models/VoterInfoResponse;", "getVoterInfo", "voterInfoFetched", "getVoterInfoFetched", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initFollowButton", "onBallotInformationClicked", "onFollowButtonClicked", "onVotingLocationsClicked", "app_debug"})
public final class VoterInfoViewModel extends com.example.android.politicalpreparedness.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.android.politicalpreparedness.network.models.VoterInfoResponse> voterInfo = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _voterInfoFetched = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _errorOnFetchingNetwork = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _showVotingLocations = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _showBallotInformation = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _followButtonState = null;
    
    /**
     * Hint: The saved state can be accomplished in multiple ways. It is directly related to how elections are saved/removed from the database.
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> hasElectionInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> hasVotingLocationsInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> hasBallotInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.android.politicalpreparedness.network.models.Address> hasCorrespondenceInformation = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> correspondenceAddress = null;
    private final com.example.android.politicalpreparedness.repository.ElectionRepository repository = null;
    private final java.lang.String followString = null;
    private final java.lang.String unfollowString = null;
    private final com.example.android.politicalpreparedness.network.models.Election election = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.android.politicalpreparedness.network.models.VoterInfoResponse> getVoterInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getVoterInfoFetched() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getErrorOnFetchingNetwork() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShowVotingLocations() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShowBallotInformation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getFollowButtonState() {
        return null;
    }
    
    public final void onVotingLocationsClicked() {
    }
    
    public final void onBallotInformationClicked() {
    }
    
    public final void onFollowButtonClicked() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getHasElectionInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getHasVotingLocationsInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getHasBallotInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.android.politicalpreparedness.network.models.Address> getHasCorrespondenceInformation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getCorrespondenceAddress() {
        return null;
    }
    
    public VoterInfoViewModel(@org.jetbrains.annotations.NotNull()
    com.example.android.politicalpreparedness.repository.ElectionRepository repository, @org.jetbrains.annotations.NotNull()
    java.lang.String followString, @org.jetbrains.annotations.NotNull()
    java.lang.String unfollowString, @org.jetbrains.annotations.NotNull()
    com.example.android.politicalpreparedness.network.models.Election election, @org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super(null);
    }
}