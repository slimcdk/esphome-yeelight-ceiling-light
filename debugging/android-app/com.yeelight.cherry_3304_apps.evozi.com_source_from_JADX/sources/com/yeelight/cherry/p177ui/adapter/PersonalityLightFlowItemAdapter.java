package com.yeelight.cherry.p177ui.adapter;

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
import com.chauthai.swipereveallayout.C1261a;
import com.chauthai.swipereveallayout.SwipeRevealLayout;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p177ui.activity.ActionSheetActivity;
import com.yeelight.cherry.p177ui.activity.AddBrightFrameActivity;
import com.yeelight.cherry.p177ui.activity.AddColorFrameActivity;
import com.yeelight.cherry.p177ui.activity.AddColorTemperatureFrameActivity;
import com.yeelight.cherry.p177ui.activity.AddSuspendFrameActivity;
import com.yeelight.cherry.p177ui.activity.PersonalityLightItemMoreActivity;
import com.yeelight.yeelib.p153g.C4300b0;
import com.yeelight.yeelib.p153g.C9838i;
import com.yeelight.yeelib.p153g.C9844m;
import com.yeelight.yeelib.p153g.C9845n;
import com.yeelight.yeelib.p194ui.view.TimelineView;
import com.yeelight.yeelib.utils.C10542f;
import java.util.Locale;

/* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemAdapter */
public class PersonalityLightFlowItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private final LayoutInflater f12173a;

    /* renamed from: b */
    private final C1261a f12174b = new C1261a();

    /* renamed from: c */
    private boolean f12175c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f12176d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C9838i f12177e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C5831b f12178f;

    /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemAdapter$PersonalityAddItemHolder */
    public class PersonalityAddItemHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f12179a;

        /* renamed from: b */
        LinearLayout f12180b;

        /* renamed from: c */
        TimelineView f12181c;

        /* renamed from: d */
        LinearLayout f12182d;

        /* renamed from: e */
        TextView f12183e;

        /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemAdapter$PersonalityAddItemHolder$a */
        class C5820a implements View.OnClickListener {
            C5820a(PersonalityLightFlowItemAdapter personalityLightFlowItemAdapter) {
            }

            public void onClick(View view) {
                if (PersonalityLightFlowItemAdapter.this.f12178f != null) {
                    PersonalityLightFlowItemAdapter.this.f12178f.mo26705J();
                }
                Intent intent = new Intent();
                intent.setClass(view.getContext(), ActionSheetActivity.class);
                intent.putExtra("custom_scene_index", PersonalityLightFlowItemAdapter.this.f12176d);
                view.getContext().startActivity(intent);
            }
        }

        PersonalityAddItemHolder(View view) {
            super(view);
            this.f12179a = (TextView) view.findViewById(C11745R$id.padding_view);
            this.f12180b = (LinearLayout) view.findViewById(C11745R$id.layout_add_frame);
            this.f12181c = (TimelineView) view.findViewById(C11745R$id.layout_time_line);
            this.f12182d = (LinearLayout) view.findViewById(C11745R$id.add_layout);
            this.f12183e = (TextView) view.findViewById(C11745R$id.can_not_add_tips);
            this.f12180b.setOnClickListener(new C5820a(PersonalityLightFlowItemAdapter.this));
        }

        /* renamed from: a */
        public void mo27180a(boolean z) {
            if (z) {
                this.f12183e.setVisibility(0);
                this.f12182d.setVisibility(4);
                return;
            }
            this.f12183e.setVisibility(4);
            this.f12182d.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemAdapter$PersonalityFlowItemBrightHolder */
    public class PersonalityFlowItemBrightHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f12186a;

        /* renamed from: b */
        TimelineView f12187b;

        /* renamed from: c */
        TextView f12188c;

        /* renamed from: d */
        TextView f12189d;

        /* renamed from: e */
        LinearLayout f12190e;

        /* renamed from: f */
        LinearLayout f12191f;

        /* renamed from: g */
        LinearLayout f12192g;

        /* renamed from: h */
        SwipeRevealLayout f12193h;

        /* renamed from: i */
        int f12194i;

        /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemAdapter$PersonalityFlowItemBrightHolder$a */
        class C5821a implements View.OnClickListener {
            C5821a(PersonalityLightFlowItemAdapter personalityLightFlowItemAdapter) {
            }

            public void onClick(View view) {
                "onClick" + PersonalityFlowItemBrightHolder.this.getPosition();
                Intent intent = new Intent();
                intent.setClass(view.getContext(), AddBrightFrameActivity.class);
                intent.putExtra("scene_edit", true);
                intent.putExtra("scene_edit_index", PersonalityFlowItemBrightHolder.this.f12194i);
                intent.putExtra("custom_scene_index", PersonalityLightFlowItemAdapter.this.f12176d);
                view.getContext().startActivity(intent);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemAdapter$PersonalityFlowItemBrightHolder$b */
        class C5822b implements View.OnClickListener {
            C5822b(PersonalityLightFlowItemAdapter personalityLightFlowItemAdapter) {
            }

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(view.getContext(), PersonalityLightItemMoreActivity.class);
                intent.putExtra("scene_edit_index", PersonalityFlowItemBrightHolder.this.f12194i);
                intent.putExtra("custom_scene_index", PersonalityLightFlowItemAdapter.this.f12176d);
                view.getContext().startActivity(intent);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemAdapter$PersonalityFlowItemBrightHolder$c */
        class C5823c implements View.OnClickListener {
            C5823c(PersonalityLightFlowItemAdapter personalityLightFlowItemAdapter) {
            }

            public void onClick(View view) {
                PersonalityLightFlowItemAdapter.this.f12177e.mo31871c().mo31723h().remove(PersonalityFlowItemBrightHolder.this.f12194i);
                PersonalityLightFlowItemAdapter.this.notifyDataSetChanged();
            }
        }

        PersonalityFlowItemBrightHolder(View view) {
            super(view);
            this.f12186a = (TextView) view.findViewById(C11745R$id.padding_view);
            this.f12187b = (TimelineView) view.findViewById(C11745R$id.layout_time_line);
            this.f12188c = (TextView) view.findViewById(C11745R$id.flow_item_duration_value);
            this.f12189d = (TextView) view.findViewById(C11745R$id.flow_item_bright_value);
            this.f12193h = (SwipeRevealLayout) view.findViewById(2131297369);
            this.f12190e = (LinearLayout) view.findViewById(C11745R$id.bright_frame_layout);
            this.f12191f = (LinearLayout) view.findViewById(2131296923);
            this.f12192g = (LinearLayout) view.findViewById(C11745R$id.layout_left_view);
            this.f12190e.setOnClickListener(new C5821a(PersonalityLightFlowItemAdapter.this));
            this.f12191f.setOnClickListener(new C5822b(PersonalityLightFlowItemAdapter.this));
            this.f12192g.setOnClickListener(new C5823c(PersonalityLightFlowItemAdapter.this));
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m17235b(int i) {
            this.f12194i = i;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemAdapter$PersonalityFlowItemHolder */
    public class PersonalityFlowItemHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f12199a;

        /* renamed from: b */
        TimelineView f12200b;

        /* renamed from: c */
        ImageView f12201c;

        /* renamed from: d */
        TextView f12202d;

        /* renamed from: e */
        TextView f12203e;

        /* renamed from: f */
        TextView f12204f;

        /* renamed from: g */
        LinearLayout f12205g;

        /* renamed from: h */
        LinearLayout f12206h;

        /* renamed from: i */
        LinearLayout f12207i;

        /* renamed from: j */
        SwipeRevealLayout f12208j;

        /* renamed from: k */
        int f12209k;

        /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemAdapter$PersonalityFlowItemHolder$a */
        class C5824a implements View.OnClickListener {
            C5824a(PersonalityLightFlowItemAdapter personalityLightFlowItemAdapter) {
            }

            public void onClick(View view) {
                Class cls;
                Context context;
                "onClick" + PersonalityFlowItemHolder.this.getPosition();
                Intent intent = new Intent();
                if (PersonalityLightFlowItemAdapter.this.f12177e.mo31871c().mo31723h().get(PersonalityFlowItemHolder.this.f12209k).mo31789d().equals(C9845n.FLOW_MODE_COLOR)) {
                    context = view.getContext();
                    cls = AddColorFrameActivity.class;
                } else {
                    context = view.getContext();
                    cls = AddColorTemperatureFrameActivity.class;
                }
                intent.setClass(context, cls);
                intent.putExtra("scene_edit", true);
                intent.putExtra("scene_edit_index", PersonalityFlowItemHolder.this.f12209k);
                intent.putExtra("custom_scene_index", PersonalityLightFlowItemAdapter.this.f12176d);
                view.getContext().startActivity(intent);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemAdapter$PersonalityFlowItemHolder$b */
        class C5825b implements View.OnClickListener {
            C5825b(PersonalityLightFlowItemAdapter personalityLightFlowItemAdapter) {
            }

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(view.getContext(), PersonalityLightItemMoreActivity.class);
                intent.putExtra("scene_edit_index", PersonalityFlowItemHolder.this.f12209k);
                intent.putExtra("custom_scene_index", PersonalityLightFlowItemAdapter.this.f12176d);
                view.getContext().startActivity(intent);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemAdapter$PersonalityFlowItemHolder$c */
        class C5826c implements View.OnClickListener {
            C5826c(PersonalityLightFlowItemAdapter personalityLightFlowItemAdapter) {
            }

            public void onClick(View view) {
                PersonalityLightFlowItemAdapter.this.f12177e.mo31871c().mo31723h().remove(PersonalityFlowItemHolder.this.f12209k);
                PersonalityLightFlowItemAdapter.this.notifyDataSetChanged();
            }
        }

        PersonalityFlowItemHolder(View view) {
            super(view);
            this.f12199a = (TextView) view.findViewById(C11745R$id.padding_view);
            this.f12200b = (TimelineView) view.findViewById(C11745R$id.layout_time_line);
            this.f12201c = (ImageView) view.findViewById(C11745R$id.flow_item_type_image);
            this.f12202d = (TextView) view.findViewById(C11745R$id.flow_item_type_text);
            this.f12203e = (TextView) view.findViewById(C11745R$id.flow_item_bright_value);
            this.f12204f = (TextView) view.findViewById(C11745R$id.flow_item_duration_value);
            this.f12208j = (SwipeRevealLayout) view.findViewById(2131297369);
            this.f12205g = (LinearLayout) view.findViewById(C11745R$id.color_ct_frame_layout);
            this.f12206h = (LinearLayout) view.findViewById(2131296923);
            this.f12207i = (LinearLayout) view.findViewById(C11745R$id.layout_left_view);
            this.f12205g.setOnClickListener(new C5824a(PersonalityLightFlowItemAdapter.this));
            this.f12206h.setOnClickListener(new C5825b(PersonalityLightFlowItemAdapter.this));
            this.f12207i.setOnClickListener(new C5826c(PersonalityLightFlowItemAdapter.this));
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m17237c(int i) {
            this.f12209k = i;
        }

        /* renamed from: b */
        public void mo27185b(int i) {
            this.f12202d.setText(i);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemAdapter$PersonalityFlowItemSuspendHolder */
    public class PersonalityFlowItemSuspendHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f12214a;

        /* renamed from: b */
        TimelineView f12215b;

        /* renamed from: c */
        TextView f12216c;

        /* renamed from: d */
        LinearLayout f12217d;

        /* renamed from: e */
        LinearLayout f12218e;

        /* renamed from: f */
        LinearLayout f12219f;

        /* renamed from: g */
        SwipeRevealLayout f12220g;

        /* renamed from: h */
        int f12221h;

        /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemAdapter$PersonalityFlowItemSuspendHolder$a */
        class C5827a implements View.OnClickListener {
            C5827a(PersonalityLightFlowItemAdapter personalityLightFlowItemAdapter) {
            }

            public void onClick(View view) {
                "onClick" + PersonalityFlowItemSuspendHolder.this.getPosition();
                Intent intent = new Intent();
                intent.setClass(view.getContext(), AddSuspendFrameActivity.class);
                intent.putExtra("scene_edit", true);
                intent.putExtra("scene_edit_index", PersonalityFlowItemSuspendHolder.this.f12221h);
                intent.putExtra("custom_scene_index", PersonalityLightFlowItemAdapter.this.f12176d);
                view.getContext().startActivity(intent);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemAdapter$PersonalityFlowItemSuspendHolder$b */
        class C5828b implements View.OnClickListener {
            C5828b(PersonalityLightFlowItemAdapter personalityLightFlowItemAdapter) {
            }

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(view.getContext(), PersonalityLightItemMoreActivity.class);
                intent.putExtra("scene_edit_index", PersonalityFlowItemSuspendHolder.this.f12221h);
                intent.putExtra("custom_scene_index", PersonalityLightFlowItemAdapter.this.f12176d);
                view.getContext().startActivity(intent);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemAdapter$PersonalityFlowItemSuspendHolder$c */
        class C5829c implements View.OnClickListener {
            C5829c(PersonalityLightFlowItemAdapter personalityLightFlowItemAdapter) {
            }

            public void onClick(View view) {
                PersonalityLightFlowItemAdapter.this.f12177e.mo31871c().mo31723h().remove(PersonalityFlowItemSuspendHolder.this.f12221h);
                PersonalityLightFlowItemAdapter.this.notifyDataSetChanged();
            }
        }

        PersonalityFlowItemSuspendHolder(View view) {
            super(view);
            this.f12214a = (TextView) view.findViewById(C11745R$id.padding_view);
            this.f12215b = (TimelineView) view.findViewById(C11745R$id.layout_time_line);
            this.f12216c = (TextView) view.findViewById(C11745R$id.flow_item_duration_value);
            this.f12220g = (SwipeRevealLayout) view.findViewById(2131297369);
            this.f12217d = (LinearLayout) view.findViewById(C11745R$id.suspend_frame_layout);
            this.f12218e = (LinearLayout) view.findViewById(2131296923);
            this.f12219f = (LinearLayout) view.findViewById(C11745R$id.layout_left_view);
            this.f12217d.setOnClickListener(new C5827a(PersonalityLightFlowItemAdapter.this));
            this.f12218e.setOnClickListener(new C5828b(PersonalityLightFlowItemAdapter.this));
            this.f12219f.setOnClickListener(new C5829c(PersonalityLightFlowItemAdapter.this));
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m17240b(int i) {
            this.f12221h = i;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemAdapter$a */
    static /* synthetic */ class C5830a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12226a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.yeelight.yeelib.g.n[] r0 = com.yeelight.yeelib.p153g.C9845n.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12226a = r0
                com.yeelight.yeelib.g.n r1 = com.yeelight.yeelib.p153g.C9845n.FLOW_MODE_CT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12226a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.g.n r1 = com.yeelight.yeelib.p153g.C9845n.FLOW_MODE_COLOR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12226a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.g.n r1 = com.yeelight.yeelib.p153g.C9845n.FLOW_MODE_BRIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.adapter.PersonalityLightFlowItemAdapter.C5830a.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.PersonalityLightFlowItemAdapter$b */
    public interface C5831b {
        /* renamed from: J */
        void mo26705J();
    }

    public PersonalityLightFlowItemAdapter(Context context, int i) {
        boolean z = false;
        this.f12175c = false;
        this.f12173a = LayoutInflater.from(context);
        this.f12174b.mo10111h(true);
        this.f12176d = i;
        if (!(i == -1 || i == -2)) {
            z = true;
        }
        this.f12175c = z;
        C4300b0 u = C4300b0.m12083u();
        this.f12177e = z ? u.mo23745i().get(this.f12176d) : u.mo23753r();
    }

    /* renamed from: d */
    private int m17227d(int i, int i2) {
        return Color.HSVToColor(new float[]{41.0f, C10542f.m25739h(i, "yeelink.light.color1"), C10542f.m25732a(i2)});
    }

    /* renamed from: e */
    private String m17228e(int i) {
        return String.format(Locale.US, "%d%%", new Object[]{Integer.valueOf(this.f12177e.mo31871c().mo31723h().get(i).mo31787b())});
    }

    /* renamed from: f */
    private String m17229f(int i) {
        C9844m mVar = this.f12177e.mo31871c().mo31723h().get(i);
        return String.format(Locale.US, "%02d:%02d.%d", new Object[]{Integer.valueOf(mVar.mo31788c() / 60000), Integer.valueOf((mVar.mo31788c() % 60000) / 1000), Integer.valueOf((mVar.mo31788c() % 1000) / 100)});
    }

    /* renamed from: g */
    private int m17230g(int i) {
        return Color.rgb((i >> 16) & 255, (i >> 8) & 255, (i >> 0) & 255);
    }

    public int getItemCount() {
        return this.f12176d == -2 ? this.f12177e.mo31871c().mo31723h().size() : this.f12177e.mo31871c().mo31723h().size() + 1;
    }

    public int getItemViewType(int i) {
        if (this.f12176d != -2 && i == getItemCount() - 1) {
            return 3;
        }
        int i2 = C5830a.f12226a[this.f12177e.mo31871c().mo31723h().get(i).mo31789d().ordinal()];
        if (i2 == 1 || i2 == 2) {
            return 0;
        }
        return i2 != 3 ? 1 : 2;
    }

    /* renamed from: h */
    public void mo27178h(C5831b bVar) {
        this.f12178f = bVar;
    }

    /* renamed from: i */
    public void mo27179i() {
        this.f12178f = null;
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        SwipeRevealLayout swipeRevealLayout;
        TimelineView timelineView;
        int i2;
        int i3;
        if (viewHolder instanceof PersonalityFlowItemHolder) {
            TextView textView = ((PersonalityFlowItemHolder) viewHolder).f12199a;
            if (i != 0) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
            C9844m mVar = this.f12177e.mo31871c().mo31723h().get(i);
            if (i == 0) {
                ((PersonalityFlowItemHolder) viewHolder).f12200b.setMode(0);
            } else if (i == 9) {
                ((PersonalityFlowItemHolder) viewHolder).f12200b.setMode(3);
            } else {
                ((PersonalityFlowItemHolder) viewHolder).f12200b.setMode(1);
            }
            PersonalityFlowItemHolder personalityFlowItemHolder = (PersonalityFlowItemHolder) viewHolder;
            personalityFlowItemHolder.f12203e.setText(m17228e(i));
            personalityFlowItemHolder.f12204f.setText(m17229f(i));
            Drawable drawable = personalityFlowItemHolder.f12201c.getDrawable();
            if (mVar.mo31789d().equals(C9845n.FLOW_MODE_COLOR)) {
                ((GradientDrawable) drawable).setColor(m17230g(mVar.mo31790e()));
                i3 = 2131755983;
            } else {
                ((GradientDrawable) drawable).setColor(m17227d(mVar.mo31790e(), mVar.mo31787b()));
                i3 = 2131755984;
            }
            personalityFlowItemHolder.mo27185b(i3);
            personalityFlowItemHolder.m17237c(i);
            personalityFlowItemHolder.f12201c.setImageDrawable(drawable);
            this.f12174b.mo10109d(personalityFlowItemHolder.f12208j, String.valueOf(i));
            swipeRevealLayout = personalityFlowItemHolder.f12208j;
        } else if (viewHolder instanceof PersonalityFlowItemSuspendHolder) {
            TextView textView2 = ((PersonalityFlowItemSuspendHolder) viewHolder).f12214a;
            if (i != 0) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
            TimelineView timelineView2 = ((PersonalityFlowItemSuspendHolder) viewHolder).f12215b;
            if (i == 0) {
                timelineView2.setMode(0);
            } else if (i == 9) {
                timelineView2.setMode(3);
            } else {
                timelineView2.setMode(1);
            }
            PersonalityFlowItemSuspendHolder personalityFlowItemSuspendHolder = (PersonalityFlowItemSuspendHolder) viewHolder;
            personalityFlowItemSuspendHolder.m17240b(i);
            personalityFlowItemSuspendHolder.f12216c.setText(m17229f(i));
            this.f12174b.mo10109d(personalityFlowItemSuspendHolder.f12220g, String.valueOf(i));
            swipeRevealLayout = personalityFlowItemSuspendHolder.f12220g;
        } else if (viewHolder instanceof PersonalityAddItemHolder) {
            TextView textView3 = ((PersonalityAddItemHolder) viewHolder).f12179a;
            if (i != 0) {
                textView3.setVisibility(8);
            } else {
                textView3.setVisibility(0);
            }
            if (i == 0) {
                PersonalityAddItemHolder personalityAddItemHolder = (PersonalityAddItemHolder) viewHolder;
                personalityAddItemHolder.mo27180a(false);
                timelineView = personalityAddItemHolder.f12181c;
                i2 = 4;
            } else {
                PersonalityAddItemHolder personalityAddItemHolder2 = (PersonalityAddItemHolder) viewHolder;
                if (i == 10) {
                    personalityAddItemHolder2.mo27180a(true);
                    return;
                }
                personalityAddItemHolder2.mo27180a(false);
                timelineView = personalityAddItemHolder2.f12181c;
                i2 = 2;
            }
            timelineView.setMode(i2);
            return;
        } else if (viewHolder instanceof PersonalityFlowItemBrightHolder) {
            TextView textView4 = ((PersonalityFlowItemBrightHolder) viewHolder).f12186a;
            if (i != 0) {
                textView4.setVisibility(8);
            } else {
                textView4.setVisibility(0);
            }
            TimelineView timelineView3 = ((PersonalityFlowItemBrightHolder) viewHolder).f12187b;
            if (i == 0) {
                timelineView3.setMode(0);
            } else if (i == 9) {
                timelineView3.setMode(3);
            } else {
                timelineView3.setMode(1);
            }
            PersonalityFlowItemBrightHolder personalityFlowItemBrightHolder = (PersonalityFlowItemBrightHolder) viewHolder;
            personalityFlowItemBrightHolder.m17235b(i);
            personalityFlowItemBrightHolder.f12188c.setText(m17229f(i));
            personalityFlowItemBrightHolder.f12189d.setText(m17228e(i));
            this.f12174b.mo10109d(personalityFlowItemBrightHolder.f12193h, String.valueOf(i));
            swipeRevealLayout = personalityFlowItemBrightHolder.f12193h;
        } else {
            return;
        }
        swipeRevealLayout.mo10084B(true);
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i == 0 ? new PersonalityFlowItemHolder(this.f12173a.inflate(C11748R$layout.list_item_personality_frame, viewGroup, false)) : i == 1 ? new PersonalityFlowItemSuspendHolder(this.f12173a.inflate(C11748R$layout.list_item_personality_frame_suspend, viewGroup, false)) : i == 2 ? new PersonalityFlowItemBrightHolder(this.f12173a.inflate(C11748R$layout.list_item_personality_frame_bright, viewGroup, false)) : new PersonalityAddItemHolder(this.f12173a.inflate(C11748R$layout.list_item_personality_frame_add, viewGroup, false));
    }
}
