package com.yeelight.yeelib.p150c.p181l;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yeelight.yeelib.R$dimen;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C6038h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.yeelib.c.l.c0 */
public class C6122c0 {

    /* renamed from: a */
    public List<C6038h> f13029a = new ArrayList();

    public C6122c0(String str, List<C6038h> list) {
        this.f13029a = list;
    }

    /* renamed from: a */
    public View mo28005a(Activity activity, C4198d dVar) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(activity).inflate(R$layout.item_feature_group, (ViewGroup) null).findViewById(R$id.feature_group_root);
        if (this.f13029a != null) {
            for (int i = 0; i < this.f13029a.size(); i++) {
                View a = this.f13029a.get(i).mo27771a(activity, dVar);
                if (a != null) {
                    linearLayout.addView(a, -1, activity.getResources().getDimensionPixelSize(R$dimen.setting_item_height));
                }
            }
        }
        return linearLayout;
    }

    /* renamed from: b */
    public void mo28006b() {
        if (this.f13029a != null) {
            for (int i = 0; i < this.f13029a.size(); i++) {
                this.f13029a.get(i).mo27772b();
            }
        }
    }

    /* renamed from: c */
    public List<C6038h> mo28007c() {
        return this.f13029a;
    }
}
