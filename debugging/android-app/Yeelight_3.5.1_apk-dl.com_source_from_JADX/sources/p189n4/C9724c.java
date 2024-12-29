package p189n4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.yeelight.yeelib_tasker.R$id;
import com.yeelight.yeelib_tasker.R$layout;
import java.util.ArrayList;
import java.util.List;
import p051j4.C9195n;
import p145d4.C8937a;

/* renamed from: n4.c */
public class C9724c extends BaseAdapter {

    /* renamed from: a */
    private List<C8937a> f17540a = new ArrayList();

    /* renamed from: n4.c$a */
    static class C9725a {

        /* renamed from: a */
        public ImageView f17541a;

        /* renamed from: b */
        public TextView f17542b;

        C9725a() {
        }
    }

    static {
        Class<C9724c> cls = C9724c.class;
    }

    public C9724c(List<C8937a> list) {
        this.f17540a = list;
    }

    public int getCount() {
        return this.f17540a.size();
    }

    public Object getItem(int i) {
        return this.f17540a.get(i);
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C9725a aVar;
        if (view != null) {
            aVar = (C9725a) view.getTag();
        } else {
            C9725a aVar2 = new C9725a();
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.list_item_device_tasker, viewGroup, false);
            aVar2.f17541a = (ImageView) inflate.findViewById(R$id.device_badge);
            aVar2.f17542b = (TextView) inflate.findViewById(R$id.device_item_name);
            inflate.setTag(aVar2);
            View view2 = inflate;
            aVar = aVar2;
            view = view2;
        }
        C8937a aVar3 = this.f17540a.get(i);
        aVar.f17541a.setImageResource(C9195n.m22164a(2, aVar3.mo36726r()));
        aVar.f17542b.setText(aVar3.mo36723o());
        return view;
    }
}
