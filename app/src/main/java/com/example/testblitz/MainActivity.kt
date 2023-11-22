package com.example.testblitz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent

class MainActivity : AppCompatActivity() {

    // In einer Aktivität
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity) // Hier wird das Layout angezeigt
    }
    // Füge einen Klicklistener zum Button hinzu
    // Die Methode, die durch android:onClick aufgerufen wird
}

