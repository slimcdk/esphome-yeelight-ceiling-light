package com.yeelight.cherry.p141ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dgreenhalgh.android.simpleitemdecoration.grid.GridDividerItemDecoration;
import com.yeelight.cherry.C12224R$drawable;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.models.C3112v;
import com.yeelight.yeelib.models.C8321m;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import java.util.ArrayList;
import java.util.List;
import p051j4.C9193k;
import p051j4.C9195n;

/* renamed from: com.yeelight.cherry.ui.activity.ImageModeSelectionActivity */
public class ImageModeSelectionActivity extends BaseActivity {

    /* renamed from: a */
    RecyclerView f10560a;

    /* renamed from: b */
    private int f10561b = 3;

    /* renamed from: c */
    List<Integer> f10562c = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f10563d = -1;

    /* renamed from: e */
    private boolean f10564e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f10565f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f10566g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f10567h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Handler f10568i = new C5342e();

    /* renamed from: com.yeelight.cherry.ui.activity.ImageModeSelectionActivity$TypeRecyclerViewAdapter */
    public class TypeRecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder> {

        /* renamed from: com.yeelight.cherry.ui.activity.ImageModeSelectionActivity$TypeRecyclerViewAdapter$ViewHolder */
        public class ViewHolder extends RecyclerView.ViewHolder {

            /* renamed from: a */
            public final ImageView f10570a;

            /* renamed from: b */
            public final LinearLayout f10571b;

            public ViewHolder(TypeRecyclerViewAdapter typeRecyclerViewAdapter, View view) {
                super(view);
                this.f10570a = (ImageView) view.findViewById(C12225R$id.mode_img);
                this.f10571b = (LinearLayout) view.findViewById(C12225R$id.layout_type);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.ImageModeSelectionActivity$TypeRecyclerViewAdapter$a */
        class C5336a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f10572a;

            /* renamed from: b */
            final /* synthetic */ ViewHolder f10573b;

            C5336a(int i, ViewHolder viewHolder) {
                this.f10572a = i;
                this.f10573b = viewHolder;
            }

            public void onClick(View view) {
                int unused = ImageModeSelectionActivity.this.f10563d = this.f10572a;
                this.f10573b.f10571b.setSelected(true);
                TypeRecyclerViewAdapter.this.notifyDataSetChanged();
            }
        }

        public TypeRecyclerViewAdapter() {
        }

        /* renamed from: a */
        public void onBindViewHolder(ViewHolder viewHolder, int i) {
            boolean z;
            LinearLayout linearLayout;
            viewHolder.f10570a.setImageResource(ImageModeSelectionActivity.this.f10562c.get(i).intValue());
            if (ImageModeSelectionActivity.this.f10563d == i) {
                linearLayout = viewHolder.f10571b;
                z = true;
            } else {
                linearLayout = viewHolder.f10571b;
                z = false;
            }
            linearLayout.setSelected(z);
            viewHolder.f10571b.setOnClickListener(new C5336a(i, viewHolder));
        }

        /* renamed from: b */
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new ViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(C12228R$layout.mode_selection_recycle_item, viewGroup, false));
        }

