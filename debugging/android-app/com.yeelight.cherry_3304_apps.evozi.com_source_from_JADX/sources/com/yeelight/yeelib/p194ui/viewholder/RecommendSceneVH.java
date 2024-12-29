package com.yeelight.yeelib.p194ui.viewholder;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.yeelight.yeelib.R$id;

/* renamed from: com.yeelight.yeelib.ui.viewholder.RecommendSceneVH */
public class RecommendSceneVH extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public TextView f19891a;

    /* renamed from: b */
    public TextView f19892b;

    /* renamed from: c */
    public Button f19893c;

    /* renamed from: d */
    public ImageView f19894d;

    public RecommendSceneVH(View view) {
        super(view);
        view.findViewById(R$id.root_view);
        this.f19891a = (TextView) view.findViewById(R$id.recmd_name);
        this.f19892b = (TextView) view.findViewById(R$id.recmd_value);
        this.f19893c = (Button) view.findViewById(R$id.recmd_apply);
        this.f19894d = (ImageView) view.findViewById(R$id.recmd_banner);
    }
}
