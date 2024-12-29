package com.yeelight.yeelib.p194ui.widget;

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
import com.yeelight.yeelib.p194ui.widget.C10521d;
import com.yeelight.yeelib.p194ui.widget.InputTextView;
import java.lang.ref.WeakReference;

/* renamed from: com.yeelight.yeelib.ui.widget.YLAlertController */
public class YLAlertController {

    /* renamed from: A */
    private TextView f19960A;

    /* renamed from: B */
    private View f19961B;

    /* renamed from: C */
    private boolean f19962C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public ListAdapter f19963D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public int f19964E = -1;

    /* renamed from: F */
    private int f19965F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public int f19966G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public int f19967H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public int f19968I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public int f19969J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public int f19970K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public int f19971L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public Handler f19972M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public boolean f19973N = false;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public boolean f19974O = true;

    /* renamed from: P */
    private boolean f19975P = false;

    /* renamed from: Q */
    View.OnClickListener f19976Q = new C10503a();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f19977a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final DialogInterface f19978b;

    /* renamed from: c */
    private final Window f19979c;

    /* renamed from: d */
    private CharSequence f19980d;

    /* renamed from: e */
    private CharSequence f19981e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ListView f19982f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public View f19983g;

    /* renamed from: h */
    private int f19984h;

    /* renamed from: i */
    private int f19985i;

    /* renamed from: j */
    private int f19986j;

    /* renamed from: k */
    private int f19987k;

    /* renamed from: l */
    private boolean f19988l = false;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Button f19989m;

    /* renamed from: n */
    private CharSequence f19990n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Message f19991o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public Button f19992p;

    /* renamed from: q */
    private CharSequence f19993q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public Message f19994r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public Button f19995s;

    /* renamed from: t */
    private CharSequence f19996t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public Message f19997u;

    /* renamed from: v */
    private ScrollView f19998v;

    /* renamed from: w */
    private int f19999w = -1;

    /* renamed from: x */
    private Drawable f20000x;

    /* renamed from: y */
    private ImageView f20001y;

    /* renamed from: z */
    private TextView f20002z;

    /* renamed from: com.yeelight.yeelib.ui.widget.YLAlertController$RecycleListView */
    public static class RecycleListView extends ListView {

        /* renamed from: a */
        boolean f20003a;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.widget.YLAlertController$a */
    class C10503a implements View.OnClickListener {
        C10503a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0057  */
        /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                com.yeelight.yeelib.ui.widget.YLAlertController r0 = com.yeelight.yeelib.p194ui.widget.YLAlertController.this
                android.widget.Button r0 = r0.f19989m
                if (r3 != r0) goto L_0x001b
                com.yeelight.yeelib.ui.widget.YLAlertController r0 = com.yeelight.yeelib.p194ui.widget.YLAlertController.this
                android.os.Message r0 = r0.f19991o
                if (r0 == 0) goto L_0x001b
                com.yeelight.yeelib.ui.widget.YLAlertController r3 = com.yeelight.yeelib.p194ui.widget.YLAlertController.this
                android.os.Message r3 = r3.f19991o
            L_0x0016:
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x004a
            L_0x001b:
                com.yeelight.yeelib.ui.widget.YLAlertController r0 = com.yeelight.yeelib.p194ui.widget.YLAlertController.this
                android.widget.Button r0 = r0.f19992p
                if (r3 != r0) goto L_0x0032
                com.yeelight.yeelib.ui.widget.YLAlertController r0 = com.yeelight.yeelib.p194ui.widget.YLAlertController.this
                android.os.Message r0 = r0.f19994r
                if (r0 == 0) goto L_0x0032
                com.yeelight.yeelib.ui.widget.YLAlertController r3 = com.yeelight.yeelib.p194ui.widget.YLAlertController.this
                android.os.Message r3 = r3.f19994r
                goto L_0x0016
            L_0x0032:
                com.yeelight.yeelib.ui.widget.YLAlertController r0 = com.yeelight.yeelib.p194ui.widget.YLAlertController.this
                android.widget.Button r0 = r0.f19995s
                if (r3 != r0) goto L_0x0049
                com.yeelight.yeelib.ui.widget.YLAlertController r3 = com.yeelight.yeelib.p194ui.widget.YLAlertController.this
                android.os.Message r3 = r3.f19997u
                if (r3 == 0) goto L_0x0049
                com.yeelight.yeelib.ui.widget.YLAlertController r3 = com.yeelight.yeelib.p194ui.widget.YLAlertController.this
                android.os.Message r3 = r3.f19997u
                goto L_0x0016
            L_0x0049:
                r3 = 0
            L_0x004a:
                if (r3 == 0) goto L_0x004f
                r3.sendToTarget()
            L_0x004f:
                com.yeelight.yeelib.ui.widget.YLAlertController r3 = com.yeelight.yeelib.p194ui.widget.YLAlertController.this
                boolean r3 = r3.f19974O
                if (r3 == 0) goto L_0x006b
                com.yeelight.yeelib.ui.widget.YLAlertController r3 = com.yeelight.yeelib.p194ui.widget.YLAlertController.this
                android.os.Handler r3 = r3.f19972M
                r0 = 1
                com.yeelight.yeelib.ui.widget.YLAlertController r1 = com.yeelight.yeelib.p194ui.widget.YLAlertController.this
                android.content.DialogInterface r1 = r1.f19978b
                android.os.Message r3 = r3.obtainMessage(r0, r1)
                r3.sendToTarget()
            L_0x006b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.widget.YLAlertController.C10503a.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.widget.YLAlertController$b */
    class C10504b implements InputTextView.C10499b {
        C10504b() {
        }

