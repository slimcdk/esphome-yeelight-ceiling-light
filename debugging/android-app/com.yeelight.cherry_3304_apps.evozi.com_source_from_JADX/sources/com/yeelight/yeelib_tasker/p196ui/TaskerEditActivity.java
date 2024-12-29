package com.yeelight.yeelib_tasker.p196ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.p150c.C5980c;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p152f.C9812t;
import com.yeelight.yeelib.p153g.C4300b0;
import com.yeelight.yeelib.p153g.C9830b;
import com.yeelight.yeelib.p153g.C9833d;
import com.yeelight.yeelib.p153g.C9835f;
import com.yeelight.yeelib.p153g.C9836g;
import com.yeelight.yeelib.p153g.C9851t;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p185d.C7563a;
import com.yeelight.yeelib.p190i.C9875a;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10549p;
import com.yeelight.yeelib_tasker.R$drawable;
import com.yeelight.yeelib_tasker.R$integer;
import com.yeelight.yeelib_tasker.R$string;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib_tasker.ui.TaskerEditActivity */
public final class TaskerEditActivity extends AbstractPluginActivity implements C4201a.C4202i {

    /* renamed from: s */
    private static final String f20253s = TaskerEditActivity.class.getSimpleName();

    /* renamed from: c */
    CommonTitleBar f20254c;

    /* renamed from: d */
    FrameLayout f20255d;

    /* renamed from: e */
    LinearLayout f20256e;

    /* renamed from: f */
    LinearLayout f20257f;

    /* renamed from: g */
    LinearLayout f20258g;

    /* renamed from: h */
    LinearLayout f20259h;

    /* renamed from: i */
    TextView f20260i;

    /* renamed from: j */
    TextView f20261j;

    /* renamed from: k */
    ImageView f20262k;

    /* renamed from: l */
    TextView f20263l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public String f20264m = "";

    /* renamed from: n */
    private String f20265n = "";
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C7563a f20266o = null;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f20267p = 0;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f20268q = 0;

    /* renamed from: r */
    private JSONObject f20269r;

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerEditActivity$a */
    class C10592a implements View.OnClickListener {
        C10592a() {
        }

