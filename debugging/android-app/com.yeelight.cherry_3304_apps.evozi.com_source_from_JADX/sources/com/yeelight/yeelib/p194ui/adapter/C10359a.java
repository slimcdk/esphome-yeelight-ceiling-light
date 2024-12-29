package com.yeelight.yeelib.p194ui.adapter;

import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.yeelight.yeelib.R$color;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.data.C7574b;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p152f.C4247u;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p153g.C9828a0;
import com.yeelight.yeelib.p153g.C9858z;
import com.yeelight.yeelib.p186e.C9771f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yeelight.yeelib.ui.adapter.a */
public class C10359a extends CursorAdapter {

    /* renamed from: a */
    List<Boolean> f19211a = new ArrayList();

    /* renamed from: b */
    List<C10361b> f19212b = new ArrayList();

    /* renamed from: c */
    C9858z f19213c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C9771f f19214d;

    /* renamed from: com.yeelight.yeelib.ui.adapter.a$b */
    private class C10361b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public ImageView f19215a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public TextView f19216b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public TextView f19217c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public CheckBox f19218d;

        private C10361b(C10359a aVar) {
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.adapter.a$c */
    private class C10362c implements View.OnClickListener {

        /* renamed from: a */
        private int f19219a;

        /* renamed from: b */
        private String f19220b;

        public C10362c(int i, String str) {
            this.f19219a = i;
            this.f19220b = str;
        }

        public void onClick(View view) {
            C10359a.this.f19214d.mo26902b(this.f19219a, this.f19220b);
        }
    }

    static {
        Class<C10359a> cls = C10359a.class;
    }

    public C10359a(Context context, Cursor cursor, String str, C9771f fVar) {
        super(context, cursor, false);
        new ArrayList();
        this.f19214d = fVar;
        this.f19213c = C4247u.m11865n().mo23619o(str);
    }

    /* renamed from: b */
    public boolean mo32667b(int i) {
        return this.f19211a.get(i).booleanValue();
    }

    public void bindView(View view, Context context, Cursor cursor) {
        C10361b bVar = (C10361b) view.getTag();
        String string = cursor.getString(cursor.getColumnIndex(C7574b.C7575a.C7577b.f15345b));
        String string2 = cursor.getString(cursor.getColumnIndex(C7574b.C7575a.C7577b.f15346c));
        String string3 = cursor.getString(cursor.getColumnIndex(C7574b.C7575a.C7577b.f15348e));
        C4200i o0 = C4257w.m11953o0(string2);
        if (o0 != null) {
            Drawable drawable = ContextCompat.getDrawable(context, o0.mo23303F());
            if (string3 == null || string3.isEmpty()) {
                if (string.equals("wifi")) {
                    string3 = "Wifi Light";
                } else if (string.equals("bluetooth")) {
                    string3 = "Bluetooth Light";
                }
            }
            if (mo32669c(cursor.getPosition())) {
                Iterator<C9828a0> it = this.f19214d.mo26901a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C9828a0 next = it.next();
                    if (next.mo31732e().equals(string2)) {
                        String format = String.format(bVar.f19217c.getResources().getString(R$string.scene_bundle_action), new Object[]{next.mo31734g()});
                        bVar.f19217c.setTextColor(bVar.f19217c.getResources().getColor(R$color.common_text_color_secondary_66));
                        bVar.f19217c.setText(format);
                        break;
                    }
                }
            } else {
                bVar.f19217c.setTextColor(bVar.f19217c.getResources().getColor(R$color.common_text_color_tips));
                bVar.f19217c.setText(bVar.f19217c.getResources().getString(R$string.room_device_manage_no_added));
            }
            bVar.f19216b.setText(string3);
            bVar.f19216b.setTextColor(ContextCompat.getColor(context, o0.mo23416o0() ? R$color.common_text_color_primary_33 : R$color.common_text_color_not_clickable_cc));
            bVar.f19215a.setImageDrawable(drawable);
            bVar.f19218d.setClickable(false);
            bVar.f19218d.setFocusable(false);
            bVar.f19218d.setChecked(this.f19211a.get(cursor.getPosition()).booleanValue());
            view.setOnClickListener(new C10362c(cursor.getPosition(), string2));
        }
    }

    /* renamed from: c */
    public boolean mo32669c(int i) {
        return this.f19211a.get(i).booleanValue();
    }

    public void changeCursor(Cursor cursor) {
        Boolean bool;
        List<Boolean> list;
        super.changeCursor(cursor);
        this.f19211a.clear();
        if (cursor.moveToFirst()) {
            do {
                String string = cursor.getString(cursor.getColumnIndex(C7574b.C7575a.C7577b.f15346c));
                C9858z zVar = this.f19213c;
                if (zVar == null || !zVar.mo31902h(string)) {
                    list = this.f19211a;
                    bool = Boolean.FALSE;
                } else {
                    list = this.f19211a;
                    bool = Boolean.TRUE;
                }
                list.add(bool);
            } while (cursor.moveToNext());
        }
    }

    /* renamed from: d */
    public void mo32671d(int i, boolean z) {
        if (i != -1) {
            this.f19211a.set(i, Boolean.valueOf(z));
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return super.getView(i, view, viewGroup);
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.item_create_scene_select_device, viewGroup, false);
        C10361b bVar = new C10361b();
        ImageView unused = bVar.f19215a = (ImageView) inflate.findViewById(R$id.device_icon);
        TextView unused2 = bVar.f19216b = (TextView) inflate.findViewById(R$id.device_name);
        TextView unused3 = bVar.f19217c = (TextView) inflate.findViewById(R$id.sub_status);
        CheckBox unused4 = bVar.f19218d = (CheckBox) inflate.findViewById(R$id.device_checkbox);
        this.f19212b.add(bVar);
        inflate.setTag(bVar);
        return inflate;
    }
}
