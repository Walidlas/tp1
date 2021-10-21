    package wal.example.hi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sayHi = findViewById(R.id.buttonSayHi);
        final TextView textViewDisplay = findViewById(R.id.textViewDisplay);
        final EditText editTextTextName = findViewById(R.id.editTextTextName);
        
        sayHi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextTextName.getText().toString();
                if(name.isEmpty())
                    textViewDisplay.setText("please type your name");
                else
                textViewDisplay.setText("Hello " + name);
                editTextTextName.setText("");
            }
        })  ;
    }

}