package post.com.boxes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        float length = getIntent().getFloatExtra("Length",0);
        float width = getIntent().getFloatExtra("Width",0);
        float height = getIntent().getFloatExtra("Height",0);
        TextView resultbox = findViewById(R.id.resultbox);
        TextView dm = findViewById(R.id.dm);
        TextView price = findViewById(R.id.price);
        if (length <= 23 && width <= 14 && height <= 13 || length <= 23 && width <= 13 && height <= 14 || length <= 14 && width <= 23 && height <= 13
                ||length <= 14 && width <= 13 && height <= 23 || length <= 13 && width <= 14 && height <= 23 ){
            resultbox.setText("Box3");
            dm.setText("Dimention : 23/14/13cm");
            price.setText("65");
        }

        if (length >= 39.5 && width >= 27.5 && height >= 23 || length >= 27.5 && width >= 39.5 && height >= 23|| length >= 27.5 && width >= 23 && height >= 39.5
                ||length >=23 && width >= 27.5 && height >= 39.5 || length >= 23 && width >= 39.5 && height >= 27.5 ){
            resultbox.setText("Box5");
            dm.setText("Dimention : 39.5/27.5/23cm");
            price.setText("90");
        }


    }
}
