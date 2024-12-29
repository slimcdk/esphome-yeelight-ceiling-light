package p189n4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.yeelight.yeelib.device.C6119c;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib_tasker.R$drawable;
import com.yeelight.yeelib_tasker.R$id;
import com.yeelight.yeelib_tasker.R$layout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: n4.b */
public class C9722b extends BaseAdapter {

    /* renamed from: a */
    private List<C3010c> f17537a = new ArrayList();

    /* renamed from: n4.b$a */
    static class C9723a {

        /* renamed from: a */
        public ImageView f17538a;

        /* renamed from: b */
        public TextView f17539b;

        C9723a() {
        }
    }

    static {
        Class<C9722b> cls = C9722b.class;
    }

    public C9722b(List<C3010c> list) {
        this.f17537a = list;
    }

    public int getCount() {
        return this.f17537a.size();
    }

    public Object getItem(int i) {
        return this.f17537a.get(i);
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C9723a aVar;
        if (view != null) {
            aVar = (C9723a) view.getTag();
        } else {
            C9723a aVar2 = new C9723a();
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.list_item_device_tasker, viewGroup, false);
            aVar2.f17538a = (ImageView) inflate.findViewById(R$id.device_badge);
            aVar2.f17539b = (TextView) inflate.findViewById(R$id.device_item_name);
            inflate.setTag(aVar2);
            View view2 = inflate;
            aVar = aVar2;
            view = view2;
        }
        aVar.f17538a.setImageResource(R$drawable.icon_yeelight_device_badge_group_small);
        aVar.f17539b.setText(((C6119c) this.f17537a.get(i)).mo23210U());
        return view;
    }
}
