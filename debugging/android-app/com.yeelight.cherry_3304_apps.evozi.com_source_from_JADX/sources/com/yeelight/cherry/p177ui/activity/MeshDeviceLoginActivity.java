package com.yeelight.cherry.p177ui.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6047m;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.widget.C10526e;

/* renamed from: com.yeelight.cherry.ui.activity.MeshDeviceLoginActivity */
public class MeshDeviceLoginActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C6047m f11204b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f11205c = false;

    /* renamed from: d */
    private C9770e f11206d = new C5376a();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C10526e f11207e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f11208f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Handler f11209g = new C5378b(Looper.getMainLooper());

    /* renamed from: com.yeelight.cherry.ui.activity.MeshDeviceLoginActivity$a */
    class C5376a implements C9770e {

        /* renamed from: com.yeelight.cherry.ui.activity.MeshDeviceLoginActivity$a$a */
        class C5377a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f11211a;

            C5377a(int i) {
                this.f11211a = i;
            }

            public void run() {
                String str;
                C10526e eVar;
                MeshDeviceLoginActivity.this.f11209g.removeMessages(1);
                int i = this.f11211a;
                if (i == 536870916) {
                    Intent intent = new Intent(MeshDeviceLoginActivity.this, SelectNetworkActivity.class);
                    intent.putExtra("com.yeelight.cherry.device_id", MeshDeviceLoginActivity.this.getIntent().getStringExtra("com.yeelight.cherry.device_id"));
                    MeshDeviceLoginActivity.this.startActivity(intent);
                    MeshDeviceLoginActivity.this.f11209g.removeMessages(2);
                    MeshDeviceLoginActivity.this.finish();
                } else if (i == 805306372) {
                    "device network - " + MeshDeviceLoginActivity.this.f11204b.mo27805V1();
                    if (MeshDeviceLoginActivity.this.f11204b.mo27805V1().mo31820a() == 0) {
                        MeshDeviceLoginActivity.this.f11207e.setTitle((CharSequence) MeshDeviceLoginActivity.this.getResources().getString(2131755536));
                        eVar = MeshDeviceLoginActivity.this.f11207e;
                        str = MeshDeviceLoginActivity.this.getResources().getString(2131755523, new Object[]{MeshDeviceLoginActivity.this.m16619c0()});
                    } else {
                        MeshDeviceLoginActivity.this.f11207e.setTitle((CharSequence) MeshDeviceLoginActivity.this.getResources().getString(2131755537));
                        eVar = MeshDeviceLoginActivity.this.f11207e;
                        str = MeshDeviceLoginActivity.this.getResources().getString(2131755525, new Object[]{MeshDeviceLoginActivity.this.m16619c0()});
                    }
                    eVar.mo33339k(str);
                    MeshDeviceLoginActivity.this.f11209g.removeMessages(2);
                    MeshDeviceLoginActivity.this.f11207e.show();
                }
            }
        }

        C5376a() {
        }

        public void onStatusChange(int i, C6024e eVar) {
            MeshDeviceLoginActivity.this.f11209g.postDelayed(new C5377a(i), 100);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshDeviceLoginActivity$b */
    class C5378b extends Handler {
        C5378b(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                if (!MeshDeviceLoginActivity.this.f11205c) {
                    boolean unused = MeshDeviceLoginActivity.this.f11205c = true;
                    if (MeshDeviceLoginActivity.this.f11204b != null) {
                        MeshDeviceLoginActivity.this.f11204b.mo27808Y1(MeshDeviceLoginActivity.this.f11204b.mo27805V1().mo31822c(), MeshDeviceLoginActivity.this.f11204b.mo27805V1().mo31823d());
                        MeshDeviceLoginActivity.this.f11209g.sendEmptyMessageDelayed(1, 2000);
                        return;
                    }
                }
                MeshDeviceLoginActivity.this.f11207e.show();
            } else if (i != 2) {
                return;
            }
            MeshDeviceLoginActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshDeviceLoginActivity$c */
    class C5379c implements DialogInterface.OnClickListener {
        C5379c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent(MeshDeviceLoginActivity.this, AddNetworkActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", MeshDeviceLoginActivity.this.f11208f);
            intent.putExtra("updateMesh", (byte[]) MeshDeviceLoginActivity.this.f11204b.mo27804U1("ADV_MESH_NAME"));
            MeshDeviceLoginActivity.this.startActivity(intent);
            dialogInterface.dismiss();
            MeshDeviceLoginActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshDeviceLoginActivity$d */
    class C5380d implements DialogInterface.OnClickListener {
        C5380d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            MeshDeviceLoginActivity.this.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public String m16619c0() {
        try {
            return new String((byte[]) this.f11204b.mo27804U1("ADV_MESH_NAME"));
        } catch (Exception e) {
            e.printStackTrace();
            return this.f11204b.mo27805V1().mo31822c();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        String stringExtra = getIntent().getStringExtra("com.yeelight.cherry.device_id");
        this.f11208f = stringExtra;
        this.f11204b = (C6047m) C4257w.m11945h0(stringExtra);
        C10526e.C10531e eVar = new C10526e.C10531e(this);
        eVar.mo33358i(getString(2131755850));
        eVar.mo33356g(getString(2131755851));
        eVar.mo33353d(-2, getString(2131755229), new C5380d());
        eVar.mo33353d(-1, getString(2131755277), new C5379c());
        this.f11207e = eVar.mo33351b();
        C6047m mVar = this.f11204b;
        if (mVar == null) {
            finish();
        } else if (mVar.mo27806W1()) {
            Intent intent = new Intent(this, SelectNetworkActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", getIntent().getStringExtra("com.yeelight.cherry.device_id"));
            startActivity(intent);
            finish();
        } else {
            this.f11204b.mo23365B0(this.f11206d);
            C6047m mVar2 = this.f11204b;
            mVar2.mo27808Y1(mVar2.mo27805V1().mo31822c(), this.f11204b.mo27805V1().mo31823d());
            this.f11209g.sendEmptyMessageDelayed(1, 2000);
            this.f11209g.sendEmptyMessageDelayed(2, 5000);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f11209g.removeMessages(2);
        C6047m mVar = this.f11204b;
        if (mVar != null) {
            mVar.mo23400W0(this.f11206d);
        }
        this.f11207e.dismiss();
    }
}
