package com.example.userprofile;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private EditText nameEditText, indexEditText, departmentEditText, facultyEditText;
    private Button okButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Initialize UI elements
        nameEditText = findViewById(R.id.name);
        indexEditText = findViewById(R.id.index);
        departmentEditText = findViewById(R.id.department);
        facultyEditText = findViewById(R.id.faculty);
        okButton = findViewById(R.id.btnok);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Retrieve data from EditText fields
                String name = nameEditText.getText().toString();
                String indexNumber = indexEditText.getText().toString();
                String department = departmentEditText.getText().toString();
                String faculty = facultyEditText.getText().toString();

                // Create an Intent to start the third activity
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);

                // Put user-entered data as extras in the Intent
                intent.putExtra("name", name);
                intent.putExtra("indexNumber", indexNumber);
                intent.putExtra("department", department);
                intent.putExtra("faculty", faculty);

                // Start the third activity
                startActivity(intent);
            }
        });
    }
}
