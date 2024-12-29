package com.miot.service.qrcode;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.google.zxing.C2564h;
import com.miot.common.utils.DisplayUtils;
import com.miot.service.C2875R;
import com.miot.service.qrcode.camera.CameraManager;
import java.util.ArrayList;
import java.util.List;

public final class ViewfinderView extends View {
    private static final long ANIMATION_DELAY = 80;
    private static final int CURRENT_POINT_OPACITY = 160;
    private static final int MAX_RESULT_POINTS = 20;
    private static final int POINT_SIZE = 6;
    private static final int[] SCANNER_ALPHA = {0, 64, 128, 192, 255, 192, 128, 64};
    private CameraManager cameraManager;
    private final int laserColor;
    private List<C2564h> lastPossibleResultPoints;
    private final Paint mTextPaint;
    private final int maskColor;
    private final Paint paint = new Paint(1);
    private List<C2564h> possibleResultPoints;
    private Bitmap resultBitmap;
    private final int resultColor;
    private final int resultPointColor;
    private int scannerAlpha;

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint2 = new Paint(1);
        this.mTextPaint = paint2;
        Resources resources = getResources();
        this.maskColor = Color.parseColor("#cc000000");
        this.resultColor = resources.getColor(C2875R.color.result_view);
        this.laserColor = Color.parseColor("#FF0099FF");
        this.resultPointColor = resources.getColor(C2875R.color.possible_result_points);
        paint2.setColor(resources.getColor(C2875R.color.white));
        paint2.setTextSize((float) DisplayUtils.dp2px(context, 14.7f));
        this.scannerAlpha = 0;
        this.possibleResultPoints = new ArrayList(5);
        this.lastPossibleResultPoints = null;
    }

    public void addPossibleResultPoint(C2564h hVar) {
        List<C2564h> list = this.possibleResultPoints;
        synchronized (list) {
            list.add(hVar);
            int size = list.size();
            if (size > 20) {
                list.subList(0, size - 10).clear();
            }
        }
    }

    public void drawResultBitmap(Bitmap bitmap) {
        this.resultBitmap = bitmap;
        invalidate();
    }

    public void drawViewfinder() {
        Bitmap bitmap = this.resultBitmap;
        this.resultBitmap = null;
        if (bitmap != null) {
            bitmap.recycle();
        }
        invalidate();
    }

    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        CameraManager cameraManager2 = this.cameraManager;
        if (cameraManager2 != null) {
            Rect framingRect = cameraManager2.getFramingRect();
            Rect framingRectInPreview = this.cameraManager.getFramingRectInPreview();
            if (framingRect != null && framingRectInPreview != null) {
                int width = canvas.getWidth();
                int height = canvas.getHeight();
                this.paint.setColor(this.resultBitmap != null ? this.resultColor : this.maskColor);
                float f = (float) width;
                canvas.drawRect(0.0f, 0.0f, f, (float) framingRect.top, this.paint);
                canvas.drawRect(0.0f, (float) framingRect.top, (float) framingRect.left, (float) (framingRect.bottom + 1), this.paint);
                Canvas canvas2 = canvas;
                float f2 = f;
                canvas2.drawRect((float) (framingRect.right + 1), (float) framingRect.top, f2, (float) (framingRect.bottom + 1), this.paint);
                canvas2.drawRect(0.0f, (float) (framingRect.bottom + 1), f2, (float) height, this.paint);
                if (this.resultBitmap != null) {
                    this.paint.setAlpha(CURRENT_POINT_OPACITY);
                    canvas.drawBitmap(this.resultBitmap, (Rect) null, framingRect, this.paint);
                }
            }
        }
    }

    public void setCameraManager(CameraManager cameraManager2) {
        this.cameraManager = cameraManager2;
    }
}
