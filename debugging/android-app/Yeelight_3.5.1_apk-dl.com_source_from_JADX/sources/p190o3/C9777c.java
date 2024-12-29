package p190o3;

import android.view.View;
import com.yeelight.cherry.p141ui.adapter.DeviceCategoryAdapter;
import com.yeelight.yeelib.models.C8325q;

/* renamed from: o3.c */
public final /* synthetic */ class C9777c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ DeviceCategoryAdapter f17631a;

    /* renamed from: b */
    public final /* synthetic */ C8325q f17632b;

    public /* synthetic */ C9777c(DeviceCategoryAdapter deviceCategoryAdapter, C8325q qVar) {
        this.f17631a = deviceCategoryAdapter;
        this.f17632b = qVar;
    }

    public final void onClick(View view) {
        this.f17631a.m17232b(this.f17632b, view);
    }
}
