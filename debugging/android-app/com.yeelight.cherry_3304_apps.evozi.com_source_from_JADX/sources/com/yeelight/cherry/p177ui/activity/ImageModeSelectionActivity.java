package com.yeelight.cherry.p177ui.activity;

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
import com.yeelight.cherry.C11744R$drawable;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p153g.C4300b0;
import com.yeelight.yeelib.p153g.C9849r;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C10549p;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.activity.ImageModeSelectionActivity */
public class ImageModeSelectionActivity extends BaseActivity {

    /* renamed from: b */
    RecyclerView f10993b;

    /* renamed from: c */
    private int f10994c = 3;

    /* renamed from: d */
    List<Integer> f10995d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f10996e = -1;

    /* renamed from: f */
    private boolean f10997f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f10998g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f10999h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f11000i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Handler f11001j = new C5294e();

    /* renamed from: com.yeelight.cherry.ui.activity.ImageModeSelectionActivity$TypeRecyclerViewAdapter */
    public class TypeRecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder> {

        /* renamed from: com.yeelight.cherry.ui.activity.ImageModeSelectionActivity$TypeRecyclerViewAdapter$ViewHolder */
        public class ViewHolder extends RecyclerView.ViewHolder {

            /* renamed from: a */
            public final ImageView f11003a;

            /* renamed from: b */
            public final LinearLayout f11004b;

            public ViewHolder(TypeRecyclerViewAdapter typeRecyclerViewAdapter, View view) {
                super(view);
                this.f11003a = (ImageView) view.findViewById(C11745R$id.mode_img);
                this.f11004b = (LinearLayout) view.findViewById(C11745R$id.layout_type);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.ImageModeSelectionActivity$TypeRecyclerViewAdapter$a */
        class C5288a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f11005a;

            /* renamed from: b */
            final /* synthetic */ ViewHolder f11006b;

            C5288a(int i, ViewHolder viewHolder) {
                this.f11005a = i;
                this.f11006b = viewHolder;
            }

            public void onClick(View view) {
                int unused = ImageModeSelectionActivity.this.f10996e = this.f11005a;
                this.f11006b.f11004b.setSelected(true);
                TypeRecyclerViewAdapter.this.notifyDataSetChanged();
            }
        }

        public TypeRecyclerViewAdapter() {
        }

        /* renamed from: a */
        public void onBindViewHolder(ViewHolder viewHolder, int i) {
            boolean z;
            LinearLayout linearLayout;
            viewHolder.f11003a.setImageResource(ImageModeSelectionActivity.this.f10995d.get(i).intValue());
            if (ImageModeSelectionActivity.this.f10996e == i) {
                linearLayout = viewHolder.f11004b;
                z = true;
            } else {
                linearLayout = viewHolder.f11004b;
                z = false;
            }
            linearLayout.setSelected(z);
            viewHolder.f11004b.setOnClickListener(new C5288a(i, viewHolder));
        }

        /* renamed from: b */
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new ViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(C11748R$layout.mode_selection_recycle_item, viewGroup, false));
        }

