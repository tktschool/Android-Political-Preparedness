package com.example.android.politicalpreparedness.representative;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\u0018\u0000 32\u00020\u0001:\u00013B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0003J\b\u0010\u001a\u001a\u00020\u0011H\u0002J\b\u0010\u001b\u001a\u00020\u000eH\u0003J\"\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J&\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J+\u0010*\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010.\u001a\u00020/H\u0017\u00a2\u0006\u0002\u00100J\b\u00101\u001a\u00020\u0011H\u0003J\b\u00102\u001a\u00020\u0011H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/example/android/politicalpreparedness/representative/DetailFragment;", "Lcom/example/android/politicalpreparedness/base/BaseFragment;", "()V", "_viewModel", "Lcom/example/android/politicalpreparedness/representative/RepresentativeViewModel;", "get_viewModel", "()Lcom/example/android/politicalpreparedness/representative/RepresentativeViewModel;", "_viewModel$delegate", "Lkotlin/Lazy;", "binding", "Lcom/example/android/politicalpreparedness/databinding/FragmentRepresentativeBinding;", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "runningQOrLater", "", "backgroundLocationPermissionGranted", "checkDeviceLocationSettings", "", "resolve", "checkLocationPermissions", "foregroundLocationPermissionGranted", "geoCodeLocation", "Lcom/example/android/politicalpreparedness/network/models/Address;", "location", "Landroid/location/Location;", "getLocation", "hideKeyboard", "isPermissionGranted", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "requestBackgroundLocationPermission", "requestForegroundLocationPermission", "Companion", "app_debug"})
public final class DetailFragment extends com.example.android.politicalpreparedness.base.BaseFragment {
    private com.example.android.politicalpreparedness.databinding.FragmentRepresentativeBinding binding;
    private final boolean runningQOrLater = false;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy _viewModel$delegate = null;
    public static final int REQUEST_FOREGROUND_ONLY_PERMISSIONS_REQUEST_CODE = 34;
    public static final int REQUEST_BACKGROUND_ONLY_PERMISSIONS_REQUEST_CODE = 35;
    public static final int REQUEST_TURN_DEVICE_LOCATION_ON = 29;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.android.politicalpreparedness.representative.DetailFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.android.politicalpreparedness.representative.RepresentativeViewModel get_viewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final boolean checkLocationPermissions() {
        return false;
    }
    
    @android.annotation.TargetApi(value = 29)
    private final boolean isPermissionGranted() {
        return false;
    }
    
    private final boolean foregroundLocationPermissionGranted() {
        return false;
    }
    
    @android.annotation.TargetApi(value = 29)
    private final boolean backgroundLocationPermissionGranted() {
        return false;
    }
    
    private final void checkDeviceLocationSettings(boolean resolve) {
    }
    
    private final void requestForegroundLocationPermission() {
    }
    
    @android.annotation.TargetApi(value = 29)
    private final void requestBackgroundLocationPermission() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void getLocation() {
    }
    
    private final com.example.android.politicalpreparedness.network.models.Address geoCodeLocation(android.location.Location location) {
        return null;
    }
    
    private final void hideKeyboard() {
    }
    
    public DetailFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/android/politicalpreparedness/representative/DetailFragment$Companion;", "", "()V", "REQUEST_BACKGROUND_ONLY_PERMISSIONS_REQUEST_CODE", "", "REQUEST_FOREGROUND_ONLY_PERMISSIONS_REQUEST_CODE", "REQUEST_TURN_DEVICE_LOCATION_ON", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}