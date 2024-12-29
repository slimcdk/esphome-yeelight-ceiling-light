package com.yeelight.cherry.p141ui.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.base.PrivateMeshDeviceBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import p170i4.C9113d;
import p237z3.C12145e;

/* renamed from: com.yeelight.cherry.ui.activity.MeshDeviceLoginActivity */
public class MeshDeviceLoginActivity extends BaseActivity {

    /* renamed from: g */
    public static final /* synthetic */ int f10770g = 0;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public PrivateMeshDeviceBase f10771a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f10772b = false;

    /* renamed from: c */
    private C12145e f10773c = new C5422a();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C9113d f10774d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f10775e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Handler f10776f = new C5424b(Looper.getMainLooper());

    /* renamed from: com.yeelight.cherry.ui.activity.MeshDeviceLoginActivity$a */
    class C5422a implements C12145e {

        /* renamed from: com.yeelight.cherry.ui.activity.MeshDeviceLoginActivity$a$a */
        class C5423a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f10778a;

            C5423a(int i) {
                this.f10778a = i;
            }

            public void run() {
                String str;
                C9113d dVar;
                MeshDeviceLoginActivity.this.f10776f.removeMessages(1);
                int i = this.f10778a;
                if (i == 536870916) {
                    Intent intent = new Intent(MeshDeviceLoginActivity.this, SelectNetworkActivity.class);
                    intent.putExtra("com.yeelight.cherry.device_id", MeshDeviceLoginActivity.this.getIntent().getStringExtra("com.yeelight.cherry.device_id"));
                    MeshDeviceLoginActivity.this.startActivity(intent);
                    MeshDeviceLoginActivity.this.f10776f.removeMessages(2);
                    MeshDeviceLoginActivity.this.finish();
                } else if (i == 805306372) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("device network - ");
                    sb.append(MeshDeviceLoginActivity.this.f10771a.mo31635V1());
                    if (MeshDeviceLoginActivity.this.f10771a.mo31635V1().getId() == 0) {
                        MeshDeviceLoginActivity.this.f10774d.setTitle((CharSequence) MeshDeviceLoginActivity.this.getResources().getString(2131755540));
                        dVar = MeshDeviceLoginActivity.this.f10774d;
                        str = MeshDeviceLoginActivity.this.getResources().getString(2131755527, new Object[]{MeshDeviceLoginActivity.this.m16575c0()});
                    } else {
                        MeshDeviceLoginActivity.this.f10774d.setTitle((CharSequence) MeshDeviceLoginActivity.this.getResources().getString(2131755541));
                        dVar = MeshDeviceLoginActivity.this.f10774d;
                        str = MeshDeviceLoginActivity.this.getResources().getString(2131755529, new Object[]{MeshDeviceLoginActivity.this.m16575c0()});
                    }
                    dVar.mo37160k(str);
                    MeshDeviceLoginActivity.this.f10776f.removeMessages(2);
                    MeshDeviceLoginActivity.this.f10774d.show();
                }
            }
        }

        C5422a() {
        }

        public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
            MeshDeviceLoginActivity.this.f10776f.postDelayed(new C5423a(i), 100);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshDeviceLoginActivity$b */
    class C5424b extends Handler {
        C5424b(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                if (!MeshDeviceLoginActivity.this.f10772b) {
                    boolean unused = MeshDeviceLoginActivity.this.f10772b = true;
                    if (MeshDeviceLoginActivity.this.f10771a != null) {
                        MeshDeviceLoginActivity.this.f10771a.mo31638Y1(MeshDeviceLoginActivity.this.f10771a.mo31635V1().getNetworkName(), MeshDeviceLoginActivity.this.f10771a.mo31635V1().getPassword());
                        MeshDeviceLoginActivity.this.f10776f.sendEmptyMessageDelayed(1, 2000);
                        return;
                    }
                }
                MeshDeviceLoginActivity.this.f10774d.show();
            } else if (i != 2) {
                return;
            }
            MeshDeviceLoginActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshDeviceLoginActivity$c */
    class C5425c implements DialogInterface.OnClickListener {
        C5425c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent(MeshDeviceLoginActivity.this, AddNetworkActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", MeshDeviceLoginActivity.this.f10775e);
            intent.putExtra("updateMesh", (byte[]) MeshDeviceLoginActivity.this.f10771a.mo31634U1("ADV_MESH_NAME"));
            MeshDeviceLoginActivity.this.startActivity(intent);
            dialogInterface.dismiss();
            MeshDeviceLoginActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshDeviceLoginActivity$d */
    class C5426d implements DialogInterface.OnClickListener {
        C5426d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            MeshDeviceLoginActivity.this.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public String m16575c0() {
        try {
            return new String((byte[]) this.f10771a.mo31634U1("ADV_MESH_NAME"));
        } catch (Exception e) {
            e.printStackTrace();
            return this.f10771a.mo31635V1().getNetworkName();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        String stringExtra = getIntent().getStringExtra("com.yeelight.cherry.device_id");
        this.f10775e = stringExtra;
        this.f10771a = (PrivateMeshDeviceBase) YeelightDeviceManager.m7794j0(stringExtra);
        this.f10774d = new C9113d.C9118e(this).mo37179i(getString(2131755860)).mo37177g(getString(2131755861)).mo37174d(-2, getString(2131755232), new C5426d()).mo37174d(-1, getString(2131755281), new C5425c()).mo37172b();
        PrivateMeshDeviceBase privateMeshDeviceBase = this.f10771a;
        if (privateMeshDeviceBase == null) {
            finish();
        } else if (privateMeshDeviceBase.mo31636W1()) {
            Intent intent = new Intent(this, SelectNetworkActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", getIntent().getStringExtra("com.yeelight.cherry.device_id"));
            startActivity(intent);
            finish();
        } else {
            this.f10771a.mo23178B0(this.f10773c);
            PrivateMeshDeviceBase privateMeshDeviceBase2 = this.f10771a;
            privateMeshDeviceBase2.mo31638Y1(privateMeshDeviceBase2.mo31635V1().getNetworkName(), this.f10771a.mo31635V1().getPassword());
            this.f10776f.sendEmptyMessageDelayed(1, 2000);
            this.f10776f.sendEmptyMessageDelayed(2, 5000);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f10776f.removeMessages(2);
        PrivateMeshDeviceBase privateMeshDeviceBase = this.f10771a;
        if (privateMeshDeviceBase != null) {
            privateMeshDeviceBase.mo23213W0(this.f10773c);
        }
        this.f10774d.dismiss();
    }
}
