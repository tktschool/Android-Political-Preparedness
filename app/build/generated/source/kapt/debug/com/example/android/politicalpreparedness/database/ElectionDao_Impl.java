package com.example.android.politicalpreparedness.database;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.android.politicalpreparedness.network.models.Division;
import com.example.android.politicalpreparedness.network.models.Election;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ElectionDao_Impl implements ElectionDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Election> __insertionAdapterOfElection;

  private final Converters __converters = new Converters();

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllElections;

  private final SharedSQLiteStatement __preparedStmtOfDeleteElection;

  public ElectionDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfElection = new EntityInsertionAdapter<Election>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `election_table` (`id`,`name`,`electionDay`,`division_id`,`division_country`,`division_state`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Election value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        final Long _tmp;
        _tmp = __converters.dateToTimestamp(value.getElectionDay());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, _tmp);
        }
        final Division _tmpDivision = value.getDivision();
        if(_tmpDivision != null) {
          if (_tmpDivision.getId() == null) {
            stmt.bindNull(4);
          } else {
            stmt.bindString(4, _tmpDivision.getId());
          }
          if (_tmpDivision.getCountry() == null) {
            stmt.bindNull(5);
          } else {
            stmt.bindString(5, _tmpDivision.getCountry());
          }
          if (_tmpDivision.getState() == null) {
            stmt.bindNull(6);
          } else {
            stmt.bindString(6, _tmpDivision.getState());
          }
        } else {
          stmt.bindNull(4);
          stmt.bindNull(5);
          stmt.bindNull(6);
        }
      }
    };
    this.__preparedStmtOfDeleteAllElections = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete from election_table";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteElection = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete from election_table where id = ?";
        return _query;
      }
    };
  }

  @Override
  public void insertElection(final Election election) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfElection.insert(election);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAllElections() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllElections.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllElections.release(_stmt);
    }
  }

  @Override
  public void deleteElection(final int electionId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteElection.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, electionId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteElection.release(_stmt);
    }
  }

  @Override
  public LiveData<List<Election>> getAllElections() {
    final String _sql = "select * from election_table order by electionDay asc";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"election_table"}, false, new Callable<List<Election>>() {
      @Override
      public List<Election> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfElectionDay = CursorUtil.getColumnIndexOrThrow(_cursor, "electionDay");
          final int _cursorIndexOfId_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "division_id");
          final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "division_country");
          final int _cursorIndexOfState = CursorUtil.getColumnIndexOrThrow(_cursor, "division_state");
          final List<Election> _result = new ArrayList<Election>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Election _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final Date _tmpElectionDay;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfElectionDay)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfElectionDay);
            }
            _tmpElectionDay = __converters.fromTimestamp(_tmp);
            final Division _tmpDivision;
            if (! (_cursor.isNull(_cursorIndexOfId_1) && _cursor.isNull(_cursorIndexOfCountry) && _cursor.isNull(_cursorIndexOfState))) {
              final String _tmpId_1;
              if (_cursor.isNull(_cursorIndexOfId_1)) {
                _tmpId_1 = null;
              } else {
                _tmpId_1 = _cursor.getString(_cursorIndexOfId_1);
              }
              final String _tmpCountry;
              if (_cursor.isNull(_cursorIndexOfCountry)) {
                _tmpCountry = null;
              } else {
                _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
              }
              final String _tmpState;
              if (_cursor.isNull(_cursorIndexOfState)) {
                _tmpState = null;
              } else {
                _tmpState = _cursor.getString(_cursorIndexOfState);
              }
              _tmpDivision = new Division(_tmpId_1,_tmpCountry,_tmpState);
            }  else  {
              _tmpDivision = null;
            }
            _item = new Election(_tmpId,_tmpName,_tmpElectionDay,_tmpDivision);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Election getElectionById(final int electionId) {
    final String _sql = "select * from election_table where id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, electionId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfElectionDay = CursorUtil.getColumnIndexOrThrow(_cursor, "electionDay");
      final int _cursorIndexOfId_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "division_id");
      final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "division_country");
      final int _cursorIndexOfState = CursorUtil.getColumnIndexOrThrow(_cursor, "division_state");
      final Election _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final Date _tmpElectionDay;
        final Long _tmp;
        if (_cursor.isNull(_cursorIndexOfElectionDay)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getLong(_cursorIndexOfElectionDay);
        }
        _tmpElectionDay = __converters.fromTimestamp(_tmp);
        final Division _tmpDivision;
        if (! (_cursor.isNull(_cursorIndexOfId_1) && _cursor.isNull(_cursorIndexOfCountry) && _cursor.isNull(_cursorIndexOfState))) {
          final String _tmpId_1;
          if (_cursor.isNull(_cursorIndexOfId_1)) {
            _tmpId_1 = null;
          } else {
            _tmpId_1 = _cursor.getString(_cursorIndexOfId_1);
          }
          final String _tmpCountry;
          if (_cursor.isNull(_cursorIndexOfCountry)) {
            _tmpCountry = null;
          } else {
            _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
          }
          final String _tmpState;
          if (_cursor.isNull(_cursorIndexOfState)) {
            _tmpState = null;
          } else {
            _tmpState = _cursor.getString(_cursorIndexOfState);
          }
          _tmpDivision = new Division(_tmpId_1,_tmpCountry,_tmpState);
        }  else  {
          _tmpDivision = null;
        }
        _result = new Election(_tmpId,_tmpName,_tmpElectionDay,_tmpDivision);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
