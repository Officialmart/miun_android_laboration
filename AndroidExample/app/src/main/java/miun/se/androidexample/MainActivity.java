package miun.se.androidexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    //Drawables
    //image1 = R.drawable.image1
    //image2 = R.drawable.image2
    //image3 = R.drawable.image3

    //Views
    //ImageView = R.id.imageview
    //Button = R.id.image1button
    //Button = R.id.image2button
    //Button = R.id.image3button

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.image1button);
        b1.setOnClickListener(this);
        Button b2 = (Button) findViewById(R.id.image2button);
        b2.setOnClickListener(this);
        Button b3 = (Button) findViewById(R.id.image3button);
        b3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        ImageView iv = (ImageView) findViewById(R.id.imageview);

        switch (v.getId()) {

            case R.id.image1button:
                iv.setImageResource(R.drawable.image1);
                break;

            case R.id.image2button:
                iv.setImageResource(R.drawable.image2);
                break;

            case R.id.image3button:
                iv.setImageResource(R.drawable.image3);
                break;
        }
    }
}
