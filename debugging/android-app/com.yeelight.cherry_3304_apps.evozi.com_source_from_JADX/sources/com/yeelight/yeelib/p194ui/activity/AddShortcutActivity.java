package com.yeelight.yeelib.p194ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.service.ShortcutUtils;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.yeelib.ui.activity.AddShortcutActivity */
public class AddShortcutActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final String f18108j = AddShortcutActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4200i f18109b;

    /* renamed from: c */
    ProgressBar f18110c;

    /* renamed from: d */
    ProgressBar f18111d;

    /* renamed from: e */
    ProgressBar f18112e;

    /* renamed from: f */
    CommonTitleBar f18113f;

    /* renamed from: g */
    LinearLayout f18114g;

    /* renamed from: h */
    LinearLayout f18115h;

    /* renamed from: i */
    LinearLayout f18116i;

    /* renamed from: com.yeelight.yeelib.ui.activity.AddShortcutActivity$a */
    class C9940a implements Runnable {
        C9940a() {
        }

        public void run() {
            if (!AddShortcutActivity.this.isFinishing()) {
                Toast.makeText(AddShortcutActivity.this, R$string.toast_add_shortcut_scene, 0).show();
                AddShortcutActivity.this.f18111d.setVisibility(8);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.AddShortcutActivity$b */
    class C9941b implements View.OnClickListener {
        C9941b() {
        }

        public void onClick(View view) {
            AddShortcutActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.AddShortcutActivity$c */
    class C9942c implements View.OnClickListener {
        C9942c() {
        }

        public void onClick(View view) {
            String unused = AddShortcutActivity.f18108j;
            AddShortcutActivity.this.mo32181X(ShortcutUtils.SHORTCUT_TYPE_TOGGLE, (String) null);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.AddShortcutActivity$d */
    class C9943d implements View.OnClickListener {
        C9943d() {
        }

        public void onClick(View view) {
            String unused = AddShortcutActivity.f18108j;
            AddShortcutActivity.this.mo32181X(ShortcutUtils.SHORTCUT_TYPE_DIMMER, (String) null);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.AddShortcutActivity$e */
    class C9944e implements View.OnClickListener {
        C9944e() {
        }

        public void onClick(View view) {
            String unused = AddShortcutActivity.f18108j;
            Intent intent = new Intent(AddShortcutActivity.this, SceneActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", AddShortcutActivity.this.f18109b.mo23372G());
            intent.putExtra("start_for_result", true);
            AddShortcutActivity.this.startActivityForResult(intent, 1);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.AddShortcutActivity$f */
    class C9945f implements Runnable {
        C9945f() {
        }

        public void run() {
            if (!AddShortcutActivity.this.isFinishing()) {
                AddShortcutActivity.this.f18110c.setVisibility(8);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.AddShortcutActivity$g */
    class C9946g implements Runnable {
        C9946g() {
        }

        public void run() {
            if (!AddShortcutActivity.this.isFinishing()) {
                AddShortcutActivity.this.f18112e.setVisibility(8);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.AddShortcutActivity$h */
    class C9947h implements Runnable {
        C9947h() {
        }

        public void run() {
            if (!AddShortcutActivity.this.isFinishing()) {
                AddShortcutActivity.this.f18111d.setVisibility(8);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.AddShortcutActivity$i */
    class C9948i implements Runnable {
        C9948i() {
        }

        public void run() {
            if (!AddShortcutActivity.this.isFinishing()) {
                Toast.makeText(AddShortcutActivity.this, R$string.toast_add_shortcut_toggle, 0).show();
                AddShortcutActivity.this.f18110c.setVisibility(8);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.AddShortcutActivity$j */
    class C9949j implements Runnable {
        C9949j() {
        }

        public void run() {
            if (!AddShortcutActivity.this.isFinishing()) {
                Toast.makeText(AddShortcutActivity.this, R$string.toast_add_shortcut_dimmer, 0).show();
                AddShortcutActivity.this.f18112e.setVisibility(8);
            }
        }
    }

    /* renamed from: Y */
    private void m24379Y() {
        this.f18114g = (LinearLayout) findViewById(R$id.layout_toggle);
        this.f18115h = (LinearLayout) findViewById(R$id.layout_dimmer);
        this.f18116i = (LinearLayout) findViewById(R$id.layout_scene);
        this.f18114g.setOnClickListener(new C9942c());
        this.f18115h.setOnClickListener(new C9943d());
        this.f18116i.setOnClickListener(new C9944e());
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01ba A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x031b  */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo32181X(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            com.yeelight.yeelib.c.i.i r3 = r0.f18109b
            boolean r4 = r3 instanceof com.yeelight.yeelib.p150c.C6005g
            if (r4 == 0) goto L_0x000f
            java.lang.String r3 = "type_room"
            goto L_0x0018
        L_0x000f:
            boolean r3 = r3 instanceof com.yeelight.yeelib.p150c.C5980c
            if (r3 == 0) goto L_0x0016
            java.lang.String r3 = "type_group"
            goto L_0x0018
        L_0x0016:
            java.lang.String r3 = "type_device"
        L_0x0018:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 26
            java.lang.String r6 = "com.yeelight.cherry.shortcut.action_param"
            java.lang.String r7 = "com.yeelight.cherry.shortcut.action_type"
            java.lang.String r8 = "com.yeelight.cherry.shortcut.device_id"
            java.lang.String r9 = "com.yeelight.cherry.type"
            java.lang.String r11 = "com.yeelight.cherry.action.shortcut"
            java.lang.String r12 = "com.yeelight.cherry.action.toggle"
            java.lang.String r13 = "com.yeelight.cherry.action.scene"
            java.lang.String r14 = "com.yeelight.cherry.action.dimmer"
            r15 = -518563015(0xffffffffe1175b39, float:-1.7450198E20)
            r16 = -1
            java.lang.String r10 = "-"
            r17 = r6
            r18 = r7
            r6 = 0
            if (r4 < r5) goto L_0x01ee
            java.lang.Class<android.content.pm.ShortcutManager> r4 = android.content.pm.ShortcutManager.class
            java.lang.Object r4 = r0.getSystemService(r4)
            android.content.pm.ShortcutManager r4 = (android.content.pm.ShortcutManager) r4
            boolean r5 = r4.isRequestPinShortcutSupported()
            if (r5 != 0) goto L_0x0052
            int r1 = com.yeelight.yeelib.R$string.toast_pin_shortcut_not_supported
            android.widget.Toast r1 = android.widget.Toast.makeText(r0, r1, r6)
            r1.show()
            return
        L_0x0052:
            int r5 = r20.hashCode()
            if (r5 == r15) goto L_0x0073
            r7 = -141608763(0xfffffffff78f38c5, float:-5.8097646E33)
            if (r5 == r7) goto L_0x006b
            r7 = -55139781(0xfffffffffcb6a23b, float:-7.5863076E36)
            if (r5 == r7) goto L_0x0063
            goto L_0x007b
        L_0x0063:
            boolean r5 = r1.equals(r12)
            if (r5 == 0) goto L_0x007b
            r5 = 0
            goto L_0x007c
        L_0x006b:
            boolean r5 = r1.equals(r13)
            if (r5 == 0) goto L_0x007b
            r5 = 2
            goto L_0x007c
        L_0x0073:
            boolean r5 = r1.equals(r14)
            if (r5 == 0) goto L_0x007b
            r5 = 1
            goto L_0x007c
        L_0x007b:
            r5 = -1
        L_0x007c:
            r7 = 0
            if (r5 == 0) goto L_0x0158
            r12 = 1
            if (r5 == r12) goto L_0x00fc
            r12 = 2
            if (r5 == r12) goto L_0x0088
            r12 = r7
            goto L_0x01b8
        L_0x0088:
            com.yeelight.yeelib.g.b0 r5 = com.yeelight.yeelib.p153g.C4300b0.m12083u()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r21)
            int r12 = r12.intValue()
            com.yeelight.yeelib.c.i.i r13 = r0.f18109b
            java.lang.String r13 = r13.mo23330i1()
            com.yeelight.yeelib.g.y r5 = r5.mo23754s(r12, r13)
            android.content.pm.ShortcutInfo$Builder r12 = new android.content.pm.ShortcutInfo$Builder
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            com.yeelight.yeelib.c.i.i r14 = r0.f18109b
            java.lang.String r14 = r14.mo23372G()
            r13.append(r14)
            java.lang.String r14 = "_scene_"
            r13.append(r14)
            r13.append(r2)
            java.lang.String r13 = r13.toString()
            r12.<init>(r0, r13)
            com.yeelight.yeelib.c.i.i r13 = r0.f18109b
            java.lang.String r13 = r13.mo23397U()
            r12.setShortLabel(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            com.yeelight.yeelib.c.i.i r14 = r0.f18109b
            java.lang.String r14 = r14.mo23397U()
            r13.append(r14)
            r13.append(r10)
            java.lang.String r5 = r5.mo31885q()
            r13.append(r5)
            java.lang.String r5 = r13.toString()
            r12.setLongLabel(r5)
            int r5 = com.yeelight.yeelib.R$drawable.icon_shortcut_scene
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithResource(r0, r5)
            r12.setIcon(r5)
            android.widget.ProgressBar r5 = r0.f18111d
            r5.setVisibility(r6)
            android.widget.ProgressBar r5 = r0.f18111d
            com.yeelight.yeelib.ui.activity.AddShortcutActivity$h r6 = new com.yeelight.yeelib.ui.activity.AddShortcutActivity$h
            r6.<init>()
            goto L_0x01b3
        L_0x00fc:
            android.content.pm.ShortcutInfo$Builder r12 = new android.content.pm.ShortcutInfo$Builder
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            com.yeelight.yeelib.c.i.i r13 = r0.f18109b
            java.lang.String r13 = r13.mo23372G()
            r5.append(r13)
            java.lang.String r13 = "_dimmer"
            r5.append(r13)
            java.lang.String r5 = r5.toString()
            r12.<init>(r0, r5)
            com.yeelight.yeelib.c.i.i r5 = r0.f18109b
            java.lang.String r5 = r5.mo23397U()
            r12.setShortLabel(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            com.yeelight.yeelib.c.i.i r13 = r0.f18109b
            java.lang.String r13 = r13.mo23397U()
            r5.append(r13)
            r5.append(r10)
            int r10 = com.yeelight.yeelib.R$string.common_text_bright
            java.lang.String r10 = r0.getString(r10)
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            r12.setLongLabel(r5)
            int r5 = com.yeelight.yeelib.R$drawable.icon_shortcut_dimmer
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithResource(r0, r5)
            r12.setIcon(r5)
            android.widget.ProgressBar r5 = r0.f18112e
            r5.setVisibility(r6)
            android.widget.ProgressBar r5 = r0.f18112e
            com.yeelight.yeelib.ui.activity.AddShortcutActivity$g r6 = new com.yeelight.yeelib.ui.activity.AddShortcutActivity$g
            r6.<init>()
            goto L_0x01b3
        L_0x0158:
            android.content.pm.ShortcutInfo$Builder r12 = new android.content.pm.ShortcutInfo$Builder
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            com.yeelight.yeelib.c.i.i r13 = r0.f18109b
            java.lang.String r13 = r13.mo23372G()
            r5.append(r13)
            java.lang.String r13 = "_toggle"
            r5.append(r13)
            java.lang.String r5 = r5.toString()
            r12.<init>(r0, r5)
            com.yeelight.yeelib.c.i.i r5 = r0.f18109b
            java.lang.String r5 = r5.mo23397U()
            r12.setShortLabel(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            com.yeelight.yeelib.c.i.i r13 = r0.f18109b
            java.lang.String r13 = r13.mo23397U()
            r5.append(r13)
            r5.append(r10)
            int r10 = com.yeelight.yeelib.R$string.common_text_switch_on_off
            java.lang.String r10 = r0.getString(r10)
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            r12.setLongLabel(r5)
            int r5 = com.yeelight.yeelib.R$drawable.icon_shortcut_toggle
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithResource(r0, r5)
            r12.setIcon(r5)
            android.widget.ProgressBar r5 = r0.f18110c
            r5.setVisibility(r6)
            android.widget.ProgressBar r5 = r0.f18110c
            com.yeelight.yeelib.ui.activity.AddShortcutActivity$f r6 = new com.yeelight.yeelib.ui.activity.AddShortcutActivity$f
            r6.<init>()
        L_0x01b3:
            r13 = 800(0x320, double:3.953E-321)
            r5.postDelayed(r6, r13)
        L_0x01b8:
            if (r12 != 0) goto L_0x01bb
            return
        L_0x01bb:
            android.content.Intent r5 = new android.content.Intent
            java.lang.Class<com.yeelight.yeelib.ui.activity.ShortcutIntentHandlingActivity> r6 = com.yeelight.yeelib.p194ui.activity.ShortcutIntentHandlingActivity.class
            r5.<init>(r0, r6)
            r5.setAction(r11)
            r6 = 1476395008(0x58000000, float:5.6294995E14)
            r5.setFlags(r6)
            r5.putExtra(r9, r3)
            com.yeelight.yeelib.c.i.i r3 = r0.f18109b
            java.lang.String r3 = r3.mo23372G()
            r5.putExtra(r8, r3)
            r3 = r18
            r5.putExtra(r3, r1)
            if (r2 == 0) goto L_0x01e2
            r1 = r17
            r5.putExtra(r1, r2)
        L_0x01e2:
            r12.setIntent(r5)
            android.content.pm.ShortcutInfo r1 = r12.build()
            r4.requestPinShortcut(r1, r7)
            goto L_0x0326
        L_0x01ee:
            r4 = r17
            r5 = r18
            android.content.Intent r7 = new android.content.Intent
            java.lang.String r15 = "com.android.launcher.action.INSTALL_SHORTCUT"
            r7.<init>(r15)
            java.lang.String r15 = "duplicate"
            r7.putExtra(r15, r6)
            int r15 = r20.hashCode()
            r6 = -518563015(0xffffffffe1175b39, float:-1.7450198E20)
            if (r15 == r6) goto L_0x0222
            r6 = -141608763(0xfffffffff78f38c5, float:-5.8097646E33)
            if (r15 == r6) goto L_0x021a
            r6 = -55139781(0xfffffffffcb6a23b, float:-7.5863076E36)
            if (r15 == r6) goto L_0x0212
            goto L_0x022a
        L_0x0212:
            boolean r6 = r1.equals(r12)
            if (r6 == 0) goto L_0x022a
            r6 = 0
            goto L_0x022b
        L_0x021a:
            boolean r6 = r1.equals(r13)
            if (r6 == 0) goto L_0x022a
            r6 = 2
            goto L_0x022b
        L_0x0222:
            boolean r6 = r1.equals(r14)
            if (r6 == 0) goto L_0x022a
            r6 = 1
            goto L_0x022b
        L_0x022a:
            r6 = -1
        L_0x022b:
            java.lang.String r12 = "android.intent.extra.shortcut.ICON_RESOURCE"
            java.lang.String r13 = "android.intent.extra.shortcut.NAME"
            if (r6 == 0) goto L_0x02bf
            r14 = 1
            if (r6 == r14) goto L_0x0287
            r14 = 2
            if (r6 == r14) goto L_0x0239
            goto L_0x02fb
        L_0x0239:
            com.yeelight.yeelib.g.b0 r6 = com.yeelight.yeelib.p153g.C4300b0.m12083u()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r21)
            int r10 = r10.intValue()
            com.yeelight.yeelib.c.i.i r14 = r0.f18109b
            java.lang.String r14 = r14.mo23330i1()
            com.yeelight.yeelib.g.y r6 = r6.mo23754s(r10, r14)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            com.yeelight.yeelib.c.i.i r14 = r0.f18109b
            java.lang.String r14 = r14.mo23397U()
            r10.append(r14)
            r14 = 45
            r10.append(r14)
            java.lang.String r6 = r6.mo31885q()
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            r7.putExtra(r13, r6)
            int r6 = com.yeelight.yeelib.R$drawable.icon_shortcut_scene
            android.content.Intent$ShortcutIconResource r6 = android.content.Intent.ShortcutIconResource.fromContext(r0, r6)
            r7.putExtra(r12, r6)
            android.widget.ProgressBar r6 = r0.f18111d
            r10 = 0
            r6.setVisibility(r10)
            android.widget.ProgressBar r6 = r0.f18111d
            com.yeelight.yeelib.ui.activity.AddShortcutActivity$a r10 = new com.yeelight.yeelib.ui.activity.AddShortcutActivity$a
            r10.<init>()
            goto L_0x02f6
        L_0x0287:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            com.yeelight.yeelib.c.i.i r14 = r0.f18109b
            java.lang.String r14 = r14.mo23397U()
            r6.append(r14)
            r6.append(r10)
            int r10 = com.yeelight.yeelib.R$string.common_text_bright
            java.lang.String r10 = r0.getString(r10)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            r7.putExtra(r13, r6)
            int r6 = com.yeelight.yeelib.R$drawable.icon_shortcut_dimmer
            android.content.Intent$ShortcutIconResource r6 = android.content.Intent.ShortcutIconResource.fromContext(r0, r6)
            r7.putExtra(r12, r6)
            android.widget.ProgressBar r6 = r0.f18112e
            r10 = 0
            r6.setVisibility(r10)
            android.widget.ProgressBar r6 = r0.f18112e
            com.yeelight.yeelib.ui.activity.AddShortcutActivity$j r10 = new com.yeelight.yeelib.ui.activity.AddShortcutActivity$j
            r10.<init>()
            goto L_0x02f6
        L_0x02bf:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            com.yeelight.yeelib.c.i.i r14 = r0.f18109b
            java.lang.String r14 = r14.mo23397U()
            r6.append(r14)
            r6.append(r10)
            int r10 = com.yeelight.yeelib.R$string.common_text_switch_on_off
            java.lang.String r10 = r0.getString(r10)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            r7.putExtra(r13, r6)
            int r6 = com.yeelight.yeelib.R$drawable.icon_shortcut_toggle
            android.content.Intent$ShortcutIconResource r6 = android.content.Intent.ShortcutIconResource.fromContext(r0, r6)
            r7.putExtra(r12, r6)
            android.widget.ProgressBar r6 = r0.f18110c
            r10 = 0
            r6.setVisibility(r10)
            android.widget.ProgressBar r6 = r0.f18110c
            com.yeelight.yeelib.ui.activity.AddShortcutActivity$i r10 = new com.yeelight.yeelib.ui.activity.AddShortcutActivity$i
            r10.<init>()
        L_0x02f6:
            r12 = 800(0x320, double:3.953E-321)
            r6.postDelayed(r10, r12)
        L_0x02fb:
            android.content.Intent r6 = new android.content.Intent
            java.lang.Class<com.yeelight.yeelib.ui.activity.ShortcutIntentHandlingActivity> r10 = com.yeelight.yeelib.p194ui.activity.ShortcutIntentHandlingActivity.class
            r6.<init>(r0, r10)
            r6.setAction(r11)
            r10 = 1476395008(0x58000000, float:5.6294995E14)
            r6.setFlags(r10)
            r6.putExtra(r9, r3)
            com.yeelight.yeelib.c.i.i r3 = r0.f18109b
            java.lang.String r3 = r3.mo23372G()
            r6.putExtra(r8, r3)
            r6.putExtra(r5, r1)
            if (r2 == 0) goto L_0x031e
            r6.putExtra(r4, r2)
        L_0x031e:
            java.lang.String r1 = "android.intent.extra.shortcut.INTENT"
            r7.putExtra(r1, r6)
            r0.sendBroadcast(r7)
        L_0x0326:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.activity.AddShortcutActivity.mo32181X(java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            int intExtra = intent.getIntExtra("scene", -1);
            "AddShortcutActivity, onActivityResult, scene id: " + intExtra;
            if (intExtra != -1) {
                mo32181X(ShortcutUtils.SHORTCUT_TYPE_SCENE, String.valueOf(intExtra));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        setContentView(R$layout.activity_add_short_cut);
        this.f18110c = (ProgressBar) findViewById(R$id.progress_toggle);
        this.f18111d = (ProgressBar) findViewById(R$id.progress_scene);
        this.f18112e = (ProgressBar) findViewById(R$id.progress_dimmer);
        C10547m.m25758h(true, this);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18108j, "Activity has not device id", false);
            finish();
            return;
        }
        C4200i o0 = C4257w.m11953o0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f18109b = o0;
        if (o0 == null) {
            finish();
            return;
        }
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f18113f = commonTitleBar;
        commonTitleBar.mo32825a(getString(R$string.feature_add_shortcut), new C9941b(), (View.OnClickListener) null);
        this.f18113f.setTitleTextSize(16);
        m24379Y();
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
