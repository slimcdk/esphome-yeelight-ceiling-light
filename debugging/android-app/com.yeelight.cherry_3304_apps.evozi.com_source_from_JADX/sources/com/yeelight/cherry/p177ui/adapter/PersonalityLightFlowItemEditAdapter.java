package com.yeelight.cherry.p177ui.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.chauthai.swipereveallayout.C1261a;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p153g.C4300b0;
import com.yeelight.yeelib.p153g.C9838i;
import com.yeelight.yeelib.p153g.C9844m;
import com.yeelight.yeelib.utils.C10542f;
import java.util.Locale;

/* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemEditAdapter */
public class PersonalityLightFlowItemEditAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private final LayoutInflater f12227a;

    /* renamed from: b */
    private final C1261a f12228b = new C1261a();

    /* renamed from: c */
    private boolean f12229c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f12230d;

    /* renamed from: e */
    boolean f12231e;

    /* renamed from: f */
    private C9838i f12232f;

    /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemEditAdapter$PersonalityFlowItemBrightHolder */
    public class PersonalityFlowItemBrightHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f12233a;

        /* renamed from: b */
        TextView f12234b;

        /* renamed from: c */
        LinearLayout f12235c;

        /* renamed from: d */
        ImageView f12236d;

        /* renamed from: e */
        ImageView f12237e;

        /* renamed from: f */
        int f12238f;

        /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemEditAdapter$PersonalityFlowItemBrightHolder$a */
        class C5832a implements View.OnClickListener {
            C5832a(PersonalityLightFlowItemEditAdapter personalityLightFlowItemEditAdapter) {
            }

            public void onClick(View view) {
                "onClick" + PersonalityFlowItemBrightHolder.this.getPosition();
                PersonalityFlowItemBrightHolder personalityFlowItemBrightHolder = PersonalityFlowItemBrightHolder.this;
                int unused = PersonalityLightFlowItemEditAdapter.this.f12230d = personalityFlowItemBrightHolder.f12238f;
                PersonalityLightFlowItemEditAdapter.this.notifyDataSetChanged();
            }
        }

        PersonalityFlowItemBrightHolder(View view) {
            super(view);
            this.f12233a = (TextView) view.findViewById(C11745R$id.flow_item_bright_value);
            this.f12234b = (TextView) view.findViewById(C11745R$id.flow_item_duration_value);
            this.f12235c = (LinearLayout) view.findViewById(C11745R$id.frame_layout);
            CardView cardView = (CardView) view.findViewById(C11745R$id.color_ct_frame_layout);
            this.f12236d = (ImageView) view.findViewById(C11745R$id.select_image);
            this.f12237e = (ImageView) view.findViewById(C11745R$id.sort_image);
            this.f12235c.setOnClickListener(new C5832a(PersonalityLightFlowItemEditAdapter.this));
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m17251b(int i) {
            this.f12238f = i;
        }

        /* renamed from: c */
        public void mo27195c(boolean z) {
            int i = 4;
            this.f12236d.setVisibility(z ? 4 : 0);
            ImageView imageView = this.f12237e;
            if (z) {
                i = 0;
            }
            imageView.setVisibility(i);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemEditAdapter$PersonalityFlowItemHolder */
    public class PersonalityFlowItemHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f12241a;

        /* renamed from: b */
        TextView f12242b;

        /* renamed from: c */
        TextView f12243c;

        /* renamed from: d */
        TextView f12244d;

        /* renamed from: e */
        LinearLayout f12245e;

        /* renamed from: f */
        CardView f12246f;

        /* renamed from: g */
        ImageView f12247g;

        /* renamed from: h */
        ImageView f12248h;

        /* renamed from: i */
        int f12249i;

        /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemEditAdapter$PersonalityFlowItemHolder$a */
        class C5833a implements View.OnClickListener {
            C5833a(PersonalityLightFlowItemEditAdapter personalityLightFlowItemEditAdapter) {
            }

            public void onClick(View view) {
                "onClick" + PersonalityFlowItemHolder.this.getPosition();
                PersonalityFlowItemHolder personalityFlowItemHolder = PersonalityFlowItemHolder.this;
                int unused = PersonalityLightFlowItemEditAdapter.this.f12230d = personalityFlowItemHolder.f12249i;
                PersonalityLightFlowItemEditAdapter.this.notifyDataSetChanged();
            }
        }

        PersonalityFlowItemHolder(View view) {
            super(view);
            this.f12241a = (ImageView) view.findViewById(C11745R$id.flow_item_type_image);
            this.f12242b = (TextView) view.findViewById(C11745R$id.flow_item_type_text);
            this.f12243c = (TextView) view.findViewById(C11745R$id.flow_item_bright_value);
            this.f12244d = (TextView) view.findViewById(C11745R$id.flow_item_duration_value);
            this.f12245e = (LinearLayout) view.findViewById(C11745R$id.frame_layout);
            this.f12246f = (CardView) view.findViewById(C11745R$id.color_ct_frame_layout);
            this.f12247g = (ImageView) view.findViewById(C11745R$id.select_image);
            this.f12248h = (ImageView) view.findViewById(C11745R$id.sort_image);
            this.f12245e.setOnClickListener(new C5833a(PersonalityLightFlowItemEditAdapter.this));
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m17254c(int i) {
            this.f12249i = i;
        }

        /* renamed from: b */
        public void mo27197b(int i) {
            this.f12242b.setText(i);
        }

        /* renamed from: d */
        public void mo27198d(boolean z) {
            int i = 4;
            this.f12247g.setVisibility(z ? 4 : 0);
            ImageView imageView = this.f12248h;
            if (z) {
                i = 0;
            }
            imageView.setVisibility(i);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemEditAdapter$PersonalityFlowItemSuspendHolder */
    public class PersonalityFlowItemSuspendHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f12252a;

        /* renamed from: b */
        LinearLayout f12253b;

        /* renamed from: c */
        CardView f12254c;

        /* renamed from: d */
        ImageView f12255d;

        /* renamed from: e */
        ImageView f12256e;

        /* renamed from: f */
        int f12257f;

        /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemEditAdapter$PersonalityFlowItemSuspendHolder$a */
        class C5834a implements View.OnClickListener {
            C5834a(PersonalityLightFlowItemEditAdapter personalityLightFlowItemEditAdapter) {
            }

            public void onClick(View view) {
                "onClick" + PersonalityFlowItemSuspendHolder.this.getPosition();
                PersonalityFlowItemSuspendHolder personalityFlowItemSuspendHolder = PersonalityFlowItemSuspendHolder.this;
                int unused = PersonalityLightFlowItemEditAdapter.this.f12230d = personalityFlowItemSuspendHolder.f12257f;
                PersonalityLightFlowItemEditAdapter.this.notifyDataSetChanged();
            }
        }

        PersonalityFlowItemSuspendHolder(View view) {
            super(view);
            this.f12252a = (TextView) view.findViewById(C11745R$id.flow_item_duration_value);
            this.f12253b = (LinearLayout) view.findViewById(C11745R$id.frame_layout);
            this.f12254c = (CardView) view.findViewById(C11745R$id.suspend_frame_layout);
            this.f12255d = (ImageView) view.findViewById(C11745R$id.select_image);
            this.f12256e = (ImageView) view.findViewById(C11745R$id.sort_image);
            this.f12253b.setOnClickListener(new C5834a(PersonalityLightFlowItemEditAdapter.this));
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m17258b(int i) {
            this.f12257f = i;
        }

        /* renamed from: c */
        public void mo27200c(boolean z) {
            int i = 4;
            this.f12255d.setVisibility(z ? 4 : 0);
            ImageView imageView = this.f12256e;
            if (z) {
                i = 0;
            }
            imageView.setVisibility(i);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemEditAdapter$a */
    static /* synthetic */ class C5835a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12260a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.yeelight.yeelib.g.n[] r0 = com.yeelight.yeelib.p153g.C9845n.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12260a = r0
                com.yeelight.yeelib.g.n r1 = com.yeelight.yeelib.p153g.C9845n.FLOW_MODE_CT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12260a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.g.n r1 = com.yeelight.yeelib.p153g.C9845n.FLOW_MODE_COLOR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12260a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.g.n r1 = com.yeelight.yeelib.p153g.C9845n.FLOW_MODE_BRIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.adapter.PersonalityLightFlowItemEditAdapter.C5835a.<clinit>():void");
        }
    }

    public PersonalityLightFlowItemEditAdapter(Context context, int i) {
        boolean z = false;
        this.f12229c = false;
        this.f12227a = LayoutInflater.from(context);
        this.f12228b.mo10111h(true);
        z = i != -1 ? true : z;
        this.f12231e = z;
        C4300b0 u = C4300b0.m12083u();
        this.f12232f = z ? u.mo23745i().get(i) : u.mo23753r();
    }

    /* renamed from: b */
    private int m17243b(int i, int i2) {
        return Color.HSVToColor(new float[]{41.0f, C10542f.m25739h(i, "yeelink.light.color1"), C10542f.m25732a(i2)});
    }

    /* renamed from: c */
    private String m17244c(int i) {
        return String.format(Locale.US, "%d%%", new Object[]{Integer.valueOf(this.f12232f.mo31871c().mo31723h().get(i).mo31787b())});
    }

    /* renamed from: d */
    private String m17245d(int i) {
        C9844m mVar = this.f12232f.mo31871c().mo31723h().get(i);
        return String.format(Locale.US, "%02d:%02d.%d", new Object[]{Integer.valueOf(mVar.mo31788c() / 60000), Integer.valueOf((mVar.mo31788c() % 60000) / 1000), Integer.valueOf((mVar.mo31788c() % 1000) / 100)});
    }

    /* renamed from: e */
    private int m17246e(int i) {
        return Color.rgb((i >> 16) & 255, (i >> 8) & 255, (i >> 0) & 255);
    }

    /* renamed from: f */
    public int mo27192f() {
        return this.f12230d;
    }

    /* renamed from: g */
    public void mo27193g(int i) {
        this.f12230d = i;
    }

    public int getItemCount() {
        return this.f12232f.mo31871c().mo31723h().size();
    }

    public int getItemViewType(int i) {
        int i2 = C5835a.f12260a[this.f12232f.mo31871c().mo31723h().get(i).mo31789d().ordinal()];
        if (i2 == 1 || i2 == 2) {
            return 0;
        }
        return i2 != 3 ? 1 : 2;
    }

    /* renamed from: h */
    public void mo27194h(boolean z) {
        this.f12229c = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009d, code lost:
        if (r8 == r0) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a3, code lost:
        r7.setEnabled(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00cf, code lost:
        if (r8 == r0) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x007b, code lost:
        if (r8 == r0) goto L_0x009f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r7, int r8) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.yeelight.cherry.p177ui.adapter.PersonalityLightFlowItemEditAdapter.PersonalityFlowItemHolder
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x007e
            com.yeelight.yeelib.g.i r0 = r6.f12232f
            com.yeelight.yeelib.g.a r0 = r0.mo31871c()
            java.util.List r0 = r0.mo31723h()
            java.lang.Object r0 = r0.get(r8)
            com.yeelight.yeelib.g.m r0 = (com.yeelight.yeelib.p153g.C9844m) r0
            com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemEditAdapter$PersonalityFlowItemHolder r7 = (com.yeelight.cherry.p177ui.adapter.PersonalityLightFlowItemEditAdapter.PersonalityFlowItemHolder) r7
            android.widget.TextView r3 = r7.f12243c
            java.lang.String r4 = r6.m17244c(r8)
            r3.setText(r4)
            android.widget.TextView r3 = r7.f12244d
            java.lang.String r4 = r6.m17245d(r8)
            r3.setText(r4)
            android.widget.ImageView r3 = r7.f12241a
            android.graphics.drawable.Drawable r3 = r3.getDrawable()
            com.yeelight.yeelib.g.n r4 = r0.mo31789d()
            com.yeelight.yeelib.g.n r5 = com.yeelight.yeelib.p153g.C9845n.FLOW_MODE_COLOR
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x004e
            r4 = r3
            android.graphics.drawable.GradientDrawable r4 = (android.graphics.drawable.GradientDrawable) r4
            int r0 = r0.mo31790e()
            int r0 = r6.m17246e(r0)
            r4.setColor(r0)
            r0 = 2131755983(0x7f1003cf, float:1.914286E38)
            goto L_0x0063
        L_0x004e:
            r4 = r3
            android.graphics.drawable.GradientDrawable r4 = (android.graphics.drawable.GradientDrawable) r4
            int r5 = r0.mo31790e()
            int r0 = r0.mo31787b()
            int r0 = r6.m17243b(r5, r0)
            r4.setColor(r0)
            r0 = 2131755984(0x7f1003d0, float:1.9142863E38)
        L_0x0063:
            r7.mo27197b(r0)
            r7.m17254c(r8)
            android.widget.ImageView r0 = r7.f12241a
            r0.setImageDrawable(r3)
            boolean r0 = r6.f12229c
            r7.mo27198d(r0)
            boolean r0 = r6.f12229c
            if (r0 != 0) goto L_0x00d2
            int r0 = r6.f12230d
            android.widget.ImageView r7 = r7.f12247g
            if (r8 != r0) goto L_0x00a3
            goto L_0x009f
        L_0x007e:
            boolean r0 = r7 instanceof com.yeelight.cherry.p177ui.adapter.PersonalityLightFlowItemEditAdapter.PersonalityFlowItemSuspendHolder
            if (r0 == 0) goto L_0x00a7
            com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemEditAdapter$PersonalityFlowItemSuspendHolder r7 = (com.yeelight.cherry.p177ui.adapter.PersonalityLightFlowItemEditAdapter.PersonalityFlowItemSuspendHolder) r7
            r7.m17258b(r8)
            android.widget.TextView r0 = r7.f12252a
            java.lang.String r3 = r6.m17245d(r8)
            r0.setText(r3)
            boolean r0 = r6.f12229c
            r7.mo27200c(r0)
            boolean r0 = r6.f12229c
            if (r0 != 0) goto L_0x00d2
            int r0 = r6.f12230d
            android.widget.ImageView r7 = r7.f12255d
            if (r8 != r0) goto L_0x00a3
        L_0x009f:
            r7.setEnabled(r1)
            goto L_0x00d2
        L_0x00a3:
            r7.setEnabled(r2)
            goto L_0x00d2
        L_0x00a7:
            boolean r0 = r7 instanceof com.yeelight.cherry.p177ui.adapter.PersonalityLightFlowItemEditAdapter.PersonalityFlowItemBrightHolder
            if (r0 == 0) goto L_0x00d2
            com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemEditAdapter$PersonalityFlowItemBrightHolder r7 = (com.yeelight.cherry.p177ui.adapter.PersonalityLightFlowItemEditAdapter.PersonalityFlowItemBrightHolder) r7
            r7.m17251b(r8)
            android.widget.TextView r0 = r7.f12234b
            java.lang.String r3 = r6.m17245d(r8)
            r0.setText(r3)
            android.widget.TextView r0 = r7.f12233a
            java.lang.String r3 = r6.m17244c(r8)
            r0.setText(r3)
            boolean r0 = r6.f12229c
            r7.mo27195c(r0)
            boolean r0 = r6.f12229c
            if (r0 != 0) goto L_0x00d2
            int r0 = r6.f12230d
            android.widget.ImageView r7 = r7.f12236d
            if (r8 != r0) goto L_0x00a3
            goto L_0x009f
        L_0x00d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.adapter.PersonalityLightFlowItemEditAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i == 0 ? new PersonalityFlowItemHolder(this.f12227a.inflate(C11748R$layout.list_item_personality_edit_frame, viewGroup, false)) : i == 2 ? new PersonalityFlowItemBrightHolder(this.f12227a.inflate(C11748R$layout.list_item_personality_edit_frame_bright, viewGroup, false)) : new PersonalityFlowItemSuspendHolder(this.f12227a.inflate(C11748R$layout.list_item_personality_edit_frame_suspend, viewGroup, false));
    }
}
