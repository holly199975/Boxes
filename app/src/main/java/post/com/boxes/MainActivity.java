package post.com.boxes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void check(View view){
        EditText edLength = findViewById(R.id.ed_length);
        EditText edWidth = findViewById(R.id.ed_width);
        EditText edHeight = findViewById(R.id.ed_height);
        String l = edLength.getText().toString();
        String w = edWidth.getText().toString();
        String h = edHeight.getText().toString();
        float length = Float.parseFloat(l);
        float width = Float.parseFloat(w);
        float height = Float.parseFloat(h);

        Intent intent = new Intent(this,ResultActivity.class);
        startActivity(intent);
    }
}
