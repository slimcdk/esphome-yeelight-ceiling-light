package p155f4;

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
import com.yeelight.yeelib.data.DeviceBrowserContract;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.managers.C3096u;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.C8329t;
import com.yeelight.yeelib.models.C8330u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p237z3.C12146f;

/* renamed from: f4.a */
public class C9031a extends CursorAdapter {

    /* renamed from: a */
    List<Boolean> f16544a = new ArrayList();

    /* renamed from: b */
    List<C9033b> f16545b = new ArrayList();

    /* renamed from: c */
    C8329t f16546c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C12146f f16547d;

    /* renamed from: f4.a$b */
    private class C9033b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public ImageView f16548a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public TextView f16549b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public TextView f16550c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public CheckBox f16551d;

        private C9033b(C9031a aVar) {
        }
    }

    /* renamed from: f4.a$c */
    private class C9034c implements View.OnClickListener {

        /* renamed from: a */
        private int f16552a;

        /* renamed from: b */
        private String f16553b;

        public C9034c(int i, String str) {
            this.f16552a = i;
            this.f16553b = str;
        }

        public void onClick(View view) {
            C9031a.this.f16547d.mo30879b(this.f16552a, this.f16553b);
        }
    }

    static {
        Class<C9031a> cls = C9031a.class;
    }

    public C9031a(Context context, Cursor cursor, String str, C12146f fVar) {
        super(context, cursor, false);
        new ArrayList();
        this.f16547d = fVar;
        this.f16546c = C3096u.m8175n().mo23512o(str);
    }

    /* renamed from: b */
    public boolean mo36891b(int i) {
        return this.f16544a.get(i).booleanValue();
    }

    public void bindView(View view, Context context, Cursor cursor) {
        C9033b bVar = (C9033b) view.getTag();
        String string = cursor.getString(cursor.getColumnIndex(DeviceBrowserContract.DeviceBrowser.C6034a.f12284b));
        String string2 = cursor.getString(cursor.getColumnIndex(DeviceBrowserContract.DeviceBrowser.C6034a.f12285c));
        String string3 = cursor.getString(cursor.getColumnIndex(DeviceBrowserContract.DeviceBrowser.C6034a.f12287e));
        C3012e r0 = YeelightDeviceManager.m7804r0(string2);
        if (r0 != null) {
            Drawable drawable = ContextCompat.getDrawable(context, r0.mo23116F());
            if (string3 == null || string3.isEmpty()) {
                if (string.equals("wifi")) {
                    string3 = "Wifi Light";
                } else if (string.equals("bluetooth")) {
                    string3 = "Bluetooth Light";
                }
            }
            if (mo36893c(cursor.getPosition())) {
                Iterator<C8330u> it = this.f16547d.mo30878a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C8330u next = it.next();
                    if (next.mo35482e().equals(string2)) {
                        String format = String.format(bVar.f16550c.getResources().getString(R$string.scene_bundle_action), new Object[]{next.mo35484g()});
                        bVar.f16550c.setTextColor(bVar.f16550c.getResources().getColor(R$color.common_text_color_secondary_66));
                        bVar.f16550c.setText(format);
                        break;
                    }
                }
            } else {
                bVar.f16550c.setTextColor(bVar.f16550c.getResources().getColor(R$color.common_text_color_tips));
                bVar.f16550c.setText(bVar.f16550c.getResources().getString(R$string.room_device_manage_no_added));
            }
            bVar.f16549b.setText(string3);
            bVar.f16549b.setTextColor(ContextCompat.getColor(context, r0.mo23230o0() ? R$color.common_text_color_primary_33 : R$color.common_text_color_not_clickable_cc));
            bVar.f16548a.setImageDrawable(drawable);
            bVar.f16551d.setClickable(false);
            bVar.f16551d.setFocusable(false);
            bVar.f16551d.setChecked(this.f16544a.get(cursor.getPosition()).booleanValue());
            view.setOnClickListener(new C9034c(cursor.getPosition(), string2));
        }
    }

    /* renamed from: c */
    public boolean mo36893c(int i) {
        return this.f16544a.get(i).booleanValue();
    }

    public void changeCursor(Cursor cursor) {
        Boolean bool;
        List<Boolean> list;
        super.changeCursor(cursor);
        this.f16544a.clear();
        if (cursor.moveToFirst()) {
            do {
                String string = cursor.getString(cursor.getColumnIndex(DeviceBrowserContract.DeviceBrowser.C6034a.f12285c));
                C8329t tVar = this.f16546c;
                if (tVar == null || !tVar.mo35467h(string)) {
                    list = this.f16544a;
                    bool = Boolean.FALSE;
                } else {
                    list = this.f16544a;
                    bool = Boolean.TRUE;
                }
                list.add(bool);
            } while (cursor.moveToNext());
        }
    }

    /* renamed from: d */
    public void mo36895d(int i, boolean z) {
        if (i != -1) {
            this.f16544a.set(i, Boolean.valueOf(z));
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return super.getView(i, view, viewGroup);
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.item_create_scene_select_device, viewGroup, false);
        C9033b bVar = new C9033b();
        ImageView unused = bVar.f16548a = (ImageView) inflate.findViewById(R$id.device_icon);
        TextView unused2 = bVar.f16549b = (TextView) inflate.findViewById(R$id.device_name);
        TextView unused3 = bVar.f16550c = (TextView) inflate.findViewById(R$id.sub_status);
        CheckBox unused4 = bVar.f16551d = (CheckBox) inflate.findViewById(R$id.device_checkbox);
        this.f16545b.add(bVar);
        inflate.setTag(bVar);
        return inflate;
    }
}
