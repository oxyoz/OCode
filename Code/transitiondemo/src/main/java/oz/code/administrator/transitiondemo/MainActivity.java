package oz.code.administrator.transitiondemo;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Region;
import android.graphics.drawable.shapes.PathShape;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Callback;
import com.squareup.picasso.OkHttpDownloader;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Transformation;
import com.squareup.picasso.UrlConnectionDownloader;

import org.joda.time.DateTime;

public class MainActivity extends AppCompatActivity
{

    TextView textView;

    ImageView imageView;

    Scene scene1;

    @TargetApi(Build.VERSION_CODES.KITKAT) @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);

        imageView = (ImageView) findViewById(R.id.imageView);

        ViewGroup root = (ViewGroup) findViewById(R.id.containner);

        scene1 = Scene.getSceneForLayout(root, R.layout.activity_main_1, this);

        DateTime time = new DateTime(2000, 1, 1, 0, 0, 0);

        String ouputTime = time.plusDays(90).toString("E MM/dd/yyyy HH:mm:ss");

        textView.setText(ouputTime);

        Picasso.with(this).load("http://f.hiphotos.baidu.com/zhidao/pic/item/279759ee3d6d55fb4f4071446b224f4a21a4ddca.jpg").transform(new Transformation()
        {
            @Override public Bitmap transform(Bitmap source)
            {

                Bitmap bm = null;

                try
                {
                    bm = Bitmap.createBitmap(source.getWidth(), source.getHeight(), Bitmap.Config.ARGB_8888);

                    Canvas canvas = new Canvas(bm);

                    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

                    canvas.drawCircle(source.getWidth() / 2, source.getHeight() / 2, (source.getHeight() > source.getWidth() ? source.getWidth() : source.getHeight()) / 2, paint);

                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));

                    canvas.drawBitmap(source, 0, 0, paint);

                    canvas = null;
                }
                finally
                {
                    if (!source.isRecycled()) source.recycle();
                }

                return bm;
            }

            @Override public String key()
            {
                return "bm";
            }
        }).into(imageView, new Callback()
        {

            @Override public void onSuccess()
            {

                Toast.makeText(getApplicationContext(), "加载成功！", Toast.LENGTH_SHORT).show();

            }

            @Override public void onError()
            {

                Toast.makeText(getApplicationContext(), "加载失败！", Toast.LENGTH_SHORT).show();

            }

        });

        imageView.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {

                TransitionManager.go(scene1);

                ImageView img = (ImageView) scene1.getSceneRoot().findViewById(R.id.imageView);

                Picasso.with(getApplicationContext()).load("http://f.hiphotos.baidu.com/zhidao/pic/item/279759ee3d6d55fb4f4071446b224f4a21a4ddca.jpg").into(img);

            }
        });
    }
}
