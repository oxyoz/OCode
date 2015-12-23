package oz.classloadertest;

import android.app.Application;

/**
 * Created by Administrator on 2015/12/7.
 */
public class App extends Application
{

    @Override
    public void onCreate()
    {

        String activityName = "oz.classloadertest.MainActivity";

        try {

            Class atyClass = Class.forName(activityName);

            if(atyClass != null)
            {

                ClassLoader atyClassLoader = atyClass.getClassLoader();

                String classLoaderInfo = atyClassLoader.toString();

                System.out.printf("ActivityClassLoaderInfo---->%s",classLoaderInfo);

                atyClass = atyClassLoader.loadClass(activityName);

                if(atyClass != null)
                {
                    atyClass = null;

                    System.gc();

                }


            }

        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }


        super.onCreate();
    }
}
