package test.project.a1027_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView act;
    Button btn;
    ImageButton btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        act = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        btn = (Button) findViewById(R.id.button);
        btn2 = (ImageButton) findViewById(R.id.imageButton2);
        String[] data = {"aab","aac","abc","acc","bba","bbb","cca"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                    android.R.layout.simple_spinner_item, data);
        act.setThreshold(2);
        act.setAdapter(adapter);
    }
    public void click1(View v)
    {
        Toast.makeText(MainActivity.this, act.getText().toString(),
                Toast.LENGTH_SHORT).show();
    }
    public void click2(View v)
    {
        Log.d("NBA","SOS");
    }
}
