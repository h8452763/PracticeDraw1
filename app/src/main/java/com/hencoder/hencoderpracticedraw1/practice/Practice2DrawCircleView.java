package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.LogUtils;

public class Practice2DrawCircleView extends View {
    private Paint paint1;
    private Paint paint2;
    private Paint paint3;
    private Paint paint4;


    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }


    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    private void initPaint() {
        paint1 =new Paint();
        paint1.setStyle(Paint.Style.FILL);
        paint1.setColor(Color.BLUE);
        paint1.setStrokeWidth(1);
        paint1.setAntiAlias(true);
        paint2=new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(1);
        paint2.setColor(Color.BLACK);
        paint2.setAntiAlias(true);
        paint3=new Paint();
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(Color.BLACK);
        paint3.setStrokeWidth(1);
        paint3.setAntiAlias(true);
        paint4=new Paint();
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeWidth(30);
        paint4.setColor(Color.BLUE);
        paint4.setAntiAlias(true);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height=getMeasuredHeight();
        int width=getMeasuredWidth();
//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        //获取屏幕的高度 然后除2 减去间隙，
        float radius=(height>width)?(width-50)/4:(height-30)/4;

        canvas.drawCircle(height/4+100,width/4-100,radius,paint1);
        LogUtils.e(height/4+"width"+width/4+"radius"+radius);
        canvas.drawCircle(height/2+radius+200,width/4-10,radius,paint2);
        canvas.drawCircle(height/4+100,width/4+2*radius,radius,paint3);
        canvas.drawCircle(height/2+radius+200,width/4+2*radius,radius,paint4);


    }
}
