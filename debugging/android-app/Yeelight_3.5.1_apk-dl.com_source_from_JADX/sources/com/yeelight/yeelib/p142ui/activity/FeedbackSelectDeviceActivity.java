package com.yeelight.yeelib.p142ui.activity;

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
import com.yeelight.yeelib.managers.C3088r;
import com.yeelight.yeelib.models.ProductInfo;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import java.util.ArrayList;
import java.util.List;
import p051j4.C9193k;

/* renamed from: com.yeelight.yeelib.ui.activity.FeedbackSelectDeviceActivity */
public class FeedbackSelectDeviceActivity extends BaseActivity implements C3088r.C3091b {

    /* renamed from: a */
    private CommonTitleBar f14651a;

    /* renamed from: b */
    private RecyclerView f14652b;

    /* renamed from: c */
    private C8441b f14653c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public List<ProductInfo> f14654d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f14655e = -1;

    /* renamed from: f */
    private String f14656f;

    /* renamed from: com.yeelight.yeelib.ui.activity.FeedbackSelectDeviceActivity$TypeItemDecoration */
    public class TypeItemDecoration extends RecyclerView.ItemDecoration {

        /* renamed from: a */
        Paint f14657a;

        public TypeItemDecoration(FeedbackSelectDeviceActivity feedbackSelectDeviceActivity) {
            Paint paint = new Paint();
            this.f14657a = paint;
            paint.setColor(Color.parseColor("#e8e8e8"));
            this.f14657a.setStrokeWidth(2.0f);
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
                canvas.drawLine(x, height, f, height, this.f14657a);
                i++;
                if (i % 3 != 0) {
                    canvas.drawLine(f, y, f, height, this.f14657a);
                }
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.FeedbackSelectDeviceActivity$a */
    class C8440a implements View.OnClickListener {
        C8440a() {
        }

        public void onClick(View view) {
            FeedbackSelectDeviceActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.FeedbackSelectDeviceActivity$b */
    class C8441b extends RecyclerView.Adapter<C8443b> {

        /* renamed from: com.yeelight.yeelib.ui.activity.FeedbackSelectDeviceActivity$b$a */
        class C8442a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C8443b f14660a;

            C8442a(C8443b bVar) {
                this.f14660a = bVar;
            }

            public void onClick(View view) {
                ProductInfo productInfo = (ProductInfo) FeedbackSelectDeviceActivity.this.f14654d.get(this.f14660a.getAdapterPosition());
                Intent intent = new Intent();
                intent.putExtra("model", productInfo.getProductModel());
                intent.putExtra("name", productInfo.getProductName());
                FeedbackSelectDeviceActivity.this.setResult(-1, intent);
                FeedbackSelectDeviceActivity.this.finish();
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.FeedbackSelectDeviceActivity$b$b */
        class C8443b extends RecyclerView.ViewHolder {

            /* renamed from: a */
            ImageView f14662a;

            public C8443b(C8441b bVar, View view) {
                super(view);
                this.f14662a = (ImageView) view.findViewById(R$id.product_icon);
                view.findViewById(R$id.product_name).setVisibility(8);
                view.setBackgroundResource(R$drawable.common_click_item_bg);
            }
        }

        C8441b() {
        }

        /* renamed from: a */
        public void onBindViewHolder(C8443b bVar, int i) {
            if (FeedbackSelectDeviceActivity.this.f14655e == i) {
                bVar.itemView.setBackground(new ColorDrawable(FeedbackSelectDeviceActivity.this.getResources().getColor(R$color.common_text_click_bg)));
            }
            bVar.f14662a.setImageResource(((ProductInfo) FeedbackSelectDeviceActivity.this.f14654d.get(i)).getProductIcon());
            int b = C9193k.m22151b(bVar.f14662a.getContext(), 64.0f);
            bVar.f14662a.setLayoutParams(new LinearLayout.LayoutParams(b, b));
            bVar.itemView.setOnClickListener(new C8442a(bVar));
        }

        /* renamed from: b */
        public C8443b onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C8443b(this, LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.list_item_product, viewGroup, false));
        }

        public int getItemCount() {
            return FeedbackSelectDeviceActivity.this.f14654d.size();
        }
    }

    /* renamed from: A */
    public void mo23481A() {
        this.f14654d.clear();
        this.f14654d.addAll(C3088r.m8117g().mo23467f());
        this.f14653c.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_feedback_select_device);
        this.f14651a = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f14652b = (RecyclerView) findViewById(R$id.device_list);
        this.f14656f = getIntent().getStringExtra("model");
        this.f14651a.mo36195a(getString(R$string.feature_feedback), new C8440a(), (View.OnClickListener) null);
        this.f14652b.setLayoutManager(new GridLayoutManager(this, 3));
        this.f14653c = new C8441b();
        this.f14652b.setAdapter(new C8441b());
        this.f14652b.addItemDecoration(new TypeItemDecoration(this));
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C3088r.m8117g().mo23477s(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        int i;
        super.onResume();
        this.f14654d.clear();
        this.f14654d.addAll(C3088r.m8117g().mo23467f());
        if (this.f14656f == null) {
            i = -1;
        } else {
            i = 0;
            while (true) {
                if (i >= this.f14654d.size()) {
                    break;
                } else if (this.f14656f.equals(this.f14654d.get(i).getProductModel())) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.f14655e = i;
        this.f14653c.notifyDataSetChanged();
        C3088r.m8117g().mo23475p(this);
    }
}