        /* renamed from: a */
        public void mo33195a(boolean z) {
            Button button;
            int i;
            Context context;
            if (z) {
                YLAlertController.this.f19989m.setClickable(true);
                button = YLAlertController.this.f19989m;
                context = YLAlertController.this.f19977a;
                i = R$color.common_button;
            } else {
                YLAlertController.this.f19989m.setClickable(false);
                button = YLAlertController.this.f19989m;
                context = YLAlertController.this.f19977a;
                i = R$color.black_10_transparent;
            }
            button.setTextColor(ContextCompat.getColor(context, i));
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.widget.YLAlertController$c */
    public static class C10505c {

        /* renamed from: A */
        public boolean f20006A;

        /* renamed from: B */
        public boolean f20007B;

        /* renamed from: C */
        public int f20008C = -1;

        /* renamed from: D */
        public DialogInterface.OnMultiChoiceClickListener f20009D;

        /* renamed from: E */
        public Cursor f20010E;

        /* renamed from: F */
        public String f20011F;

        /* renamed from: G */
        public String f20012G;

        /* renamed from: H */
        public boolean f20013H;

        /* renamed from: I */
        public AdapterView.OnItemSelectedListener f20014I;

        /* renamed from: J */
        public C10512g f20015J;

        /* renamed from: K */
        public boolean f20016K = true;

        /* renamed from: L */
        public boolean f20017L = true;

        /* renamed from: M */
        public C10521d.C10525c f20018M;

        /* renamed from: N */
        public CharSequence f20019N;

        /* renamed from: O */
        public boolean f20020O = false;

        /* renamed from: a */
        public final Context f20021a;

        /* renamed from: b */
        public final LayoutInflater f20022b;

        /* renamed from: c */
        public int f20023c = 0;

        /* renamed from: d */
        public Drawable f20024d;

        /* renamed from: e */
        public CharSequence f20025e;

        /* renamed from: f */
        public View f20026f;

        /* renamed from: g */
        public CharSequence f20027g;

        /* renamed from: h */
        public CharSequence f20028h;

        /* renamed from: i */
        public DialogInterface.OnClickListener f20029i;

        /* renamed from: j */
        public CharSequence f20030j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f20031k;

        /* renamed from: l */
        public CharSequence f20032l;

        /* renamed from: m */
        public DialogInterface.OnClickListener f20033m;

        /* renamed from: n */
        public boolean f20034n;

        /* renamed from: o */
        public DialogInterface.OnCancelListener f20035o;

        /* renamed from: p */
        public DialogInterface.OnKeyListener f20036p;

        /* renamed from: q */
        public CharSequence[] f20037q;

        /* renamed from: r */
        public ListAdapter f20038r;

        /* renamed from: s */
        public DialogInterface.OnClickListener f20039s;

        /* renamed from: t */
        public View f20040t;

        /* renamed from: u */
        public int f20041u;

        /* renamed from: v */
        public int f20042v;

        /* renamed from: w */
        public int f20043w;

        /* renamed from: x */
        public int f20044x;

        /* renamed from: y */
        public boolean f20045y = false;

        /* renamed from: z */
        public boolean[] f20046z;

        /* renamed from: com.yeelight.yeelib.ui.widget.YLAlertController$c$a */
        class C10506a implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            final /* synthetic */ YLAlertController f20047a;

            C10506a(YLAlertController yLAlertController) {
                this.f20047a = yLAlertController;
            }

            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                C10505c.this.f20039s.onClick(this.f20047a.f19978b, i);
                if (!C10505c.this.f20007B) {
                    this.f20047a.f19978b.dismiss();
                }
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.widget.YLAlertController$c$b */
        class C10507b implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            final /* synthetic */ RecycleListView f20049a;

            /* renamed from: b */
            final /* synthetic */ YLAlertController f20050b;

            C10507b(RecycleListView recycleListView, YLAlertController yLAlertController) {
                this.f20049a = recycleListView;
                this.f20050b = yLAlertController;
            }

            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                boolean[] zArr = C10505c.this.f20046z;
                if (zArr != null) {
                    zArr[i] = this.f20049a.isItemChecked(i);
                }
                C10505c.this.f20009D.onClick(this.f20050b.f19978b, i, this.f20049a.isItemChecked(i));
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.widget.YLAlertController$c$c */
        class C10508c extends ArrayAdapter<CharSequence> {

            /* renamed from: a */
            final /* synthetic */ RecycleListView f20052a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10508c(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f20052a = recycleListView;
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = C10505c.this.f20046z;
                if (zArr != null && zArr[i]) {
                    this.f20052a.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.widget.YLAlertController$c$d */
        class C10509d extends CursorAdapter {

            /* renamed from: a */
            private final int f20054a;

            /* renamed from: b */
            private final int f20055b;

            /* renamed from: c */
            final /* synthetic */ RecycleListView f20056c;

            /* renamed from: d */
            final /* synthetic */ YLAlertController f20057d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10509d(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, YLAlertController yLAlertController) {
                super(context, cursor, z);
                this.f20056c = recycleListView;
                this.f20057d = yLAlertController;
                Cursor cursor2 = getCursor();
                this.f20054a = cursor2.getColumnIndexOrThrow(C10505c.this.f20011F);
                this.f20055b = cursor2.getColumnIndexOrThrow(C10505c.this.f20012G);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R$id.text1)).setText(cursor.getString(this.f20054a));
                RecycleListView recycleListView = this.f20056c;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f20055b) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C10505c.this.f20022b.inflate(this.f20057d.f19968I, viewGroup, false);
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.widget.YLAlertController$c$e */
        class C10510e implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            final /* synthetic */ YLAlertController f20059a;

            C10510e(YLAlertController yLAlertController) {
                this.f20059a = yLAlertController;
            }

            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                C10505c.this.f20039s.onClick(this.f20059a.f19978b, i);
                if (!C10505c.this.f20007B) {
                    this.f20059a.f19978b.dismiss();
                }
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.widget.YLAlertController$c$f */
        class C10511f implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            final /* synthetic */ RecycleListView f20061a;

            /* renamed from: b */
            final /* synthetic */ YLAlertController f20062b;

            C10511f(RecycleListView recycleListView, YLAlertController yLAlertController) {
                this.f20061a = recycleListView;
                this.f20062b = yLAlertController;
            }

            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                boolean[] zArr = C10505c.this.f20046z;
                if (zArr != null) {
                    zArr[i] = this.f20061a.isItemChecked(i);
                }
                C10505c.this.f20009D.onClick(this.f20062b.f19978b, i, this.f20061a.isItemChecked(i));
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.widget.YLAlertController$c$g */
        public interface C10512g {
            void onPrepareListView(ListView listView);
        }

        public C10505c(Context context) {
            this.f20021a = context;
            this.f20034n = true;
            this.f20022b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0083  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x008a  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0095  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m25587b(com.yeelight.yeelib.p194ui.widget.YLAlertController r12) {
            /*
                r11 = this;
                android.view.LayoutInflater r0 = r11.f20022b
                int r1 = r12.f19967H
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                int r1 = com.yeelight.yeelib.R$id.select_dialog_listview
                android.view.View r1 = r0.findViewById(r1)
                com.yeelight.yeelib.ui.widget.YLAlertController$RecycleListView r1 = (com.yeelight.yeelib.p194ui.widget.YLAlertController.RecycleListView) r1
                int r4 = com.yeelight.yeelib.R$layout.ml_center_item
                android.database.Cursor r2 = r11.f20010E
                r8 = 1
                if (r2 != 0) goto L_0x002d
                android.widget.ListAdapter r2 = r11.f20038r
                if (r2 == 0) goto L_0x0021
                goto L_0x0045
            L_0x0021:
                android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
                android.content.Context r3 = r11.f20021a
                int r5 = com.yeelight.yeelib.R$id.text1
                java.lang.CharSequence[] r6 = r11.f20037q
                r2.<init>(r3, r4, r5, r6)
                goto L_0x0045
            L_0x002d:
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r11.f20021a
                android.database.Cursor r5 = r11.f20010E
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r2 = r11.f20011F
                r7 = 0
                r6[r7] = r2
                int[] r10 = new int[r8]
                int r2 = com.yeelight.yeelib.R$id.text1
                r10[r7] = r2
                r2 = r9
                r7 = r10
                r2.<init>(r3, r4, r5, r6, r7)
            L_0x0045:
                java.lang.CharSequence r3 = r11.f20019N
                if (r3 == 0) goto L_0x0056
                int r3 = com.yeelight.yeelib.R$id.title
                android.view.View r3 = r0.findViewById(r3)
                android.widget.TextView r3 = (android.widget.TextView) r3
                java.lang.CharSequence r4 = r11.f20019N
                r3.setText(r4)
            L_0x0056:
                com.yeelight.yeelib.ui.widget.YLAlertController$c$g r3 = r11.f20015J
                if (r3 == 0) goto L_0x005d
                r3.onPrepareListView(r1)
            L_0x005d:
                android.widget.ListAdapter unused = r12.f19963D = r2
                r1.setAdapter(r2)
                int r2 = r11.f20008C
                int unused = r12.f19964E = r2
                android.content.DialogInterface$OnClickListener r2 = r11.f20039s
                if (r2 == 0) goto L_0x0075
                com.yeelight.yeelib.ui.widget.YLAlertController$c$a r2 = new com.yeelight.yeelib.ui.widget.YLAlertController$c$a
                r2.<init>(r12)
            L_0x0071:
                r1.setOnItemClickListener(r2)
                goto L_0x007f
            L_0x0075:
                android.content.DialogInterface$OnMultiChoiceClickListener r2 = r11.f20009D
                if (r2 == 0) goto L_0x007f
                com.yeelight.yeelib.ui.widget.YLAlertController$c$b r2 = new com.yeelight.yeelib.ui.widget.YLAlertController$c$b
                r2.<init>(r1, r12)
                goto L_0x0071
            L_0x007f:
                android.widget.AdapterView$OnItemSelectedListener r2 = r11.f20014I
                if (r2 == 0) goto L_0x0086
                r1.setOnItemSelectedListener(r2)
            L_0x0086:
                android.widget.AdapterView$OnItemSelectedListener r2 = r11.f20014I
                if (r2 == 0) goto L_0x008d
                r1.setOnItemSelectedListener(r2)
            L_0x008d:
                boolean r2 = r11.f20007B
                if (r2 == 0) goto L_0x0095
                r1.setChoiceMode(r8)
                goto L_0x009d
            L_0x0095:
                boolean r2 = r11.f20006A
                if (r2 == 0) goto L_0x009d
                r2 = 2
                r1.setChoiceMode(r2)
            L_0x009d:
                boolean r2 = r11.f20016K
                r1.f20003a = r2
                android.view.View unused = r12.f19983g = r0
                boolean unused = r12.f19973N = r8
                boolean r0 = r11.f20020O
                r12.mo33254F(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.widget.YLAlertController.C10505c.m25587b(com.yeelight.yeelib.ui.widget.YLAlertController):void");
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
        private void m25588c(com.yeelight.yeelib.p194ui.widget.YLAlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f20022b
                int r1 = r11.f19966G
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                com.yeelight.yeelib.ui.widget.YLAlertController$RecycleListView r0 = (com.yeelight.yeelib.p194ui.widget.YLAlertController.RecycleListView) r0
                boolean r1 = r10.f20006A
                r8 = 1
                if (r1 == 0) goto L_0x0038
                android.database.Cursor r1 = r10.f20010E
                if (r1 != 0) goto L_0x0029
                com.yeelight.yeelib.ui.widget.YLAlertController$c$c r9 = new com.yeelight.yeelib.ui.widget.YLAlertController$c$c
                android.content.Context r3 = r10.f20021a
                int r4 = r11.f19968I
                int r5 = com.yeelight.yeelib.R$id.text1
                java.lang.CharSequence[] r6 = r10.f20037q
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x0073
            L_0x0029:
                com.yeelight.yeelib.ui.widget.YLAlertController$c$d r9 = new com.yeelight.yeelib.ui.widget.YLAlertController$c$d
                android.content.Context r3 = r10.f20021a
                android.database.Cursor r4 = r10.f20010E
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x0073
            L_0x0038:
                boolean r1 = r10.f20007B
                if (r1 == 0) goto L_0x0041
                int r1 = r11.f19969J
                goto L_0x0045
            L_0x0041:
                int r1 = r11.f19970K
            L_0x0045:
                r4 = r1
                android.database.Cursor r1 = r10.f20010E
                if (r1 != 0) goto L_0x005c
                android.widget.ListAdapter r1 = r10.f20038r
                if (r1 == 0) goto L_0x004f
                goto L_0x005a
            L_0x004f:
                android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
                android.content.Context r2 = r10.f20021a
                int r3 = com.yeelight.yeelib.R$id.text1
                java.lang.CharSequence[] r5 = r10.f20037q
                r1.<init>(r2, r4, r3, r5)
            L_0x005a:
                r9 = r1
                goto L_0x0073
            L_0x005c:
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f20021a
                android.database.Cursor r5 = r10.f20010E
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.f20011F
                r2 = 0
                r6[r2] = r1
                int[] r7 = new int[r8]
                int r1 = com.yeelight.yeelib.R$id.text1
                r7[r2] = r1
                r2 = r9
                r2.<init>(r3, r4, r5, r6, r7)
            L_0x0073:
                com.yeelight.yeelib.ui.widget.YLAlertController$c$g r1 = r10.f20015J
                if (r1 == 0) goto L_0x007a
                r1.onPrepareListView(r0)
            L_0x007a:
                android.widget.ListAdapter unused = r11.f19963D = r9
                int r1 = r10.f20008C
                int unused = r11.f19964E = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f20039s
                if (r1 == 0) goto L_0x008f
                com.yeelight.yeelib.ui.widget.YLAlertController$c$e r1 = new com.yeelight.yeelib.ui.widget.YLAlertController$c$e
                r1.<init>(r11)
            L_0x008b:
                r0.setOnItemClickListener(r1)
                goto L_0x0099
            L_0x008f:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.f20009D
                if (r1 == 0) goto L_0x0099
                com.yeelight.yeelib.ui.widget.YLAlertController$c$f r1 = new com.yeelight.yeelib.ui.widget.YLAlertController$c$f
                r1.<init>(r0, r11)
                goto L_0x008b
            L_0x0099:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.f20014I
                if (r1 == 0) goto L_0x00a0
                r0.setOnItemSelectedListener(r1)
            L_0x00a0:
                boolean r1 = r10.f20007B
                if (r1 == 0) goto L_0x00a8
                r0.setChoiceMode(r8)
                goto L_0x00b0
            L_0x00a8:
                boolean r1 = r10.f20006A
                if (r1 == 0) goto L_0x00b0
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00b0:
                boolean r1 = r10.f20016K
                r0.f20003a = r1
                android.widget.ListView unused = r11.f19982f = r0
                boolean r0 = r10.f20020O
                r11.mo33254F(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.widget.YLAlertController.C10505c.m25588c(com.yeelight.yeelib.ui.widget.YLAlertController):void");
        }

        /* renamed from: a */
        public void mo33266a(YLAlertController yLAlertController) {
            View view = this.f20026f;
            if (view != null) {
                yLAlertController.mo33253E(view);
            } else {
                CharSequence charSequence = this.f20025e;
                if (charSequence != null) {
                    yLAlertController.mo33259K(charSequence);
                }
                Drawable drawable = this.f20024d;
                if (drawable != null) {
                    yLAlertController.mo33256H(drawable);
                }
                int i = this.f20023c;
                if (i >= 0) {
                    yLAlertController.mo33255G(i);
                }
            }
            CharSequence charSequence2 = this.f20027g;
            if (charSequence2 != null) {
                yLAlertController.mo33258J(charSequence2);
            }
            CharSequence charSequence3 = this.f20028h;
            if (charSequence3 != null) {
                yLAlertController.mo33252D(-1, charSequence3, this.f20029i, (Message) null);
            }
            CharSequence charSequence4 = this.f20030j;
            if (charSequence4 != null) {
                yLAlertController.mo33252D(-2, charSequence4, this.f20031k, (Message) null);
            }
            CharSequence charSequence5 = this.f20032l;
            if (charSequence5 != null) {
                yLAlertController.mo33252D(-3, charSequence5, this.f20033m, (Message) null);
            }
            if (this.f20013H) {
                yLAlertController.mo33257I(true);
            }
            boolean unused = yLAlertController.f19973N = false;
            if (!(this.f20037q == null && this.f20010E == null && this.f20038r == null)) {
                if (yLAlertController.f19971L == 17) {
                    m25587b(yLAlertController);
                } else {
                    m25588c(yLAlertController);
                }
            }
            View view2 = this.f20040t;
            if (view2 != null) {
                if (this.f20045y) {
                    yLAlertController.mo33261M(view2, this.f20041u, this.f20042v, this.f20043w, this.f20044x);
                } else {
                    yLAlertController.mo33260L(view2);
                }
            }
            yLAlertController.mo33251B(this.f20017L);
            yLAlertController.mo33254F(this.f20020O);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.widget.YLAlertController$d */
    private static final class C10513d extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f20064a;

        public C10513d(DialogInterface dialogInterface) {
            this.f20064a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f20064a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public YLAlertController(Context context, DialogInterface dialogInterface, Window window, int i) {
        this.f19977a = context;
        this.f19978b = dialogInterface;
        this.f19979c = window;
        this.f19972M = new C10513d(dialogInterface);
        this.f19965F = R$layout.yl_alert_dialog;
        this.f19966G = R$layout.yl_select_dialog;
        this.f19967H = R$layout.yl_select_dialog_center;
        this.f19968I = R$layout.ml_select_dialog_multichoice;
        this.f19969J = R$layout.ml_select_dialog_singlechoice;
        this.f19970K = R$layout.ml_select_dialog_item;
        this.f19971L = i;
    }

    /* renamed from: C */
    private void m25542C(LinearLayout linearLayout, LinearLayout linearLayout2, View view, boolean z, boolean z2, View view2) {
        ListAdapter listAdapter;
        int i;
        if (this.f19973N) {
            int color = ContextCompat.getColor(this.f19977a, 17170445);
            int color2 = ContextCompat.getColor(this.f19977a, 17170445);
            int color3 = ContextCompat.getColor(this.f19977a, 17170445);
            int color4 = ContextCompat.getColor(this.f19977a, 17170445);
            int color5 = ContextCompat.getColor(this.f19977a, 17170445);
            int color6 = ContextCompat.getColor(this.f19977a, 17170445);
            int color7 = ContextCompat.getColor(this.f19977a, 17170445);
            int color8 = ContextCompat.getColor(this.f19977a, 17170445);
            int color9 = ContextCompat.getColor(this.f19977a, 17170445);
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
            zArr[i] = this.f19982f != null;
            int i2 = i + 1;
            if (view != null) {
                viewArr[i2] = view;
                zArr[i2] = this.f19962C;
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
        ListView listView = this.f19982f;
        if (listView != null && (listAdapter = this.f19963D) != null) {
            listView.setAdapter(listAdapter);
            int i4 = this.f19964E;
            if (i4 > -1) {
                this.f19982f.setItemChecked(i4, true);
                this.f19982f.setSelection(this.f19964E);
            }
        }
    }

    /* renamed from: N */
    private boolean m25543N() {
        int i;
        Button button;
        Button button2 = (Button) this.f19979c.findViewById(R$id.button1);
        this.f19989m = button2;
        button2.setOnClickListener(this.f19976Q);
        if (TextUtils.isEmpty(this.f19990n)) {
            this.f19989m.setVisibility(8);
            i = 0;
        } else {
            this.f19989m.setText(this.f19990n);
            this.f19989m.setVisibility(0);
            View view = this.f19983g;
            if (view instanceof InputTextView) {
                InputTextView inputTextView = (InputTextView) view;
                if (TextUtils.isEmpty(inputTextView.getText().toString())) {
                    this.f19989m.setClickable(false);
                    this.f19989m.setTextColor(ContextCompat.getColor(this.f19977a, R$color.black_10_transparent));
                }
                inputTextView.setAffirmListener(new C10504b());
            }
            i = 1;
        }
        Button button3 = (Button) this.f19979c.findViewById(R$id.button2);
        this.f19992p = button3;
        button3.setOnClickListener(this.f19976Q);
        if (TextUtils.isEmpty(this.f19993q)) {
            this.f19992p.setVisibility(8);
        } else {
            this.f19992p.setText(this.f19993q);
            this.f19992p.setVisibility(0);
            i |= 2;
        }
        Button button4 = (Button) this.f19979c.findViewById(R$id.button3);
        this.f19995s = button4;
        button4.setOnClickListener(this.f19976Q);
        if (TextUtils.isEmpty(this.f19996t)) {
            this.f19995s.setVisibility(8);
        } else {
            this.f19995s.setText(this.f19996t);
            this.f19995s.setVisibility(0);
            i |= 4;
        }
        if (m25547R(i)) {
            if (i == 1) {
                button = this.f19989m;
            } else if (i == 2) {
                button = this.f19992p;
            } else if (i == 4) {
                button = this.f19995s;
            }
            m25570w(button);
        }
        return i != 0;
    }

    /* renamed from: O */
    private void m25544O(LinearLayout linearLayout) {
        ScrollView scrollView = (ScrollView) this.f19979c.findViewById(R$id.scrollView);
        this.f19998v = scrollView;
        scrollView.setFocusable(false);
        TextView textView = (TextView) this.f19979c.findViewById(R$id.message);
        this.f19960A = textView;
        if (textView != null) {
            CharSequence charSequence = this.f19981e;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.f19998v.removeView(this.f19960A);
            if (this.f19982f != null) {
                linearLayout.removeView(this.f19979c.findViewById(R$id.scrollView));
                linearLayout.addView(this.f19982f, new LinearLayout.LayoutParams(-1, -1));
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
                return;
            }
            linearLayout.setVisibility(8);
        }
    }

    /* renamed from: P */
    private boolean m25545P(LinearLayout linearLayout) {
        if (this.f19961B != null) {
            linearLayout.addView(this.f19961B, 0, new LinearLayout.LayoutParams(-1, -2));
            this.f19979c.findViewById(R$id.title_template).setVisibility(8);
        } else {
            boolean z = !TextUtils.isEmpty(this.f19980d);
            this.f20001y = (ImageView) this.f19979c.findViewById(R$id.icon);
            if (z) {
                TextView textView = (TextView) this.f19979c.findViewById(R$id.alertTitle);
                this.f20002z = textView;
                textView.setText(this.f19980d);
                int i = this.f19999w;
                if (i > 0) {
                    this.f20001y.setImageResource(i);
                } else {
                    Drawable drawable = this.f20000x;
                    if (drawable != null) {
                        this.f20001y.setImageDrawable(drawable);
                    } else if (i == 0) {
                        this.f20002z.setPadding(this.f20001y.getPaddingLeft(), this.f20001y.getPaddingTop(), this.f20001y.getPaddingRight(), this.f20001y.getPaddingBottom());
                        this.f20001y.setVisibility(8);
                    }
                }
            } else {
                this.f19979c.findViewById(R$id.title_template).setVisibility(8);
                this.f20001y.setVisibility(8);
                linearLayout.setVisibility(8);
                return false;
            }
        }
        return true;
    }

    /* renamed from: Q */
    private void m25546Q() {
        LinearLayout linearLayout = (LinearLayout) this.f19979c.findViewById(R$id.contentPanel);
        m25544O(linearLayout);
        boolean N = m25543N();
        LinearLayout linearLayout2 = (LinearLayout) this.f19979c.findViewById(R$id.topPanel);
        boolean P = m25545P(linearLayout2);
        View findViewById = this.f19979c.findViewById(R$id.buttonPanel);
        if (!N) {
            findViewById.setVisibility(8);
        }
        FrameLayout frameLayout = (FrameLayout) this.f19979c.findViewById(R$id.customPanel);
        if (this.f19983g != null) {
            FrameLayout frameLayout2 = (FrameLayout) this.f19979c.findViewById(R$id.custom);
            frameLayout2.addView(this.f19983g);
            if (this.f19988l) {
                frameLayout2.setPadding(this.f19984h, this.f19985i, this.f19986j, this.f19987k);
                if (this.f19975P) {
                    this.f19973N = true;
                }
            }
            if (this.f19982f != null) {
                ((LinearLayout.LayoutParams) frameLayout.getLayoutParams()).weight = 0.0f;
            }
        } else {
            frameLayout.setVisibility(8);
        }
        if (this.f19973N) {
            this.f19979c.findViewById(R$id.parentPanel).setBackgroundColor(ContextCompat.getColor(this.f19977a, 17170445));
        }
        if (this.f19982f != null) {
            this.f19979c.findViewById(R$id.title_divider_line).setVisibility(0);
        } else {
            this.f19979c.findViewById(R$id.title_divider_line).setVisibility(8);
        }
        if (linearLayout2.getVisibility() == 8 && linearLayout.getVisibility() == 8 && frameLayout.getVisibility() == 8 && N) {
            findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingBottom(), findViewById.getPaddingRight(), findViewById.getPaddingBottom());
        }
        m25542C(linearLayout2, linearLayout, frameLayout, N, P, findViewById);
        if (TextUtils.isEmpty(this.f19980d) && TextUtils.isEmpty(this.f19981e)) {
            this.f19979c.findViewById(R$id.empty_view).setVisibility(8);
        }
    }

    /* renamed from: R */
    private static boolean m25547R(int i) {
        return i == 1 || i == 2 || i == 4;
    }

    /* renamed from: v */
    static boolean m25569v(View view) {
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
            if (m25569v(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: w */
    private void m25570w(TextView textView) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        textView.setLayoutParams(layoutParams);
        textView.setBackgroundResource(R$drawable.common_button);
    }

    /* renamed from: A */
    public boolean mo33250A(int i, KeyEvent keyEvent) {
        ScrollView scrollView = this.f19998v;
        return scrollView != null && scrollView.executeKeyEvent(keyEvent);
    }

    /* renamed from: B */
    public void mo33251B(boolean z) {
        this.f19974O = z;
    }

    /* renamed from: D */
    public void mo33252D(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message) {
        if (message == null && onClickListener != null) {
            message = this.f19972M.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f19996t = charSequence;
            this.f19997u = message;
        } else if (i == -2) {
            this.f19993q = charSequence;
            this.f19994r = message;
        } else if (i == -1) {
            this.f19990n = charSequence;
            this.f19991o = message;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: E */
    public void mo33253E(View view) {
        this.f19961B = view;
    }

    /* renamed from: F */
    public void mo33254F(boolean z) {
        this.f19975P = z;
    }

    /* renamed from: G */
    public void mo33255G(int i) {
        this.f19999w = i;
        ImageView imageView = this.f20001y;
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
    public void mo33256H(Drawable drawable) {
        this.f20000x = drawable;
        ImageView imageView = this.f20001y;
        if (imageView != null && drawable != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    /* renamed from: I */
    public void mo33257I(boolean z) {
        this.f19962C = z;
    }

    /* renamed from: J */
    public void mo33258J(CharSequence charSequence) {
        this.f19981e = charSequence;
        TextView textView = this.f19960A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: K */
    public void mo33259K(CharSequence charSequence) {
        this.f19980d = charSequence;
        TextView textView = this.f20002z;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: L */
    public void mo33260L(View view) {
        this.f19983g = view;
        this.f19988l = false;
    }

    /* renamed from: M */
    public void mo33261M(View view, int i, int i2, int i3, int i4) {
        this.f19983g = view;
        this.f19988l = true;
        this.f19984h = i;
        this.f19985i = i2;
        this.f19986j = i3;
        this.f19987k = i4;
    }

    /* renamed from: x */
    public View mo33262x() {
        return this.f19983g;
    }

    /* renamed from: y */
    public void mo33263y() {
        this.f19979c.requestFeature(1);
        this.f19979c.setGravity(this.f19971L);
        View view = this.f19983g;
        if (view == null || !m25569v(view)) {
            this.f19979c.setFlags(131072, 131072);
        }
        this.f19979c.setContentView(this.f19965F);
        m25546Q();
    }

    /* renamed from: z */
    public boolean mo33264z(int i, KeyEvent keyEvent) {
        ListView listView;
        if (i == 82 && (listView = this.f19982f) != null && listView.getVisibility() == 0) {
            this.f19978b.dismiss();
        }
        ScrollView scrollView = this.f19998v;
        return scrollView != null && scrollView.executeKeyEvent(keyEvent);
    }
}
