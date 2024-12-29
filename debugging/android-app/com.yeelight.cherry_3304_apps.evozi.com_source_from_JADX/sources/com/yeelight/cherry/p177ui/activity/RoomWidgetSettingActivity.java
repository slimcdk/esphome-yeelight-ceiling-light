package com.yeelight.cherry.p177ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.p150c.C6005g;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p152f.C9812t;
import com.yeelight.yeelib.p190i.C9875a;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.appwidget.YeelightRoomWidgetProvider;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.yeelight.cherry.ui.activity.RoomWidgetSettingActivity */
public class RoomWidgetSettingActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ArrayList<C9875a> f11703b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f11704c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f11705d;

    /* renamed from: e */
    BaseAdapter f11706e = new C5594c();
    @BindView(2131296985)
    ListView mRoomLv;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;

    /* renamed from: com.yeelight.cherry.ui.activity.RoomWidgetSettingActivity$a */
    class C5592a implements View.OnClickListener {
        C5592a() {
        }

        public void onClick(View view) {
            RoomWidgetSettingActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.RoomWidgetSettingActivity$b */
    class C5593b implements View.OnClickListener {
        C5593b() {
        }

        public void onClick(View view) {
            DeviceDataProvider.m22402f(RoomWidgetSettingActivity.this.f11704c, String.valueOf(RoomWidgetSettingActivity.this.f11705d));
            Intent intent = new Intent();
            intent.setAction("widget_on_click_room");
            intent.setClass(C4297y.f7456e, YeelightRoomWidgetProvider.class);
            intent.putExtra("extra_name_widget_action", "room_widget_add_room_success");
            intent.putExtra("extra_name_widget_data", RoomWidgetSettingActivity.this.f11704c);
            intent.putExtra("room_widget_extra_key_widget_id", RoomWidgetSettingActivity.this.f11705d);
            C4297y.f7456e.sendBroadcast(intent);
            RoomWidgetSettingActivity.this.moveTaskToBack(true);
            RoomWidgetSettingActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.RoomWidgetSettingActivity$c */
    class C5594c extends BaseAdapter {

        /* renamed from: com.yeelight.cherry.ui.activity.RoomWidgetSettingActivity$c$a */
        class C5595a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C9875a f11710a;

            /* renamed from: b */
            final /* synthetic */ C5596d f11711b;

            C5595a(C9875a aVar, C5596d dVar) {
                this.f11710a = aVar;
                this.f11711b = dVar;
            }

            public void onClick(View view) {
                RoomWidgetSettingActivity roomWidgetSettingActivity;
                String n;
                if (this.f11710a.mo31958s()) {
                    this.f11710a.mo31963w(false);
                    this.f11711b.f11715c.setChecked(false);
                    roomWidgetSettingActivity = RoomWidgetSettingActivity.this;
                    n = "";
                } else {
                    Iterator it = RoomWidgetSettingActivity.this.f11703b.iterator();
                    while (it.hasNext()) {
                        ((C9875a) it.next()).mo31963w(false);
                    }
                    C5594c.this.notifyDataSetChanged();
                    this.f11710a.mo31963w(true);
                    this.f11711b.f11715c.setChecked(true);
                    roomWidgetSettingActivity = RoomWidgetSettingActivity.this;
                    n = this.f11710a.mo31953n();
                }
                String unused = roomWidgetSettingActivity.f11704c = n;
            }
        }

        C5594c() {
        }

        /* renamed from: a */
        public C9875a getItem(int i) {
            if (RoomWidgetSettingActivity.this.f11703b == null || RoomWidgetSettingActivity.this.f11703b.size() <= i || i < 0) {
                return null;
            }
            return (C9875a) RoomWidgetSettingActivity.this.f11703b.get(i);
        }

        public int getCount() {
            return RoomWidgetSettingActivity.this.f11703b.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C5596d dVar;
            if (view != null) {
                dVar = (C5596d) view.getTag();
            } else {
                view = View.inflate(RoomWidgetSettingActivity.this, C11748R$layout.list_item_room_widget_edit, (ViewGroup) null);
                dVar = new C5596d(RoomWidgetSettingActivity.this, view);
                view.setTag(dVar);
            }
            C9875a a = getItem(i);
            if (a != null) {
                C6005g G0 = C4257w.m11947l0().mo23647G0(a.mo31953n());
                if (G0 != null) {
                    dVar.f11713a.setImageResource(G0.mo27551a2());
                }
                dVar.f11714b.setText(a.mo31954o());
                dVar.f11715c.setChecked(a.mo31958s());
                view.setOnClickListener(new C5595a(a, dVar));
            }
            return view;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.RoomWidgetSettingActivity$d */
    class C5596d extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f11713a;

        /* renamed from: b */
        TextView f11714b;

        /* renamed from: c */
        CheckBox f11715c;

        public C5596d(RoomWidgetSettingActivity roomWidgetSettingActivity, View view) {
            super(view);
            this.f11713a = (ImageView) view.findViewById(C11745R$id.room_img);
            this.f11714b = (TextView) view.findViewById(C11745R$id.room_name);
            this.f11715c = (CheckBox) view.findViewById(C11745R$id.room_checkbox);
        }
    }

    static {
        Class<RoomWidgetSettingActivity> cls = RoomWidgetSettingActivity.class;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_room_widget_edit);
        ButterKnife.bind((Activity) this);
        if (getIntent() != null) {
            this.f11705d = getIntent().getIntExtra("com.yeelight.cherry.widget_id", 0);
        }
        this.mTitleBar.setRightButtonResource(2131231965);
        this.mTitleBar.mo32825a(getString(2131755074), new C5592a(), new C5593b());
        this.mTitleBar.setTitleTextSize(17);
        this.mTitleBar.setRightTextVisible(true);
        this.mTitleBar.setRightTextColor(ContextCompat.getColor(this, 2131099839));
        this.mTitleBar.setRightTextStr(getString(2131755237));
        ArrayList<C9875a> arrayList = (ArrayList) C9812t.m23832j().mo31684h();
        this.f11703b = arrayList;
        Iterator<C9875a> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().mo31963w(false);
        }
        this.mRoomLv.setAdapter(this.f11706e);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
    }
}
