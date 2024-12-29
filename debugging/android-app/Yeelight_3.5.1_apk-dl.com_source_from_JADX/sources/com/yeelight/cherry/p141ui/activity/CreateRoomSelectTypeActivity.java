package com.yeelight.cherry.p141ui.activity;

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
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.adapter.RoomTypeAdapter;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import p051j4.C9193k;
import p051j4.C9195n;
import p190o3.C9776b;

/* renamed from: com.yeelight.cherry.ui.activity.CreateRoomSelectTypeActivity */
public class CreateRoomSelectTypeActivity extends BaseActivity {
    @BindView(2131297591)
    CommonTitleBar mTitleBar;
    @BindView(2131297367)
    RecyclerView mTypeList;

    /* renamed from: com.yeelight.cherry.ui.activity.CreateRoomSelectTypeActivity$TypeItemDecoration */
    public class TypeItemDecoration extends RecyclerView.ItemDecoration {

        /* renamed from: a */
        Paint f10143a;

        public TypeItemDecoration(CreateRoomSelectTypeActivity createRoomSelectTypeActivity) {
            Paint paint = new Paint();
            this.f10143a = paint;
            paint.setColor(Color.parseColor("#e8e8e8"));
            this.f10143a.setStrokeWidth(2.0f);
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
                canvas.drawLine(x, height, f, height, this.f10143a);
                i++;
                if (i % 3 != 0) {
                    canvas.drawLine(f, y, f, height, this.f10143a);
                }
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateRoomSelectTypeActivity$a */
    class C5159a implements C9776b {
        C5159a(CreateRoomSelectTypeActivity createRoomSelectTypeActivity) {
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateRoomSelectTypeActivity$b */
    class C5160b implements View.OnClickListener {
        C5160b() {
        }

        public void onClick(View view) {
            CreateRoomSelectTypeActivity.this.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_create_room_select_type);
        ButterKnife.bind((Activity) this);
        this.mTypeList.setLayoutManager(new GridLayoutManager(this, 3));
        this.mTypeList.addItemDecoration(new TypeItemDecoration(this));
        RoomTypeAdapter roomTypeAdapter = new RoomTypeAdapter(C9195n.f17012b);
        this.mTypeList.setAdapter(roomTypeAdapter);
        roomTypeAdapter.mo31206e(new C5159a(this));
        this.mTitleBar.mo36195a("选择类型", new C5160b(), (View.OnClickListener) null);
        this.mTitleBar.setTitleTextSize(16);
    }
}
