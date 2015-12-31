package oz.code.administrator.transitiondemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);
    }


    //Picasso framework
    public void onPicasso(View v)
    {

        startActivity(new Intent(this, MainActivity.class));

    }

    //Otto framework
    public void onOtto(View v)
    {

        startActivity(new Intent(this, OttoActivity.class));

    }


}
