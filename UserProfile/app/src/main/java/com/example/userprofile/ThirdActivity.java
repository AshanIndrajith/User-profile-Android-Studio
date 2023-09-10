package com.example.userprofile;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        // Initialize TextViews to display user-entered data
        TextView nameTextView = findViewById(R.id.nameTextView);
        TextView indexTextView = findViewById(R.id.indexTextView);
        TextView departmentTextView = findViewById(R.id.departmentTextView);
        TextView facultyTextView = findViewById(R.id.facultyTextView);

        // Retrieve data from the Intent's extras
        Intent intent = getIntent();
        if (intent != null) {
            String name = intent.getStringExtra("name");
            String indexNumber = intent.getStringExtra("indexNumber");
            String department = intent.getStringExtra("department");
            String faculty = intent.getStringExtra("faculty");

            // Set the retrieved data in the TextViews
            nameTextView.setText("Name: " + name);
            indexTextView.setText("Index Number: " + indexNumber);
            departmentTextView.setText("Department: " + department);
            facultyTextView.setText("Faculty: " + faculty);
        }
    }
}
