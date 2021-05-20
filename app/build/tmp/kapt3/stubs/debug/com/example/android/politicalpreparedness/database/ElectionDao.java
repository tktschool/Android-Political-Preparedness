package com.example.android.politicalpreparedness.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0007H\'\u00a8\u0006\r"}, d2 = {"Lcom/example/android/politicalpreparedness/database/ElectionDao;", "", "deleteAllElections", "", "getAllElections", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/android/politicalpreparedness/network/models/Election;", "getElectionById", "electionId", "", "insertElection", "election", "app_debug"})
public abstract interface ElectionDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertElection(@org.jetbrains.annotations.NotNull()
    com.example.android.politicalpreparedness.network.models.Election election);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from election_table order by electionDay asc")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.android.politicalpreparedness.network.models.Election>> getAllElections();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from election_table where id = :electionId")
    public abstract com.example.android.politicalpreparedness.network.models.Election getElectionById(int electionId);
    
    @androidx.room.Query(value = "delete from election_table")
    public abstract void deleteAllElections();
}