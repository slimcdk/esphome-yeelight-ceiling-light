package com.yeelight.cherry.p177ui.activity;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p177ui.adapter.C5868d;
import com.yeelight.cherry.p177ui.adapter.RoomTypeAdapter;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C10549p;

/* renamed from: com.yeelight.cherry.ui.activity.CreateRoomSelectTypeActivity */
public class CreateRoomSelectTypeActivity extends BaseActivity {
    @BindView(2131297424)
    CommonTitleBar mTitleBar;
    @BindView(2131297225)
    RecyclerView mTypeList;

    /* renamed from: com.yeelight.cherry.ui.activity.CreateRoomSelectTypeActivity$TypeItemDecoration */
    public class TypeItemDecoration extends RecyclerView.ItemDecoration {

        /* renamed from: a */
        Paint f10590a;

        public TypeItemDecoration(CreateRoomSelectTypeActivity createRoomSelectTypeActivity) {
            Paint paint = new Paint();
            this.f10590a = paint;
            paint.setColor(Color.parseColor("#e8e8e8"));
            this.f10590a.setStrokeWidth(2.0f);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            super.onDraw(canvas, recyclerView, state);
            int childCount = recyclerView.getChildCount();
            int i = 0;
            while (i < childCount) {
                View childAt = recyclerView.getChildAt(i);
                float x = childAt.getX();
                float y = childAt.getY();
                int width = childAt.getWidth();
                float height = ((float) childAt.getHeight()) + y;
                float f = x + ((float) width);
                canvas.drawLine(x, height, f, height, this.f10590a);
                i++;
                if (i % 3 != 0) {
                    canvas.drawLine(f, y, f, height, this.f10590a);
                }
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateRoomSelectTypeActivity$a */
    class C5111a implements C5868d {
        C5111a(CreateRoomSelectTypeActivity createRoomSelectTypeActivity) {
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateRoomSelectTypeActivity$b */
    class C5112b implements View.OnClickListener {
        C5112b() {
        }

        public void onClick(View view) {
            CreateRoomSelectTypeActivity.this.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_create_room_select_type);
        ButterKnife.bind((Activity) this);
        this.mTypeList.setLayoutManager(new GridLayoutManager(this, 3));
        this.mTypeList.addItemDecoration(new TypeItemDecoration(this));
        RoomTypeAdapter roomTypeAdapter = new RoomTypeAdapter(C10549p.f20167b);
        this.mTypeList.setAdapter(roomTypeAdapter);
        roomTypeAdapter.mo27241e(new C5111a(this));
        this.mTitleBar.mo32825a("选择类型", new C5112b(), (View.OnClickListener) null);
        this.mTitleBar.setTitleTextSize(16);
    }
}
