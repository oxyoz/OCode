package oz.code.administrator.numberpickertest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    private TimerNumberPicker numberPicker;

    private TextView textView;

    private static String[] times =
            {
                    "7 : 00", "7 : 30",
                    "8 : 00", "8 : 30",
                    "9 : 00", "9 : 30",
                    "10 : 00", "10 : 30",
                    "11 : 00", "11 : 30",
                    "12 : 00", "12 : 30",
                    "13 : 00", "13 : 30",
                    "14 : 00", "14 : 30",
                    "15 : 00", "15 : 30",
                    "16 : 00", "16 : 30",
                    "17 : 00", "17 : 30",
                    "18 : 00", "18 : 30",
                    "19 : 00", "19 : 30",
                    "20 : 00"
            };


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        numberPicker = (TimerNumberPicker) findViewById(R.id.numberPicker);

        textView = (TextView) findViewById(R.id.textView);

        numberPicker.setMinValue(0);

        numberPicker.setMaxValue(times.length - 1);

        numberPicker.setDisplayedValues(times);

        disableEdit(numberPicker);

        textView.setText(times[0]);

        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener()
        {
            @Override public void onValueChange(NumberPicker picker, int oldVal, int newVal)
            {

                textView.setText(times[newVal]);

            }
        });

    }

    private void disableEdit(NumberPicker numberPicker)
    {
        EditText editText = null;

        for (int i = 0; i < numberPicker.getChildCount(); i++)
        {

            if (numberPicker.getChildAt(i) instanceof EditText)
            {

                editText = (EditText) numberPicker.getChildAt(i);

                break;
            }

        }

        editText.setFocusableInTouchMode(false);

        editText.setFocusable(false);


    }


}
