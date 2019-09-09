package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity  {

     private  Integer container;
     private Integer number;
     private Button button,button2;

      public void makeToast(String string)
      {
          Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
      }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        final EditText editText=findViewById(R.id.editText);
        final Random random=new Random();
        number=random.nextInt(20);
        Log.i("Image","Clicked");



        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("case1", "going");


                try {
                    container=Integer.parseInt(editText.getText().toString());

                    if (container.equals(number)){
                       makeToast("Number is Equal!");
                    }

                    else if (container<number){
                        makeToast("Number is Greater!");
                    }
                    else {
                        makeToast("Number is Smaller!");
                    }

                }
                catch (Exception e)
                {
                    Toast.makeText(MainActivity.this, "Enter Some Value", Toast.LENGTH_SHORT).show();
                }

            }
        });

         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 number=random.nextInt(20);


             }
         });
    }
}
