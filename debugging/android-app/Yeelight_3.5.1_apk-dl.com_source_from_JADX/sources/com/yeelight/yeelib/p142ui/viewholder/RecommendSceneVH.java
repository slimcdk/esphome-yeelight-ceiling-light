package com.yeelight.yeelib.p142ui.viewholder;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.yeelight.yeelib.R$id;

/* renamed from: com.yeelight.yeelib.ui.viewholder.RecommendSceneVH */
public class RecommendSceneVH extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public TextView f16149a;

    /* renamed from: b */
    public TextView f16150b;

    /* renamed from: c */
    public Button f16151c;

    /* renamed from: d */
    public ImageView f16152d;

    public RecommendSceneVH(View view) {
        super(view);
        view.findViewById(R$id.root_view);
        this.f16149a = (TextView) view.findViewById(R$id.recmd_name);
        this.f16150b = (TextView) view.findViewById(R$id.recmd_value);
        this.f16151c = (Button) view.findViewById(R$id.recmd_apply);
        this.f16152d = (ImageView) view.findViewById(R$id.recmd_banner);
    }
}
