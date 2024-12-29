package com.yeelight.yeelib.p142ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.service.ShortcutUtils;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C9193k;

/* renamed from: com.yeelight.yeelib.ui.activity.AddShortcutActivity */
public class AddShortcutActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final String f14415i = "AddShortcutActivity";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C3012e f14416a;

    /* renamed from: b */
    ProgressBar f14417b;

    /* renamed from: c */
    ProgressBar f14418c;

    /* renamed from: d */
    ProgressBar f14419d;

    /* renamed from: e */
    CommonTitleBar f14420e;

    /* renamed from: f */
    LinearLayout f14421f;

    /* renamed from: g */
    LinearLayout f14422g;

    /* renamed from: h */
    LinearLayout f14423h;

    /* renamed from: com.yeelight.yeelib.ui.activity.AddShortcutActivity$a */
    class C8357a implements Runnable {
        C8357a() {
        }

        public void run() {
            if (!AddShortcutActivity.this.isFinishing()) {
                Toast.makeText(AddShortcutActivity.this, R$string.toast_add_shortcut_scene, 0).show();
                AddShortcutActivity.this.f14418c.setVisibility(8);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.AddShortcutActivity$b */
    class C8358b implements View.OnClickListener {
        C8358b() {
        }

        public void onClick(View view) {
            AddShortcutActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.AddShortcutActivity$c */
    class C8359c implements View.OnClickListener {
        C8359c() {
        }

        public void onClick(View view) {
            String unused = AddShortcutActivity.f14415i;
            AddShortcutActivity.this.mo35641X(ShortcutUtils.SHORTCUT_TYPE_TOGGLE, (String) null);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.AddShortcutActivity$d */
    class C8360d implements View.OnClickListener {
        C8360d() {
        }

        public void onClick(View view) {
            String unused = AddShortcutActivity.f14415i;
            AddShortcutActivity.this.mo35641X(ShortcutUtils.SHORTCUT_TYPE_DIMMER, (String) null);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.AddShortcutActivity$e */
    class C8361e implements View.OnClickListener {
        C8361e() {
        }

        public void onClick(View view) {
            String unused = AddShortcutActivity.f14415i;
            Intent intent = new Intent(AddShortcutActivity.this, SceneActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", AddShortcutActivity.this.f14416a.mo23185G());
            intent.putExtra("start_for_result", true);
            AddShortcutActivity.this.startActivityForResult(intent, 1);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.AddShortcutActivity$f */
    class C8362f implements Runnable {
        C8362f() {
        }

        public void run() {
            if (!AddShortcutActivity.this.isFinishing()) {
                AddShortcutActivity.this.f14417b.setVisibility(8);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.AddShortcutActivity$g */
    class C8363g implements Runnable {
        C8363g() {
        }

        public void run() {
            if (!AddShortcutActivity.this.isFinishing()) {
                AddShortcutActivity.this.f14419d.setVisibility(8);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.AddShortcutActivity$h */
    class C8364h implements Runnable {
        C8364h() {
        }

        public void run() {
            if (!AddShortcutActivity.this.isFinishing()) {
                AddShortcutActivity.this.f14418c.setVisibility(8);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.AddShortcutActivity$i */
    class C8365i implements Runnable {
        C8365i() {
        }

        public void run() {
            if (!AddShortcutActivity.this.isFinishing()) {
                Toast.makeText(AddShortcutActivity.this, R$string.toast_add_shortcut_toggle, 0).show();
                AddShortcutActivity.this.f14417b.setVisibility(8);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.AddShortcutActivity$j */
    class C8366j implements Runnable {
        C8366j() {
        }

        public void run() {
            if (!AddShortcutActivity.this.isFinishing()) {
                Toast.makeText(AddShortcutActivity.this, R$string.toast_add_shortcut_dimmer, 0).show();
                AddShortcutActivity.this.f14419d.setVisibility(8);
            }
        }
    }

    /* renamed from: Y */
    private void m19942Y() {
        this.f14421f = (LinearLayout) findViewById(R$id.layout_toggle);
        this.f14422g = (LinearLayout) findViewById(R$id.layout_dimmer);
        this.f14423h = (LinearLayout) findViewById(R$id.layout_scene);
        this.f14421f.setOnClickListener(new C8359c());
        this.f14422g.setOnClickListener(new C8360d());
        this.f14423h.setOnClickListener(new C8361e());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x030f  */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35641X(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.lang.Class<com.yeelight.yeelib.ui.activity.ShortcutIntentHandlingActivity> r3 = com.yeelight.yeelib.p142ui.activity.ShortcutIntentHandlingActivity.class
            com.yeelight.yeelib.device.base.e r4 = r0.f14416a
            boolean r5 = r4 instanceof com.yeelight.yeelib.device.C6169f
            if (r5 == 0) goto L_0x0011
            java.lang.String r4 = "type_room"
            goto L_0x001a
        L_0x0011:
            boolean r4 = r4 instanceof com.yeelight.yeelib.device.C6119c
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "type_group"
            goto L_0x001a
        L_0x0018:
            java.lang.String r4 = "type_device"
        L_0x001a:
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 26
            java.lang.String r7 = "com.yeelight.cherry.shortcut.action_param"
            java.lang.String r8 = "com.yeelight.cherry.shortcut.action_type"
            java.lang.String r9 = "com.yeelight.cherry.shortcut.device_id"
            java.lang.String r10 = "com.yeelight.cherry.type"
            java.lang.String r12 = "com.yeelight.cherry.action.shortcut"
            java.lang.String r14 = "com.yeelight.cherry.action.toggle"
            java.lang.String r13 = "com.yeelight.cherry.action.scene"
            java.lang.String r15 = "com.yeelight.cherry.action.dimmer"
            r16 = -1
            java.lang.String r11 = "-"
            r17 = r7
            r18 = r8
            r7 = 0
            if (r5 < r6) goto L_0x01ea
            java.lang.Class<android.content.pm.ShortcutManager> r5 = android.content.pm.ShortcutManager.class
            java.lang.Object r5 = r0.getSystemService(r5)
            android.content.pm.ShortcutManager r5 = (android.content.pm.ShortcutManager) r5
            boolean r6 = r5.isRequestPinShortcutSupported()
            if (r6 != 0) goto L_0x0051
            int r1 = com.yeelight.yeelib.R$string.toast_pin_shortcut_not_supported
            android.widget.Toast r1 = android.widget.Toast.makeText(r0, r1, r7)
            r1.show()
            return
        L_0x0051:
            r20.hashCode()
            int r6 = r20.hashCode()
            switch(r6) {
                case -518563015: goto L_0x006f;
                case -141608763: goto L_0x0066;
                case -55139781: goto L_0x005d;
                default: goto L_0x005b;
            }
        L_0x005b:
            r13 = -1
            goto L_0x0077
        L_0x005d:
            boolean r6 = r1.equals(r14)
            if (r6 != 0) goto L_0x0064
            goto L_0x005b
        L_0x0064:
            r13 = 2
            goto L_0x0077
        L_0x0066:
            boolean r6 = r1.equals(r13)
            if (r6 != 0) goto L_0x006d
            goto L_0x005b
        L_0x006d:
            r13 = 1
            goto L_0x0077
        L_0x006f:
            boolean r6 = r1.equals(r15)
            if (r6 != 0) goto L_0x0076
            goto L_0x005b
        L_0x0076:
            r13 = 0
        L_0x0077:
            r6 = 0
            switch(r13) {
                case 0: goto L_0x0159;
                case 1: goto L_0x00e0;
                case 2: goto L_0x007e;
                default: goto L_0x007b;
            }
        L_0x007b:
            r8 = r6
            goto L_0x01b6
        L_0x007e:
            android.content.pm.ShortcutInfo$Builder r8 = new android.content.pm.ShortcutInfo$Builder
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            com.yeelight.yeelib.device.base.e r14 = r0.f14416a
            java.lang.String r14 = r14.mo23185G()
            r13.append(r14)
            java.lang.String r14 = "_toggle"
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r8.<init>(r0, r13)
            com.yeelight.yeelib.device.base.e r13 = r0.f14416a
            java.lang.String r13 = r13.mo23210U()
            r8.setShortLabel(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            com.yeelight.yeelib.device.base.e r14 = r0.f14416a
            java.lang.String r14 = r14.mo23210U()
            r13.append(r14)
            r13.append(r11)
            int r11 = com.yeelight.yeelib.R$string.common_text_switch_on_off
            java.lang.String r11 = r0.getString(r11)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            r8.setLongLabel(r11)
            int r11 = com.yeelight.yeelib.R$drawable.icon_shortcut_toggle
            android.graphics.drawable.Icon r11 = android.graphics.drawable.Icon.createWithResource(r0, r11)
            r8.setIcon(r11)
            android.widget.ProgressBar r11 = r0.f14417b
            r11.setVisibility(r7)
            android.widget.ProgressBar r7 = r0.f14417b
            com.yeelight.yeelib.ui.activity.AddShortcutActivity$f r11 = new com.yeelight.yeelib.ui.activity.AddShortcutActivity$f
            r11.<init>()
        L_0x00d9:
            r13 = 800(0x320, double:3.953E-321)
            r7.postDelayed(r11, r13)
            goto L_0x01b6
        L_0x00e0:
            com.yeelight.yeelib.models.v r8 = com.yeelight.yeelib.models.C3112v.m8242u()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r21)
            int r13 = r13.intValue()
            com.yeelight.yeelib.device.base.e r14 = r0.f14416a
            java.lang.String r14 = r14.mo23144i1()
            com.yeelight.yeelib.models.s r8 = r8.mo23567s(r13, r14)
            android.content.pm.ShortcutInfo$Builder r13 = new android.content.pm.ShortcutInfo$Builder
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            com.yeelight.yeelib.device.base.e r15 = r0.f14416a
            java.lang.String r15 = r15.mo23185G()
            r14.append(r15)
            java.lang.String r15 = "_scene_"
            r14.append(r15)
            r14.append(r2)
            java.lang.String r14 = r14.toString()
            r13.<init>(r0, r14)
            com.yeelight.yeelib.device.base.e r14 = r0.f14416a
            java.lang.String r14 = r14.mo23210U()
            r13.setShortLabel(r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            com.yeelight.yeelib.device.base.e r15 = r0.f14416a
            java.lang.String r15 = r15.mo23210U()
            r14.append(r15)
            r14.append(r11)
            java.lang.String r8 = r8.mo35450q()
            r14.append(r8)
            java.lang.String r8 = r14.toString()
            r13.setLongLabel(r8)
            int r8 = com.yeelight.yeelib.R$drawable.icon_shortcut_scene
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithResource(r0, r8)
            r13.setIcon(r8)
            android.widget.ProgressBar r8 = r0.f14418c
            r8.setVisibility(r7)
            android.widget.ProgressBar r7 = r0.f14418c
            com.yeelight.yeelib.ui.activity.AddShortcutActivity$h r8 = new com.yeelight.yeelib.ui.activity.AddShortcutActivity$h
            r8.<init>()
            r14 = 800(0x320, double:3.953E-321)
            r7.postDelayed(r8, r14)
            r8 = r13
            goto L_0x01b6
        L_0x0159:
            android.content.pm.ShortcutInfo$Builder r8 = new android.content.pm.ShortcutInfo$Builder
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            com.yeelight.yeelib.device.base.e r14 = r0.f14416a
            java.lang.String r14 = r14.mo23185G()
            r13.append(r14)
            java.lang.String r14 = "_dimmer"
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r8.<init>(r0, r13)
            com.yeelight.yeelib.device.base.e r13 = r0.f14416a
            java.lang.String r13 = r13.mo23210U()
            r8.setShortLabel(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            com.yeelight.yeelib.device.base.e r14 = r0.f14416a
            java.lang.String r14 = r14.mo23210U()
            r13.append(r14)
            r13.append(r11)
            int r11 = com.yeelight.yeelib.R$string.common_text_bright
            java.lang.String r11 = r0.getString(r11)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            r8.setLongLabel(r11)
            int r11 = com.yeelight.yeelib.R$drawable.icon_shortcut_dimmer
            android.graphics.drawable.Icon r11 = android.graphics.drawable.Icon.createWithResource(r0, r11)
            r8.setIcon(r11)
            android.widget.ProgressBar r11 = r0.f14419d
            r11.setVisibility(r7)
            android.widget.ProgressBar r7 = r0.f14419d
            com.yeelight.yeelib.ui.activity.AddShortcutActivity$g r11 = new com.yeelight.yeelib.ui.activity.AddShortcutActivity$g
            r11.<init>()
            goto L_0x00d9
        L_0x01b6:
            if (r8 != 0) goto L_0x01b9
            return
        L_0x01b9:
            android.content.Intent r7 = new android.content.Intent
            r7.<init>(r0, r3)
            r7.setAction(r12)
            r3 = 1476395008(0x58000000, float:5.6294995E14)
            r7.setFlags(r3)
            r7.putExtra(r10, r4)
            com.yeelight.yeelib.device.base.e r3 = r0.f14416a
            java.lang.String r3 = r3.mo23185G()
            r7.putExtra(r9, r3)
            r3 = r18
            r7.putExtra(r3, r1)
            if (r2 == 0) goto L_0x01de
            r1 = r17
            r7.putExtra(r1, r2)
        L_0x01de:
            r8.setIntent(r7)
            android.content.pm.ShortcutInfo r1 = r8.build()
            r5.requestPinShortcut(r1, r6)
            goto L_0x031c
        L_0x01ea:
            r5 = r17
            r6 = r18
            android.content.Intent r8 = new android.content.Intent
            java.lang.String r7 = "com.android.launcher.action.INSTALL_SHORTCUT"
            r8.<init>(r7)
            java.lang.String r7 = "duplicate"
            r18 = r5
            r5 = 0
            r8.putExtra(r7, r5)
            r20.hashCode()
            int r5 = r20.hashCode()
            switch(r5) {
                case -518563015: goto L_0x021b;
                case -141608763: goto L_0x0212;
                case -55139781: goto L_0x0209;
                default: goto L_0x0207;
            }
        L_0x0207:
            r13 = -1
            goto L_0x0223
        L_0x0209:
            boolean r5 = r1.equals(r14)
            if (r5 != 0) goto L_0x0210
            goto L_0x0207
        L_0x0210:
            r13 = 2
            goto L_0x0223
        L_0x0212:
            boolean r5 = r1.equals(r13)
            if (r5 != 0) goto L_0x0219
            goto L_0x0207
        L_0x0219:
            r13 = 1
            goto L_0x0223
        L_0x021b:
            boolean r5 = r1.equals(r15)
            if (r5 != 0) goto L_0x0222
            goto L_0x0207
        L_0x0222:
            r13 = 0
        L_0x0223:
            java.lang.String r5 = "android.intent.extra.shortcut.ICON_RESOURCE"
            java.lang.String r7 = "android.intent.extra.shortcut.NAME"
            switch(r13) {
                case 0: goto L_0x02b8;
                case 1: goto L_0x026a;
                case 2: goto L_0x022c;
                default: goto L_0x022a;
            }
        L_0x022a:
            goto L_0x02f1
        L_0x022c:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            com.yeelight.yeelib.device.base.e r14 = r0.f14416a
            java.lang.String r14 = r14.mo23210U()
            r13.append(r14)
            r13.append(r11)
            int r11 = com.yeelight.yeelib.R$string.common_text_switch_on_off
            java.lang.String r11 = r0.getString(r11)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            r8.putExtra(r7, r11)
            int r7 = com.yeelight.yeelib.R$drawable.icon_shortcut_toggle
            android.content.Intent$ShortcutIconResource r7 = android.content.Intent.ShortcutIconResource.fromContext(r0, r7)
            r8.putExtra(r5, r7)
            android.widget.ProgressBar r5 = r0.f14417b
            r7 = 0
            r5.setVisibility(r7)
            android.widget.ProgressBar r5 = r0.f14417b
            com.yeelight.yeelib.ui.activity.AddShortcutActivity$i r7 = new com.yeelight.yeelib.ui.activity.AddShortcutActivity$i
            r7.<init>()
        L_0x0263:
            r13 = 800(0x320, double:3.953E-321)
            r5.postDelayed(r7, r13)
            goto L_0x02f1
        L_0x026a:
            com.yeelight.yeelib.models.v r11 = com.yeelight.yeelib.models.C3112v.m8242u()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r21)
            int r13 = r13.intValue()
            com.yeelight.yeelib.device.base.e r14 = r0.f14416a
            java.lang.String r14 = r14.mo23144i1()
            com.yeelight.yeelib.models.s r11 = r11.mo23567s(r13, r14)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            com.yeelight.yeelib.device.base.e r14 = r0.f14416a
            java.lang.String r14 = r14.mo23210U()
            r13.append(r14)
            r14 = 45
            r13.append(r14)
            java.lang.String r11 = r11.mo35450q()
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            r8.putExtra(r7, r11)
            int r7 = com.yeelight.yeelib.R$drawable.icon_shortcut_scene
            android.content.Intent$ShortcutIconResource r7 = android.content.Intent.ShortcutIconResource.fromContext(r0, r7)
            r8.putExtra(r5, r7)
            android.widget.ProgressBar r5 = r0.f14418c
            r7 = 0
            r5.setVisibility(r7)
            android.widget.ProgressBar r5 = r0.f14418c
            com.yeelight.yeelib.ui.activity.AddShortcutActivity$a r7 = new com.yeelight.yeelib.ui.activity.AddShortcutActivity$a
            r7.<init>()
            goto L_0x0263
        L_0x02b8:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            com.yeelight.yeelib.device.base.e r14 = r0.f14416a
            java.lang.String r14 = r14.mo23210U()
            r13.append(r14)
            r13.append(r11)
            int r11 = com.yeelight.yeelib.R$string.common_text_bright
            java.lang.String r11 = r0.getString(r11)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            r8.putExtra(r7, r11)
            int r7 = com.yeelight.yeelib.R$drawable.icon_shortcut_dimmer
            android.content.Intent$ShortcutIconResource r7 = android.content.Intent.ShortcutIconResource.fromContext(r0, r7)
            r8.putExtra(r5, r7)
            android.widget.ProgressBar r5 = r0.f14419d
            r7 = 0
            r5.setVisibility(r7)
            android.widget.ProgressBar r5 = r0.f14419d
            com.yeelight.yeelib.ui.activity.AddShortcutActivity$j r7 = new com.yeelight.yeelib.ui.activity.AddShortcutActivity$j
            r7.<init>()
            goto L_0x0263
        L_0x02f1:
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r0, r3)
            r5.setAction(r12)
            r3 = 1476395008(0x58000000, float:5.6294995E14)
            r5.setFlags(r3)
            r5.putExtra(r10, r4)
            com.yeelight.yeelib.device.base.e r3 = r0.f14416a
            java.lang.String r3 = r3.mo23185G()
            r5.putExtra(r9, r3)
            r5.putExtra(r6, r1)
            if (r2 == 0) goto L_0x0314
            r1 = r18
            r5.putExtra(r1, r2)
        L_0x0314:
            java.lang.String r1 = "android.intent.extra.shortcut.INTENT"
            r8.putExtra(r1, r5)
            r0.sendBroadcast(r8)
        L_0x031c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p142ui.activity.AddShortcutActivity.mo35641X(java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            int intExtra = intent.getIntExtra("scene", -1);
            StringBuilder sb = new StringBuilder();
            sb.append("AddShortcutActivity, onActivityResult, scene id: ");
            sb.append(intExtra);
            if (intExtra != -1) {
                mo35641X(ShortcutUtils.SHORTCUT_TYPE_SCENE, String.valueOf(intExtra));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        setContentView(R$layout.activity_add_short_cut);
        this.f14417b = (ProgressBar) findViewById(R$id.progress_toggle);
        this.f14418c = (ProgressBar) findViewById(R$id.progress_scene);
        this.f14419d = (ProgressBar) findViewById(R$id.progress_dimmer);
        C9193k.m22157h(true, this);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f14415i, "Activity has not device id", false);
            finish();
            return;
        }
        C3012e r0 = YeelightDeviceManager.m7804r0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f14416a = r0;
        if (r0 == null) {
            finish();
            return;
        }
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f14420e = commonTitleBar;
        commonTitleBar.mo36195a(getString(R$string.feature_add_shortcut), new C8358b(), (View.OnClickListener) null);
        this.f14420e.setTitleTextSize(16);
        m19942Y();
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
