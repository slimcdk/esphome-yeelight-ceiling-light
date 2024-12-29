package com.yeelight.yeelib_tasker.p196ui.p197a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.yeelight.yeelib.p150c.C5980c;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib_tasker.R$drawable;
import com.yeelight.yeelib_tasker.R$id;
import com.yeelight.yeelib_tasker.R$layout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.yeelib_tasker.ui.a.b */
public class C10603b extends BaseAdapter {

    /* renamed from: a */
    private List<C4198d> f20281a = new ArrayList();

    /* renamed from: com.yeelight.yeelib_tasker.ui.a.b$a */
    static class C10604a {

        /* renamed from: a */
        public ImageView f20282a;

        /* renamed from: b */
        public TextView f20283b;

        C10604a() {
        }
    }

    static {
        Class<C10603b> cls = C10603b.class;
    }

    public C10603b(List<C4198d> list) {
        this.f20281a = list;
    }

    public int getCount() {
        return this.f20281a.size();
    }

    public Object getItem(int i) {
        return this.f20281a.get(i);
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C10604a aVar;
        if (view != null) {
            aVar = (C10604a) view.getTag();
        } else {
            C10604a aVar2 = new C10604a();
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.list_item_device_tasker, viewGroup, false);
            aVar2.f20282a = (ImageView) inflate.findViewById(R$id.device_badge);
            aVar2.f20283b = (TextView) inflate.findViewById(R$id.device_item_name);
            inflate.setTag(aVar2);
            View view2 = inflate;
            aVar = aVar2;
            view = view2;
        }
        aVar.f20282a.setImageResource(R$drawable.icon_yeelight_device_badge_group_small);
        aVar.f20283b.setText(((C5980c) this.f20281a.get(i)).mo23397U());
        return view;
    }
}
