package oz.classloadertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import dalvik.system.PathClassLoader;

public class MainActivity extends AppCompatActivity
{

    private TextView main_txt_info;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        main_txt_info = (TextView) findViewById(R.id.main_txt_info);

        PathClassLoader selfClassLoader = (PathClassLoader) getClassLoader();
        String activityName = "oz.classloadertest.MainActivity";
        try {
            selfClassLoader.loadClass(activityName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        ClassLoader parentClassLoader = selfClassLoader != null?selfClassLoader.getParent():null;

        main_txt_info.setText("selfClassLoader--->" + selfClassLoader.toString() + "\nparentClassLoader--->" + parentClassLoader.toString());


    }
}
