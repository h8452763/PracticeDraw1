package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice3DrawRectView extends View {
    Paint paint1 =new Paint();

    public Practice3DrawRectView(Context context) {
        super(context);
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint1.setStyle(Paint.Style.FILL);
        paint1.setColor(Color.BLACK);
        paint1.setStrokeWidth(1);
        paint1.setAntiAlias(true);
        Rect rect=new Rect(100,100,400,400);
        canvas.drawRect(rect,paint1);
//        练习内容：使用 canvas.drawRect() 方法画矩形
    }
}
