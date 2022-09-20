package com.example.snackbarexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      Snackbar mySnackbar = Snackbar.make(findViewById(R.id.myCoordinatorLayout),
              "Email Archived", Snackbar.LENGTH_SHORT);
      mySnackbar.setAction("Undo", new MyUndoListener());
      mySnackbar.show();
   }
}