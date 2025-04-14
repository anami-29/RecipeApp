package com.example.recipeapp;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class Dao_Impl implements Dao {
  private final RoomDatabase __db;

  public Dao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
  }

  @Override
  public List<Recipe> getAll() {
    final String _sql = "SELECT * FROM recipe";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfImg = CursorUtil.getColumnIndexOrThrow(_cursor, "img");
      final int _cursorIndexOfTittle = CursorUtil.getColumnIndexOrThrow(_cursor, "tittle");
      final int _cursorIndexOfDes = CursorUtil.getColumnIndexOrThrow(_cursor, "des");
      final int _cursorIndexOfIng = CursorUtil.getColumnIndexOrThrow(_cursor, "ing");
      final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
      final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
      final List<Recipe> _result = new ArrayList<Recipe>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final Recipe _item;
        final String _tmpImg;
        _tmpImg = _cursor.getString(_cursorIndexOfImg);
        final String _tmpTittle;
        _tmpTittle = _cursor.getString(_cursorIndexOfTittle);
        final String _tmpDes;
        _tmpDes = _cursor.getString(_cursorIndexOfDes);
        final String _tmpIng;
        _tmpIng = _cursor.getString(_cursorIndexOfIng);
        final String _tmpCategory;
        _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
        final int _tmpUid;
        _tmpUid = _cursor.getInt(_cursorIndexOfUid);
        _item = new Recipe(_tmpImg,_tmpTittle,_tmpDes,_tmpIng,_tmpCategory,_tmpUid);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
