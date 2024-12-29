package com.yeelight.cherry.p141ui.activity;

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
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.device.C6169f;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.managers.C8293t;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.appwidget.YeelightRoomWidgetProvider;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import java.util.ArrayList;
import java.util.Iterator;
import p051j4.C9193k;
import p145d4.C8937a;

/* renamed from: com.yeelight.cherry.ui.activity.RoomWidgetSettingActivity */
public class RoomWidgetSettingActivity extends BaseActivity {

    /* renamed from: e */
    public static final /* synthetic */ int f11272e = 0;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ArrayList<C8937a> f11273a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f11274b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f11275c;

    /* renamed from: d */
    BaseAdapter f11276d = new C5635c();
    @BindView(2131297102)
    ListView mRoomLv;
    @BindView(2131297591)
    CommonTitleBar mTitleBar;

    /* renamed from: com.yeelight.cherry.ui.activity.RoomWidgetSettingActivity$a */
    class C5633a implements View.OnClickListener {
        C5633a() {
        }

        public void onClick(View view) {
            RoomWidgetSettingActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.RoomWidgetSettingActivity$b */
    class C5634b implements View.OnClickListener {
        C5634b() {
        }

        public void onClick(View view) {
            DeviceDataProvider.m17624f(RoomWidgetSettingActivity.this.f11274b, String.valueOf(RoomWidgetSettingActivity.this.f11275c));
            Intent intent = new Intent();
            intent.setAction("widget_on_click_room");
            intent.setClass(C3108x.f4951e, YeelightRoomWidgetProvider.class);
            intent.putExtra("extra_name_widget_action", "room_widget_add_room_success");
            intent.putExtra("extra_name_widget_data", RoomWidgetSettingActivity.this.f11274b);
            intent.putExtra("room_widget_extra_key_widget_id", RoomWidgetSettingActivity.this.f11275c);
            C3108x.f4951e.sendBroadcast(intent);
            RoomWidgetSettingActivity.this.moveTaskToBack(true);
            RoomWidgetSettingActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.RoomWidgetSettingActivity$c */
    class C5635c extends BaseAdapter {

        /* renamed from: com.yeelight.cherry.ui.activity.RoomWidgetSettingActivity$c$a */
        class C5636a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C8937a f11280a;

            /* renamed from: b */
            final /* synthetic */ C5637d f11281b;

            C5636a(C8937a aVar, C5637d dVar) {
                this.f11280a = aVar;
                this.f11281b = dVar;
            }

            public void onClick(View view) {
                RoomWidgetSettingActivity roomWidgetSettingActivity;
                String n;
                if (this.f11280a.mo36727s()) {
                    this.f11280a.mo36732w(false);
                    this.f11281b.f11285c.setChecked(false);
                    roomWidgetSettingActivity = RoomWidgetSettingActivity.this;
                    n = "";
                } else {
                    Iterator it = RoomWidgetSettingActivity.this.f11273a.iterator();
                    while (it.hasNext()) {
                        ((C8937a) it.next()).mo36732w(false);
                    }
                    C5635c.this.notifyDataSetChanged();
                    this.f11280a.mo36732w(true);
                    this.f11281b.f11285c.setChecked(true);
                    roomWidgetSettingActivity = RoomWidgetSettingActivity.this;
                    n = this.f11280a.mo36722n();
                }
                String unused = roomWidgetSettingActivity.f11274b = n;
            }
        }

        C5635c() {
        }

        /* renamed from: a */
        public C8937a getItem(int i) {
            if (RoomWidgetSettingActivity.this.f11273a == null || RoomWidgetSettingActivity.this.f11273a.size() <= i || i < 0) {
                return null;
            }
            return (C8937a) RoomWidgetSettingActivity.this.f11273a.get(i);
        }

        public int getCount() {
            return RoomWidgetSettingActivity.this.f11273a.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C5637d dVar;
            if (view != null) {
                dVar = (C5637d) view.getTag();
            } else {
                view = View.inflate(RoomWidgetSettingActivity.this, C12228R$layout.list_item_room_widget_edit, (ViewGroup) null);
                dVar = new C5637d(RoomWidgetSettingActivity.this, view);
                view.setTag(dVar);
            }
            C8937a a = getItem(i);
            if (a != null) {
                C6169f J0 = YeelightDeviceManager.m7800o0().mo23268J0(a.mo36722n());
                if (J0 != null) {
                    dVar.f11283a.setImageResource(J0.mo31873a2());
                }
                dVar.f11284b.setText(a.mo36723o());
                dVar.f11285c.setChecked(a.mo36727s());
                view.setOnClickListener(new C5636a(a, dVar));
            }
            return view;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.RoomWidgetSettingActivity$d */
    class C5637d extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f11283a;

        /* renamed from: b */
        TextView f11284b;

        /* renamed from: c */
        CheckBox f11285c;

        public C5637d(RoomWidgetSettingActivity roomWidgetSettingActivity, View view) {
            super(view);
            this.f11283a = (ImageView) view.findViewById(C12225R$id.room_img);
            this.f11284b = (TextView) view.findViewById(C12225R$id.room_name);
            this.f11285c = (CheckBox) view.findViewById(C12225R$id.room_checkbox);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_room_widget_edit);
        ButterKnife.bind((Activity) this);
        if (getIntent() != null) {
            this.f11275c = getIntent().getIntExtra("com.yeelight.cherry.widget_id", 0);
        }
        this.mTitleBar.setRightButtonResource(2131231991);
        this.mTitleBar.mo36195a(getString(2131755073), new C5633a(), new C5634b());
        this.mTitleBar.setTitleTextSize(17);
        this.mTitleBar.setRightTextVisible(true);
        this.mTitleBar.setRightTextColor(ContextCompat.getColor(this, 2131099842));
        this.mTitleBar.setRightTextStr(getString(2131755240));
        ArrayList<C8937a> arrayList = (ArrayList) C8293t.m19620n().mo35254m();
        this.f11273a = arrayList;
        Iterator<C8937a> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().mo36732w(false);
        }
        this.mRoomLv.setAdapter(this.f11276d);
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
