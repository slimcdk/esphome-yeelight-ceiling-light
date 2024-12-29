package com.yeelight.yeelib.p142ui.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.yeelight.yeelib.R$color;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.p142ui.widget.C8891a;
import com.yeelight.yeelib.p142ui.widget.InputTextView;
import java.lang.ref.WeakReference;

/* renamed from: com.yeelight.yeelib.ui.widget.YLAlertController */
public class YLAlertController {

    /* renamed from: A */
    private TextView f16218A;

    /* renamed from: B */
    private View f16219B;

    /* renamed from: C */
    private boolean f16220C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public ListAdapter f16221D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public int f16222E = -1;

    /* renamed from: F */
    private int f16223F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public int f16224G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public int f16225H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public int f16226I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public int f16227J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public int f16228K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public int f16229L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public Handler f16230M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public boolean f16231N = false;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public boolean f16232O = true;

    /* renamed from: P */
    private boolean f16233P = false;

    /* renamed from: Q */
    View.OnClickListener f16234Q = new C8880a();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f16235a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final DialogInterface f16236b;

    /* renamed from: c */
    private final Window f16237c;

    /* renamed from: d */
    private CharSequence f16238d;

    /* renamed from: e */
    private CharSequence f16239e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ListView f16240f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public View f16241g;

    /* renamed from: h */
    private int f16242h;

    /* renamed from: i */
    private int f16243i;

    /* renamed from: j */
    private int f16244j;

    /* renamed from: k */
    private int f16245k;

    /* renamed from: l */
    private boolean f16246l = false;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Button f16247m;

    /* renamed from: n */
    private CharSequence f16248n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Message f16249o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public Button f16250p;

    /* renamed from: q */
    private CharSequence f16251q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public Message f16252r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public Button f16253s;

    /* renamed from: t */
    private CharSequence f16254t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public Message f16255u;

    /* renamed from: v */
    private ScrollView f16256v;

    /* renamed from: w */
    private int f16257w = -1;

    /* renamed from: x */
    private Drawable f16258x;

    /* renamed from: y */
    private ImageView f16259y;

    /* renamed from: z */
    private TextView f16260z;

    /* renamed from: com.yeelight.yeelib.ui.widget.YLAlertController$RecycleListView */
    public static class RecycleListView extends ListView {

        /* renamed from: a */
        boolean f16261a;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.widget.YLAlertController$a */
    class C8880a implements View.OnClickListener {
        C8880a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0057  */
        /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                com.yeelight.yeelib.ui.widget.YLAlertController r0 = com.yeelight.yeelib.p142ui.widget.YLAlertController.this
                android.widget.Button r0 = r0.f16247m
                if (r3 != r0) goto L_0x001b
                com.yeelight.yeelib.ui.widget.YLAlertController r0 = com.yeelight.yeelib.p142ui.widget.YLAlertController.this
                android.os.Message r0 = r0.f16249o
                if (r0 == 0) goto L_0x001b
                com.yeelight.yeelib.ui.widget.YLAlertController r3 = com.yeelight.yeelib.p142ui.widget.YLAlertController.this
                android.os.Message r3 = r3.f16249o
            L_0x0016:
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x004a
            L_0x001b:
                com.yeelight.yeelib.ui.widget.YLAlertController r0 = com.yeelight.yeelib.p142ui.widget.YLAlertController.this
                android.widget.Button r0 = r0.f16250p
                if (r3 != r0) goto L_0x0032
                com.yeelight.yeelib.ui.widget.YLAlertController r0 = com.yeelight.yeelib.p142ui.widget.YLAlertController.this
                android.os.Message r0 = r0.f16252r
                if (r0 == 0) goto L_0x0032
                com.yeelight.yeelib.ui.widget.YLAlertController r3 = com.yeelight.yeelib.p142ui.widget.YLAlertController.this
                android.os.Message r3 = r3.f16252r
                goto L_0x0016
            L_0x0032:
                com.yeelight.yeelib.ui.widget.YLAlertController r0 = com.yeelight.yeelib.p142ui.widget.YLAlertController.this
                android.widget.Button r0 = r0.f16253s
                if (r3 != r0) goto L_0x0049
                com.yeelight.yeelib.ui.widget.YLAlertController r3 = com.yeelight.yeelib.p142ui.widget.YLAlertController.this
                android.os.Message r3 = r3.f16255u
                if (r3 == 0) goto L_0x0049
                com.yeelight.yeelib.ui.widget.YLAlertController r3 = com.yeelight.yeelib.p142ui.widget.YLAlertController.this
                android.os.Message r3 = r3.f16255u
                goto L_0x0016
            L_0x0049:
                r3 = 0
            L_0x004a:
                if (r3 == 0) goto L_0x004f
                r3.sendToTarget()
            L_0x004f:
                com.yeelight.yeelib.ui.widget.YLAlertController r3 = com.yeelight.yeelib.p142ui.widget.YLAlertController.this
                boolean r3 = r3.f16232O
                if (r3 == 0) goto L_0x006b
                com.yeelight.yeelib.ui.widget.YLAlertController r3 = com.yeelight.yeelib.p142ui.widget.YLAlertController.this
                android.os.Handler r3 = r3.f16230M
                r0 = 1
                com.yeelight.yeelib.ui.widget.YLAlertController r1 = com.yeelight.yeelib.p142ui.widget.YLAlertController.this
                android.content.DialogInterface r1 = r1.f16236b
                android.os.Message r3 = r3.obtainMessage(r0, r1)
                r3.sendToTarget()
            L_0x006b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p142ui.widget.YLAlertController.C8880a.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.widget.YLAlertController$b */
    class C8881b implements InputTextView.C8876b {
        C8881b() {
        }

