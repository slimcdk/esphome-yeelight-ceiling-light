package com.yeelight.yeelib_tasker.p143ui;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.yeelight.yeelib.data.C6043b;
import com.yeelight.yeelib.data.C6065f;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.device.C6119c;
import com.yeelight.yeelib.managers.C8293t;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib_tasker.R$id;
import com.yeelight.yeelib_tasker.R$layout;
import p145d4.C8937a;
import p189n4.C9721a;
import p189n4.C9722b;
import p189n4.C9724c;

/* renamed from: com.yeelight.yeelib_tasker.ui.TaskerDeviceSelectActivity */
public class TaskerDeviceSelectActivity extends BaseActivity {

    /* renamed from: a */
    CommonTitleBar f16386a;

    /* renamed from: b */
    ListView f16387b;

    /* renamed from: c */
    C9721a f16388c;

    /* renamed from: d */
    C9722b f16389d;

    /* renamed from: e */
    C9724c f16390e;

    /* renamed from: f */
    C6065f f16391f;

    /* renamed from: g */
    String f16392g;

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerDeviceSelectActivity$a */
    class C8916a implements View.OnClickListener {
        C8916a() {
        }

        public void onClick(View view) {
            TaskerDeviceSelectActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerDeviceSelectActivity$b */
    class C8917b implements AdapterView.OnItemClickListener {
        C8917b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            StringBuilder sb = new StringBuilder();
            sb.append("tasker device list view, on item clicked: ");
            sb.append(i);
            Intent intent = new Intent();
            TaskerDeviceSelectActivity.this.f16391f.moveToPosition(i);
            C6065f fVar = TaskerDeviceSelectActivity.this.f16391f;
            String string = fVar.getString(fVar.getColumnIndexOrThrow(C6043b.C6044a.C6045a.f12331c));
            intent.putExtra("com.yeelight.cherry.type", "type_device");
            intent.putExtra("com.yeelight.cherry.device_id", string);
            TaskerDeviceSelectActivity.this.setResult(-1, intent);
            TaskerDeviceSelectActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerDeviceSelectActivity$c */
    class C8918c implements AdapterView.OnItemClickListener {
        C8918c() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            StringBuilder sb = new StringBuilder();
            sb.append("tasker device list view, on item clicked: ");
            sb.append(i);
            Intent intent = new Intent();
            String G = ((C6119c) TaskerDeviceSelectActivity.this.f16389d.getItem(i)).mo23185G();
            intent.putExtra("com.yeelight.cherry.type", "type_group");
            intent.putExtra("com.yeelight.cherry.device_id", G);
            TaskerDeviceSelectActivity.this.setResult(-1, intent);
            TaskerDeviceSelectActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerDeviceSelectActivity$d */
    class C8919d implements AdapterView.OnItemClickListener {
        C8919d() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            StringBuilder sb = new StringBuilder();
            sb.append("tasker device list view, on item clicked: ");
            sb.append(i);
            Intent intent = new Intent();
            String n = ((C8937a) TaskerDeviceSelectActivity.this.f16390e.getItem(i)).mo36722n();
            intent.putExtra("com.yeelight.cherry.type", "type_room");
            intent.putExtra("com.yeelight.cherry.device_id", n);
            TaskerDeviceSelectActivity.this.setResult(-1, intent);
            TaskerDeviceSelectActivity.this.finish();
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        ListView listView;
        AdapterView.OnItemClickListener dVar;
        super.onCreate(bundle);
        mo35653P();
        setContentView(R$layout.activity_tasker_device_select);
        this.f16386a = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f16387b = (ListView) findViewById(R$id.device_list);
        LinearLayout linearLayout = (LinearLayout) findViewById(R$id.activity_add_group_layout);
        this.f16386a.mo36195a("Tasker", new C8916a(), (View.OnClickListener) null);
        this.f16386a.setTitleTextSize(16);
        String stringExtra = getIntent().getStringExtra("com.yeelight.cherry.type");
        this.f16392g = stringExtra;
        if (stringExtra.equals("type_device")) {
            this.f16388c = new C9721a(this, (Cursor) null);
            this.f16391f = new C6065f(DeviceDataProvider.m17644z());
            this.f16387b.setAdapter(this.f16388c);
            this.f16388c.changeCursor(this.f16391f);
            listView = this.f16387b;
            dVar = new C8917b();
        } else if (this.f16392g.equals("type_group")) {
            C9722b bVar = new C9722b(YeelightDeviceManager.m7800o0().mo23292h0());
            this.f16389d = bVar;
            this.f16387b.setAdapter(bVar);
            listView = this.f16387b;
            dVar = new C8918c();
        } else if (this.f16392g.equals("type_room")) {
            C9724c cVar = new C9724c(C8293t.m19620n().mo35255o());
            this.f16390e = cVar;
            this.f16387b.setAdapter(cVar);
            listView = this.f16387b;
            dVar = new C8919d();
        } else {
            return;
        }
        listView.setOnItemClickListener(dVar);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C6065f fVar = this.f16391f;
        if (fVar != null) {
            fVar.close();
        }
        mo35652M(this);
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
