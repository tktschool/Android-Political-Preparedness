package com.example.android.politicalpreparedness.representative;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\tR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r\u00a8\u0006\u0015"}, d2 = {"Lcom/example/android/politicalpreparedness/representative/RepresentativeViewModel;", "Lcom/example/android/politicalpreparedness/base/BaseViewModel;", "repository", "Lcom/example/android/politicalpreparedness/repository/ElectionRepository;", "application", "Landroid/app/Application;", "(Lcom/example/android/politicalpreparedness/repository/ElectionRepository;Landroid/app/Application;)V", "_address", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/android/politicalpreparedness/network/models/Address;", "address", "Landroidx/lifecycle/LiveData;", "getAddress", "()Landroidx/lifecycle/LiveData;", "representatives", "", "Lcom/example/android/politicalpreparedness/representative/model/Representative;", "getRepresentatives", "getRepresentativesByAddress", "", "setAddress", "app_debug"})
public final class RepresentativeViewModel extends com.example.android.politicalpreparedness.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.example.android.politicalpreparedness.network.models.Address> _address = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.android.politicalpreparedness.representative.model.Representative>> representatives = null;
    private final com.example.android.politicalpreparedness.repository.ElectionRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.android.politicalpreparedness.network.models.Address> getAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.android.politicalpreparedness.representative.model.Representative>> getRepresentatives() {
        return null;
    }
    
    /**
     * The following code will prove helpful in constructing a representative from the API. This code combines the two nodes of the RepresentativeResponse into a single official :
     *
     *  val (offices, officials) = getRepresentativesDeferred.await()
     *  _representatives.value = offices.flatMap { office -> office.getRepresentatives(officials) }
     *
     *  Note: getRepresentatives in the above code represents the method used to fetch data from the API
     *  Note: _representatives in the above code represents the established mutable live data housing representatives
     */
    public final void getRepresentativesByAddress(@org.jetbrains.annotations.NotNull()
    com.example.android.politicalpreparedness.network.models.Address address) {
    }
    
    public final void setAddress(@org.jetbrains.annotations.NotNull()
    com.example.android.politicalpreparedness.network.models.Address address) {
    }
    
    public RepresentativeViewModel(@org.jetbrains.annotations.NotNull()
    com.example.android.politicalpreparedness.repository.ElectionRepository repository, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}