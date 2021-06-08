package com.example.android.politicalpreparedness.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.android.politicalpreparedness.network.models.Election

@Dao
interface ElectionDao {

    //: Add insert query
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertElection(election: Election)

    //: Add select all election query
    @Query("select * from election_table order by electionDay asc")
    fun getAllElections(): LiveData<List<Election>>

    //: Add select single election query
    @Query("select * from election_table where id = :electionId")
    fun getElectionById(electionId: Int): Election

    //: Add delete query
    @Query("delete from election_table")
    fun deleteAllElections()

    @Query("delete from election_table where id = :electionId")
    fun deleteElection(electionId: Int)


}