        public int getItemCount() {
            return ImageModeSelectionActivity.this.f10562c.size();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ImageModeSelectionActivity$a */
    class C5337a implements View.OnClickListener {
        C5337a() {
        }

        public void onClick(View view) {
            ImageModeSelectionActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ImageModeSelectionActivity$b */
    class C5338b implements View.OnClickListener {
        C5338b() {
        }

        public void onClick(View view) {
            Intent intent;
            if (ImageModeSelectionActivity.this.f10565f == 1) {
                if (ImageModeSelectionActivity.this.f10563d != -1) {
                    C3112v.m8242u().mo23566r().mo35297e0(ImageModeSelectionActivity.this.f10563d);
                    intent = new Intent();
                    intent.setClass(ImageModeSelectionActivity.this, CreateNameForPersonalityLightActivity.class);
                }
                ImageModeSelectionActivity.this.f10568i.removeMessages(0);
                ImageModeSelectionActivity.this.f10568i.sendEmptyMessageDelayed(0, 500);
                return;
            }
            if (ImageModeSelectionActivity.this.f10563d != -1) {
                intent = new Intent();
                intent.setClass(ImageModeSelectionActivity.this, CommonCreateNameActivity.class);
                if (ImageModeSelectionActivity.this.f10565f == 2) {
                    intent.putExtra("create_name_type", 0);
                } else if (ImageModeSelectionActivity.this.f10565f == 3) {
                    intent.putExtra("create_name_type", 1);
                    if (ImageModeSelectionActivity.this.f10567h != null && !ImageModeSelectionActivity.this.f10567h.isEmpty()) {
                        intent.putExtra("com.yeelight.cherry.room_id", ImageModeSelectionActivity.this.f10567h);
                    }
                }
                intent.putExtra("create_res_index", ImageModeSelectionActivity.this.f10563d);
            }
            ImageModeSelectionActivity.this.f10568i.removeMessages(0);
            ImageModeSelectionActivity.this.f10568i.sendEmptyMessageDelayed(0, 500);
            return;
            ImageModeSelectionActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ImageModeSelectionActivity$c */
    class C5339c implements View.OnClickListener {

        /* renamed from: com.yeelight.cherry.ui.activity.ImageModeSelectionActivity$c$a */
        class C5340a implements C3112v.C3119g {
            C5340a() {
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public /* synthetic */ void m16372c(String str) {
                Toast toast;
                if (str == null || str.isEmpty()) {
                    ImageModeSelectionActivity imageModeSelectionActivity = ImageModeSelectionActivity.this;
                    toast = Toast.makeText(imageModeSelectionActivity, imageModeSelectionActivity.getText(2131755310), 0);
                } else {
                    toast = Toast.makeText(ImageModeSelectionActivity.this, str, 0);
                }
                toast.show();
            }

            /* renamed from: a */
            public void mo23579a(String str) {
                ImageModeSelectionActivity.this.runOnUiThread(new C5778j1(this, str));
            }

            /* renamed from: g */
            public void mo23580g() {
            }

            public void onRefresh() {
            }

            /* renamed from: r */
            public void mo23582r(boolean z, List<C8321m> list) {
            }

            /* renamed from: s */
            public void mo23583s(String str) {
            }
        }

        C5339c() {
        }

        public void onClick(View view) {
            if (ImageModeSelectionActivity.this.f10565f == 1) {
                C3112v.m8242u().mo23558i().get(ImageModeSelectionActivity.this.f10566g).mo35297e0(ImageModeSelectionActivity.this.f10563d);
                C3112v.m8242u().mo23553B(C3112v.m8242u().mo23558i().get(ImageModeSelectionActivity.this.f10566g), new C5340a());
            } else {
                Intent intent = new Intent();
                intent.putExtra("create_res_index", ImageModeSelectionActivity.this.f10563d);
                ImageModeSelectionActivity.this.setResult(-1, intent);
            }
            ImageModeSelectionActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ImageModeSelectionActivity$d */
    class C5341d implements View.OnClickListener {
        C5341d() {
        }

        public void onClick(View view) {
            Intent intent;
            Class<MainActivity> cls = MainActivity.class;
            if (ImageModeSelectionActivity.this.f10567h != null) {
                intent = new Intent(ImageModeSelectionActivity.this, DemoControlViewActivity.class);
                intent.putExtra("com.yeelight.cherry.device_id", ImageModeSelectionActivity.this.f10567h);
                intent.putExtra("room_flag", true);
            } else if (ImageModeSelectionActivity.this.f10565f == 1) {
                intent = new Intent(ImageModeSelectionActivity.this, PersonalityLightingActivity.class);
            } else {
                intent = (ImageModeSelectionActivity.this.f10565f == 2 || ImageModeSelectionActivity.this.f10565f == 3) ? new Intent(ImageModeSelectionActivity.this, cls) : new Intent(ImageModeSelectionActivity.this, cls);
            }
            intent.addFlags(71303168);
            ImageModeSelectionActivity.this.startActivity(intent);
            ImageModeSelectionActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ImageModeSelectionActivity$e */
    class C5342e extends Handler {
        C5342e() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0) {
                if (ImageModeSelectionActivity.this.f10565f == 1 || ImageModeSelectionActivity.this.f10565f == 3 || ImageModeSelectionActivity.this.f10565f == 2) {
                    ImageModeSelectionActivity imageModeSelectionActivity = ImageModeSelectionActivity.this;
                    Toast.makeText(imageModeSelectionActivity, imageModeSelectionActivity.getText(2131755314), 0).show();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int d0;
        List<Integer> list;
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_image_mode_selection);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297591);
        commonTitleBar.mo36195a(getText(2131756051).toString(), new C5337a(), (View.OnClickListener) null);
        commonTitleBar.setTitleTextSize(16);
        this.f10560a = (RecyclerView) findViewById(2131297081);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        Intent intent = getIntent();
        this.f10564e = intent.getBooleanExtra("type_edit", false);
        this.f10566g = intent.getIntExtra("custom_scene_index", -1);
        if (intent.hasExtra("com.yeelight.cherry.room_id")) {
            this.f10567h = intent.getStringExtra("com.yeelight.cherry.room_id");
        }
        TextView textView = (TextView) findViewById(2131297165);
        textView.setOnClickListener(new C5338b());
        if (this.f10564e) {
            commonTitleBar.setRightTextColor(getResources().getColor(2131099805));
            commonTitleBar.setRightTextVisible(true);
            commonTitleBar.setRightTextStr(getString(2131755309));
            commonTitleBar.setRightButtonClickListener(new C5339c());
            textView.setVisibility(8);
        } else {
            commonTitleBar.setRightButtonClickListener(new C5341d());
            commonTitleBar.setRightButtonResource(2131231214);
            commonTitleBar.setRightButtonVisibility(0);
        }
        int intExtra = intent.getIntExtra("image_type", 1);
        this.f10565f = intExtra;
        if (intExtra == 2) {
            list = C9195n.f17012b;
        } else if (intExtra == 3) {
            list = C9195n.f17011a;
        } else {
            this.f10562c = C9195n.f17011a;
            d0 = C3112v.m8242u().mo23566r().mo35296d0();
            this.f10563d = d0;
            this.f10560a.setLayoutManager(new GridLayoutManager(this, this.f10561b));
            this.f10560a.addItemDecoration(new GridDividerItemDecoration(getResources().getDrawable(C12224R$drawable.line_divider), getResources().getDrawable(C12224R$drawable.line_divider), this.f10561b));
            this.f10560a.setAdapter(new TypeRecyclerViewAdapter());
        }
        this.f10562c = list;
        d0 = getIntent().getIntExtra("create_res_index", -1);
        this.f10563d = d0;
        this.f10560a.setLayoutManager(new GridLayoutManager(this, this.f10561b));
        this.f10560a.addItemDecoration(new GridDividerItemDecoration(getResources().getDrawable(C12224R$drawable.line_divider), getResources().getDrawable(C12224R$drawable.line_divider), this.f10561b));
        this.f10560a.setAdapter(new TypeRecyclerViewAdapter());
    }
}
