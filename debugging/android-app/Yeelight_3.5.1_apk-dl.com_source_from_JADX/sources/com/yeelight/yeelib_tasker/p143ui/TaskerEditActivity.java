package com.yeelight.yeelib_tasker.p143ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.device.C6119c;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.managers.C8293t;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.C3112v;
import com.yeelight.yeelib.models.C8309b;
import com.yeelight.yeelib.models.C8311d;
import com.yeelight.yeelib.models.C8313f;
import com.yeelight.yeelib.models.C8314g;
import com.yeelight.yeelib.models.C8322n;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib_tasker.R$drawable;
import com.yeelight.yeelib_tasker.R$integer;
import com.yeelight.yeelib_tasker.R$string;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p051j4.C9195n;
import p145d4.C8937a;

/* renamed from: com.yeelight.yeelib_tasker.ui.TaskerEditActivity */
public final class TaskerEditActivity extends AbstractPluginActivity implements C3051a.C3052i {

    /* renamed from: b */
    CommonTitleBar f16397b;

    /* renamed from: c */
    FrameLayout f16398c;

    /* renamed from: d */
    LinearLayout f16399d;

    /* renamed from: e */
    LinearLayout f16400e;

    /* renamed from: f */
    LinearLayout f16401f;

    /* renamed from: g */
    LinearLayout f16402g;

    /* renamed from: h */
    TextView f16403h;

    /* renamed from: i */
    TextView f16404i;

    /* renamed from: j */
    ImageView f16405j;

    /* renamed from: k */
    TextView f16406k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public String f16407l = "";

    /* renamed from: m */
    private String f16408m = "";
    /* access modifiers changed from: private */

    /* renamed from: n */
    public ActionType f16409n = null;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f16410o = 0;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f16411p = 0;

    /* renamed from: q */
    private JSONObject f16412q;

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerEditActivity$a */
    class C8920a implements View.OnClickListener {
        C8920a() {
        }

