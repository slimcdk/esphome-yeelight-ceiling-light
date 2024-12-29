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
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C10549p;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.activity.CreateSceneImageSelectionActivity */
public class CreateSceneImageSelectionActivity extends BaseActivity {

    /* renamed from: b */
    private RecyclerView f10606b;

    /* renamed from: c */
    private int f10607c = 3;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public List<Integer> f10608d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f10609e = -1;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Handler f10610f = new Handler(new C5122c());

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneImageSelectionActivity$TypeRecyclerViewAdapter */
    public class TypeRecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder> {

        /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneImageSelectionActivity$TypeRecyclerViewAdapter$ViewHolder */
        public class ViewHolder extends RecyclerView.ViewHolder {

            /* renamed from: a */
            public final ImageView f10612a;

            /* renamed from: b */
            public final LinearLayout f10613b;

            public ViewHolder(TypeRecyclerViewAdapter typeRecyclerViewAdapter, View view) {
                super(view);
                this.f10612a = (ImageView) view.findViewById(C11745R$id.mode_img);
                this.f10613b = (LinearLayout) view.findViewById(C11745R$id.layout_type);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneImageSelectionActivity$TypeRecyclerViewAdapter$a */
        class C5119a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f10614a;

            /* renamed from: b */
            final /* synthetic */ ViewHolder f10615b;

            C5119a(int i, ViewHolder viewHolder) {
                this.f10614a = i;
                this.f10615b = viewHolder;
            }

            public void onClick(View view) {
                int unused = CreateSceneImageSelectionActivity.this.f10609e = this.f10614a;
                this.f10615b.f10613b.setSelected(true);
                TypeRecyclerViewAdapter.this.notifyDataSetChanged();
            }
        }

        public TypeRecyclerViewAdapter() {
        }

        /* renamed from: a */
        public void onBindViewHolder(ViewHolder viewHolder, int i) {
            boolean z;
            LinearLayout linearLayout;
            viewHolder.f10612a.setImageResource(((Integer) CreateSceneImageSelectionActivity.this.f10608d.get(i)).intValue());
            if (CreateSceneImageSelectionActivity.this.f10609e == i) {
                linearLayout = viewHolder.f10613b;
                z = true;
            } else {
                linearLayout = viewHolder.f10613b;
                z = false;
            }
            linearLayout.setSelected(z);
            viewHolder.f10613b.setOnClickListener(new C5119a(i, viewHolder));
        }

        /* renamed from: b */
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new ViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(C11748R$layout.mode_selection_recycle_item, viewGroup, false));
        }

        public int getItemCount() {
            return CreateSceneImageSelectionActivity.this.f10608d.size();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneImageSelectionActivity$a */
    class C5120a implements View.OnClickListener {
        C5120a() {
        }

        public void onClick(View view) {
            CreateSceneImageSelectionActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneImageSelectionActivity$b */
    class C5121b implements View.OnClickListener {
        C5121b() {
        }

        public void onClick(View view) {
            if (CreateSceneImageSelectionActivity.this.f10609e != -1) {
                Intent intent = new Intent();
                intent.putExtra("create_res_index", CreateSceneImageSelectionActivity.this.f10609e);
                CreateSceneImageSelectionActivity.this.setResult(-1, intent);
                CreateSceneImageSelectionActivity.this.finish();
                return;
            }
            CreateSceneImageSelectionActivity.this.f10610f.removeMessages(0);
            CreateSceneImageSelectionActivity.this.f10610f.sendEmptyMessageDelayed(0, 500);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneImageSelectionActivity$c */
    class C5122c implements Handler.Callback {
        C5122c() {
        }

        public boolean handleMessage(Message message) {
            if (message.what == 0) {
                CreateSceneImageSelectionActivity createSceneImageSelectionActivity = CreateSceneImageSelectionActivity.this;
                Toast.makeText(createSceneImageSelectionActivity, createSceneImageSelectionActivity.getText(2131755310), 0).show();
            }
            return false;
        }
    }

    static {
        Class<CreateSceneImageSelectionActivity> cls = CreateSceneImageSelectionActivity.class;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_create_scene_image_selection);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297424);
        commonTitleBar.mo32825a(getText(2131756039).toString(), new C5120a(), (View.OnClickListener) null);
        commonTitleBar.setTitleTextSize(17);
        this.f10606b = (RecyclerView) findViewById(2131296968);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        Intent intent = getIntent();
        if (intent != null) {
            this.f10609e = intent.getIntExtra("create_res_index", -1);
        }
        ((TextView) findViewById(2131296405)).setOnClickListener(new C5121b());
        this.f10608d = C10549p.f20166a;
        this.f10606b.setLayoutManager(new GridLayoutManager(this, this.f10607c));
        this.f10606b.addItemDecoration(new GridDividerItemDecoration(getResources().getDrawable(C11744R$drawable.line_divider), getResources().getDrawable(C11744R$drawable.line_divider), this.f10607c));
        this.f10606b.setAdapter(new TypeRecyclerViewAdapter());
    }
}
