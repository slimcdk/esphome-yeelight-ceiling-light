package com.yeelight.yeelib_tasker.p196ui.p197a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.yeelight.yeelib.p190i.C9875a;
import com.yeelight.yeelib.utils.C10549p;
import com.yeelight.yeelib_tasker.R$id;
import com.yeelight.yeelib_tasker.R$layout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.yeelib_tasker.ui.a.c */
public class C10605c extends BaseAdapter {

    /* renamed from: a */
    private List<C9875a> f20284a = new ArrayList();

    /* renamed from: com.yeelight.yeelib_tasker.ui.a.c$a */
    static class C10606a {

        /* renamed from: a */
        public ImageView f20285a;

        /* renamed from: b */
        public TextView f20286b;

        C10606a() {
        }
    }

    static {
        Class<C10605c> cls = C10605c.class;
    }

    public C10605c(List<C9875a> list) {
        this.f20284a = list;
    }

    public int getCount() {
        return this.f20284a.size();
    }

    public Object getItem(int i) {
        return this.f20284a.get(i);
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C10606a aVar;
        if (view != null) {
            aVar = (C10606a) view.getTag();
        } else {
            C10606a aVar2 = new C10606a();
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.list_item_device_tasker, viewGroup, false);
            aVar2.f20285a = (ImageView) inflate.findViewById(R$id.device_badge);
            aVar2.f20286b = (TextView) inflate.findViewById(R$id.device_item_name);
            inflate.setTag(aVar2);
            View view2 = inflate;
            aVar = aVar2;
            view = view2;
        }
        C9875a aVar3 = this.f20284a.get(i);
        aVar.f20285a.setImageResource(C10549p.m25765a(2, aVar3.mo31957r()));
        aVar.f20286b.setText(aVar3.mo31954o());
        return view;
    }
}
