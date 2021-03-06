package com.github.anastr.targetviewlib.targets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

import com.github.anastr.targetviewlib.Target;


public class Target1 extends Target {

    public Target1(Context context, Builder builder) {
        super(context, builder);
        init();
    }

    private void init() {
        paint = new Paint();
        rect = new RectF();

        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
    }

    private Paint paint;
    private RectF rect;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setColor(targetColor);
        paint.setStrokeWidth(targetWidth);

        float risk = targetWidth /2f;
        rect.set(getLeft() +risk, getTop() +risk, getRight() -risk, getBottom()-risk);
        canvas.drawArc(rect, 0f, -90f, false, paint);
        canvas.drawArc(rect, 180f, -90f, false, paint);
    }
}