        /* renamed from: a */
        public void mo36564a(boolean z) {
            Button button;
            int i;
            Context context;
            if (z) {
                YLAlertController.this.f16247m.setClickable(true);
                button = YLAlertController.this.f16247m;
                context = YLAlertController.this.f16235a;
                i = R$color.common_button;
            } else {
                YLAlertController.this.f16247m.setClickable(false);
                button = YLAlertController.this.f16247m;
                context = YLAlertController.this.f16235a;
                i = R$color.black_10_transparent;
            }
            button.setTextColor(ContextCompat.getColor(context, i));
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.widget.YLAlertController$c */
    public static class C8882c {

        /* renamed from: A */
        public boolean f16264A;

        /* renamed from: B */
        public boolean f16265B;

        /* renamed from: C */
        public int f16266C = -1;

        /* renamed from: D */
        public DialogInterface.OnMultiChoiceClickListener f16267D;

        /* renamed from: E */
        public Cursor f16268E;

        /* renamed from: F */
        public String f16269F;

        /* renamed from: G */
        public String f16270G;

        /* renamed from: H */
        public boolean f16271H;

        /* renamed from: I */
        public AdapterView.OnItemSelectedListener f16272I;

        /* renamed from: J */
        public C8889g f16273J;

        /* renamed from: K */
        public boolean f16274K = true;

        /* renamed from: L */
        public boolean f16275L = true;

        /* renamed from: M */
        public C8891a.C8895c f16276M;

        /* renamed from: N */
        public CharSequence f16277N;

        /* renamed from: O */
        public boolean f16278O = false;

        /* renamed from: a */
        public final Context f16279a;

        /* renamed from: b */
        public final LayoutInflater f16280b;

        /* renamed from: c */
        public int f16281c = 0;

        /* renamed from: d */
        public Drawable f16282d;

        /* renamed from: e */
        public CharSequence f16283e;

        /* renamed from: f */
        public View f16284f;

        /* renamed from: g */
        public CharSequence f16285g;

        /* renamed from: h */
        public CharSequence f16286h;

        /* renamed from: i */
        public DialogInterface.OnClickListener f16287i;

        /* renamed from: j */
        public CharSequence f16288j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f16289k;

        /* renamed from: l */
        public CharSequence f16290l;

        /* renamed from: m */
        public DialogInterface.OnClickListener f16291m;

        /* renamed from: n */
        public boolean f16292n;

        /* renamed from: o */
        public DialogInterface.OnCancelListener f16293o;

        /* renamed from: p */
        public DialogInterface.OnKeyListener f16294p;

        /* renamed from: q */
        public CharSequence[] f16295q;

        /* renamed from: r */
        public ListAdapter f16296r;

        /* renamed from: s */
        public DialogInterface.OnClickListener f16297s;

        /* renamed from: t */
        public View f16298t;

        /* renamed from: u */
        public int f16299u;

        /* renamed from: v */
        public int f16300v;

        /* renamed from: w */
        public int f16301w;

        /* renamed from: x */
        public int f16302x;

        /* renamed from: y */
        public boolean f16303y = false;

        /* renamed from: z */
        public boolean[] f16304z;

        /* renamed from: com.yeelight.yeelib.ui.widget.YLAlertController$c$a */
        class C8883a implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            final /* synthetic */ YLAlertController f16305a;

            C8883a(YLAlertController yLAlertController) {
                this.f16305a = yLAlertController;
            }

            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                C8882c.this.f16297s.onClick(this.f16305a.f16236b, i);
                if (!C8882c.this.f16265B) {
                    this.f16305a.f16236b.dismiss();
                }
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.widget.YLAlertController$c$b */
        class C8884b implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            final /* synthetic */ RecycleListView f16307a;

            /* renamed from: b */
            final /* synthetic */ YLAlertController f16308b;

            C8884b(RecycleListView recycleListView, YLAlertController yLAlertController) {
                this.f16307a = recycleListView;
                this.f16308b = yLAlertController;
            }

            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                boolean[] zArr = C8882c.this.f16304z;
                if (zArr != null) {
                    zArr[i] = this.f16307a.isItemChecked(i);
                }
                C8882c.this.f16267D.onClick(this.f16308b.f16236b, i, this.f16307a.isItemChecked(i));
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.widget.YLAlertController$c$c */
        class C8885c extends ArrayAdapter<CharSequence> {

            /* renamed from: a */
            final /* synthetic */ RecycleListView f16310a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C8885c(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f16310a = recycleListView;
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = C8882c.this.f16304z;
                if (zArr != null && zArr[i]) {
                    this.f16310a.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.widget.YLAlertController$c$d */
        class C8886d extends CursorAdapter {

            /* renamed from: a */
            private final int f16312a;

            /* renamed from: b */
            private final int f16313b;

            /* renamed from: c */
            final /* synthetic */ RecycleListView f16314c;

            /* renamed from: d */
            final /* synthetic */ YLAlertController f16315d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C8886d(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, YLAlertController yLAlertController) {
                super(context, cursor, z);
                this.f16314c = recycleListView;
                this.f16315d = yLAlertController;
                Cursor cursor2 = getCursor();
                this.f16312a = cursor2.getColumnIndexOrThrow(C8882c.this.f16269F);
                this.f16313b = cursor2.getColumnIndexOrThrow(C8882c.this.f16270G);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R$id.text1)).setText(cursor.getString(this.f16312a));
                RecycleListView recycleListView = this.f16314c;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f16313b) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C8882c.this.f16280b.inflate(this.f16315d.f16226I, viewGroup, false);
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.widget.YLAlertController$c$e */
        class C8887e implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            final /* synthetic */ YLAlertController f16317a;

            C8887e(YLAlertController yLAlertController) {
                this.f16317a = yLAlertController;
            }

            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                C8882c.this.f16297s.onClick(this.f16317a.f16236b, i);
                if (!C8882c.this.f16265B) {
                    this.f16317a.f16236b.dismiss();
                }
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.widget.YLAlertController$c$f */
        class C8888f implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            final /* synthetic */ RecycleListView f16319a;

            /* renamed from: b */
            final /* synthetic */ YLAlertController f16320b;

            C8888f(RecycleListView recycleListView, YLAlertController yLAlertController) {
                this.f16319a = recycleListView;
                this.f16320b = yLAlertController;
            }

            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                boolean[] zArr = C8882c.this.f16304z;
                if (zArr != null) {
                    zArr[i] = this.f16319a.isItemChecked(i);
                }
                C8882c.this.f16267D.onClick(this.f16320b.f16236b, i, this.f16319a.isItemChecked(i));
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.widget.YLAlertController$c$g */
        public interface C8889g {
            void onPrepareListView(ListView listView);
        }

        public C8882c(Context context) {
            this.f16279a = context;
            this.f16292n = true;
            this.f16280b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0083  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x008a  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0095  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m21201b(com.yeelight.yeelib.p142ui.widget.YLAlertController r12) {
            /*
                r11 = this;
                android.view.LayoutInflater r0 = r11.f16280b
                int r1 = r12.f16225H
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                int r1 = com.yeelight.yeelib.R$id.select_dialog_listview
                android.view.View r1 = r0.findViewById(r1)
                com.yeelight.yeelib.ui.widget.YLAlertController$RecycleListView r1 = (com.yeelight.yeelib.p142ui.widget.YLAlertController.RecycleListView) r1
                int r4 = com.yeelight.yeelib.R$layout.ml_center_item
                android.database.Cursor r2 = r11.f16268E
                r8 = 1
                if (r2 != 0) goto L_0x002d
                android.widget.ListAdapter r2 = r11.f16296r
                if (r2 == 0) goto L_0x0021
                goto L_0x0045
            L_0x0021:
                android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
                android.content.Context r3 = r11.f16279a
                int r5 = com.yeelight.yeelib.R$id.text1
                java.lang.CharSequence[] r6 = r11.f16295q
                r2.<init>(r3, r4, r5, r6)
                goto L_0x0045
            L_0x002d:
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r11.f16279a
                android.database.Cursor r5 = r11.f16268E
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r2 = r11.f16269F
                r7 = 0
                r6[r7] = r2
                int[] r10 = new int[r8]
                int r2 = com.yeelight.yeelib.R$id.text1
                r10[r7] = r2
                r2 = r9
                r7 = r10
                r2.<init>(r3, r4, r5, r6, r7)
            L_0x0045:
                java.lang.CharSequence r3 = r11.f16277N
                if (r3 == 0) goto L_0x0056
                int r3 = com.yeelight.yeelib.R$id.title
                android.view.View r3 = r0.findViewById(r3)
                android.widget.TextView r3 = (android.widget.TextView) r3
                java.lang.CharSequence r4 = r11.f16277N
                r3.setText(r4)
            L_0x0056:
                com.yeelight.yeelib.ui.widget.YLAlertController$c$g r3 = r11.f16273J
                if (r3 == 0) goto L_0x005d
                r3.onPrepareListView(r1)
            L_0x005d:
                android.widget.ListAdapter unused = r12.f16221D = r2
                r1.setAdapter(r2)
                int r2 = r11.f16266C
                int unused = r12.f16222E = r2
                android.content.DialogInterface$OnClickListener r2 = r11.f16297s
                if (r2 == 0) goto L_0x0075
                com.yeelight.yeelib.ui.widget.YLAlertController$c$a r2 = new com.yeelight.yeelib.ui.widget.YLAlertController$c$a
                r2.<init>(r12)
            L_0x0071:
                r1.setOnItemClickListener(r2)
                goto L_0x007f
            L_0x0075:
                android.content.DialogInterface$OnMultiChoiceClickListener r2 = r11.f16267D
                if (r2 == 0) goto L_0x007f
                com.yeelight.yeelib.ui.widget.YLAlertController$c$b r2 = new com.yeelight.yeelib.ui.widget.YLAlertController$c$b
                r2.<init>(r1, r12)
                goto L_0x0071
            L_0x007f:
                android.widget.AdapterView$OnItemSelectedListener r2 = r11.f16272I
                if (r2 == 0) goto L_0x0086
                r1.setOnItemSelectedListener(r2)
            L_0x0086:
                android.widget.AdapterView$OnItemSelectedListener r2 = r11.f16272I
                if (r2 == 0) goto L_0x008d
                r1.setOnItemSelectedListener(r2)
            L_0x008d:
                boolean r2 = r11.f16265B
                if (r2 == 0) goto L_0x0095
                r1.setChoiceMode(r8)
                goto L_0x009d
            L_0x0095:
                boolean r2 = r11.f16264A
                if (r2 == 0) goto L_0x009d
                r2 = 2
                r1.setChoiceMode(r2)
            L_0x009d:
                android.view.View unused = r12.f16241g = r0
                boolean unused = r12.f16231N = r8
                boolean r0 = r11.f16278O
                r12.mo36623F(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p142ui.widget.YLAlertController.C8882c.m21201b(com.yeelight.yeelib.ui.widget.YLAlertController):void");
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v2 */
        /* JADX WARNING: type inference failed for: r2v6, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v27, types: [com.yeelight.yeelib.ui.widget.YLAlertController$c$d] */
        /* JADX WARNING: type inference failed for: r1v28, types: [com.yeelight.yeelib.ui.widget.YLAlertController$c$c] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00a4  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00a8  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m21202c(com.yeelight.yeelib.p142ui.widget.YLAlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f16280b
                int r1 = r11.f16224G
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                com.yeelight.yeelib.ui.widget.YLAlertController$RecycleListView r0 = (com.yeelight.yeelib.p142ui.widget.YLAlertController.RecycleListView) r0
                boolean r1 = r10.f16264A
                r8 = 1
                if (r1 == 0) goto L_0x0038
                android.database.Cursor r1 = r10.f16268E
                if (r1 != 0) goto L_0x0029
                com.yeelight.yeelib.ui.widget.YLAlertController$c$c r9 = new com.yeelight.yeelib.ui.widget.YLAlertController$c$c
                android.content.Context r3 = r10.f16279a
                int r4 = r11.f16226I
                int r5 = com.yeelight.yeelib.R$id.text1
                java.lang.CharSequence[] r6 = r10.f16295q
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x0073
            L_0x0029:
                com.yeelight.yeelib.ui.widget.YLAlertController$c$d r9 = new com.yeelight.yeelib.ui.widget.YLAlertController$c$d
                android.content.Context r3 = r10.f16279a
                android.database.Cursor r4 = r10.f16268E
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x0073
            L_0x0038:
                boolean r1 = r10.f16265B
                if (r1 == 0) goto L_0x0041
                int r1 = r11.f16227J
                goto L_0x0045
            L_0x0041:
                int r1 = r11.f16228K
            L_0x0045:
                r4 = r1
                android.database.Cursor r1 = r10.f16268E
                if (r1 != 0) goto L_0x005c
                android.widget.ListAdapter r1 = r10.f16296r
                if (r1 == 0) goto L_0x004f
                goto L_0x005a
            L_0x004f:
                android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
                android.content.Context r2 = r10.f16279a
                int r3 = com.yeelight.yeelib.R$id.text1
                java.lang.CharSequence[] r5 = r10.f16295q
                r1.<init>(r2, r4, r3, r5)
            L_0x005a:
                r9 = r1
                goto L_0x0073
            L_0x005c:
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f16279a
                android.database.Cursor r5 = r10.f16268E
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.f16269F
                r2 = 0
                r6[r2] = r1
                int[] r7 = new int[r8]
                int r1 = com.yeelight.yeelib.R$id.text1
                r7[r2] = r1
                r2 = r9
                r2.<init>(r3, r4, r5, r6, r7)
            L_0x0073:
                com.yeelight.yeelib.ui.widget.YLAlertController$c$g r1 = r10.f16273J
                if (r1 == 0) goto L_0x007a
                r1.onPrepareListView(r0)
            L_0x007a:
                android.widget.ListAdapter unused = r11.f16221D = r9
                int r1 = r10.f16266C
                int unused = r11.f16222E = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f16297s
                if (r1 == 0) goto L_0x008f
                com.yeelight.yeelib.ui.widget.YLAlertController$c$e r1 = new com.yeelight.yeelib.ui.widget.YLAlertController$c$e
                r1.<init>(r11)
            L_0x008b:
                r0.setOnItemClickListener(r1)
                goto L_0x0099
            L_0x008f:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.f16267D
                if (r1 == 0) goto L_0x0099
                com.yeelight.yeelib.ui.widget.YLAlertController$c$f r1 = new com.yeelight.yeelib.ui.widget.YLAlertController$c$f
                r1.<init>(r0, r11)
                goto L_0x008b
            L_0x0099:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.f16272I
                if (r1 == 0) goto L_0x00a0
                r0.setOnItemSelectedListener(r1)
            L_0x00a0:
                boolean r1 = r10.f16265B
                if (r1 == 0) goto L_0x00a8
                r0.setChoiceMode(r8)
                goto L_0x00b0
            L_0x00a8:
                boolean r1 = r10.f16264A
                if (r1 == 0) goto L_0x00b0
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00b0:
                boolean r1 = r10.f16274K
                r0.f16261a = r1
                android.widget.ListView unused = r11.f16240f = r0
                boolean r0 = r10.f16278O
                r11.mo36623F(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p142ui.widget.YLAlertController.C8882c.m21202c(com.yeelight.yeelib.ui.widget.YLAlertController):void");
        }

        /* renamed from: a */
        public void mo36635a(YLAlertController yLAlertController) {
            View view = this.f16284f;
            if (view != null) {
                yLAlertController.mo36622E(view);
            } else {
                CharSequence charSequence = this.f16283e;
                if (charSequence != null) {
                    yLAlertController.mo36628K(charSequence);
                }
                Drawable drawable = this.f16282d;
                if (drawable != null) {
                    yLAlertController.mo36625H(drawable);
                }
                int i = this.f16281c;
                if (i >= 0) {
                    yLAlertController.mo36624G(i);
                }
            }
            CharSequence charSequence2 = this.f16285g;
            if (charSequence2 != null) {
                yLAlertController.mo36627J(charSequence2);
            }
            CharSequence charSequence3 = this.f16286h;
            if (charSequence3 != null) {
                yLAlertController.mo36621D(-1, charSequence3, this.f16287i, (Message) null);
            }
            CharSequence charSequence4 = this.f16288j;
            if (charSequence4 != null) {
                yLAlertController.mo36621D(-2, charSequence4, this.f16289k, (Message) null);
            }
            CharSequence charSequence5 = this.f16290l;
            if (charSequence5 != null) {
                yLAlertController.mo36621D(-3, charSequence5, this.f16291m, (Message) null);
            }
            if (this.f16271H) {
                yLAlertController.mo36626I(true);
            }
            boolean unused = yLAlertController.f16231N = false;
            if (!(this.f16295q == null && this.f16268E == null && this.f16296r == null)) {
                if (yLAlertController.f16229L == 17) {
                    m21201b(yLAlertController);
                } else {
                    m21202c(yLAlertController);
                }
            }
            View view2 = this.f16298t;
            if (view2 != null) {
                if (this.f16303y) {
                    yLAlertController.mo36630M(view2, this.f16299u, this.f16300v, this.f16301w, this.f16302x);
                } else {
                    yLAlertController.mo36629L(view2);
                }
            }
            yLAlertController.mo36620B(this.f16275L);
            yLAlertController.mo36623F(this.f16278O);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.widget.YLAlertController$d */
    private static final class C8890d extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f16322a;

        public C8890d(DialogInterface dialogInterface) {
            this.f16322a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f16322a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public YLAlertController(Context context, DialogInterface dialogInterface, Window window, int i) {
        this.f16235a = context;
        this.f16236b = dialogInterface;
        this.f16237c = window;
        this.f16230M = new C8890d(dialogInterface);
        this.f16223F = R$layout.yl_alert_dialog;
        this.f16224G = R$layout.yl_select_dialog;
        this.f16225H = R$layout.yl_select_dialog_center;
        this.f16226I = R$layout.ml_select_dialog_multichoice;
        this.f16227J = R$layout.ml_select_dialog_singlechoice;
        this.f16228K = R$layout.ml_select_dialog_item;
        this.f16229L = i;
    }

    /* renamed from: C */
    private void m21156C(LinearLayout linearLayout, LinearLayout linearLayout2, View view, boolean z, boolean z2, View view2) {
        ListAdapter listAdapter;
        int i;
        if (this.f16231N) {
            int color = ContextCompat.getColor(this.f16235a, 17170445);
            int color2 = ContextCompat.getColor(this.f16235a, 17170445);
            int color3 = ContextCompat.getColor(this.f16235a, 17170445);
            int color4 = ContextCompat.getColor(this.f16235a, 17170445);
            int color5 = ContextCompat.getColor(this.f16235a, 17170445);
            int color6 = ContextCompat.getColor(this.f16235a, 17170445);
            int color7 = ContextCompat.getColor(this.f16235a, 17170445);
            int color8 = ContextCompat.getColor(this.f16235a, 17170445);
            int color9 = ContextCompat.getColor(this.f16235a, 17170445);
            View[] viewArr = new View[4];
            boolean[] zArr = new boolean[4];
            if (z2) {
                viewArr[0] = linearLayout;
                zArr[0] = false;
                i = 1;
            } else {
                i = 0;
            }
            viewArr[i] = linearLayout2.getVisibility() == 8 ? null : linearLayout2;
            zArr[i] = this.f16240f != null;
            int i2 = i + 1;
            if (view != null) {
                viewArr[i2] = view;
                zArr[i2] = this.f16220C;
                i2++;
            }
            if (z) {
                viewArr[i2] = view2;
                zArr[i2] = true;
            }
            View view3 = null;
            boolean z3 = false;
            boolean z4 = false;
            for (int i3 = 0; i3 < 4; i3++) {
                View view4 = viewArr[i3];
                if (view4 != null) {
                    if (view3 != null) {
                        view3.setBackgroundResource(!z4 ? z3 ? color6 : color2 : z3 ? color7 : color3);
                        z4 = true;
                    }
                    z3 = zArr[i3];
                    view3 = view4;
                }
            }
            if (view3 != null) {
                if (z4) {
                    if (z3) {
                        color4 = z ? color9 : color8;
                    }
                    view3.setBackgroundResource(color4);
                } else {
                    if (z3) {
                        color = color5;
                    }
                    view3.setBackgroundResource(color);
                }
            }
        }
        ListView listView = this.f16240f;
        if (listView != null && (listAdapter = this.f16221D) != null) {
            listView.setAdapter(listAdapter);
            int i4 = this.f16222E;
            if (i4 > -1) {
                this.f16240f.setItemChecked(i4, true);
                this.f16240f.setSelection(this.f16222E);
            }
        }
    }

    /* renamed from: N */
    private boolean m21157N() {
        int i;
        Button button;
        Button button2 = (Button) this.f16237c.findViewById(R$id.button1);
        this.f16247m = button2;
        button2.setOnClickListener(this.f16234Q);
        if (TextUtils.isEmpty(this.f16248n)) {
            this.f16247m.setVisibility(8);
            i = 0;
        } else {
            this.f16247m.setText(this.f16248n);
            this.f16247m.setVisibility(0);
            View view = this.f16241g;
            if (view instanceof InputTextView) {
                InputTextView inputTextView = (InputTextView) view;
                if (TextUtils.isEmpty(inputTextView.getText().toString())) {
                    this.f16247m.setClickable(false);
                    this.f16247m.setTextColor(ContextCompat.getColor(this.f16235a, R$color.black_10_transparent));
                }
                inputTextView.setAffirmListener(new C8881b());
            }
            i = 1;
        }
        Button button3 = (Button) this.f16237c.findViewById(R$id.button2);
        this.f16250p = button3;
        button3.setOnClickListener(this.f16234Q);
        if (TextUtils.isEmpty(this.f16251q)) {
            this.f16250p.setVisibility(8);
        } else {
            this.f16250p.setText(this.f16251q);
            this.f16250p.setVisibility(0);
            i |= 2;
        }
        Button button4 = (Button) this.f16237c.findViewById(R$id.button3);
        this.f16253s = button4;
        button4.setOnClickListener(this.f16234Q);
        if (TextUtils.isEmpty(this.f16254t)) {
            this.f16253s.setVisibility(8);
        } else {
            this.f16253s.setText(this.f16254t);
            this.f16253s.setVisibility(0);
            i |= 4;
        }
        if (m21161R(i)) {
            if (i == 1) {
                button = this.f16247m;
            } else if (i == 2) {
                button = this.f16250p;
            } else if (i == 4) {
                button = this.f16253s;
            }
            m21184w(button);
        }
        return i != 0;
    }

    /* renamed from: O */
    private void m21158O(LinearLayout linearLayout) {
        Window window = this.f16237c;
        int i = R$id.scrollView;
        ScrollView scrollView = (ScrollView) window.findViewById(i);
        this.f16256v = scrollView;
        scrollView.setFocusable(false);
        TextView textView = (TextView) this.f16237c.findViewById(R$id.message);
        this.f16218A = textView;
        if (textView != null) {
            CharSequence charSequence = this.f16239e;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.f16256v.removeView(this.f16218A);
            if (this.f16240f != null) {
                linearLayout.removeView(this.f16237c.findViewById(i));
                linearLayout.addView(this.f16240f, new LinearLayout.LayoutParams(-1, -1));
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
                return;
            }
            linearLayout.setVisibility(8);
        }
    }

    /* renamed from: P */
    private boolean m21159P(LinearLayout linearLayout) {
        if (this.f16219B != null) {
            linearLayout.addView(this.f16219B, 0, new LinearLayout.LayoutParams(-1, -2));
            this.f16237c.findViewById(R$id.title_template).setVisibility(8);
        } else {
            boolean z = !TextUtils.isEmpty(this.f16238d);
            this.f16259y = (ImageView) this.f16237c.findViewById(R$id.icon);
            if (z) {
                TextView textView = (TextView) this.f16237c.findViewById(R$id.alertTitle);
                this.f16260z = textView;
                textView.setText(this.f16238d);
                int i = this.f16257w;
                if (i > 0) {
                    this.f16259y.setImageResource(i);
                } else {
                    Drawable drawable = this.f16258x;
                    if (drawable != null) {
                        this.f16259y.setImageDrawable(drawable);
                    } else if (i == 0) {
                        this.f16260z.setPadding(this.f16259y.getPaddingLeft(), this.f16259y.getPaddingTop(), this.f16259y.getPaddingRight(), this.f16259y.getPaddingBottom());
                        this.f16259y.setVisibility(8);
                    }
                }
            } else {
                this.f16237c.findViewById(R$id.title_template).setVisibility(8);
                this.f16259y.setVisibility(8);
                linearLayout.setVisibility(8);
                return false;
            }
        }
        return true;
    }

    /* renamed from: Q */
    private void m21160Q() {
        LinearLayout linearLayout = (LinearLayout) this.f16237c.findViewById(R$id.contentPanel);
        m21158O(linearLayout);
        boolean N = m21157N();
        LinearLayout linearLayout2 = (LinearLayout) this.f16237c.findViewById(R$id.topPanel);
        boolean P = m21159P(linearLayout2);
        View findViewById = this.f16237c.findViewById(R$id.buttonPanel);
        if (!N) {
            findViewById.setVisibility(8);
        }
        FrameLayout frameLayout = (FrameLayout) this.f16237c.findViewById(R$id.customPanel);
        if (this.f16241g != null) {
            FrameLayout frameLayout2 = (FrameLayout) this.f16237c.findViewById(R$id.custom);
            frameLayout2.addView(this.f16241g);
            if (this.f16246l) {
                frameLayout2.setPadding(this.f16242h, this.f16243i, this.f16244j, this.f16245k);
                if (this.f16233P) {
                    this.f16231N = true;
                }
            }
            if (this.f16240f != null) {
                ((LinearLayout.LayoutParams) frameLayout.getLayoutParams()).weight = 0.0f;
            }
        } else {
            frameLayout.setVisibility(8);
        }
        if (this.f16231N) {
            this.f16237c.findViewById(R$id.parentPanel).setBackgroundColor(ContextCompat.getColor(this.f16235a, 17170445));
        }
        if (this.f16240f != null) {
            this.f16237c.findViewById(R$id.title_divider_line).setVisibility(0);
        } else {
            this.f16237c.findViewById(R$id.title_divider_line).setVisibility(8);
        }
        if (linearLayout2.getVisibility() == 8 && linearLayout.getVisibility() == 8 && frameLayout.getVisibility() == 8 && N) {
            findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingBottom(), findViewById.getPaddingRight(), findViewById.getPaddingBottom());
        }
        m21156C(linearLayout2, linearLayout, frameLayout, N, P, findViewById);
        if (TextUtils.isEmpty(this.f16238d) && TextUtils.isEmpty(this.f16239e)) {
            this.f16237c.findViewById(R$id.empty_view).setVisibility(8);
        }
    }

    /* renamed from: R */
    private static boolean m21161R(int i) {
        return i == 1 || i == 2 || i == 4;
    }

    /* renamed from: v */
    static boolean m21183v(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m21183v(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: w */
    private void m21184w(TextView textView) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        textView.setLayoutParams(layoutParams);
        textView.setBackgroundResource(R$drawable.common_button);
    }

    /* renamed from: A */
    public boolean mo36619A(int i, KeyEvent keyEvent) {
        ScrollView scrollView = this.f16256v;
        return scrollView != null && scrollView.executeKeyEvent(keyEvent);
    }

    /* renamed from: B */
    public void mo36620B(boolean z) {
        this.f16232O = z;
    }

    /* renamed from: D */
    public void mo36621D(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message) {
        if (message == null && onClickListener != null) {
            message = this.f16230M.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f16254t = charSequence;
            this.f16255u = message;
        } else if (i == -2) {
            this.f16251q = charSequence;
            this.f16252r = message;
        } else if (i == -1) {
            this.f16248n = charSequence;
            this.f16249o = message;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: E */
    public void mo36622E(View view) {
        this.f16219B = view;
    }

    /* renamed from: F */
    public void mo36623F(boolean z) {
        this.f16233P = z;
    }

    /* renamed from: G */
    public void mo36624G(int i) {
        this.f16257w = i;
        ImageView imageView = this.f16259y;
        if (imageView == null) {
            return;
        }
        if (i > 0) {
            imageView.setImageResource(i);
        } else if (i == 0) {
            imageView.setVisibility(8);
        }
    }

    /* renamed from: H */
    public void mo36625H(Drawable drawable) {
        this.f16258x = drawable;
        ImageView imageView = this.f16259y;
        if (imageView != null && drawable != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    /* renamed from: I */
    public void mo36626I(boolean z) {
        this.f16220C = z;
    }

    /* renamed from: J */
    public void mo36627J(CharSequence charSequence) {
        this.f16239e = charSequence;
        TextView textView = this.f16218A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: K */
    public void mo36628K(CharSequence charSequence) {
        this.f16238d = charSequence;
        TextView textView = this.f16260z;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: L */
    public void mo36629L(View view) {
        this.f16241g = view;
        this.f16246l = false;
    }

    /* renamed from: M */
    public void mo36630M(View view, int i, int i2, int i3, int i4) {
        this.f16241g = view;
        this.f16246l = true;
        this.f16242h = i;
        this.f16243i = i2;
        this.f16244j = i3;
        this.f16245k = i4;
    }

    /* renamed from: x */
    public View mo36631x() {
        return this.f16241g;
    }

    /* renamed from: y */
    public void mo36632y() {
        this.f16237c.requestFeature(1);
        this.f16237c.setGravity(this.f16229L);
        View view = this.f16241g;
        if (view == null || !m21183v(view)) {
            this.f16237c.setFlags(131072, 131072);
        }
        this.f16237c.setContentView(this.f16223F);
        m21160Q();
    }

    /* renamed from: z */
    public boolean mo36633z(int i, KeyEvent keyEvent) {
        ListView listView;
        if (i == 82 && (listView = this.f16240f) != null && listView.getVisibility() == 0) {
            this.f16236b.dismiss();
        }
        ScrollView scrollView = this.f16256v;
        return scrollView != null && scrollView.executeKeyEvent(keyEvent);
    }
}
