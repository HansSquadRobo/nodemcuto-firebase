package com.example.rohan.squadrobotech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
        private DatabaseReference mDatabase;
        private ToggleButton switch1,switch2,switch3,switch4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switch1=(ToggleButton) findViewById(R.id.switch1);
        switch2=(ToggleButton) findViewById(R.id.switch2);
        switch3=(ToggleButton) findViewById(R.id.switch3);
        switch4=(ToggleButton) findViewById(R.id.switch4);

        mDatabase= FirebaseDatabase.getInstance().getReference();

        switch1.setOnCheckedChangeListener(this);
        switch2.setOnCheckedChangeListener(this);
        switch3.setOnCheckedChangeListener(this);
        switch4.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if(switch1.isChecked())
        {
            mDatabase.child("Light1").setValue("true");
            Toast.makeText(this ,"Light1 On",Toast.LENGTH_SHORT).show();
        }
        else{
            mDatabase.child("Light1").setValue("false");
            Toast.makeText(this ,"Light1 Off",Toast.LENGTH_SHORT).show();
        }

        if(switch2.isChecked())
        {
            mDatabase.child("Light2").setValue("true");
            Toast.makeText(this ,"Light2 On",Toast.LENGTH_SHORT).show();
        }
        else{
            mDatabase.child("Light2").setValue("false");
            Toast.makeText(this ,"Light2 Off",Toast.LENGTH_SHORT).show();
        }
        if(switch3.isChecked())
        {
            mDatabase.child("Light3").setValue("true");
            Toast.makeText(this ,"Light3 On",Toast.LENGTH_SHORT).show();
        }
        else{
            mDatabase.child("Light3").setValue("false");
            Toast.makeText(this ,"Light3 Off",Toast.LENGTH_SHORT).show();
        }
        if(switch4.isChecked())
        {
            mDatabase.child("Light4").setValue("true");
            Toast.makeText(this ,"Light4 On",Toast.LENGTH_SHORT).show();
        }
        else{
            mDatabase.child("Light4").setValue("false");
            Toast.makeText(this ,"Light4 Off",Toast.LENGTH_SHORT).show();
        }
    }
}
