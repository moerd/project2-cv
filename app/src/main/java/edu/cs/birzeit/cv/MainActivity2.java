package edu.cs.birzeit.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    CheckBox cb1,cb2;
    EditText edu;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        cb1=findViewById(R.id.cb1);
        cb2=findViewById(R.id.cb2);
        edu=findViewById(R.id.txtedu);
        btn1=findViewById(R.id.saveInfo);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String exp=null;
                SharedPreferences sharedPreferences = getSharedPreferences("MyData", MODE_PRIVATE);
                String fname = sharedPreferences.getString("name","");
                String Email = sharedPreferences.getString("email","");
                int ph_no = sharedPreferences.getInt("phone",0);
                String uni = sharedPreferences.getString("university","");
                if(cb1.isSelected()){
                    exp=cb1.getText().toString();
                }else {
                    exp=cb2.getText().toString();
                }
                String educ=edu.getText().toString();
                Person_Info pi=new Person_Info(fname,Email,uni,ph_no,exp,educ);
                pi.toString();

               // String password =  sharedPreferences.getString("password",DEFAULT);
            }
        });
    }
}