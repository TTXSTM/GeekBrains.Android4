package com.example.note.Database;

import static androidx.room.OnConflictStrategy.REPLACE;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.note.Model.Note;

import java.util.List;

@Dao
public interface Main {
    @Insert(onConflict = REPLACE)
    void insert(Note note);

    @Query("SELECT * FROM note ORDER BY id DESC")

    List<Note> getAll();

    @Query("UPDATE note SET titl = :title, note = :note WHERE ID = :id")
    void update(int id, String title, String note);

    @Delete
    void delete(Note note);
}
