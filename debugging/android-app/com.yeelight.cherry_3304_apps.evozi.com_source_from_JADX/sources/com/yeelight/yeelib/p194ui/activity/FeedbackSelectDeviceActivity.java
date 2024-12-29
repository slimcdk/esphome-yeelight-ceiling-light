package com.yeelight.yeelib.p194ui.activity;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yeelight.yeelib.R$color;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p152f.C4239r;
import com.yeelight.yeelib.p153g.C9855x;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.yeelib.ui.activity.FeedbackSelectDeviceActivity */
public class FeedbackSelectDeviceActivity extends BaseActivity implements C4239r.C4242b {

    /* renamed from: b */
    private CommonTitleBar f18343b;

    /* renamed from: c */
    private RecyclerView f18344c;

    /* renamed from: d */
    private C10023b f18345d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<C9855x> f18346e = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f18347f = -1;

    /* renamed from: g */
    private String f18348g;

    /* renamed from: com.yeelight.yeelib.ui.activity.FeedbackSelectDeviceActivity$TypeItemDecoration */
    public class TypeItemDecoration extends RecyclerView.ItemDecoration {

        /* renamed from: a */
        Paint f18349a;

        public TypeItemDecoration(FeedbackSelectDeviceActivity feedbackSelectDeviceActivity) {
            Paint paint = new Paint();
            this.f18349a = paint;
            paint.setColor(Color.parseColor("#e8e8e8"));
            this.f18349a.setStrokeWidth(2.0f);
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
                canvas.drawLine(x, height, f, height, this.f18349a);
                i++;
                if (i % 3 != 0) {
                    canvas.drawLine(f, y, f, height, this.f18349a);
                }
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.FeedbackSelectDeviceActivity$a */
    class C10022a implements View.OnClickListener {
        C10022a() {
        }

        public void onClick(View view) {
            FeedbackSelectDeviceActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.FeedbackSelectDeviceActivity$b */
    class C10023b extends RecyclerView.Adapter<C10025b> {

        /* renamed from: com.yeelight.yeelib.ui.activity.FeedbackSelectDeviceActivity$b$a */
        class C10024a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C10025b f18352a;

            C10024a(C10025b bVar) {
                this.f18352a = bVar;
            }

            public void onClick(View view) {
                C9855x xVar = (C9855x) FeedbackSelectDeviceActivity.this.f18346e.get(this.f18352a.getAdapterPosition());
                Intent intent = new Intent();
                intent.putExtra("model", xVar.mo31841c());
                intent.putExtra("name", xVar.mo31842d());
                FeedbackSelectDeviceActivity.this.setResult(-1, intent);
                FeedbackSelectDeviceActivity.this.finish();
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.FeedbackSelectDeviceActivity$b$b */
        class C10025b extends RecyclerView.ViewHolder {

            /* renamed from: a */
            ImageView f18354a;

            public C10025b(C10023b bVar, View view) {
                super(view);
                this.f18354a = (ImageView) view.findViewById(R$id.product_icon);
                view.findViewById(R$id.product_name).setVisibility(8);
                view.setBackgroundResource(R$drawable.common_click_item_bg);
            }
        }

        C10023b() {
        }

        /* renamed from: a */
        public void onBindViewHolder(C10025b bVar, int i) {
            if (FeedbackSelectDeviceActivity.this.f18347f == i) {
                bVar.itemView.setBackground(new ColorDrawable(FeedbackSelectDeviceActivity.this.getResources().getColor(R$color.common_text_click_bg)));
            }
            bVar.f18354a.setImageResource(((C9855x) FeedbackSelectDeviceActivity.this.f18346e.get(i)).mo31840b());
            int b = C10547m.m25752b(bVar.f18354a.getContext(), 64.0f);
            bVar.f18354a.setLayoutParams(new LinearLayout.LayoutParams(b, b));
            bVar.itemView.setOnClickListener(new C10024a(bVar));
        }

        /* renamed from: b */
        public C10025b onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C10025b(this, LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.list_item_product, viewGroup, false));
        }

        public int getItemCount() {
            return FeedbackSelectDeviceActivity.this.f18346e.size();
        }
    }

    /* renamed from: A */
    public void mo23588A() {
        this.f18346e.clear();
        this.f18346e.addAll(C4239r.m11807g().mo23574f());
        this.f18345d.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_feedback_select_device);
        this.f18343b = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f18344c = (RecyclerView) findViewById(R$id.device_list);
        this.f18348g = getIntent().getStringExtra("model");
        this.f18343b.mo32825a(getString(R$string.feature_feedback), new C10022a(), (View.OnClickListener) null);
        this.f18344c.setLayoutManager(new GridLayoutManager(this, 3));
        this.f18345d = new C10023b();
        this.f18344c.setAdapter(new C10023b());
        this.f18344c.addItemDecoration(new TypeItemDecoration(this));
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C4239r.m11807g().mo23584s(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        int i;
        super.onResume();
        this.f18346e.clear();
        this.f18346e.addAll(C4239r.m11807g().mo23574f());
        if (this.f18348g == null) {
            i = -1;
        } else {
            i = 0;
            while (true) {
                if (i >= this.f18346e.size()) {
                    break;
                } else if (this.f18348g.equals(this.f18346e.get(i).mo31841c())) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.f18347f = i;
        this.f18345d.notifyDataSetChanged();
        C4239r.m11807g().mo23582p(this);
    }
}
