package com.yeelight.cherry.p141ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.chauthai.swipereveallayout.C0635a;
import com.chauthai.swipereveallayout.SwipeRevealLayout;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.activity.ActionSheetActivity;
import com.yeelight.cherry.p141ui.activity.AddBrightFrameActivity;
import com.yeelight.cherry.p141ui.activity.AddColorFrameActivity;
import com.yeelight.cherry.p141ui.activity.AddColorTemperatureFrameActivity;
import com.yeelight.cherry.p141ui.activity.AddSuspendFrameActivity;
import com.yeelight.cherry.p141ui.activity.PersonalityLightItemMoreActivity;
import com.yeelight.yeelib.models.C3112v;
import com.yeelight.yeelib.models.C8319k;
import com.yeelight.yeelib.models.CustomAdvancedFlowScene;
import com.yeelight.yeelib.models.FlowItemMode;
import com.yeelight.yeelib.p142ui.view.TimelineView;
import java.util.Locale;
import p051j4.C9188d;

/* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemAdapter */
public class PersonalityLightFlowItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private final LayoutInflater f11773a;

    /* renamed from: b */
    private final C0635a f11774b;

    /* renamed from: c */
    private boolean f11775c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f11776d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public CustomAdvancedFlowScene f11777e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C5894b f11778f;

    /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemAdapter$PersonalityAddItemHolder */
    public class PersonalityAddItemHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f11779a;

        /* renamed from: b */
        LinearLayout f11780b;

        /* renamed from: c */
        TimelineView f11781c;

        /* renamed from: d */
        LinearLayout f11782d;

        /* renamed from: e */
        TextView f11783e;

        /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemAdapter$PersonalityAddItemHolder$a */
        class C5883a implements View.OnClickListener {
            C5883a(PersonalityLightFlowItemAdapter personalityLightFlowItemAdapter) {
            }

            public void onClick(View view) {
                if (PersonalityLightFlowItemAdapter.this.f11778f != null) {
                    PersonalityLightFlowItemAdapter.this.f11778f.mo30715J();
                }
                Intent intent = new Intent();
                intent.setClass(view.getContext(), ActionSheetActivity.class);
                intent.putExtra("custom_scene_index", PersonalityLightFlowItemAdapter.this.f11776d);
                view.getContext().startActivity(intent);
            }
        }

        PersonalityAddItemHolder(View view) {
            super(view);
            this.f11779a = (TextView) view.findViewById(C12225R$id.padding_view);
            this.f11780b = (LinearLayout) view.findViewById(C12225R$id.layout_add_frame);
            this.f11781c = (TimelineView) view.findViewById(C12225R$id.layout_time_line);
            this.f11782d = (LinearLayout) view.findViewById(C12225R$id.add_layout);
            this.f11783e = (TextView) view.findViewById(C12225R$id.can_not_add_tips);
            this.f11780b.setOnClickListener(new C5883a(PersonalityLightFlowItemAdapter.this));
        }

        /* renamed from: a */
        public void mo31147a(boolean z) {
            if (z) {
                this.f11783e.setVisibility(0);
                this.f11782d.setVisibility(4);
                return;
            }
            this.f11783e.setVisibility(4);
            this.f11782d.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemAdapter$PersonalityFlowItemBrightHolder */
    public class PersonalityFlowItemBrightHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f11786a;

        /* renamed from: b */
        TimelineView f11787b;

        /* renamed from: c */
        TextView f11788c;

        /* renamed from: d */
        TextView f11789d;

        /* renamed from: e */
        LinearLayout f11790e;

        /* renamed from: f */
        LinearLayout f11791f;

        /* renamed from: g */
        LinearLayout f11792g;

        /* renamed from: h */
        SwipeRevealLayout f11793h;

        /* renamed from: i */
        int f11794i;

        /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemAdapter$PersonalityFlowItemBrightHolder$a */
        class C5884a implements View.OnClickListener {
            C5884a(PersonalityLightFlowItemAdapter personalityLightFlowItemAdapter) {
            }

            public void onClick(View view) {
                StringBuilder sb = new StringBuilder();
                sb.append("onClick");
                sb.append(PersonalityFlowItemBrightHolder.this.getPosition());
                Intent intent = new Intent();
                intent.setClass(view.getContext(), AddBrightFrameActivity.class);
                intent.putExtra("scene_edit", true);
                intent.putExtra("scene_edit_index", PersonalityFlowItemBrightHolder.this.f11794i);
                intent.putExtra("custom_scene_index", PersonalityLightFlowItemAdapter.this.f11776d);
                view.getContext().startActivity(intent);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemAdapter$PersonalityFlowItemBrightHolder$b */
        class C5885b implements View.OnClickListener {
            C5885b(PersonalityLightFlowItemAdapter personalityLightFlowItemAdapter) {
            }

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(view.getContext(), PersonalityLightItemMoreActivity.class);
                intent.putExtra("scene_edit_index", PersonalityFlowItemBrightHolder.this.f11794i);
                intent.putExtra("custom_scene_index", PersonalityLightFlowItemAdapter.this.f11776d);
                view.getContext().startActivity(intent);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemAdapter$PersonalityFlowItemBrightHolder$c */
        class C5886c implements View.OnClickListener {
            C5886c(PersonalityLightFlowItemAdapter personalityLightFlowItemAdapter) {
            }

            public void onClick(View view) {
                PersonalityLightFlowItemAdapter.this.f11777e.mo35436c().mo35338h().remove(PersonalityFlowItemBrightHolder.this.f11794i);
                PersonalityLightFlowItemAdapter.this.notifyDataSetChanged();
            }
        }

        PersonalityFlowItemBrightHolder(View view) {
            super(view);
            this.f11786a = (TextView) view.findViewById(C12225R$id.padding_view);
            this.f11787b = (TimelineView) view.findViewById(C12225R$id.layout_time_line);
            this.f11788c = (TextView) view.findViewById(C12225R$id.flow_item_duration_value);
            this.f11789d = (TextView) view.findViewById(C12225R$id.flow_item_bright_value);
            this.f11793h = (SwipeRevealLayout) view.findViewById(2131297525);
            this.f11790e = (LinearLayout) view.findViewById(C12225R$id.bright_frame_layout);
            this.f11791f = (LinearLayout) view.findViewById(2131297034);
            this.f11792g = (LinearLayout) view.findViewById(C12225R$id.layout_left_view);
            this.f11790e.setOnClickListener(new C5884a(PersonalityLightFlowItemAdapter.this));
            this.f11791f.setOnClickListener(new C5885b(PersonalityLightFlowItemAdapter.this));
            this.f11792g.setOnClickListener(new C5886c(PersonalityLightFlowItemAdapter.this));
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m17273b(int i) {
            this.f11794i = i;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemAdapter$PersonalityFlowItemHolder */
    public class PersonalityFlowItemHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f11799a;

        /* renamed from: b */
        TimelineView f11800b;

        /* renamed from: c */
        ImageView f11801c;

        /* renamed from: d */
        TextView f11802d;

        /* renamed from: e */
        TextView f11803e;

        /* renamed from: f */
        TextView f11804f;

        /* renamed from: g */
        LinearLayout f11805g;

        /* renamed from: h */
        LinearLayout f11806h;

        /* renamed from: i */
        LinearLayout f11807i;

        /* renamed from: j */
        SwipeRevealLayout f11808j;

        /* renamed from: k */
        int f11809k;

        /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemAdapter$PersonalityFlowItemHolder$a */
        class C5887a implements View.OnClickListener {
            C5887a(PersonalityLightFlowItemAdapter personalityLightFlowItemAdapter) {
            }

            public void onClick(View view) {
                Class cls;
                Context context;
                StringBuilder sb = new StringBuilder();
                sb.append("onClick");
                sb.append(PersonalityFlowItemHolder.this.getPosition());
                Intent intent = new Intent();
                if (PersonalityLightFlowItemAdapter.this.f11777e.mo35436c().mo35338h().get(PersonalityFlowItemHolder.this.f11809k).mo35376d().equals(FlowItemMode.FLOW_MODE_COLOR)) {
                    context = view.getContext();
                    cls = AddColorFrameActivity.class;
                } else {
                    context = view.getContext();
                    cls = AddColorTemperatureFrameActivity.class;
                }
                intent.setClass(context, cls);
                intent.putExtra("scene_edit", true);
                intent.putExtra("scene_edit_index", PersonalityFlowItemHolder.this.f11809k);
                intent.putExtra("custom_scene_index", PersonalityLightFlowItemAdapter.this.f11776d);
                view.getContext().startActivity(intent);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemAdapter$PersonalityFlowItemHolder$b */
        class C5888b implements View.OnClickListener {
            C5888b(PersonalityLightFlowItemAdapter personalityLightFlowItemAdapter) {
            }

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(view.getContext(), PersonalityLightItemMoreActivity.class);
                intent.putExtra("scene_edit_index", PersonalityFlowItemHolder.this.f11809k);
                intent.putExtra("custom_scene_index", PersonalityLightFlowItemAdapter.this.f11776d);
                view.getContext().startActivity(intent);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemAdapter$PersonalityFlowItemHolder$c */
        class C5889c implements View.OnClickListener {
            C5889c(PersonalityLightFlowItemAdapter personalityLightFlowItemAdapter) {
            }

            public void onClick(View view) {
                PersonalityLightFlowItemAdapter.this.f11777e.mo35436c().mo35338h().remove(PersonalityFlowItemHolder.this.f11809k);
                PersonalityLightFlowItemAdapter.this.notifyDataSetChanged();
            }
        }

        PersonalityFlowItemHolder(View view) {
            super(view);
            this.f11799a = (TextView) view.findViewById(C12225R$id.padding_view);
            this.f11800b = (TimelineView) view.findViewById(C12225R$id.layout_time_line);
            this.f11801c = (ImageView) view.findViewById(C12225R$id.flow_item_type_image);
            this.f11802d = (TextView) view.findViewById(C12225R$id.flow_item_type_text);
            this.f11803e = (TextView) view.findViewById(C12225R$id.flow_item_bright_value);
            this.f11804f = (TextView) view.findViewById(C12225R$id.flow_item_duration_value);
            this.f11808j = (SwipeRevealLayout) view.findViewById(2131297525);
            this.f11805g = (LinearLayout) view.findViewById(C12225R$id.color_ct_frame_layout);
            this.f11806h = (LinearLayout) view.findViewById(2131297034);
            this.f11807i = (LinearLayout) view.findViewById(C12225R$id.layout_left_view);
            this.f11805g.setOnClickListener(new C5887a(PersonalityLightFlowItemAdapter.this));
            this.f11806h.setOnClickListener(new C5888b(PersonalityLightFlowItemAdapter.this));
            this.f11807i.setOnClickListener(new C5889c(PersonalityLightFlowItemAdapter.this));
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m17275c(int i) {
            this.f11809k = i;
        }

        /* renamed from: b */
        public void mo31152b(int i) {
            this.f11802d.setText(i);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemAdapter$PersonalityFlowItemSuspendHolder */
    public class PersonalityFlowItemSuspendHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f11814a;

        /* renamed from: b */
        TimelineView f11815b;

        /* renamed from: c */
        TextView f11816c;

        /* renamed from: d */
        LinearLayout f11817d;

        /* renamed from: e */
        LinearLayout f11818e;

        /* renamed from: f */
        LinearLayout f11819f;

        /* renamed from: g */
        SwipeRevealLayout f11820g;

        /* renamed from: h */
        int f11821h;

        /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemAdapter$PersonalityFlowItemSuspendHolder$a */
        class C5890a implements View.OnClickListener {
            C5890a(PersonalityLightFlowItemAdapter personalityLightFlowItemAdapter) {
            }

            public void onClick(View view) {
                StringBuilder sb = new StringBuilder();
                sb.append("onClick");
                sb.append(PersonalityFlowItemSuspendHolder.this.getPosition());
                Intent intent = new Intent();
                intent.setClass(view.getContext(), AddSuspendFrameActivity.class);
                intent.putExtra("scene_edit", true);
                intent.putExtra("scene_edit_index", PersonalityFlowItemSuspendHolder.this.f11821h);
                intent.putExtra("custom_scene_index", PersonalityLightFlowItemAdapter.this.f11776d);
                view.getContext().startActivity(intent);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemAdapter$PersonalityFlowItemSuspendHolder$b */
        class C5891b implements View.OnClickListener {
            C5891b(PersonalityLightFlowItemAdapter personalityLightFlowItemAdapter) {
            }

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(view.getContext(), PersonalityLightItemMoreActivity.class);
                intent.putExtra("scene_edit_index", PersonalityFlowItemSuspendHolder.this.f11821h);
                intent.putExtra("custom_scene_index", PersonalityLightFlowItemAdapter.this.f11776d);
                view.getContext().startActivity(intent);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemAdapter$PersonalityFlowItemSuspendHolder$c */
        class C5892c implements View.OnClickListener {
            C5892c(PersonalityLightFlowItemAdapter personalityLightFlowItemAdapter) {
            }

            public void onClick(View view) {
                PersonalityLightFlowItemAdapter.this.f11777e.mo35436c().mo35338h().remove(PersonalityFlowItemSuspendHolder.this.f11821h);
                PersonalityLightFlowItemAdapter.this.notifyDataSetChanged();
            }
        }

        PersonalityFlowItemSuspendHolder(View view) {
            super(view);
            this.f11814a = (TextView) view.findViewById(C12225R$id.padding_view);
            this.f11815b = (TimelineView) view.findViewById(C12225R$id.layout_time_line);
            this.f11816c = (TextView) view.findViewById(C12225R$id.flow_item_duration_value);
            this.f11820g = (SwipeRevealLayout) view.findViewById(2131297525);
            this.f11817d = (LinearLayout) view.findViewById(C12225R$id.suspend_frame_layout);
            this.f11818e = (LinearLayout) view.findViewById(2131297034);
            this.f11819f = (LinearLayout) view.findViewById(C12225R$id.layout_left_view);
            this.f11817d.setOnClickListener(new C5890a(PersonalityLightFlowItemAdapter.this));
            this.f11818e.setOnClickListener(new C5891b(PersonalityLightFlowItemAdapter.this));
            this.f11819f.setOnClickListener(new C5892c(PersonalityLightFlowItemAdapter.this));
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m17278b(int i) {
            this.f11821h = i;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemAdapter$a */
    static /* synthetic */ class C5893a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11826a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.yeelight.yeelib.models.FlowItemMode[] r0 = com.yeelight.yeelib.models.FlowItemMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11826a = r0
                com.yeelight.yeelib.models.FlowItemMode r1 = com.yeelight.yeelib.models.FlowItemMode.FLOW_MODE_CT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11826a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.models.FlowItemMode r1 = com.yeelight.yeelib.models.FlowItemMode.FLOW_MODE_COLOR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11826a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.models.FlowItemMode r1 = com.yeelight.yeelib.models.FlowItemMode.FLOW_MODE_BRIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.adapter.PersonalityLightFlowItemAdapter.C5893a.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemAdapter$b */
    public interface C5894b {
        /* renamed from: J */
        void mo30715J();
    }

    public PersonalityLightFlowItemAdapter(Context context, int i) {
        C0635a aVar = new C0635a();
        this.f11774b = aVar;
        boolean z = false;
        this.f11773a = LayoutInflater.from(context);
        aVar.mo11089h(true);
        this.f11776d = i;
        if (!(i == -1 || i == -2)) {
            z = true;
        }
        this.f11775c = z;
        C3112v u = C3112v.m8242u();
        this.f11777e = z ? u.mo23558i().get(this.f11776d) : u.mo23566r();
    }

    /* renamed from: d */
    private int m17265d(int i, int i2) {
        return Color.HSVToColor(new float[]{41.0f, C9188d.m22137h(i, "yeelink.light.color1"), C9188d.m22130a(i2)});
    }

    /* renamed from: e */
    private String m17266e(int i) {
        return String.format(Locale.US, "%d%%", new Object[]{Integer.valueOf(this.f11777e.mo35436c().mo35338h().get(i).mo35374b())});
    }

    /* renamed from: f */
    private String m17267f(int i) {
        C8319k kVar = this.f11777e.mo35436c().mo35338h().get(i);
        return String.format(Locale.US, "%02d:%02d.%d", new Object[]{Integer.valueOf(kVar.mo35375c() / 60000), Integer.valueOf((kVar.mo35375c() % 60000) / 1000), Integer.valueOf((kVar.mo35375c() % 1000) / 100)});
    }

    /* renamed from: g */
    private int m17268g(int i) {
        return Color.rgb((i >> 16) & 255, (i >> 8) & 255, (i >> 0) & 255);
    }

    public int getItemCount() {
        return this.f11776d == -2 ? this.f11777e.mo35436c().mo35338h().size() : this.f11777e.mo35436c().mo35338h().size() + 1;
    }

    public int getItemViewType(int i) {
        if (this.f11776d != -2 && i == getItemCount() - 1) {
            return 3;
        }
        int i2 = C5893a.f11826a[this.f11777e.mo35436c().mo35338h().get(i).mo35376d().ordinal()];
        if (i2 == 1 || i2 == 2) {
            return 0;
        }
        return i2 != 3 ? 1 : 2;
    }

    /* renamed from: h */
    public void mo31145h(C5894b bVar) {
        this.f11778f = bVar;
    }

    /* renamed from: i */
    public void mo31146i() {
        this.f11778f = null;
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        SwipeRevealLayout swipeRevealLayout;
        TimelineView timelineView;
        int i2;
        int i3;
        if (viewHolder instanceof PersonalityFlowItemHolder) {
            TextView textView = ((PersonalityFlowItemHolder) viewHolder).f11799a;
            if (i != 0) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
            C8319k kVar = this.f11777e.mo35436c().mo35338h().get(i);
            if (i == 0) {
                ((PersonalityFlowItemHolder) viewHolder).f11800b.setMode(0);
            } else if (i == 9) {
                ((PersonalityFlowItemHolder) viewHolder).f11800b.setMode(3);
            } else {
                ((PersonalityFlowItemHolder) viewHolder).f11800b.setMode(1);
            }
            PersonalityFlowItemHolder personalityFlowItemHolder = (PersonalityFlowItemHolder) viewHolder;
            personalityFlowItemHolder.f11803e.setText(m17266e(i));
            personalityFlowItemHolder.f11804f.setText(m17267f(i));
            Drawable drawable = personalityFlowItemHolder.f11801c.getDrawable();
            if (kVar.mo35376d().equals(FlowItemMode.FLOW_MODE_COLOR)) {
                ((GradientDrawable) drawable).setColor(m17268g(kVar.mo35377e()));
                i3 = 2131755995;
            } else {
                ((GradientDrawable) drawable).setColor(m17265d(kVar.mo35377e(), kVar.mo35374b()));
                i3 = 2131755996;
            }
            personalityFlowItemHolder.mo31152b(i3);
            personalityFlowItemHolder.m17275c(i);
            personalityFlowItemHolder.f11801c.setImageDrawable(drawable);
            this.f11774b.mo11087d(personalityFlowItemHolder.f11808j, String.valueOf(i));
            swipeRevealLayout = personalityFlowItemHolder.f11808j;
        } else if (viewHolder instanceof PersonalityFlowItemSuspendHolder) {
            TextView textView2 = ((PersonalityFlowItemSuspendHolder) viewHolder).f11814a;
            if (i != 0) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
            TimelineView timelineView2 = ((PersonalityFlowItemSuspendHolder) viewHolder).f11815b;
            if (i == 0) {
                timelineView2.setMode(0);
            } else if (i == 9) {
                timelineView2.setMode(3);
            } else {
                timelineView2.setMode(1);
            }
            PersonalityFlowItemSuspendHolder personalityFlowItemSuspendHolder = (PersonalityFlowItemSuspendHolder) viewHolder;
            personalityFlowItemSuspendHolder.m17278b(i);
            personalityFlowItemSuspendHolder.f11816c.setText(m17267f(i));
            this.f11774b.mo11087d(personalityFlowItemSuspendHolder.f11820g, String.valueOf(i));
            swipeRevealLayout = personalityFlowItemSuspendHolder.f11820g;
        } else if (viewHolder instanceof PersonalityAddItemHolder) {
            TextView textView3 = ((PersonalityAddItemHolder) viewHolder).f11779a;
            if (i != 0) {
                textView3.setVisibility(8);
            } else {
                textView3.setVisibility(0);
            }
            if (i == 0) {
                PersonalityAddItemHolder personalityAddItemHolder = (PersonalityAddItemHolder) viewHolder;
                personalityAddItemHolder.mo31147a(false);
                timelineView = personalityAddItemHolder.f11781c;
                i2 = 4;
            } else {
                PersonalityAddItemHolder personalityAddItemHolder2 = (PersonalityAddItemHolder) viewHolder;
                if (i == 10) {
                    personalityAddItemHolder2.mo31147a(true);
                    return;
                }
                personalityAddItemHolder2.mo31147a(false);
                timelineView = personalityAddItemHolder2.f11781c;
                i2 = 2;
            }
            timelineView.setMode(i2);
            return;
        } else if (viewHolder instanceof PersonalityFlowItemBrightHolder) {
            TextView textView4 = ((PersonalityFlowItemBrightHolder) viewHolder).f11786a;
            if (i != 0) {
                textView4.setVisibility(8);
            } else {
                textView4.setVisibility(0);
            }
            TimelineView timelineView3 = ((PersonalityFlowItemBrightHolder) viewHolder).f11787b;
            if (i == 0) {
                timelineView3.setMode(0);
            } else if (i == 9) {
                timelineView3.setMode(3);
            } else {
                timelineView3.setMode(1);
            }
            PersonalityFlowItemBrightHolder personalityFlowItemBrightHolder = (PersonalityFlowItemBrightHolder) viewHolder;
            personalityFlowItemBrightHolder.m17273b(i);
            personalityFlowItemBrightHolder.f11788c.setText(m17267f(i));
            personalityFlowItemBrightHolder.f11789d.setText(m17266e(i));
            this.f11774b.mo11087d(personalityFlowItemBrightHolder.f11793h, String.valueOf(i));
            swipeRevealLayout = personalityFlowItemBrightHolder.f11793h;
        } else {
            return;
        }
        swipeRevealLayout.mo11062B(true);
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i == 0 ? new PersonalityFlowItemHolder(this.f11773a.inflate(C12228R$layout.list_item_personality_frame, viewGroup, false)) : i == 1 ? new PersonalityFlowItemSuspendHolder(this.f11773a.inflate(C12228R$layout.list_item_personality_frame_suspend, viewGroup, false)) : i == 2 ? new PersonalityFlowItemBrightHolder(this.f11773a.inflate(C12228R$layout.list_item_personality_frame_bright, viewGroup, false)) : new PersonalityAddItemHolder(this.f11773a.inflate(C12228R$layout.list_item_personality_frame_add, viewGroup, false));
    }
}
