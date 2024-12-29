package com.yeelight.yeelib_tasker.p196ui;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.yeelight.yeelib.data.C7579c;
import com.yeelight.yeelib.data.C7601g;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.p150c.C5980c;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C9812t;
import com.yeelight.yeelib.p190i.C9875a;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib_tasker.R$id;
import com.yeelight.yeelib_tasker.R$layout;
import com.yeelight.yeelib_tasker.p196ui.p197a.C10602a;
import com.yeelight.yeelib_tasker.p196ui.p197a.C10603b;
import com.yeelight.yeelib_tasker.p196ui.p197a.C10605c;

/* renamed from: com.yeelight.yeelib_tasker.ui.TaskerDeviceSelectActivity */
public class TaskerDeviceSelectActivity extends BaseActivity {

    /* renamed from: b */
    CommonTitleBar f20242b;

    /* renamed from: c */
    ListView f20243c;

    /* renamed from: d */
    C10602a f20244d;

    /* renamed from: e */
    C10603b f20245e;

    /* renamed from: f */
    C10605c f20246f;

    /* renamed from: g */
    C7601g f20247g;

    /* renamed from: h */
    String f20248h;

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerDeviceSelectActivity$a */
    class C10588a implements View.OnClickListener {
        C10588a() {
        }

        public void onClick(View view) {
            TaskerDeviceSelectActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerDeviceSelectActivity$b */
    class C10589b implements AdapterView.OnItemClickListener {
        C10589b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            "tasker device list view, on item clicked: " + i;
            Intent intent = new Intent();
            TaskerDeviceSelectActivity.this.f20247g.moveToPosition(i);
            C7601g gVar = TaskerDeviceSelectActivity.this.f20247g;
            String string = gVar.getString(gVar.getColumnIndexOrThrow(C7579c.C7580a.C7581a.f15372c));
            intent.putExtra("com.yeelight.cherry.type", "type_device");
            intent.putExtra("com.yeelight.cherry.device_id", string);
            TaskerDeviceSelectActivity.this.setResult(-1, intent);
            TaskerDeviceSelectActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerDeviceSelectActivity$c */
    class C10590c implements AdapterView.OnItemClickListener {
        C10590c() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            "tasker device list view, on item clicked: " + i;
            Intent intent = new Intent();
            String G = ((C5980c) TaskerDeviceSelectActivity.this.f20245e.getItem(i)).mo23372G();
            intent.putExtra("com.yeelight.cherry.type", "type_group");
            intent.putExtra("com.yeelight.cherry.device_id", G);
            TaskerDeviceSelectActivity.this.setResult(-1, intent);
            TaskerDeviceSelectActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerDeviceSelectActivity$d */
    class C10591d implements AdapterView.OnItemClickListener {
        C10591d() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            "tasker device list view, on item clicked: " + i;
            Intent intent = new Intent();
            String n = ((C9875a) TaskerDeviceSelectActivity.this.f20246f.getItem(i)).mo31953n();
            intent.putExtra("com.yeelight.cherry.type", "type_room");
            intent.putExtra("com.yeelight.cherry.device_id", n);
            TaskerDeviceSelectActivity.this.setResult(-1, intent);
            TaskerDeviceSelectActivity.this.finish();
        }
    }

    static {
        Class<TaskerDeviceSelectActivity> cls = TaskerDeviceSelectActivity.class;
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        ListView listView;
        AdapterView.OnItemClickListener dVar;
        super.onCreate(bundle);
        mo32193P();
        setContentView(R$layout.activity_tasker_device_select);
        this.f20242b = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f20243c = (ListView) findViewById(R$id.device_list);
        LinearLayout linearLayout = (LinearLayout) findViewById(R$id.activity_add_group_layout);
        this.f20242b.mo32825a("Tasker", new C10588a(), (View.OnClickListener) null);
        this.f20242b.setTitleTextSize(16);
        String stringExtra = getIntent().getStringExtra("com.yeelight.cherry.type");
        this.f20248h = stringExtra;
        if (stringExtra.equals("type_device")) {
            this.f20244d = new C10602a(this, (Cursor) null);
            this.f20247g = new C7601g(DeviceDataProvider.m22422z());
            this.f20243c.setAdapter(this.f20244d);
            this.f20244d.changeCursor(this.f20247g);
            listView = this.f20243c;
            dVar = new C10589b();
        } else if (this.f20248h.equals("type_group")) {
            C10603b bVar = new C10603b(C4257w.m11947l0().mo23666f0());
            this.f20245e = bVar;
            this.f20243c.setAdapter(bVar);
            listView = this.f20243c;
            dVar = new C10590c();
        } else if (this.f20248h.equals("type_room")) {
            C10605c cVar = new C10605c(C9812t.m23832j().mo31685k());
            this.f20246f = cVar;
            this.f20243c.setAdapter(cVar);
            listView = this.f20243c;
            dVar = new C10591d();
        } else {
            return;
        }
        listView.setOnItemClickListener(dVar);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C7601g gVar = this.f20247g;
        if (gVar != null) {
            gVar.close();
        }
        mo32192M(this);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }
}
