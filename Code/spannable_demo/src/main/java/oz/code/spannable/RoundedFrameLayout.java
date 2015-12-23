package oz.code.spannable;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.shapes.PathShape;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/**
 * Created by Administrator on 2015/11/6.
 */
public class RoundedFrameLayout extends FrameLayout
{

    private int roundRadius = 8;

    public RoundedFrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public RoundedFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RoundedFrameLayout(Context context) {
        super(context);
    }


    public int getRoundRadius() {
        return roundRadius;
    }

    public void setRoundRadius(int roundRadius) {
        this.roundRadius = roundRadius;
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        Path path = new Path();

        RectF rectF = new RectF(0, 0, getWidth(), getHeight());

        path.addRoundRect(rectF,roundRadius,roundRadius, Path.Direction.CCW);

        canvas.clipPath(path);

        super.onDraw(canvas);
    }
}
