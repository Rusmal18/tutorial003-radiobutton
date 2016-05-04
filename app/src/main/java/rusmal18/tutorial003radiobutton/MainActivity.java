package rusmal18.tutorial003radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //variable
    RadioGroup radioGroup;
    RadioButton radioButton;
    RadioButton radioButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //variable value
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioButton = (RadioButton) findViewById(R.id.radioButton);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);

        //action if checked radio button
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                int id = group.indexOfChild(findViewById(checkedId));

                if (id == 0){
                    //set String to get Value from radio button
                    String text = radioButton.getText().toString();

                    //make toast
                    Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
                }

                if (id == 1){
                    //set String to get Value from radio button
                    String text = radioButton2.getText().toString();

                    //make toast
                    Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
