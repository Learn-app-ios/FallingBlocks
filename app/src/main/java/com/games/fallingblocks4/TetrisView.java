package com.games.fallingblocks4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;


public class TetrisView extends View{
    private static int tileSize = 60;  // size of individual tiles on gameboard

    private static int WIDTH;  // screen width
    private static int HEIGHT;  // screen height

    public static long Score = 0;  // game score initialized to 0

    public TetrisView(Context context, AttributeSet attributeSet){
        super(context, attributeSet);

    }
}
