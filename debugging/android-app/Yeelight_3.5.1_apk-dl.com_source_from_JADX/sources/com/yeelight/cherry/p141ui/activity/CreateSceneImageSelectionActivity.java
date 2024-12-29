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
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import java.util.ArrayList;
import java.util.List;
import p051j4.C9193k;
import p051j4.C9195n;

/* renamed from: com.yeelight.cherry.ui.activity.CreateSceneImageSelectionActivity */
public class CreateSceneImageSelectionActivity extends BaseActivity {

    /* renamed from: a */
    private RecyclerView f10159a;

    /* renamed from: b */
    private int f10160b = 3;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<Integer> f10161c = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f10162d = -1;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Handler f10163e = new Handler(new C5170c());

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneImageSelectionActivity$TypeRecyclerViewAdapter */
    public class TypeRecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder> {

        /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneImageSelectionActivity$TypeRecyclerViewAdapter$ViewHolder */
        public class ViewHolder extends RecyclerView.ViewHolder {

            /* renamed from: a */
            public final ImageView f10165a;

            /* renamed from: b */
            public final LinearLayout f10166b;

            public ViewHolder(TypeRecyclerViewAdapter typeRecyclerViewAdapter, View view) {
                super(view);
                this.f10165a = (ImageView) view.findViewById(C12225R$id.mode_img);
                this.f10166b = (LinearLayout) view.findViewById(C12225R$id.layout_type);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneImageSelectionActivity$TypeRecyclerViewAdapter$a */
        class C5167a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f10167a;

            /* renamed from: b */
            final /* synthetic */ ViewHolder f10168b;

            C5167a(int i, ViewHolder viewHolder) {
                this.f10167a = i;
                this.f10168b = viewHolder;
            }

            public void onClick(View view) {
                int unused = CreateSceneImageSelectionActivity.this.f10162d = this.f10167a;
                this.f10168b.f10166b.setSelected(true);
                TypeRecyclerViewAdapter.this.notifyDataSetChanged();
            }
        }

        public TypeRecyclerViewAdapter() {
        }

        /* renamed from: a */
        public void onBindViewHolder(ViewHolder viewHolder, int i) {
            boolean z;
            LinearLayout linearLayout;
            viewHolder.f10165a.setImageResource(((Integer) CreateSceneImageSelectionActivity.this.f10161c.get(i)).intValue());
            if (CreateSceneImageSelectionActivity.this.f10162d == i) {
                linearLayout = viewHolder.f10166b;
                z = true;
            } else {
                linearLayout = viewHolder.f10166b;
                z = false;
            }
            linearLayout.setSelected(z);
            viewHolder.f10166b.setOnClickListener(new C5167a(i, viewHolder));
        }

        /* renamed from: b */
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new ViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(C12228R$layout.mode_selection_recycle_item, viewGroup, false));
        }

        public int getItemCount() {
            return CreateSceneImageSelectionActivity.this.f10161c.size();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneImageSelectionActivity$a */
    class C5168a implements View.OnClickListener {
        C5168a() {
        }

        public void onClick(View view) {
            CreateSceneImageSelectionActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneImageSelectionActivity$b */
    class C5169b implements View.OnClickListener {
        C5169b() {
        }

        public void onClick(View view) {
            if (CreateSceneImageSelectionActivity.this.f10162d != -1) {
                Intent intent = new Intent();
                intent.putExtra("create_res_index", CreateSceneImageSelectionActivity.this.f10162d);
                CreateSceneImageSelectionActivity.this.setResult(-1, intent);
                CreateSceneImageSelectionActivity.this.finish();
                return;
            }
            CreateSceneImageSelectionActivity.this.f10163e.removeMessages(0);
            CreateSceneImageSelectionActivity.this.f10163e.sendEmptyMessageDelayed(0, 500);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneImageSelectionActivity$c */
    class C5170c implements Handler.Callback {
        C5170c() {
        }

        public boolean handleMessage(Message message) {
            if (message.what == 0) {
                CreateSceneImageSelectionActivity createSceneImageSelectionActivity = CreateSceneImageSelectionActivity.this;
                Toast.makeText(createSceneImageSelectionActivity, createSceneImageSelectionActivity.getText(2131755314), 0).show();
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_create_scene_image_selection);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297591);
        commonTitleBar.mo36195a(getText(2131756051).toString(), new C5168a(), (View.OnClickListener) null);
        commonTitleBar.setTitleTextSize(17);
        this.f10159a = (RecyclerView) findViewById(2131297081);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        Intent intent = getIntent();
        if (intent != null) {
            this.f10162d = intent.getIntExtra("create_res_index", -1);
        }
        ((TextView) findViewById(2131296463)).setOnClickListener(new C5169b());
        this.f10161c = C9195n.f17011a;
        this.f10159a.setLayoutManager(new GridLayoutManager(this, this.f10160b));
        this.f10159a.addItemDecoration(new GridDividerItemDecoration(getResources().getDrawable(C12224R$drawable.line_divider), getResources().getDrawable(C12224R$drawable.line_divider), this.f10160b));
        this.f10159a.setAdapter(new TypeRecyclerViewAdapter());
    }
}
