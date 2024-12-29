package p215u3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yeelight.yeelib.R$dimen;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C6093d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: u3.u */
public class C10507u {

    /* renamed from: a */
    public List<C6093d> f19653a = new ArrayList();

    public C10507u(String str, List<C6093d> list) {
        this.f19653a = list;
    }

    /* renamed from: a */
    public View mo42174a(Activity activity, C3010c cVar) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(activity).inflate(R$layout.item_feature_group, (ViewGroup) null).findViewById(R$id.feature_group_root);
        if (this.f19653a != null) {
            for (int i = 0; i < this.f19653a.size(); i++) {
                View a = this.f19653a.get(i).mo31681a(activity, cVar);
                if (a != null) {
                    linearLayout.addView(a, -1, activity.getResources().getDimensionPixelSize(R$dimen.setting_item_height));
                }
            }
        }
        return linearLayout;
    }

    /* renamed from: b */
    public void mo42175b() {
        if (this.f19653a != null) {
            for (int i = 0; i < this.f19653a.size(); i++) {
                this.f19653a.get(i).mo31682b();
            }
        }
    }

    /* renamed from: c */
    public List<C6093d> mo42176c() {
        return this.f19653a;
    }
}
