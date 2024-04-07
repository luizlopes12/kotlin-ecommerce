package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.database.FirebaseDatabase

class BaseActivity : AppCompatActivity() {
    private lateinit var database: FirebaseDatabase;
    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);

        database = FirebaseDatabase.getInstance();
    }
}