        public void onClick(View view) {
            TaskerEditActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerEditActivity$b */
    class C10593b implements View.OnClickListener {
        C10593b() {
        }

        public void onClick(View view) {
            TaskerEditActivity.this.startActivityForResult(new Intent(TaskerEditActivity.this, TypeSheetActivity.class), 1);
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerEditActivity$c */
    class C10594c implements View.OnClickListener {
        C10594c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(TaskerEditActivity.this, TaskerActionActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", TaskerEditActivity.this.f20264m);
            if (TaskerEditActivity.this.f20266o == C7563a.BRIGHT && TaskerEditActivity.this.f20267p != 0) {
                intent.putExtra("com.yeelight.cherry.device_bright", TaskerEditActivity.this.f20267p);
            }
            TaskerEditActivity.this.startActivityForResult(intent, 2);
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerEditActivity$d */
    class C10595d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C4200i f20273a;

        C10595d(C4200i iVar) {
            this.f20273a = iVar;
        }

        public void run() {
            TaskerEditActivity.this.m25895i0(this.f20273a);
            TaskerEditActivity.this.f20256e.setVisibility(8);
            TaskerEditActivity.this.f20257f.setVisibility(0);
            TaskerEditActivity.this.f20258g.setVisibility(0);
            TaskerEditActivity.this.f20263l.setText(this.f20273a.mo23397U());
            TaskerEditActivity taskerEditActivity = TaskerEditActivity.this;
            taskerEditActivity.f20260i.setText(taskerEditActivity.f20266o.mo28969b(TaskerEditActivity.this));
            int i = C10596e.f20275a[TaskerEditActivity.this.f20266o.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                TaskerEditActivity.this.f20261j.setVisibility(4);
                return;
            }
            if (i == 7) {
                TextView textView = TaskerEditActivity.this.f20261j;
                textView.setText(String.valueOf(TaskerEditActivity.this.f20267p) + "%");
            } else if (i == 8) {
                C9856y s = C4300b0.m12083u().mo23754s(TaskerEditActivity.this.f20268q, this.f20273a.mo23330i1());
                if (s == null) {
                    s = C4300b0.m12083u().mo23744h(TaskerEditActivity.this.f20268q);
                }
                if (s != null) {
                    TaskerEditActivity.this.f20261j.setText(s.mo31885q());
                }
            } else if (i == 10) {
                C4300b0.m12083u().mo23750n(TaskerEditActivity.this.f20268q, this.f20273a.mo23330i1());
            } else {
                return;
            }
            TaskerEditActivity.this.f20261j.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerEditActivity$e */
    static /* synthetic */ class C10596e {

        /* renamed from: a */
        static final /* synthetic */ int[] f20275a;

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
                com.yeelight.yeelib.d.a[] r0 = com.yeelight.yeelib.p185d.C7563a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20275a = r0
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.ON     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20275a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.OFF     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f20275a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.TOGGLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f20275a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.BRIGHT_VARIABLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f20275a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.CT_VARIABLE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f20275a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.COLOR_VARIABLE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f20275a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.BRIGHT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f20275a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.SCENE     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f20275a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.COMMAND     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f20275a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.RECOMMEND_SCENE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib_tasker.p196ui.TaskerEditActivity.C10596e.<clinit>():void");
        }
    }

    /* renamed from: e0 */
    private C9856y m25892e0(int i, int i2, int i3, int i4, String str) {
        "mode = " + i + " , bright = " + i2 + " , color = " + i3 + " , ct = " + i4 + " , flowJson = " + str;
        if (i == 0) {
            return new C9836g("", -1, 3, i2, i4);
        }
        if (i == 1) {
            return new C9835f("", -1, 2, i2, i3);
        }
        if (i == 2) {
            try {
                return C9830b.m23922Z(new JSONObject(str));
            } catch (Exception unused) {
            }
        } else if (i != 3) {
            if (i == 4) {
                return new C9851t("", -1, 6, i2);
            }
            "No reason to run here! " + new Exception();
            return null;
        }
        return new C9833d("", -1, 3, i2);
    }

    /* renamed from: f0 */
    private C9856y m25893f0(int i, int i2, String str) {
        List k;
        C4200i L0 = C4257w.m11947l0().mo23651L0(str);
        if (L0 == null) {
            L0 = C4257w.m11947l0().mo23675k0(str);
        }
        if (L0 == null) {
            L0 = C4257w.m11947l0().mo23647G0(str);
        }
        if (L0 == null) {
            return null;
        }
        if (i == 0) {
            this.f20266o = C7563a.RECOMMEND_SCENE;
            k = C4300b0.m12083u().mo23747k(L0.mo23330i1());
        } else if (i == 1) {
            k = C4300b0.m12083u().mo23746j(L0.mo23330i1());
        } else if (i != 2) {
            return null;
        } else {
            k = C4300b0.m12083u().mo23751p(L0.mo23330i1());
        }
        return (C9856y) k.get(i2);
    }

    /* renamed from: g0 */
    static String m25894g0(Context context, String str) {
        int integer = context.getResources().getInteger(R$integer.twofortyfouram_locale_maximum_blurb_length);
        return str.length() > integer ? str.substring(0, integer) : str;
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public void m25895i0(C4200i iVar) {
        int i;
        if (iVar instanceof C5980c) {
            C9875a m = C9812t.m23832j().mo31686m(this.f20264m);
            if (m != null) {
                i = C10549p.m25765a(2, m.mo31957r());
            } else {
                return;
            }
        } else {
            i = iVar.mo23303F();
        }
        this.f20262k.setImageDrawable(ContextCompat.getDrawable(this, i));
    }

    /* renamed from: C */
    public void mo23456C(C4201a.C4212k kVar) {
    }

    /* renamed from: H */
    public void mo23457H() {
    }

    /* renamed from: d */
    public void mo23458d() {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r0 = java.lang.String.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        r1 = new android.content.Intent();
        r2 = com.yeelight.yeelib_tasker.p195c.C10572b.m25878a(getApplicationContext(), r7.f20265n, r7.f20264m, r7.f20266o.name(), r0);
        r1.putExtra("com.twofortyfouram.locale.intent.extra.BUNDLE", r2);
        r3 = m25894g0(getApplicationContext(), "Device: " + r7.f20263l.getText().toString() + ", Action: " + r7.f20266o.name());
        r4 = r7.f20266o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008d, code lost:
        if (r4 == com.yeelight.yeelib.p185d.C7563a.BRIGHT) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0091, code lost:
        if (r4 == com.yeelight.yeelib.p185d.C7563a.SCENE) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0095, code lost:
        if (r4 == com.yeelight.yeelib.p185d.C7563a.RECOMMEND_SCENE) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0099, code lost:
        if (r4 == com.yeelight.yeelib.p185d.C7563a.BRIGHT_VARIABLE) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009d, code lost:
        if (r4 == com.yeelight.yeelib.p185d.C7563a.CT_VARIABLE) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a1, code lost:
        if (r4 == com.yeelight.yeelib.p185d.C7563a.COLOR_VARIABLE) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a5, code lost:
        if (r4 != com.yeelight.yeelib.p185d.C7563a.COMMAND) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a7, code lost:
        r3 = r3 + ", Param: " + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bb, code lost:
        r1.putExtra("com.twofortyfouram.locale.intent.extra.BLURB", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c4, code lost:
        if (r7.f20266o != com.yeelight.yeelib.p185d.C7563a.BRIGHT_VARIABLE) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d2, code lost:
        if (com.yeelight.yeelib_tasker.C10569b.m25872h(getIntent().getExtras()) == false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d4, code lost:
        com.yeelight.yeelib_tasker.C10569b.m25867c(r1, new java.lang.String[]{"%YeelightBright\nBright\nThe bright you want to set to your device."});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e1, code lost:
        if (r7.f20266o != com.yeelight.yeelib.p185d.C7563a.CT_VARIABLE) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ef, code lost:
        if (com.yeelight.yeelib_tasker.C10569b.m25872h(getIntent().getExtras()) == false) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f1, code lost:
        r0 = com.yeelight.yeelib.p152f.C4257w.m11945h0(r7.f20264m);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f7, code lost:
        if (r0 == null) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f9, code lost:
        r0 = com.yeelight.yeelib.device.models.C7632k.m22541b(r0.mo23395T());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0101, code lost:
        if (r0 == null) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0103, code lost:
        r3 = r0.mo29080b();
        r0 = r0.mo29079a();
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
        com.yeelight.yeelib_tasker.C10569b.m25867c(r1, new java.lang.String[]{r0});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x014b, code lost:
        if (r7.f20266o != com.yeelight.yeelib.p185d.C7563a.COLOR_VARIABLE) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0159, code lost:
        if (com.yeelight.yeelib_tasker.C10569b.m25872h(getIntent().getExtras()) == false) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x015b, code lost:
        com.yeelight.yeelib_tasker.C10569b.m25867c(r1, new java.lang.String[]{"%YeelightColor\nColor\nThe color you want to set to your device."});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0168, code lost:
        if (com.yeelight.yeelib_tasker.C10569b.C10570a.m25873a(r7) == false) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x016a, code lost:
        com.yeelight.yeelib_tasker.C10569b.C10570a.m25875c(r2, new java.lang.String[]{"com.yeelight.tasker.extra.PARAM"});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0173, code lost:
        setResult(-1, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void finish() {
        /*
            r7 = this;
            boolean r0 = r7.mo33408V()
            if (r0 != 0) goto L_0x0177
            java.lang.String r0 = r7.f20264m
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0177
            com.yeelight.yeelib.d.a r0 = r7.f20266o
            if (r0 == 0) goto L_0x0177
            int[] r1 = com.yeelight.yeelib_tasker.p196ui.TaskerEditActivity.C10596e.f20275a
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
            org.json.JSONObject r0 = r7.f20269r
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = r0.toString()
            goto L_0x003c
        L_0x0027:
            int r0 = r7.f20268q
            goto L_0x002c
        L_0x002a:
            int r0 = r7.f20267p
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
            java.lang.String r3 = r7.f20265n
            java.lang.String r4 = r7.f20264m
            com.yeelight.yeelib.d.a r5 = r7.f20266o
            java.lang.String r5 = r5.name()
            android.os.Bundle r2 = com.yeelight.yeelib_tasker.p195c.C10572b.m25878a(r2, r3, r4, r5, r0)
            java.lang.String r3 = "com.twofortyfouram.locale.intent.extra.BUNDLE"
            r1.putExtra(r3, r2)
            android.content.Context r3 = r7.getApplicationContext()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Device: "
            r4.append(r5)
            android.widget.TextView r5 = r7.f20263l
            java.lang.CharSequence r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            r4.append(r5)
            java.lang.String r5 = ", Action: "
            r4.append(r5)
            com.yeelight.yeelib.d.a r5 = r7.f20266o
            java.lang.String r5 = r5.name()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r3 = m25894g0(r3, r4)
            com.yeelight.yeelib.d.a r4 = r7.f20266o
            com.yeelight.yeelib.d.a r5 = com.yeelight.yeelib.p185d.C7563a.BRIGHT
            if (r4 == r5) goto L_0x00a7
            com.yeelight.yeelib.d.a r5 = com.yeelight.yeelib.p185d.C7563a.SCENE
            if (r4 == r5) goto L_0x00a7
            com.yeelight.yeelib.d.a r5 = com.yeelight.yeelib.p185d.C7563a.RECOMMEND_SCENE
            if (r4 == r5) goto L_0x00a7
            com.yeelight.yeelib.d.a r5 = com.yeelight.yeelib.p185d.C7563a.BRIGHT_VARIABLE
            if (r4 == r5) goto L_0x00a7
            com.yeelight.yeelib.d.a r5 = com.yeelight.yeelib.p185d.C7563a.CT_VARIABLE
            if (r4 == r5) goto L_0x00a7
            com.yeelight.yeelib.d.a r5 = com.yeelight.yeelib.p185d.C7563a.COLOR_VARIABLE
            if (r4 == r5) goto L_0x00a7
            com.yeelight.yeelib.d.a r5 = com.yeelight.yeelib.p185d.C7563a.COMMAND
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
            com.yeelight.yeelib.d.a r0 = r7.f20266o
            com.yeelight.yeelib.d.a r3 = com.yeelight.yeelib.p185d.C7563a.BRIGHT_VARIABLE
            if (r0 != r3) goto L_0x00dd
            android.content.Intent r0 = r7.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            boolean r0 = com.yeelight.yeelib_tasker.C10569b.m25872h(r0)
            if (r0 == 0) goto L_0x00dd
            java.lang.String r0 = "%YeelightBright\nBright\nThe bright you want to set to your device."
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.yeelight.yeelib_tasker.C10569b.m25867c(r1, r0)
        L_0x00dd:
            com.yeelight.yeelib.d.a r0 = r7.f20266o
            com.yeelight.yeelib.d.a r3 = com.yeelight.yeelib.p185d.C7563a.CT_VARIABLE
            if (r0 != r3) goto L_0x0147
            android.content.Intent r0 = r7.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            boolean r0 = com.yeelight.yeelib_tasker.C10569b.m25872h(r0)
            if (r0 == 0) goto L_0x0147
            java.lang.String r0 = r7.f20264m
            com.yeelight.yeelib.c.i.d r0 = com.yeelight.yeelib.p152f.C4257w.m11945h0(r0)
            if (r0 == 0) goto L_0x0147
            java.lang.String r0 = r0.mo23395T()
            com.yeelight.yeelib.device.models.k$a r0 = com.yeelight.yeelib.device.models.C7632k.m22541b(r0)
            if (r0 == 0) goto L_0x0147
            int r3 = r0.mo29080b()
            int r0 = r0.mo29079a()
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
            com.yeelight.yeelib_tasker.C10569b.m25867c(r1, r3)
        L_0x0147:
            com.yeelight.yeelib.d.a r0 = r7.f20266o
            com.yeelight.yeelib.d.a r3 = com.yeelight.yeelib.p185d.C7563a.COLOR_VARIABLE
            if (r0 != r3) goto L_0x0164
            android.content.Intent r0 = r7.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            boolean r0 = com.yeelight.yeelib_tasker.C10569b.m25872h(r0)
            if (r0 == 0) goto L_0x0164
            java.lang.String r0 = "%YeelightColor\nColor\nThe color you want to set to your device."
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.yeelight.yeelib_tasker.C10569b.m25867c(r1, r0)
        L_0x0164:
            boolean r0 = com.yeelight.yeelib_tasker.C10569b.C10570a.m25873a(r7)
            if (r0 == 0) goto L_0x0173
            java.lang.String r0 = "com.yeelight.tasker.extra.PARAM"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.yeelight.yeelib_tasker.C10569b.C10570a.m25875c(r2, r0)
        L_0x0173:
            r0 = -1
            r7.setResult(r0, r1)
        L_0x0177:
            super.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib_tasker.p196ui.TaskerEditActivity.finish():void");
    }

    /* renamed from: g */
    public void mo23459g() {
    }

    /* renamed from: h0 */
    public String mo33428h0() {
        JSONObject jSONObject = this.f20269r;
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.getString("method").equals("set_power")) {
                return this.f20269r.getString("params").contains("on") ? C4297y.f7456e.getString(R$string.common_text_turn_on) : C4297y.f7456e.getString(R$string.common_text_turn_off);
            }
            String string = this.f20269r.getString("params");
            "getSceneCommandInfo , scene params : " + string;
            String str = string.split(Constants.ACCEPT_TIME_SEPARATOR_SP)[0];
            if (str.contains("color")) {
                return C4297y.f7456e.getString(com.yeelight.yeelib.R$string.common_text_colors);
            }
            if (!str.contains("cf")) {
                if (!str.contains("hsv")) {
                    return str.contains("nightlight") ? C4297y.f7456e.getString(com.yeelight.yeelib.R$string.common_text_night_light) : C4297y.f7456e.getString(com.yeelight.yeelib.R$string.common_text_sunshine);
                }
            }
            return C4297y.f7456e.getString(com.yeelight.yeelib.R$string.common_text_flow);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public void mo23460i() {
        C4200i o0 = C4257w.m11953o0(this.f20264m);
        if (o0 != null) {
            runOnUiThread(new C10595d(o0));
        }
    }

    /* renamed from: l */
    public void mo23461l() {
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        C9856y f0;
        if (i == 1 && i2 == -1) {
            this.f20264m = intent.getStringExtra("com.yeelight.cherry.device_id");
            String stringExtra = intent.getStringExtra("com.yeelight.cherry.type");
            this.f20265n = stringExtra;
            if (stringExtra.equals("type_device")) {
                "onActivityResult, device id: " + this.f20264m;
                C4200i o0 = C4257w.m11953o0(this.f20264m);
                if (o0 != null) {
                    m25895i0(o0);
                    this.f20263l.setText(o0.mo23397U());
                    this.f20256e.setVisibility(8);
                    this.f20257f.setVisibility(0);
                    this.f20258g.setVisibility(0);
                    if (this.f20266o != null) {
                        return;
                    }
                } else {
                    return;
                }
            } else if (this.f20265n.equals("type_group")) {
                "onActivityResult, group id: " + this.f20264m;
                C5980c k0 = C4257w.m11947l0().mo23675k0(this.f20264m);
                if (k0 != null) {
                    this.f20262k.setImageResource(R$drawable.icon_yeelight_device_badge_group_small);
                    this.f20263l.setText(k0.mo23397U());
                    this.f20256e.setVisibility(8);
                    this.f20257f.setVisibility(0);
                    this.f20258g.setVisibility(0);
                    if (this.f20266o != null) {
                        return;
                    }
                } else {
                    return;
                }
            } else if (this.f20265n.equals("type_room")) {
                "onActivityResult, room id: " + this.f20264m;
                C9875a m = C9812t.m23832j().mo31686m(this.f20264m);
                if (m != null) {
                    this.f20262k.setImageResource(C10549p.m25765a(2, m.mo31957r()));
                    this.f20263l.setText(m.mo31954o());
                    this.f20256e.setVisibility(8);
                    this.f20257f.setVisibility(0);
                    this.f20258g.setVisibility(0);
                    if (this.f20266o != null) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
            this.f20266o = C7563a.ON;
        } else if (i == 2 && i2 == -1) {
            this.f20266o = C7563a.values()[intent.getIntExtra("com.yeelight.cherry.device_action", 0)];
            "onActivityResult, device action: " + this.f20266o;
            this.f20260i.setText(this.f20266o.mo28969b(this));
            switch (C10596e.f20275a[this.f20266o.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    this.f20261j.setVisibility(4);
                    return;
                case 7:
                    this.f20267p = intent.getIntExtra("com.yeelight.cherry.device_bright", 0);
                    this.f20261j.setText(String.valueOf(this.f20267p) + "%");
                    this.f20261j.setVisibility(0);
                    return;
                case 8:
                    this.f20261j.setVisibility(0);
                    int intExtra = intent.getIntExtra("scene_type", -1);
                    C4200i o02 = C4257w.m11953o0(this.f20264m);
                    if (intExtra == 1002) {
                        this.f20266o = C7563a.COMMAND;
                        C9856y e0 = m25892e0(intent.getIntExtra("light_adjust_mode", -1), intent.getIntExtra("light_adjust_bright", -1), intent.getIntExtra("light_adjust_color", -1), intent.getIntExtra("light_adjust_ct", -1), intent.getStringExtra("light_adjust_json"));
                        if (e0 != null) {
                            this.f20269r = e0.mo31743a();
                            this.f20261j.setText(mo33428h0());
                            return;
                        }
                        return;
                    } else if (intExtra == 1003 && (f0 = m25893f0(intent.getIntExtra("scene_select_mode", -1), intent.getIntExtra("scene_select_position", -1), o02.mo23372G())) != null) {
                        this.f20268q = f0.mo31886r();
                        this.f20261j.setText(f0.mo31885q());
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
        r6.f20261j.setText(r7.mo31885q());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0197, code lost:
        if (r7 != null) goto L_0x0158;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            r6.mo32193P()
            r7 = 1
            com.yeelight.yeelib.utils.C10547m.m25758h(r7, r6)
            int r7 = com.yeelight.yeelib_tasker.R$layout.activity_tasker_edit
            r6.setContentView(r7)
            int r7 = com.yeelight.yeelib_tasker.R$id.title_bar
            android.view.View r7 = r6.findViewById(r7)
            com.yeelight.yeelib.ui.view.CommonTitleBar r7 = (com.yeelight.yeelib.p194ui.view.CommonTitleBar) r7
            r6.f20254c = r7
            int r7 = com.yeelight.yeelib_tasker.R$id.layout_device
            android.view.View r7 = r6.findViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            int r7 = com.yeelight.yeelib_tasker.R$id.layout_device_content
            android.view.View r7 = r6.findViewById(r7)
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            r6.f20255d = r7
            int r7 = com.yeelight.yeelib_tasker.R$id.layout_device_add
            android.view.View r7 = r6.findViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r6.f20256e = r7
            int r7 = com.yeelight.yeelib_tasker.R$id.layout_device_info
            android.view.View r7 = r6.findViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r6.f20257f = r7
            int r7 = com.yeelight.yeelib_tasker.R$id.layout_action
            android.view.View r7 = r6.findViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r6.f20258g = r7
            int r7 = com.yeelight.yeelib_tasker.R$id.layout_action_content
            android.view.View r7 = r6.findViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r6.f20259h = r7
            int r7 = com.yeelight.yeelib_tasker.R$id.tv_action_name
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6.f20260i = r7
            int r7 = com.yeelight.yeelib_tasker.R$id.tv_action_content
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6.f20261j = r7
            int r7 = com.yeelight.yeelib_tasker.R$id.device_badge
            android.view.View r7 = r6.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r6.f20262k = r7
            int r7 = com.yeelight.yeelib_tasker.R$id.device_name
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6.f20263l = r7
            android.content.Intent r7 = r6.getIntent()
            com.yeelight.yeelib_tasker.p195c.C10571a.m25876a(r7)
            android.content.Intent r7 = r6.getIntent()
            java.lang.String r0 = "com.twofortyfouram.locale.intent.extra.BUNDLE"
            android.os.Bundle r7 = r7.getBundleExtra(r0)
            com.yeelight.yeelib_tasker.p195c.C10571a.m25877b(r7)
            com.yeelight.yeelib.ui.view.CommonTitleBar r0 = r6.f20254c
            com.yeelight.yeelib_tasker.ui.TaskerEditActivity$a r1 = new com.yeelight.yeelib_tasker.ui.TaskerEditActivity$a
            r1.<init>()
            java.lang.String r2 = "Tasker"
            r3 = 0
            r0.mo32825a(r2, r1, r3)
            com.yeelight.yeelib.ui.view.CommonTitleBar r0 = r6.f20254c
            r1 = 16
            r0.setTitleTextSize(r1)
            boolean r0 = com.yeelight.yeelib_tasker.p195c.C10572b.m25879b(r7)
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L_0x01cb
            java.lang.String r0 = "com.yeelight.tasker.extra.DEVICE_TYPE"
            java.lang.String r0 = r7.getString(r0)
            r6.f20265n = r0
            java.lang.String r0 = "com.yeelight.tasker.extra.DEVICE_ID"
            java.lang.String r0 = r7.getString(r0)
            r6.f20264m = r0
            java.lang.String r0 = "com.yeelight.tasker.extra.ACTION"
            java.lang.String r0 = r7.getString(r0)
            java.lang.String r0 = com.yeelight.yeelib.p185d.C7563a.m22345a(r0)
            com.yeelight.yeelib.d.a r0 = com.yeelight.yeelib.p185d.C7563a.valueOf(r0)
            r6.f20266o = r0
            java.lang.String r0 = "com.yeelight.tasker.extra.PARAM"
            java.lang.String r7 = r7.getString(r0)
            java.lang.String r0 = r6.f20264m
            com.yeelight.yeelib.c.i.i r0 = com.yeelight.yeelib.p152f.C4257w.m11953o0(r0)
            int[] r4 = com.yeelight.yeelib_tasker.p196ui.TaskerEditActivity.C10596e.f20275a
            com.yeelight.yeelib.d.a r5 = r6.f20266o
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
            r6.f20269r = r4     // Catch:{ JSONException -> 0x00f4 }
            goto L_0x010c
        L_0x00f4:
            r6.f20269r = r3
            goto L_0x010c
        L_0x00f7:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r7 = r7.intValue()
            r6.f20268q = r7
            goto L_0x010c
        L_0x0102:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r7 = r7.intValue()
            r6.f20267p = r7
        L_0x010c:
            if (r0 == 0) goto L_0x01c3
            r6.m25895i0(r0)
            android.widget.LinearLayout r7 = r6.f20256e
            r7.setVisibility(r1)
            android.widget.LinearLayout r7 = r6.f20257f
            r7.setVisibility(r2)
            android.widget.LinearLayout r7 = r6.f20258g
            r7.setVisibility(r2)
            android.widget.TextView r7 = r6.f20263l
            java.lang.String r1 = r0.mo23397U()
            r7.setText(r1)
            android.widget.TextView r7 = r6.f20260i
            com.yeelight.yeelib.d.a r1 = r6.f20266o
            java.lang.String r1 = r1.mo28969b(r6)
            r7.setText(r1)
            int[] r7 = com.yeelight.yeelib_tasker.p196ui.TaskerEditActivity.C10596e.f20275a
            com.yeelight.yeelib.d.a r1 = r6.f20266o
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
            android.widget.TextView r7 = r6.f20261j
            r7.setVisibility(r2)
            com.yeelight.yeelib.g.b0 r7 = com.yeelight.yeelib.p153g.C4300b0.m12083u()
            int r1 = r6.f20268q
            java.lang.String r0 = r0.mo23330i1()
            com.yeelight.yeelib.g.y r7 = r7.mo23750n(r1, r0)
            if (r7 == 0) goto L_0x01da
        L_0x0158:
            android.widget.TextView r0 = r6.f20261j
            java.lang.String r7 = r7.mo31885q()
            r0.setText(r7)
            goto L_0x01da
        L_0x0163:
            android.widget.TextView r7 = r6.f20260i
            com.yeelight.yeelib.d.a r0 = com.yeelight.yeelib.p185d.C7563a.SCENE
            java.lang.String r0 = r0.mo28969b(r6)
            r7.setText(r0)
            android.widget.TextView r7 = r6.f20261j
            java.lang.String r0 = r6.mo33428h0()
            r7.setText(r0)
            goto L_0x01da
        L_0x0178:
            android.widget.TextView r7 = r6.f20261j
            r7.setVisibility(r2)
            com.yeelight.yeelib.g.b0 r7 = com.yeelight.yeelib.p153g.C4300b0.m12083u()
            int r1 = r6.f20268q
            java.lang.String r0 = r0.mo23330i1()
            com.yeelight.yeelib.g.y r7 = r7.mo23754s(r1, r0)
            if (r7 != 0) goto L_0x0197
            com.yeelight.yeelib.g.b0 r7 = com.yeelight.yeelib.p153g.C4300b0.m12083u()
            int r0 = r6.f20268q
            com.yeelight.yeelib.g.y r7 = r7.mo23744h(r0)
        L_0x0197:
            if (r7 == 0) goto L_0x01da
            goto L_0x0158
        L_0x019a:
            android.widget.TextView r7 = r6.f20261j
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.f20267p
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.append(r1)
            java.lang.String r1 = "%"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.setText(r0)
            android.widget.TextView r7 = r6.f20261j
            r7.setVisibility(r2)
            goto L_0x01da
        L_0x01bc:
            android.widget.TextView r7 = r6.f20261j
            r0 = 4
            r7.setVisibility(r0)
            goto L_0x01da
        L_0x01c3:
            com.yeelight.yeelib.f.a r7 = com.yeelight.yeelib.p152f.C4201a.m11607r()
            r7.mo23444M(r6)
            goto L_0x01da
        L_0x01cb:
            android.widget.LinearLayout r7 = r6.f20256e
            r7.setVisibility(r2)
            android.widget.LinearLayout r7 = r6.f20257f
            r7.setVisibility(r1)
            android.widget.LinearLayout r7 = r6.f20258g
            r7.setVisibility(r1)
        L_0x01da:
            android.widget.FrameLayout r7 = r6.f20255d
            com.yeelight.yeelib_tasker.ui.TaskerEditActivity$b r0 = new com.yeelight.yeelib_tasker.ui.TaskerEditActivity$b
            r0.<init>()
            r7.setOnClickListener(r0)
            android.widget.LinearLayout r7 = r6.f20259h
            com.yeelight.yeelib_tasker.ui.TaskerEditActivity$c r0 = new com.yeelight.yeelib_tasker.ui.TaskerEditActivity$c
            r0.<init>()
            r7.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib_tasker.p196ui.TaskerEditActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: q */
    public void mo23462q(String str) {
    }

    /* renamed from: r */
    public void mo23463r(String str) {
    }
}
