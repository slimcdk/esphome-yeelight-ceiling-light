package com.yeelight.cherry.p177ui.fragment;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p177ui.activity.SceneBundleSettingActivity;
import com.yeelight.cherry.p177ui.activity.SceneItemModifyActivity;
import com.yeelight.yeelib.p152f.C9807q;
import com.yeelight.yeelib.p153g.C9858z;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.utils.C10549p;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.fragment.SceneRecyclerViewAdapter */
public class SceneRecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    private final List<C9858z> f12522a;

    /* renamed from: com.yeelight.cherry.ui.fragment.SceneRecyclerViewAdapter$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f12523a;

        /* renamed from: b */
        ImageView f12524b;

        /* renamed from: c */
        ImageView f12525c;

        /* renamed from: d */
        FrameLayout f12526d;

        /* renamed from: e */
        C9858z f12527e;

        public ViewHolder(SceneRecyclerViewAdapter sceneRecyclerViewAdapter, View view) {
            super(view);
            this.f12524b = (ImageView) view.findViewById(2131297263);
            this.f12523a = (TextView) view.findViewById(2131297266);
            this.f12526d = (FrameLayout) view.findViewById(C11745R$id.edit_layout);
            this.f12525c = (ImageView) view.findViewById(2131297264);
        }

        public String toString() {
            return super.toString() + " '" + this.f12523a.getText() + "'";
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.SceneRecyclerViewAdapter$a */
    class C5924a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ViewHolder f12528a;

        /* renamed from: b */
        final /* synthetic */ C9858z f12529b;

        /* renamed from: com.yeelight.cherry.ui.fragment.SceneRecyclerViewAdapter$a$a */
        class C5925a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C10526e f12530a;

            C5925a(C10526e eVar) {
                this.f12530a = eVar;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(C5924a.this.f12528a.f12524b.getContext(), SceneItemModifyActivity.class);
                intent.putExtra("com.yeelight.cherry.scene_bundle_id", C5924a.this.f12529b.mo31906l());
                C5924a.this.f12528a.f12524b.getContext().startActivity(intent);
                this.f12530a.dismiss();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.SceneRecyclerViewAdapter$a$b */
        class C5926b implements Animation.AnimationListener {
            C5926b() {
            }

            public void onAnimationEnd(Animation animation) {
                C5924a.this.f12528a.f12525c.setVisibility(8);
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        }

        C5924a(SceneRecyclerViewAdapter sceneRecyclerViewAdapter, ViewHolder viewHolder, C9858z zVar) {
            this.f12528a = viewHolder;
            this.f12529b = zVar;
        }

        public void onClick(View view) {
            Resources resources = this.f12528a.f12524b.getResources();
            if (this.f12529b.mo31908n().size() != 0) {
                this.f12529b.mo31900b();
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(100);
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation2.setDuration(300);
                alphaAnimation2.setStartOffset(200);
                animationSet.addAnimation(alphaAnimation);
                animationSet.addAnimation(alphaAnimation2);
                this.f12528a.f12525c.setVisibility(0);
                animationSet.setAnimationListener(new C5926b());
                this.f12528a.f12525c.startAnimation(animationSet);
            } else if (C9807q.m23812c().mo31675e()) {
                Toast.makeText(view.getContext(), view.getResources().getString(2131756146), 0).show();
            } else {
                C10526e b = new C10526e.C10531e(this.f12528a.f12524b.getContext()).mo33351b();
                b.setTitle((CharSequence) resources.getString(2131755245));
                b.mo33339k(resources.getString(2131756195));
                b.mo33335g(-1, resources.getString(2131755277), new C5925a(b));
                b.mo33335g(-2, resources.getString(2131755229), (DialogInterface.OnClickListener) null);
                b.show();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.SceneRecyclerViewAdapter$b */
    class C5927b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ViewHolder f12533a;

        /* renamed from: b */
        final /* synthetic */ C9858z f12534b;

        C5927b(SceneRecyclerViewAdapter sceneRecyclerViewAdapter, ViewHolder viewHolder, C9858z zVar) {
            this.f12533a = viewHolder;
            this.f12534b = zVar;
        }

        public void onClick(View view) {
            if (C9807q.m23812c().mo31675e()) {
                Toast.makeText(view.getContext(), view.getResources().getString(2131756146), 0).show();
                return;
            }
            Intent intent = new Intent(this.f12533a.f12524b.getContext(), SceneBundleSettingActivity.class);
            intent.putExtra("com.yeelight.cherry.scene_bundle_id", this.f12534b.mo31906l());
            this.f12533a.f12524b.getContext().startActivity(intent);
        }
    }

    public SceneRecyclerViewAdapter(List<C9858z> list) {
        this.f12522a = list;
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        C9858z zVar = this.f12522a.get(i);
        viewHolder.f12527e = this.f12522a.get(i);
        viewHolder.f12523a.setText(zVar.mo31907m());
        viewHolder.f12524b.setImageResource(C10549p.m25765a(3, zVar.mo31910p()));
        viewHolder.f12525c.setVisibility(8);
        viewHolder.f12524b.setOnClickListener(new C5924a(this, viewHolder, zVar));
        viewHolder.f12526d.setOnClickListener(new C5927b(this, viewHolder, zVar));
    }

    /* renamed from: b */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(C11748R$layout.control_view_recycle_scene, viewGroup, false));
    }

    public int getItemCount() {
        return this.f12522a.size();
    }
}
