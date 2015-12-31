package oz.code.administrator.numberpickertest;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.NumberPicker;

import java.lang.reflect.Field;

/**
 * Created by Administrator on 2015/12/24.
 */
public class TimerNumberPicker extends NumberPicker
{

    public TimerNumberPicker(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);

        Class<?> numberPickerClass = null;
        try
        {
            numberPickerClass = Class.forName("android.widget.NumberPicker");
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }

        Field selectionDivider = null;
        try
        {
            selectionDivider = numberPickerClass.getDeclaredField("mSelectionDivider");
        }
        catch (NoSuchFieldException e)
        {
            e.printStackTrace();
        }

        try
        {
            selectionDivider.setAccessible(true);

            Drawable drawable = getResources().getDrawable(R.drawable.line_divider_timer);

            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());

            selectionDivider.set(this, drawable);
        }
        catch (IllegalArgumentException e)
        {
            e.printStackTrace();
        }
        catch (Resources.NotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }

    }

    public TimerNumberPicker(Context context, AttributeSet attrs)
    {
        super(context, attrs);

        Class<?> numberPickerClass = null;
        try
        {
            numberPickerClass = Class.forName("android.widget.NumberPicker");
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }

        Field selectionDivider = null;
        try
        {
            selectionDivider = numberPickerClass.getDeclaredField("mSelectionDivider");
        }
        catch (NoSuchFieldException e)
        {
            e.printStackTrace();
        }

        try
        {
            selectionDivider.setAccessible(true);

            Drawable drawable = getResources().getDrawable(R.drawable.line_divider_timer);

            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());

            selectionDivider.set(this, drawable);
        }
        catch (IllegalArgumentException e)
        {
            e.printStackTrace();
        }
        catch (Resources.NotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }

    }

    public TimerNumberPicker(Context context)
    {
        super(context);

        Class<?> numberPickerClass = null;
        try
        {
            numberPickerClass = Class.forName("android.widget.NumberPicker");
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }

        Field selectionDivider = null;
        try
        {
            selectionDivider = numberPickerClass.getDeclaredField("mSelectionDivider");
        }
        catch (NoSuchFieldException e)
        {
            e.printStackTrace();
        }

        try
        {
            selectionDivider.setAccessible(true);

            Drawable drawable = getResources().getDrawable(R.drawable.line_divider_timer);

            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());

            selectionDivider.set(this, drawable);
        }
        catch (IllegalArgumentException e)
        {
            e.printStackTrace();
        }
        catch (Resources.NotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }

    }


}