        public int getItemCount() {
            return ImageModeSelectionActivity.this.f10995d.size();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ImageModeSelectionActivity$a */
    class C5289a implements View.OnClickListener {
        C5289a() {
        }

        public void onClick(View view) {
            ImageModeSelectionActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ImageModeSelectionActivity$b */
    class C5290b implements View.OnClickListener {
        C5290b() {
        }

        public void onClick(View view) {
            Intent intent;
            if (ImageModeSelectionActivity.this.f10998g == 1) {
                if (ImageModeSelectionActivity.this.f10996e != -1) {
                    C4300b0.m12083u().mo23753r().mo31762e0(ImageModeSelectionActivity.this.f10996e);
                    intent = new Intent();
                    intent.setClass(ImageModeSelectionActivity.this, CreateNameForPersonalityLightActivity.class);
                }
                ImageModeSelectionActivity.this.f11001j.removeMessages(0);
                ImageModeSelectionActivity.this.f11001j.sendEmptyMessageDelayed(0, 500);
                return;
            }
            if (ImageModeSelectionActivity.this.f10996e != -1) {
                intent = new Intent();
                intent.setClass(ImageModeSelectionActivity.this, CommonCreateNameActivity.class);
                if (ImageModeSelectionActivity.this.f10998g == 2) {
                    intent.putExtra("create_name_type", 0);
                } else if (ImageModeSelectionActivity.this.f10998g == 3) {
                    intent.putExtra("create_name_type", 1);
                    if (ImageModeSelectionActivity.this.f11000i != null && !ImageModeSelectionActivity.this.f11000i.isEmpty()) {
                        intent.putExtra("com.yeelight.cherry.room_id", ImageModeSelectionActivity.this.f11000i);
                    }
                }
                intent.putExtra("create_res_index", ImageModeSelectionActivity.this.f10996e);
            }
            ImageModeSelectionActivity.this.f11001j.removeMessages(0);
            ImageModeSelectionActivity.this.f11001j.sendEmptyMessageDelayed(0, 500);
            return;
            ImageModeSelectionActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ImageModeSelectionActivity$c */
    class C5291c implements View.OnClickListener {

        /* renamed from: com.yeelight.cherry.ui.activity.ImageModeSelectionActivity$c$a */
        class C5292a implements C4300b0.C4307g {
            C5292a() {
            }

            /* renamed from: a */
            public void mo23766a(String str) {
                ImageModeSelectionActivity.this.runOnUiThread(new C5783v0(this, str));
            }

            /* renamed from: b */
            public /* synthetic */ void mo26502b(String str) {
                Toast toast;
                if (str == null || str.isEmpty()) {
                    ImageModeSelectionActivity imageModeSelectionActivity = ImageModeSelectionActivity.this;
                    toast = Toast.makeText(imageModeSelectionActivity, imageModeSelectionActivity.getText(2131755306), 0);
                } else {
                    toast = Toast.makeText(ImageModeSelectionActivity.this, str, 0);
                }
                toast.show();
            }

            /* renamed from: f */
            public void mo23767f() {
            }

            /* renamed from: n */
            public void mo23768n(boolean z, List<C9849r> list) {
            }

            public void onRefresh() {
            }

            /* renamed from: p */
            public void mo23770p(String str) {
            }
        }

        C5291c() {
        }

        public void onClick(View view) {
            if (ImageModeSelectionActivity.this.f10998g == 1) {
                C4300b0.m12083u().mo23745i().get(ImageModeSelectionActivity.this.f10999h).mo31762e0(ImageModeSelectionActivity.this.f10996e);
                C4300b0.m12083u().mo23740C(C4300b0.m12083u().mo23745i().get(ImageModeSelectionActivity.this.f10999h), new C5292a());
            } else {
                Intent intent = new Intent();
                intent.putExtra("create_res_index", ImageModeSelectionActivity.this.f10996e);
                ImageModeSelectionActivity.this.setResult(-1, intent);
            }
            ImageModeSelectionActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ImageModeSelectionActivity$d */
    class C5293d implements View.OnClickListener {
        C5293d() {
        }

        public void onClick(View view) {
            Intent intent;
            if (ImageModeSelectionActivity.this.f11000i != null) {
                intent = new Intent(ImageModeSelectionActivity.this, DemoControlViewActivity.class);
                intent.putExtra("com.yeelight.cherry.device_id", ImageModeSelectionActivity.this.f11000i);
                intent.putExtra("room_flag", true);
            } else {
                intent = ImageModeSelectionActivity.this.f10998g == 1 ? new Intent(ImageModeSelectionActivity.this, PersonalityLightingActivity.class) : (ImageModeSelectionActivity.this.f10998g == 2 || ImageModeSelectionActivity.this.f10998g == 3) ? new Intent(ImageModeSelectionActivity.this, MainActivity.class) : new Intent(ImageModeSelectionActivity.this, MainActivity.class);
            }
            intent.addFlags(71303168);
            ImageModeSelectionActivity.this.startActivity(intent);
            ImageModeSelectionActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ImageModeSelectionActivity$e */
    class C5294e extends Handler {
        C5294e() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0) {
                if (ImageModeSelectionActivity.this.f10998g == 1 || ImageModeSelectionActivity.this.f10998g == 3 || ImageModeSelectionActivity.this.f10998g == 2) {
                    ImageModeSelectionActivity imageModeSelectionActivity = ImageModeSelectionActivity.this;
                    Toast.makeText(imageModeSelectionActivity, imageModeSelectionActivity.getText(2131755310), 0).show();
                }
            }
        }
    }

    static {
        Class<ImageModeSelectionActivity> cls = ImageModeSelectionActivity.class;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int d0;
        List<Integer> list;
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_image_mode_selection);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297424);
        commonTitleBar.mo32825a(getText(2131756039).toString(), new C5289a(), (View.OnClickListener) null);
        commonTitleBar.setTitleTextSize(16);
        this.f10993b = (RecyclerView) findViewById(2131296968);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        Intent intent = getIntent();
        this.f10997f = intent.getBooleanExtra("type_edit", false);
        this.f10999h = intent.getIntExtra("custom_scene_index", -1);
        if (intent.hasExtra("com.yeelight.cherry.room_id")) {
            this.f11000i = intent.getStringExtra("com.yeelight.cherry.room_id");
        }
        TextView textView = (TextView) findViewById(2131297043);
        textView.setOnClickListener(new C5290b());
        if (this.f10997f) {
            commonTitleBar.setRightTextColor(getResources().getColor(2131099802));
            commonTitleBar.setRightTextVisible(true);
            commonTitleBar.setRightTextStr(getString(2131755305));
            commonTitleBar.setRightButtonClickListener(new C5291c());
            textView.setVisibility(8);
        } else {
            commonTitleBar.setRightButtonClickListener(new C5293d());
            commonTitleBar.setRightButtonResource(2131231200);
            commonTitleBar.setRightButtonVisibility(0);
        }
        int intExtra = intent.getIntExtra("image_type", 1);
        this.f10998g = intExtra;
        if (intExtra == 2) {
            list = C10549p.f20167b;
        } else if (intExtra == 3) {
            list = C10549p.f20166a;
        } else {
            this.f10995d = C10549p.f20166a;
            d0 = C4300b0.m12083u().mo23753r().mo31761d0();
            this.f10996e = d0;
            this.f10993b.setLayoutManager(new GridLayoutManager(this, this.f10994c));
            this.f10993b.addItemDecoration(new GridDividerItemDecoration(getResources().getDrawable(C11744R$drawable.line_divider), getResources().getDrawable(C11744R$drawable.line_divider), this.f10994c));
            this.f10993b.setAdapter(new TypeRecyclerViewAdapter());
        }
        this.f10995d = list;
        d0 = getIntent().getIntExtra("create_res_index", -1);
        this.f10996e = d0;
        this.f10993b.setLayoutManager(new GridLayoutManager(this, this.f10994c));
        this.f10993b.addItemDecoration(new GridDividerItemDecoration(getResources().getDrawable(C11744R$drawable.line_divider), getResources().getDrawable(C11744R$drawable.line_divider), this.f10994c));
        this.f10993b.setAdapter(new TypeRecyclerViewAdapter());
    }
}
