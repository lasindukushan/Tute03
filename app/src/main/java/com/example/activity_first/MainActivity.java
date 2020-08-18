package com.example.activity_first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ednum1 , ednum2 ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            ednum1 = findViewById(R.id.ednum1);
            ednum2 = findViewById(R.id.ednum2);


        }

        public void  OpenSecond(View view){

            Intent intent = new Intent(this,activity_sceond.class);
            intent.putExtra("n1",ednum1.getText().toString());
            intent.putExtra("n2",ednum2.getText().toString());


            startActivity(intent);

            LayoutInflater li = getLayoutInflater();

            View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                    findViewById(R.id.custom_toast_layout));

            Toast toast = new Toast(getApplicationContext());
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setView(layout);
            toast.show();
    }
}
