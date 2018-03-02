package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {
    Paint paint1 ;

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint1=new Paint();
        paint1.setStrokeWidth(1);
        paint1.setStyle(Paint.Style.FILL);
        paint1.setColor(Color.BLACK);

        canvas.drawArc(100,100,600,600,-45,90,true,paint1);
        canvas.drawArc(100,100,600,600,90,90,false,paint1);
        paint1.setStyle(Paint.Style.STROKE);
        canvas.drawArc(100,100,600,600,200,50, true,paint1);
        //        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
    }
}
