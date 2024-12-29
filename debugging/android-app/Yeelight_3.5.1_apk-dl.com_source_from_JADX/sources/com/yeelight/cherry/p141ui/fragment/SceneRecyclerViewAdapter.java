package com.yeelight.cherry.p141ui.fragment;

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
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.activity.SceneBundleSettingActivity;
import com.yeelight.cherry.p141ui.activity.SceneItemModifyActivity;
import com.yeelight.yeelib.managers.C8287q;
import com.yeelight.yeelib.models.C8329t;
import java.util.List;
import p051j4.C9195n;
import p170i4.C9113d;

/* renamed from: com.yeelight.cherry.ui.fragment.SceneRecyclerViewAdapter */
public class SceneRecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    private final List<C8329t> f12115a;

    /* renamed from: com.yeelight.cherry.ui.fragment.SceneRecyclerViewAdapter$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f12116a;

        /* renamed from: b */
        ImageView f12117b;

        /* renamed from: c */
        ImageView f12118c;

        /* renamed from: d */
        FrameLayout f12119d;

        /* renamed from: e */
        C8329t f12120e;

        public ViewHolder(SceneRecyclerViewAdapter sceneRecyclerViewAdapter, View view) {
            super(view);
            this.f12117b = (ImageView) view.findViewById(2131297406);
            this.f12116a = (TextView) view.findViewById(2131297409);
            this.f12119d = (FrameLayout) view.findViewById(C12225R$id.edit_layout);
            this.f12118c = (ImageView) view.findViewById(2131297407);
        }

        public String toString() {
            return super.toString() + " '" + this.f12116a.getText() + "'";
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.SceneRecyclerViewAdapter$a */
    class C5984a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ViewHolder f12121a;

        /* renamed from: b */
        final /* synthetic */ C8329t f12122b;

        /* renamed from: com.yeelight.cherry.ui.fragment.SceneRecyclerViewAdapter$a$a */
        class C5985a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C9113d f12123a;

            C5985a(C9113d dVar) {
                this.f12123a = dVar;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(C5984a.this.f12121a.f12117b.getContext(), SceneItemModifyActivity.class);
                intent.putExtra("com.yeelight.cherry.scene_bundle_id", C5984a.this.f12122b.mo35471l());
                C5984a.this.f12121a.f12117b.getContext().startActivity(intent);
                this.f12123a.dismiss();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.fragment.SceneRecyclerViewAdapter$a$b */
        class C5986b implements Animation.AnimationListener {
            C5986b() {
            }

            public void onAnimationEnd(Animation animation) {
                C5984a.this.f12121a.f12118c.setVisibility(8);
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        }

        C5984a(SceneRecyclerViewAdapter sceneRecyclerViewAdapter, ViewHolder viewHolder, C8329t tVar) {
            this.f12121a = viewHolder;
            this.f12122b = tVar;
        }

        public void onClick(View view) {
            Resources resources = this.f12121a.f12117b.getResources();
            if (this.f12122b.mo35473n().size() != 0) {
                this.f12122b.mo35465b();
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(100);
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation2.setDuration(300);
                alphaAnimation2.setStartOffset(200);
                animationSet.addAnimation(alphaAnimation);
                animationSet.addAnimation(alphaAnimation2);
                this.f12121a.f12118c.setVisibility(0);
                animationSet.setAnimationListener(new C5986b());
                this.f12121a.f12118c.startAnimation(animationSet);
            } else if (C8287q.m19593e().mo35242i()) {
                Toast.makeText(view.getContext(), view.getResources().getString(2131756170), 0).show();
            } else {
                C9113d b = new C9113d.C9118e(this.f12121a.f12117b.getContext()).mo37172b();
                b.setTitle((CharSequence) resources.getString(2131755248));
                b.mo37160k(resources.getString(2131756220));
                b.mo37156g(-1, resources.getString(2131755281), new C5985a(b));
                b.mo37156g(-2, resources.getString(2131755232), (DialogInterface.OnClickListener) null);
                b.show();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.SceneRecyclerViewAdapter$b */
    class C5987b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ViewHolder f12126a;

        /* renamed from: b */
        final /* synthetic */ C8329t f12127b;

        C5987b(SceneRecyclerViewAdapter sceneRecyclerViewAdapter, ViewHolder viewHolder, C8329t tVar) {
            this.f12126a = viewHolder;
            this.f12127b = tVar;
        }

        public void onClick(View view) {
            if (C8287q.m19593e().mo35242i()) {
                Toast.makeText(view.getContext(), view.getResources().getString(2131756170), 0).show();
                return;
            }
            Intent intent = new Intent(this.f12126a.f12117b.getContext(), SceneBundleSettingActivity.class);
            intent.putExtra("com.yeelight.cherry.scene_bundle_id", this.f12127b.mo35471l());
            this.f12126a.f12117b.getContext().startActivity(intent);
        }
    }

    public SceneRecyclerViewAdapter(List<C8329t> list) {
        this.f12115a = list;
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        C8329t tVar = this.f12115a.get(i);
        viewHolder.f12120e = this.f12115a.get(i);
        viewHolder.f12116a.setText(tVar.mo35472m());
        viewHolder.f12117b.setImageResource(C9195n.m22164a(3, tVar.mo35475p()));
        viewHolder.f12118c.setVisibility(8);
        viewHolder.f12117b.setOnClickListener(new C5984a(this, viewHolder, tVar));
        viewHolder.f12119d.setOnClickListener(new C5987b(this, viewHolder, tVar));
    }

    /* renamed from: b */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(C12228R$layout.control_view_recycle_scene, viewGroup, false));
    }

    public int getItemCount() {
        return this.f12115a.size();
    }
}