        public void onClick(View view) {
            TaskerEditActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerEditActivity$b */
    class C8921b implements View.OnClickListener {
        C8921b() {
        }

        public void onClick(View view) {
            TaskerEditActivity.this.startActivityForResult(new Intent(TaskerEditActivity.this, TypeSheetActivity.class), 1);
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerEditActivity$c */
    class C8922c implements View.OnClickListener {
        C8922c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(TaskerEditActivity.this, TaskerActionActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", TaskerEditActivity.this.f16407l);
            if (TaskerEditActivity.this.f16409n == ActionType.BRIGHT && TaskerEditActivity.this.f16410o != 0) {
                intent.putExtra("com.yeelight.cherry.device_bright", TaskerEditActivity.this.f16410o);
            }
            TaskerEditActivity.this.startActivityForResult(intent, 2);
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerEditActivity$d */
    class C8923d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3012e f16416a;

        C8923d(C3012e eVar) {
            this.f16416a = eVar;
        }

        public void run() {
            TaskerEditActivity.this.m21285i0(this.f16416a);
            TaskerEditActivity.this.f16399d.setVisibility(8);
            TaskerEditActivity.this.f16400e.setVisibility(0);
            TaskerEditActivity.this.f16401f.setVisibility(0);
            TaskerEditActivity.this.f16406k.setText(this.f16416a.mo23210U());
            TaskerEditActivity taskerEditActivity = TaskerEditActivity.this;
            taskerEditActivity.f16403h.setText(taskerEditActivity.f16409n.getActionName(TaskerEditActivity.this));
            int i = C8924e.f16418a[TaskerEditActivity.this.f16409n.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                TaskerEditActivity.this.f16404i.setVisibility(4);
                return;
            }
            if (i == 7) {
                TextView textView = TaskerEditActivity.this.f16404i;
                textView.setText(String.valueOf(TaskerEditActivity.this.f16410o) + "%");
            } else if (i == 8) {
                C8327s s = C3112v.m8242u().mo23567s(TaskerEditActivity.this.f16411p, this.f16416a.mo23144i1());
                if (s == null) {
                    s = C3112v.m8242u().mo23557h(TaskerEditActivity.this.f16411p);
                }
                if (s != null) {
                    TaskerEditActivity.this.f16404i.setText(s.mo35450q());
                }
            } else if (i == 10) {
                C3112v.m8242u().mo23563n(TaskerEditActivity.this.f16411p, this.f16416a.mo23144i1());
            } else {
                return;
            }
            TaskerEditActivity.this.f16404i.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerEditActivity$e */
    static /* synthetic */ class C8924e {

        /* renamed from: a */
        static final /* synthetic */ int[] f16418a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.yeelight.yeelib.interaction.ActionType[] r0 = com.yeelight.yeelib.interaction.ActionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16418a = r0
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.ON     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16418a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.OFF     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16418a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.TOGGLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f16418a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.BRIGHT_VARIABLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f16418a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.CT_VARIABLE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f16418a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.COLOR_VARIABLE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f16418a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.BRIGHT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f16418a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.SCENE     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f16418a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.COMMAND     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f16418a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.RECOMMEND_SCENE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib_tasker.p143ui.TaskerEditActivity.C8924e.<clinit>():void");
        }
    }

    /* renamed from: e0 */
    private C8327s m21282e0(int i, int i2, int i3, int i4, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("mode = ");
        sb.append(i);
        sb.append(" , bright = ");
        sb.append(i2);
        sb.append(" , color = ");
        sb.append(i3);
        sb.append(" , ct = ");
        sb.append(i4);
        sb.append(" , flowJson = ");
        sb.append(str);
        if (i == 0) {
            return new C8314g("", -1, 3, i2, i4);
        }
        if (i == 1) {
            return new C8313f("", -1, 2, i2, i3);
        }
        if (i == 2) {
            try {
                return C8309b.m19702a0(new JSONObject(str));
            } catch (Exception unused) {
            }
        } else if (i != 3) {
            if (i == 4) {
                return new C8322n("", -1, 6, i2);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No reason to run here! ");
            sb2.append(new Exception());
            return null;
        }
        return new C8311d("", -1, 3, i2);
    }

    /* renamed from: f0 */
    private C8327s m21283f0(int i, int i2, String str) {
        List k;
        C3012e P0 = YeelightDeviceManager.m7800o0().mo23274P0(str);
        if (P0 == null) {
            P0 = YeelightDeviceManager.m7800o0().mo23304n0(str);
        }
        if (P0 == null) {
            P0 = YeelightDeviceManager.m7800o0().mo23268J0(str);
        }
        if (P0 == null) {
            return null;
        }
        if (i == 0) {
            this.f16409n = ActionType.RECOMMEND_SCENE;
            k = C3112v.m8242u().mo23560k(P0.mo23144i1());
        } else if (i == 1) {
            k = C3112v.m8242u().mo23559j(P0.mo23144i1());
        } else if (i != 2) {
            return null;
        } else {
            k = C3112v.m8242u().mo23564p(P0.mo23144i1());
        }
        return (C8327s) k.get(i2);
    }

    /* renamed from: g0 */
    static String m21284g0(Context context, String str) {
        int integer = context.getResources().getInteger(R$integer.twofortyfouram_locale_maximum_blurb_length);
        return str.length() > integer ? str.substring(0, integer) : str;
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public void m21285i0(C3012e eVar) {
        int i;
        if (eVar instanceof C6119c) {
            C8937a p = C8293t.m19620n().mo35256p(this.f16407l);
            if (p != null) {
                i = C9195n.m22164a(2, p.mo36726r());
            } else {
                return;
            }
        } else {
            i = eVar.mo23116F();
        }
        this.f16405j.setImageDrawable(ContextCompat.getDrawable(this, i));
    }

    /* renamed from: C */
    public void mo23255C(C3051a.C3062k kVar) {
    }

    /* renamed from: H */
    public void mo23262H() {
    }

    /* renamed from: d */
    public void mo23283d() {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r0 = java.lang.String.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        r1 = new android.content.Intent();
        r2 = p185m4.C9548b.m23218a(getApplicationContext(), r7.f16408m, r7.f16407l, r7.f16409n.name(), r0);
        r1.putExtra("com.twofortyfouram.locale.intent.extra.BUNDLE", r2);
        r3 = m21284g0(getApplicationContext(), "Device: " + r7.f16406k.getText().toString() + ", Action: " + r7.f16409n.name());
        r4 = r7.f16409n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008d, code lost:
        if (r4 == com.yeelight.yeelib.interaction.ActionType.BRIGHT) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0091, code lost:
        if (r4 == com.yeelight.yeelib.interaction.ActionType.SCENE) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0095, code lost:
        if (r4 == com.yeelight.yeelib.interaction.ActionType.RECOMMEND_SCENE) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0099, code lost:
        if (r4 == com.yeelight.yeelib.interaction.ActionType.BRIGHT_VARIABLE) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009d, code lost:
        if (r4 == com.yeelight.yeelib.interaction.ActionType.CT_VARIABLE) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a1, code lost:
        if (r4 == com.yeelight.yeelib.interaction.ActionType.COLOR_VARIABLE) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a5, code lost:
        if (r4 != com.yeelight.yeelib.interaction.ActionType.COMMAND) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a7, code lost:
        r3 = r3 + ", Param: " + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bb, code lost:
        r1.putExtra("com.twofortyfouram.locale.intent.extra.BLURB", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c4, code lost:
        if (r7.f16409n != com.yeelight.yeelib.interaction.ActionType.BRIGHT_VARIABLE) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d2, code lost:
        if (com.yeelight.yeelib_tasker.TaskerPlugin.m21266h(getIntent().getExtras()) == false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d4, code lost:
        com.yeelight.yeelib_tasker.TaskerPlugin.m21261c(r1, new java.lang.String[]{"%YeelightBright\nBright\nThe bright you want to set to your device."});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e1, code lost:
        if (r7.f16409n != com.yeelight.yeelib.interaction.ActionType.CT_VARIABLE) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ef, code lost:
        if (com.yeelight.yeelib_tasker.TaskerPlugin.m21266h(getIntent().getExtras()) == false) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f1, code lost:
        r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.m7794j0(r7.f16407l);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f7, code lost:
        if (r0 == null) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f9, code lost:
        r0 = p227x3.C11972i.m30704b(r0.mo23208T());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0101, code lost:
        if (r0 == null) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0103, code lost:
        r3 = r0.mo42547b();
        r0 = r0.mo42546a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x010f, code lost:
        if (r3 != r0) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0111, code lost:
        r0 = "%YeelightCt\nColor Temperature\nThe color temperature you want to set to your device.(" + r3 + "K)";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0124, code lost:
        r0 = "%YeelightCt\nColor Temperature\nThe color temperature you want to set to your device.(" + r3 + "K ~ " + r0 + "K)";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x013e, code lost:
        com.yeelight.yeelib_tasker.TaskerPlugin.m21261c(r1, new java.lang.String[]{r0});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x014b, code lost:
        if (r7.f16409n != com.yeelight.yeelib.interaction.ActionType.COLOR_VARIABLE) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0159, code lost:
        if (com.yeelight.yeelib_tasker.TaskerPlugin.m21266h(getIntent().getExtras()) == false) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x015b, code lost:
        com.yeelight.yeelib_tasker.TaskerPlugin.m21261c(r1, new java.lang.String[]{"%YeelightColor\nColor\nThe color you want to set to your device."});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0168, code lost:
        if (com.yeelight.yeelib_tasker.TaskerPlugin.C8900a.m21267a(r7) == false) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x016a, code lost:
        com.yeelight.yeelib_tasker.TaskerPlugin.C8900a.m21269c(r2, new java.lang.String[]{"com.yeelight.tasker.extra.PARAM"});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0173, code lost:
        setResult(-1, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void finish() {
        /*
            r7 = this;
            boolean r0 = r7.mo36679V()
            if (r0 != 0) goto L_0x0177
            java.lang.String r0 = r7.f16407l
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0177
            com.yeelight.yeelib.interaction.ActionType r0 = r7.f16409n
            if (r0 == 0) goto L_0x0177
            int[] r1 = com.yeelight.yeelib_tasker.p143ui.TaskerEditActivity.C8924e.f16418a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 4: goto L_0x0037;
                case 5: goto L_0x0034;
                case 6: goto L_0x0031;
                case 7: goto L_0x002a;
                case 8: goto L_0x0027;
                case 9: goto L_0x001e;
                case 10: goto L_0x0027;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x003a
        L_0x001e:
            org.json.JSONObject r0 = r7.f16412q
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = r0.toString()
            goto L_0x003c
        L_0x0027:
            int r0 = r7.f16411p
            goto L_0x002c
        L_0x002a:
            int r0 = r7.f16410o
        L_0x002c:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L_0x003c
        L_0x0031:
            java.lang.String r0 = "%YeelightColor"
            goto L_0x003c
        L_0x0034:
            java.lang.String r0 = "%YeelightCt"
            goto L_0x003c
        L_0x0037:
            java.lang.String r0 = "%YeelightBright"
            goto L_0x003c
        L_0x003a:
            java.lang.String r0 = ""
        L_0x003c:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            android.content.Context r2 = r7.getApplicationContext()
            java.lang.String r3 = r7.f16408m
            java.lang.String r4 = r7.f16407l
            com.yeelight.yeelib.interaction.ActionType r5 = r7.f16409n
            java.lang.String r5 = r5.name()
            android.os.Bundle r2 = p185m4.C9548b.m23218a(r2, r3, r4, r5, r0)
            java.lang.String r3 = "com.twofortyfouram.locale.intent.extra.BUNDLE"
            r1.putExtra(r3, r2)
            android.content.Context r3 = r7.getApplicationContext()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Device: "
            r4.append(r5)
            android.widget.TextView r5 = r7.f16406k
            java.lang.CharSequence r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            r4.append(r5)
            java.lang.String r5 = ", Action: "
            r4.append(r5)
            com.yeelight.yeelib.interaction.ActionType r5 = r7.f16409n
            java.lang.String r5 = r5.name()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r3 = m21284g0(r3, r4)
            com.yeelight.yeelib.interaction.ActionType r4 = r7.f16409n
            com.yeelight.yeelib.interaction.ActionType r5 = com.yeelight.yeelib.interaction.ActionType.BRIGHT
            if (r4 == r5) goto L_0x00a7
            com.yeelight.yeelib.interaction.ActionType r5 = com.yeelight.yeelib.interaction.ActionType.SCENE
            if (r4 == r5) goto L_0x00a7
            com.yeelight.yeelib.interaction.ActionType r5 = com.yeelight.yeelib.interaction.ActionType.RECOMMEND_SCENE
            if (r4 == r5) goto L_0x00a7
            com.yeelight.yeelib.interaction.ActionType r5 = com.yeelight.yeelib.interaction.ActionType.BRIGHT_VARIABLE
            if (r4 == r5) goto L_0x00a7
            com.yeelight.yeelib.interaction.ActionType r5 = com.yeelight.yeelib.interaction.ActionType.CT_VARIABLE
            if (r4 == r5) goto L_0x00a7
            com.yeelight.yeelib.interaction.ActionType r5 = com.yeelight.yeelib.interaction.ActionType.COLOR_VARIABLE
            if (r4 == r5) goto L_0x00a7
            com.yeelight.yeelib.interaction.ActionType r5 = com.yeelight.yeelib.interaction.ActionType.COMMAND
            if (r4 != r5) goto L_0x00bb
        L_0x00a7:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = ", Param: "
            r4.append(r3)
            r4.append(r0)
            java.lang.String r3 = r4.toString()
        L_0x00bb:
            java.lang.String r0 = "com.twofortyfouram.locale.intent.extra.BLURB"
            r1.putExtra(r0, r3)
            com.yeelight.yeelib.interaction.ActionType r0 = r7.f16409n
            com.yeelight.yeelib.interaction.ActionType r3 = com.yeelight.yeelib.interaction.ActionType.BRIGHT_VARIABLE
            if (r0 != r3) goto L_0x00dd
            android.content.Intent r0 = r7.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            boolean r0 = com.yeelight.yeelib_tasker.TaskerPlugin.m21266h(r0)
            if (r0 == 0) goto L_0x00dd
            java.lang.String r0 = "%YeelightBright\nBright\nThe bright you want to set to your device."
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.yeelight.yeelib_tasker.TaskerPlugin.m21261c(r1, r0)
        L_0x00dd:
            com.yeelight.yeelib.interaction.ActionType r0 = r7.f16409n
            com.yeelight.yeelib.interaction.ActionType r3 = com.yeelight.yeelib.interaction.ActionType.CT_VARIABLE
            if (r0 != r3) goto L_0x0147
            android.content.Intent r0 = r7.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            boolean r0 = com.yeelight.yeelib_tasker.TaskerPlugin.m21266h(r0)
            if (r0 == 0) goto L_0x0147
            java.lang.String r0 = r7.f16407l
            com.yeelight.yeelib.device.base.c r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.m7794j0(r0)
            if (r0 == 0) goto L_0x0147
            java.lang.String r0 = r0.mo23208T()
            x3.i$a r0 = p227x3.C11972i.m30704b(r0)
            if (r0 == 0) goto L_0x0147
            int r3 = r0.mo42547b()
            int r0 = r0.mo42546a()
            java.lang.String r4 = "K)"
            java.lang.String r5 = "%YeelightCt\nColor Temperature\nThe color temperature you want to set to your device.("
            if (r3 != r0) goto L_0x0124
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r3)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            goto L_0x013e
        L_0x0124:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r3)
            java.lang.String r3 = "K ~ "
            r6.append(r3)
            r6.append(r0)
            r6.append(r4)
            java.lang.String r0 = r6.toString()
        L_0x013e:
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = 0
            r3[r4] = r0
            com.yeelight.yeelib_tasker.TaskerPlugin.m21261c(r1, r3)
        L_0x0147:
            com.yeelight.yeelib.interaction.ActionType r0 = r7.f16409n
            com.yeelight.yeelib.interaction.ActionType r3 = com.yeelight.yeelib.interaction.ActionType.COLOR_VARIABLE
            if (r0 != r3) goto L_0x0164
            android.content.Intent r0 = r7.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            boolean r0 = com.yeelight.yeelib_tasker.TaskerPlugin.m21266h(r0)
            if (r0 == 0) goto L_0x0164
            java.lang.String r0 = "%YeelightColor\nColor\nThe color you want to set to your device."
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.yeelight.yeelib_tasker.TaskerPlugin.m21261c(r1, r0)
        L_0x0164:
            boolean r0 = com.yeelight.yeelib_tasker.TaskerPlugin.C8900a.m21267a(r7)
            if (r0 == 0) goto L_0x0173
            java.lang.String r0 = "com.yeelight.tasker.extra.PARAM"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.yeelight.yeelib_tasker.TaskerPlugin.C8900a.m21269c(r2, r0)
        L_0x0173:
            r0 = -1
            r7.setResult(r0, r1)
        L_0x0177:
            super.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib_tasker.p143ui.TaskerEditActivity.finish():void");
    }

    /* renamed from: g */
    public void mo23288g() {
    }

    /* renamed from: h */
    public void mo23291h() {
        C3012e r0 = YeelightDeviceManager.m7804r0(this.f16407l);
        if (r0 != null) {
            runOnUiThread(new C8923d(r0));
        }
    }

    /* renamed from: h0 */
    public String mo36699h0() {
        JSONObject jSONObject = this.f16412q;
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.getString("method").equals("set_power")) {
                return this.f16412q.getString("params").contains("on") ? C3108x.f4951e.getString(R$string.common_text_turn_on) : C3108x.f4951e.getString(R$string.common_text_turn_off);
            }
            String string = this.f16412q.getString("params");
            StringBuilder sb = new StringBuilder();
            sb.append("getSceneCommandInfo , scene params : ");
            sb.append(string);
            String str = string.split(Constants.ACCEPT_TIME_SEPARATOR_SP)[0];
            if (str.contains("color")) {
                return C3108x.f4951e.getString(com.yeelight.yeelib.R$string.common_text_colors);
            }
            if (!str.contains("cf")) {
                if (!str.contains("hsv")) {
                    return str.contains("nightlight") ? C3108x.f4951e.getString(com.yeelight.yeelib.R$string.common_text_night_light) : C3108x.f4951e.getString(com.yeelight.yeelib.R$string.common_text_sunshine);
                }
            }
            return C3108x.f4951e.getString(com.yeelight.yeelib.R$string.common_text_flow);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: l */
    public void mo23300l() {
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        C8327s f0;
        if (i == 1 && i2 == -1) {
            this.f16407l = intent.getStringExtra("com.yeelight.cherry.device_id");
            String stringExtra = intent.getStringExtra("com.yeelight.cherry.type");
            this.f16408m = stringExtra;
            if (stringExtra.equals("type_device")) {
                StringBuilder sb = new StringBuilder();
                sb.append("onActivityResult, device id: ");
                sb.append(this.f16407l);
                C3012e r0 = YeelightDeviceManager.m7804r0(this.f16407l);
                if (r0 != null) {
                    m21285i0(r0);
                    this.f16406k.setText(r0.mo23210U());
                    this.f16399d.setVisibility(8);
                    this.f16400e.setVisibility(0);
                    this.f16401f.setVisibility(0);
                    if (this.f16409n != null) {
                        return;
                    }
                } else {
                    return;
                }
            } else if (this.f16408m.equals("type_group")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onActivityResult, group id: ");
                sb2.append(this.f16407l);
                C6119c n0 = YeelightDeviceManager.m7800o0().mo23304n0(this.f16407l);
                if (n0 != null) {
                    this.f16405j.setImageResource(R$drawable.icon_yeelight_device_badge_group_small);
                    this.f16406k.setText(n0.mo23210U());
                    this.f16399d.setVisibility(8);
                    this.f16400e.setVisibility(0);
                    this.f16401f.setVisibility(0);
                    if (this.f16409n != null) {
                        return;
                    }
                } else {
                    return;
                }
            } else if (this.f16408m.equals("type_room")) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("onActivityResult, room id: ");
                sb3.append(this.f16407l);
                C8937a p = C8293t.m19620n().mo35256p(this.f16407l);
                if (p != null) {
                    this.f16405j.setImageResource(C9195n.m22164a(2, p.mo36726r()));
                    this.f16406k.setText(p.mo36723o());
                    this.f16399d.setVisibility(8);
                    this.f16400e.setVisibility(0);
                    this.f16401f.setVisibility(0);
                    if (this.f16409n != null) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
            this.f16409n = ActionType.ON;
        } else if (i == 2 && i2 == -1) {
            this.f16409n = ActionType.values()[intent.getIntExtra("com.yeelight.cherry.device_action", 0)];
            StringBuilder sb4 = new StringBuilder();
            sb4.append("onActivityResult, device action: ");
            sb4.append(this.f16409n);
            this.f16403h.setText(this.f16409n.getActionName(this));
            switch (C8924e.f16418a[this.f16409n.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    this.f16404i.setVisibility(4);
                    return;
                case 7:
                    this.f16410o = intent.getIntExtra("com.yeelight.cherry.device_bright", 0);
                    TextView textView = this.f16404i;
                    textView.setText(String.valueOf(this.f16410o) + "%");
                    this.f16404i.setVisibility(0);
                    return;
                case 8:
                    this.f16404i.setVisibility(0);
                    int intExtra = intent.getIntExtra("scene_type", -1);
                    C3012e r02 = YeelightDeviceManager.m7804r0(this.f16407l);
                    if (intExtra == 1002) {
                        this.f16409n = ActionType.COMMAND;
                        C8327s e0 = m21282e0(intent.getIntExtra("light_adjust_mode", -1), intent.getIntExtra("light_adjust_bright", -1), intent.getIntExtra("light_adjust_color", -1), intent.getIntExtra("light_adjust_ct", -1), intent.getStringExtra("light_adjust_json"));
                        if (e0 != null) {
                            this.f16412q = e0.mo35294a();
                            this.f16404i.setText(mo36699h0());
                            return;
                        }
                        return;
                    } else if (intExtra == 1003 && (f0 = m21283f0(intent.getIntExtra("scene_select_mode", -1), intent.getIntExtra("scene_select_position", -1), r02.mo23185G())) != null) {
                        this.f16411p = f0.mo35451r();
                        this.f16404i.setText(f0.mo35450q());
                        return;
                    } else {
                        return;
                    }
                default:
                    return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0156, code lost:
        if (r7 != null) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0158, code lost:
        r6.f16404i.setText(r7.mo35450q());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0197, code lost:
        if (r7 != null) goto L_0x0158;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            r6.mo35653P()
            r7 = 1
            p051j4.C9193k.m22157h(r7, r6)
            int r7 = com.yeelight.yeelib_tasker.R$layout.activity_tasker_edit
            r6.setContentView(r7)
            int r7 = com.yeelight.yeelib_tasker.R$id.title_bar
            android.view.View r7 = r6.findViewById(r7)
            com.yeelight.yeelib.ui.view.CommonTitleBar r7 = (com.yeelight.yeelib.p142ui.view.CommonTitleBar) r7
            r6.f16397b = r7
            int r7 = com.yeelight.yeelib_tasker.R$id.layout_device
            android.view.View r7 = r6.findViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            int r7 = com.yeelight.yeelib_tasker.R$id.layout_device_content
            android.view.View r7 = r6.findViewById(r7)
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            r6.f16398c = r7
            int r7 = com.yeelight.yeelib_tasker.R$id.layout_device_add
            android.view.View r7 = r6.findViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r6.f16399d = r7
            int r7 = com.yeelight.yeelib_tasker.R$id.layout_device_info
            android.view.View r7 = r6.findViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r6.f16400e = r7
            int r7 = com.yeelight.yeelib_tasker.R$id.layout_action
            android.view.View r7 = r6.findViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r6.f16401f = r7
            int r7 = com.yeelight.yeelib_tasker.R$id.layout_action_content
            android.view.View r7 = r6.findViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r6.f16402g = r7
            int r7 = com.yeelight.yeelib_tasker.R$id.tv_action_name
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6.f16403h = r7
            int r7 = com.yeelight.yeelib_tasker.R$id.tv_action_content
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6.f16404i = r7
            int r7 = com.yeelight.yeelib_tasker.R$id.device_badge
            android.view.View r7 = r6.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r6.f16405j = r7
            int r7 = com.yeelight.yeelib_tasker.R$id.device_name
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6.f16406k = r7
            android.content.Intent r7 = r6.getIntent()
            p185m4.C9547a.m23216a(r7)
            android.content.Intent r7 = r6.getIntent()
            java.lang.String r0 = "com.twofortyfouram.locale.intent.extra.BUNDLE"
            android.os.Bundle r7 = r7.getBundleExtra(r0)
            p185m4.C9547a.m23217b(r7)
            com.yeelight.yeelib.ui.view.CommonTitleBar r0 = r6.f16397b
            com.yeelight.yeelib_tasker.ui.TaskerEditActivity$a r1 = new com.yeelight.yeelib_tasker.ui.TaskerEditActivity$a
            r1.<init>()
            java.lang.String r2 = "Tasker"
            r3 = 0
            r0.mo36195a(r2, r1, r3)
            com.yeelight.yeelib.ui.view.CommonTitleBar r0 = r6.f16397b
            r1 = 16
            r0.setTitleTextSize(r1)
            boolean r0 = p185m4.C9548b.m23219b(r7)
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L_0x01cb
            java.lang.String r0 = "com.yeelight.tasker.extra.DEVICE_TYPE"
            java.lang.String r0 = r7.getString(r0)
            r6.f16408m = r0
            java.lang.String r0 = "com.yeelight.tasker.extra.DEVICE_ID"
            java.lang.String r0 = r7.getString(r0)
            r6.f16407l = r0
            java.lang.String r0 = "com.yeelight.tasker.extra.ACTION"
            java.lang.String r0 = r7.getString(r0)
            java.lang.String r0 = com.yeelight.yeelib.interaction.ActionType.OPEN_CLSOE_2_ON_OFF(r0)
            com.yeelight.yeelib.interaction.ActionType r0 = com.yeelight.yeelib.interaction.ActionType.valueOf(r0)
            r6.f16409n = r0
            java.lang.String r0 = "com.yeelight.tasker.extra.PARAM"
            java.lang.String r7 = r7.getString(r0)
            java.lang.String r0 = r6.f16407l
            com.yeelight.yeelib.device.base.e r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.m7804r0(r0)
            int[] r4 = com.yeelight.yeelib_tasker.p143ui.TaskerEditActivity.C8924e.f16418a
            com.yeelight.yeelib.interaction.ActionType r5 = r6.f16409n
            int r5 = r5.ordinal()
            r4 = r4[r5]
            r5 = 7
            if (r4 == r5) goto L_0x0102
            if (r4 == r1) goto L_0x00f7
            r5 = 9
            if (r4 == r5) goto L_0x00ec
            goto L_0x010c
        L_0x00ec:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00f4 }
            r4.<init>(r7)     // Catch:{ JSONException -> 0x00f4 }
            r6.f16412q = r4     // Catch:{ JSONException -> 0x00f4 }
            goto L_0x010c
        L_0x00f4:
            r6.f16412q = r3
            goto L_0x010c
        L_0x00f7:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r7 = r7.intValue()
            r6.f16411p = r7
            goto L_0x010c
        L_0x0102:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r7 = r7.intValue()
            r6.f16410o = r7
        L_0x010c:
            if (r0 == 0) goto L_0x01c3
            r6.m21285i0(r0)
            android.widget.LinearLayout r7 = r6.f16399d
            r7.setVisibility(r1)
            android.widget.LinearLayout r7 = r6.f16400e
            r7.setVisibility(r2)
            android.widget.LinearLayout r7 = r6.f16401f
            r7.setVisibility(r2)
            android.widget.TextView r7 = r6.f16406k
            java.lang.String r1 = r0.mo23210U()
            r7.setText(r1)
            android.widget.TextView r7 = r6.f16403h
            com.yeelight.yeelib.interaction.ActionType r1 = r6.f16409n
            java.lang.String r1 = r1.getActionName(r6)
            r7.setText(r1)
            int[] r7 = com.yeelight.yeelib_tasker.p143ui.TaskerEditActivity.C8924e.f16418a
            com.yeelight.yeelib.interaction.ActionType r1 = r6.f16409n
            int r1 = r1.ordinal()
            r7 = r7[r1]
            switch(r7) {
                case 1: goto L_0x01bc;
                case 2: goto L_0x01bc;
                case 3: goto L_0x01bc;
                case 4: goto L_0x01bc;
                case 5: goto L_0x01bc;
                case 6: goto L_0x01bc;
                case 7: goto L_0x019a;
                case 8: goto L_0x0178;
                case 9: goto L_0x0163;
                case 10: goto L_0x0143;
                default: goto L_0x0141;
            }
        L_0x0141:
            goto L_0x01da
        L_0x0143:
            android.widget.TextView r7 = r6.f16404i
            r7.setVisibility(r2)
            com.yeelight.yeelib.models.v r7 = com.yeelight.yeelib.models.C3112v.m8242u()
            int r1 = r6.f16411p
            java.lang.String r0 = r0.mo23144i1()
            com.yeelight.yeelib.models.s r7 = r7.mo23563n(r1, r0)
            if (r7 == 0) goto L_0x01da
        L_0x0158:
            android.widget.TextView r0 = r6.f16404i
            java.lang.String r7 = r7.mo35450q()
            r0.setText(r7)
            goto L_0x01da
        L_0x0163:
            android.widget.TextView r7 = r6.f16403h
            com.yeelight.yeelib.interaction.ActionType r0 = com.yeelight.yeelib.interaction.ActionType.SCENE
            java.lang.String r0 = r0.getActionName(r6)
            r7.setText(r0)
            android.widget.TextView r7 = r6.f16404i
            java.lang.String r0 = r6.mo36699h0()
            r7.setText(r0)
            goto L_0x01da
        L_0x0178:
            android.widget.TextView r7 = r6.f16404i
            r7.setVisibility(r2)
            com.yeelight.yeelib.models.v r7 = com.yeelight.yeelib.models.C3112v.m8242u()
            int r1 = r6.f16411p
            java.lang.String r0 = r0.mo23144i1()
            com.yeelight.yeelib.models.s r7 = r7.mo23567s(r1, r0)
            if (r7 != 0) goto L_0x0197
            com.yeelight.yeelib.models.v r7 = com.yeelight.yeelib.models.C3112v.m8242u()
            int r0 = r6.f16411p
            com.yeelight.yeelib.models.s r7 = r7.mo23557h(r0)
        L_0x0197:
            if (r7 == 0) goto L_0x01da
            goto L_0x0158
        L_0x019a:
            android.widget.TextView r7 = r6.f16404i
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.f16410o
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.append(r1)
            java.lang.String r1 = "%"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.setText(r0)
            android.widget.TextView r7 = r6.f16404i
            r7.setVisibility(r2)
            goto L_0x01da
        L_0x01bc:
            android.widget.TextView r7 = r6.f16404i
            r0 = 4
            r7.setVisibility(r0)
            goto L_0x01da
        L_0x01c3:
            com.yeelight.yeelib.managers.a r7 = com.yeelight.yeelib.managers.C3051a.m7925r()
            r7.mo23358M(r6)
            goto L_0x01da
        L_0x01cb:
            android.widget.LinearLayout r7 = r6.f16399d
            r7.setVisibility(r2)
            android.widget.LinearLayout r7 = r6.f16400e
            r7.setVisibility(r1)
            android.widget.LinearLayout r7 = r6.f16401f
            r7.setVisibility(r1)
        L_0x01da:
            android.widget.FrameLayout r7 = r6.f16398c
            com.yeelight.yeelib_tasker.ui.TaskerEditActivity$b r0 = new com.yeelight.yeelib_tasker.ui.TaskerEditActivity$b
            r0.<init>()
            r7.setOnClickListener(r0)
            android.widget.LinearLayout r7 = r6.f16402g
            com.yeelight.yeelib_tasker.ui.TaskerEditActivity$c r0 = new com.yeelight.yeelib_tasker.ui.TaskerEditActivity$c
            r0.<init>()
            r7.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib_tasker.p143ui.TaskerEditActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: q */
    public void mo23308q(String str) {
    }

    /* renamed from: r */
    public void mo23310r(String str) {
    }
}
