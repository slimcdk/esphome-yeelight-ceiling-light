package com.yeelight.yeelib_tasker.p196ui.p197a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.yeelight.yeelib.data.C7574b;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib_tasker.R$id;
import com.yeelight.yeelib_tasker.R$layout;

/* renamed from: com.yeelight.yeelib_tasker.ui.a.a */
public class C10602a extends CursorAdapter {
    static {
        Class<C10602a> cls = C10602a.class;
    }

    public C10602a(Context context, Cursor cursor) {
        super(context, cursor, false);
    }

    public void bindView(View view, Context context, Cursor cursor) {
        TextView textView = (TextView) view.findViewById(R$id.device_item_name);
        String string = cursor.getString(cursor.getColumnIndex(C7574b.C7575a.C7577b.f15345b));
        String string2 = cursor.getString(cursor.getColumnIndex(C7574b.C7575a.C7577b.f15346c));
        String string3 = cursor.getString(cursor.getColumnIndex(C7574b.C7575a.C7577b.f15348e));
        ((ImageView) view.findViewById(R$id.device_badge)).setBackground(ContextCompat.getDrawable(context, C4257w.m11945h0(string2).mo23303F()));
        if (string3 == null || string3.isEmpty()) {
            if (string.equals("wifi")) {
                string3 = "Wifi Light";
            } else if (string.equals("bluetooth")) {
                string3 = "Bluetooth Light";
            }
        }
        textView.setText(string3);
    }

    public void changeCursor(Cursor cursor) {
        super.changeCursor(cursor);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return super.getView(i, view, viewGroup);
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R$layout.list_item_device_tasker, viewGroup, false);
    }
}
