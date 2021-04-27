package edu.cs.birzeit.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    EditText name,email,phone;
   CheckBox c1,c2,c3;
    Button move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.txtFname);
        email=findViewById(R.id.txtemail);
        phone=findViewById(R.id.txtphone);
       c1=findViewById(R.id.birzeituni);
       c2=findViewById(R.id.najahuni);
       c3=findViewById(R.id.qudsuni);
        move=findViewById(R.id.btnNextPage);
        SharedPreferences sharedPref = getSharedPreferences("MyData",MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();

        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity. this,MainActivity2.class);
                String full_name=name.getText().toString();
                String Email=email.getText().toString();
                int ph=Integer.parseInt(phone.getText().toString());
                String uni=null;
                if(c1.isSelected()){
                    uni="birzeit";
                }else if(c2.isSelected()){
                    uni="al najah";
                }else {
                    uni="alquds";
                }
                editor.putString("name",full_name);
                editor.putString("email",Email);
                editor.putInt("phone",ph);
                editor.putString("university",uni);
                editor.commit();


               startActivity(intent);
            }
        });
    }
}