package com.yeelight.cherry.p141ui.adapter;

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
import com.chauthai.swipereveallayout.C0635a;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.models.C3112v;
import com.yeelight.yeelib.models.C8319k;
import com.yeelight.yeelib.models.CustomAdvancedFlowScene;
import java.util.Locale;
import p051j4.C9188d;

/* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemEditAdapter */
public class PersonalityLightFlowItemEditAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private final LayoutInflater f11827a;

    /* renamed from: b */
    private final C0635a f11828b;

    /* renamed from: c */
    private boolean f11829c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f11830d;

    /* renamed from: e */
    boolean f11831e;

    /* renamed from: f */
    private CustomAdvancedFlowScene f11832f;

    /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemEditAdapter$PersonalityFlowItemBrightHolder */
    public class PersonalityFlowItemBrightHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f11833a;

        /* renamed from: b */
        TextView f11834b;

        /* renamed from: c */
        LinearLayout f11835c;

        /* renamed from: d */
        ImageView f11836d;

        /* renamed from: e */
        ImageView f11837e;

        /* renamed from: f */
        int f11838f;

        /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemEditAdapter$PersonalityFlowItemBrightHolder$a */
        class C5895a implements View.OnClickListener {
            C5895a(PersonalityLightFlowItemEditAdapter personalityLightFlowItemEditAdapter) {
            }

            public void onClick(View view) {
                StringBuilder sb = new StringBuilder();
                sb.append("onClick");
                sb.append(PersonalityFlowItemBrightHolder.this.getPosition());
                PersonalityFlowItemBrightHolder personalityFlowItemBrightHolder = PersonalityFlowItemBrightHolder.this;
                int unused = PersonalityLightFlowItemEditAdapter.this.f11830d = personalityFlowItemBrightHolder.f11838f;
                PersonalityLightFlowItemEditAdapter.this.notifyDataSetChanged();
            }
        }

        PersonalityFlowItemBrightHolder(View view) {
            super(view);
            this.f11833a = (TextView) view.findViewById(C12225R$id.flow_item_bright_value);
            this.f11834b = (TextView) view.findViewById(C12225R$id.flow_item_duration_value);
            this.f11835c = (LinearLayout) view.findViewById(C12225R$id.frame_layout);
            CardView cardView = (CardView) view.findViewById(C12225R$id.color_ct_frame_layout);
            this.f11836d = (ImageView) view.findViewById(C12225R$id.select_image);
            this.f11837e = (ImageView) view.findViewById(C12225R$id.sort_image);
            this.f11835c.setOnClickListener(new C5895a(PersonalityLightFlowItemEditAdapter.this));
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m17289b(int i) {
            this.f11838f = i;
        }

        /* renamed from: c */
        public void mo31162c(boolean z) {
            int i = 4;
            this.f11836d.setVisibility(z ? 4 : 0);
            ImageView imageView = this.f11837e;
            if (z) {
                i = 0;
            }
            imageView.setVisibility(i);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemEditAdapter$PersonalityFlowItemHolder */
    public class PersonalityFlowItemHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f11841a;

        /* renamed from: b */
        TextView f11842b;

        /* renamed from: c */
        TextView f11843c;

        /* renamed from: d */
        TextView f11844d;

        /* renamed from: e */
        LinearLayout f11845e;

        /* renamed from: f */
        CardView f11846f;

        /* renamed from: g */
        ImageView f11847g;

        /* renamed from: h */
        ImageView f11848h;

        /* renamed from: i */
        int f11849i;

        /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemEditAdapter$PersonalityFlowItemHolder$a */
        class C5896a implements View.OnClickListener {
            C5896a(PersonalityLightFlowItemEditAdapter personalityLightFlowItemEditAdapter) {
            }

            public void onClick(View view) {
                StringBuilder sb = new StringBuilder();
                sb.append("onClick");
                sb.append(PersonalityFlowItemHolder.this.getPosition());
                PersonalityFlowItemHolder personalityFlowItemHolder = PersonalityFlowItemHolder.this;
                int unused = PersonalityLightFlowItemEditAdapter.this.f11830d = personalityFlowItemHolder.f11849i;
                PersonalityLightFlowItemEditAdapter.this.notifyDataSetChanged();
            }
        }

        PersonalityFlowItemHolder(View view) {
            super(view);
            this.f11841a = (ImageView) view.findViewById(C12225R$id.flow_item_type_image);
            this.f11842b = (TextView) view.findViewById(C12225R$id.flow_item_type_text);
            this.f11843c = (TextView) view.findViewById(C12225R$id.flow_item_bright_value);
            this.f11844d = (TextView) view.findViewById(C12225R$id.flow_item_duration_value);
            this.f11845e = (LinearLayout) view.findViewById(C12225R$id.frame_layout);
            this.f11846f = (CardView) view.findViewById(C12225R$id.color_ct_frame_layout);
            this.f11847g = (ImageView) view.findViewById(C12225R$id.select_image);
            this.f11848h = (ImageView) view.findViewById(C12225R$id.sort_image);
            this.f11845e.setOnClickListener(new C5896a(PersonalityLightFlowItemEditAdapter.this));
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m17292c(int i) {
            this.f11849i = i;
        }

        /* renamed from: b */
        public void mo31164b(int i) {
            this.f11842b.setText(i);
        }

        /* renamed from: d */
        public void mo31165d(boolean z) {
            int i = 4;
            this.f11847g.setVisibility(z ? 4 : 0);
            ImageView imageView = this.f11848h;
            if (z) {
                i = 0;
            }
            imageView.setVisibility(i);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemEditAdapter$PersonalityFlowItemSuspendHolder */
    public class PersonalityFlowItemSuspendHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f11852a;

        /* renamed from: b */
        LinearLayout f11853b;

        /* renamed from: c */
        CardView f11854c;

        /* renamed from: d */
        ImageView f11855d;

        /* renamed from: e */
        ImageView f11856e;

        /* renamed from: f */
        int f11857f;

        /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemEditAdapter$PersonalityFlowItemSuspendHolder$a */
        class C5897a implements View.OnClickListener {
            C5897a(PersonalityLightFlowItemEditAdapter personalityLightFlowItemEditAdapter) {
            }

            public void onClick(View view) {
                StringBuilder sb = new StringBuilder();
                sb.append("onClick");
                sb.append(PersonalityFlowItemSuspendHolder.this.getPosition());
                PersonalityFlowItemSuspendHolder personalityFlowItemSuspendHolder = PersonalityFlowItemSuspendHolder.this;
                int unused = PersonalityLightFlowItemEditAdapter.this.f11830d = personalityFlowItemSuspendHolder.f11857f;
                PersonalityLightFlowItemEditAdapter.this.notifyDataSetChanged();
            }
        }

        PersonalityFlowItemSuspendHolder(View view) {
            super(view);
            this.f11852a = (TextView) view.findViewById(C12225R$id.flow_item_duration_value);
            this.f11853b = (LinearLayout) view.findViewById(C12225R$id.frame_layout);
            this.f11854c = (CardView) view.findViewById(C12225R$id.suspend_frame_layout);
            this.f11855d = (ImageView) view.findViewById(C12225R$id.select_image);
            this.f11856e = (ImageView) view.findViewById(C12225R$id.sort_image);
            this.f11853b.setOnClickListener(new C5897a(PersonalityLightFlowItemEditAdapter.this));
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m17296b(int i) {
            this.f11857f = i;
        }

        /* renamed from: c */
        public void mo31167c(boolean z) {
            int i = 4;
            this.f11855d.setVisibility(z ? 4 : 0);
            ImageView imageView = this.f11856e;
            if (z) {
                i = 0;
            }
            imageView.setVisibility(i);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemEditAdapter$a */
    static /* synthetic */ class C5898a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11860a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.yeelight.yeelib.models.FlowItemMode[] r0 = com.yeelight.yeelib.models.FlowItemMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11860a = r0
                com.yeelight.yeelib.models.FlowItemMode r1 = com.yeelight.yeelib.models.FlowItemMode.FLOW_MODE_CT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11860a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.models.FlowItemMode r1 = com.yeelight.yeelib.models.FlowItemMode.FLOW_MODE_COLOR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11860a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.models.FlowItemMode r1 = com.yeelight.yeelib.models.FlowItemMode.FLOW_MODE_BRIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.adapter.PersonalityLightFlowItemEditAdapter.C5898a.<clinit>():void");
        }
    }

    public PersonalityLightFlowItemEditAdapter(Context context, int i) {
        C0635a aVar = new C0635a();
        this.f11828b = aVar;
        boolean z = false;
        this.f11827a = LayoutInflater.from(context);
        aVar.mo11089h(true);
        z = i != -1 ? true : z;
        this.f11831e = z;
        C3112v u = C3112v.m8242u();
        this.f11832f = z ? u.mo23558i().get(i) : u.mo23566r();
    }

    /* renamed from: b */
    private int m17281b(int i, int i2) {
        return Color.HSVToColor(new float[]{41.0f, C9188d.m22137h(i, "yeelink.light.color1"), C9188d.m22130a(i2)});
    }

    /* renamed from: c */
    private String m17282c(int i) {
        return String.format(Locale.US, "%d%%", new Object[]{Integer.valueOf(this.f11832f.mo35436c().mo35338h().get(i).mo35374b())});
    }

    /* renamed from: d */
    private String m17283d(int i) {
        C8319k kVar = this.f11832f.mo35436c().mo35338h().get(i);
        return String.format(Locale.US, "%02d:%02d.%d", new Object[]{Integer.valueOf(kVar.mo35375c() / 60000), Integer.valueOf((kVar.mo35375c() % 60000) / 1000), Integer.valueOf((kVar.mo35375c() % 1000) / 100)});
    }

    /* renamed from: e */
    private int m17284e(int i) {
        return Color.rgb((i >> 16) & 255, (i >> 8) & 255, (i >> 0) & 255);
    }

    /* renamed from: f */
    public int mo31159f() {
        return this.f11830d;
    }

    /* renamed from: g */
    public void mo31160g(int i) {
        this.f11830d = i;
    }

    public int getItemCount() {
        return this.f11832f.mo35436c().mo35338h().size();
    }

    public int getItemViewType(int i) {
        int i2 = C5898a.f11860a[this.f11832f.mo35436c().mo35338h().get(i).mo35376d().ordinal()];
        if (i2 == 1 || i2 == 2) {
            return 0;
        }
        return i2 != 3 ? 1 : 2;
    }

    /* renamed from: h */
    public void mo31161h(boolean z) {
        this.f11829c = z;
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
            boolean r0 = r7 instanceof com.yeelight.cherry.p141ui.adapter.PersonalityLightFlowItemEditAdapter.PersonalityFlowItemHolder
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x007e
            com.yeelight.yeelib.models.CustomAdvancedFlowScene r0 = r6.f11832f
            com.yeelight.yeelib.models.a r0 = r0.mo35436c()
            java.util.List r0 = r0.mo35338h()
            java.lang.Object r0 = r0.get(r8)
            com.yeelight.yeelib.models.k r0 = (com.yeelight.yeelib.models.C8319k) r0
            com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemEditAdapter$PersonalityFlowItemHolder r7 = (com.yeelight.cherry.p141ui.adapter.PersonalityLightFlowItemEditAdapter.PersonalityFlowItemHolder) r7
            android.widget.TextView r3 = r7.f11843c
            java.lang.String r4 = r6.m17282c(r8)
            r3.setText(r4)
            android.widget.TextView r3 = r7.f11844d
            java.lang.String r4 = r6.m17283d(r8)
            r3.setText(r4)
            android.widget.ImageView r3 = r7.f11841a
            android.graphics.drawable.Drawable r3 = r3.getDrawable()
            com.yeelight.yeelib.models.FlowItemMode r4 = r0.mo35376d()
            com.yeelight.yeelib.models.FlowItemMode r5 = com.yeelight.yeelib.models.FlowItemMode.FLOW_MODE_COLOR
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x004e
            r4 = r3
            android.graphics.drawable.GradientDrawable r4 = (android.graphics.drawable.GradientDrawable) r4
            int r0 = r0.mo35377e()
            int r0 = r6.m17284e(r0)
            r4.setColor(r0)
            r0 = 2131755995(0x7f1003db, float:1.9142885E38)
            goto L_0x0063
        L_0x004e:
            r4 = r3
            android.graphics.drawable.GradientDrawable r4 = (android.graphics.drawable.GradientDrawable) r4
            int r5 = r0.mo35377e()
            int r0 = r0.mo35374b()
            int r0 = r6.m17281b(r5, r0)
            r4.setColor(r0)
            r0 = 2131755996(0x7f1003dc, float:1.9142887E38)
        L_0x0063:
            r7.mo31164b(r0)
            r7.m17292c(r8)
            android.widget.ImageView r0 = r7.f11841a
            r0.setImageDrawable(r3)
            boolean r0 = r6.f11829c
            r7.mo31165d(r0)
            boolean r0 = r6.f11829c
            if (r0 != 0) goto L_0x00d2
            int r0 = r6.f11830d
            android.widget.ImageView r7 = r7.f11847g
            if (r8 != r0) goto L_0x00a3
            goto L_0x009f
        L_0x007e:
            boolean r0 = r7 instanceof com.yeelight.cherry.p141ui.adapter.PersonalityLightFlowItemEditAdapter.PersonalityFlowItemSuspendHolder
            if (r0 == 0) goto L_0x00a7
            com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemEditAdapter$PersonalityFlowItemSuspendHolder r7 = (com.yeelight.cherry.p141ui.adapter.PersonalityLightFlowItemEditAdapter.PersonalityFlowItemSuspendHolder) r7
            r7.m17296b(r8)
            android.widget.TextView r0 = r7.f11852a
            java.lang.String r3 = r6.m17283d(r8)
            r0.setText(r3)
            boolean r0 = r6.f11829c
            r7.mo31167c(r0)
            boolean r0 = r6.f11829c
            if (r0 != 0) goto L_0x00d2
            int r0 = r6.f11830d
            android.widget.ImageView r7 = r7.f11855d
            if (r8 != r0) goto L_0x00a3
        L_0x009f:
            r7.setEnabled(r1)
            goto L_0x00d2
        L_0x00a3:
            r7.setEnabled(r2)
            goto L_0x00d2
        L_0x00a7:
            boolean r0 = r7 instanceof com.yeelight.cherry.p141ui.adapter.PersonalityLightFlowItemEditAdapter.PersonalityFlowItemBrightHolder
            if (r0 == 0) goto L_0x00d2
            com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemEditAdapter$PersonalityFlowItemBrightHolder r7 = (com.yeelight.cherry.p141ui.adapter.PersonalityLightFlowItemEditAdapter.PersonalityFlowItemBrightHolder) r7
            r7.m17289b(r8)
            android.widget.TextView r0 = r7.f11834b
            java.lang.String r3 = r6.m17283d(r8)
            r0.setText(r3)
            android.widget.TextView r0 = r7.f11833a
            java.lang.String r3 = r6.m17282c(r8)
            r0.setText(r3)
            boolean r0 = r6.f11829c
            r7.mo31162c(r0)
            boolean r0 = r6.f11829c
            if (r0 != 0) goto L_0x00d2
            int r0 = r6.f11830d
            android.widget.ImageView r7 = r7.f11836d
            if (r8 != r0) goto L_0x00a3
            goto L_0x009f
        L_0x00d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.adapter.PersonalityLightFlowItemEditAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i == 0 ? new PersonalityFlowItemHolder(this.f11827a.inflate(C12228R$layout.list_item_personality_edit_frame, viewGroup, false)) : i == 2 ? new PersonalityFlowItemBrightHolder(this.f11827a.inflate(C12228R$layout.list_item_personality_edit_frame_bright, viewGroup, false)) : new PersonalityFlowItemSuspendHolder(this.f11827a.inflate(C12228R$layout.list_item_personality_edit_frame_suspend, viewGroup, false));
    }
}
