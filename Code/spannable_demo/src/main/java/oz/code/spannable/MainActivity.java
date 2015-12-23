package oz.code.spannable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    private TextView txt_main_show;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        txt_main_show = (TextView)findViewById(R.id.txt_main_show);

        Spannable spn = new SpannableString("Spannable\nText");

        spn.setSpan(new BackgroundColorSpan(0xff00ffff),0, spn.length(),Spanned.SPAN_INCLUSIVE_INCLUSIVE);

        txt_main_show.setText(Html.fromHtml("<p dir='ltr'><font color='#ffffff'>特沃尔球杆</font></p><p dir='rtl'><font color='#ff0000'>65<small><small>元</small></small></font></p>"));


    }
}
