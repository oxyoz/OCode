package oz.code.administrator.transitiondemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class OttoActivity extends AppCompatActivity
{

    TextView txt_show;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_otto);

        txt_show = (TextView) findViewById(R.id.txt_show);

    }


    public void onA(View v)
    {




    }


    public void onB(View v)
    {




    }


}
