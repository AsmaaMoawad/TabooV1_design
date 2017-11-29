package com.example.asmaa.asmaa_task2_taboogh.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.asmaa.asmaa_task2_taboogh.R;

public class ContactUsActivity extends AppCompatActivity {

    EditText emailEditText, messageEditText, nameEditText, subjectEditText;
    Button contactusButton;
    String email, name, subject, message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        emailEditText=(EditText)findViewById(R.id.editTextEmail);
        nameEditText=(EditText) findViewById(R.id.editTextName);
        subjectEditText=(EditText)findViewById(R.id.editTextSubject);
        messageEditText=(EditText)findViewById(R.id.editTextMessage);
        contactusButton=(Button)findViewById(R.id.buttonContactUs);


        contactusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate();
            }
        });
    }

    public boolean validate() {
        boolean valid = true;
        if (email.isEmpty()) {
            emailEditText.setError(getString(R.string.invalid_email));
            valid = false;
        } else {
            emailEditText.setError(null);
        }

        if (name.isEmpty() || name.length() < 3) {

            nameEditText.setError(getString(R.string.invalid_name));
            valid = false;
        } else {
            nameEditText.setError(null);
        }
        if (subject.isEmpty() || subject.length() < 3) {

            subjectEditText.setError(getString(R.string.invalid_subjet));
            valid = false;
        } else {
            subjectEditText.setError(null);
        }
        if (message.isEmpty() || message.length() < 50) {

            messageEditText.setError(getString(R.string.invalid_message));
            valid = false;
        } else {
            messageEditText.setError(null);
        }


        if (valid == false) {
            Toast.makeText(this, R.string.correct_errors, Toast.LENGTH_LONG).show();
        }
        return valid;
    }
}
