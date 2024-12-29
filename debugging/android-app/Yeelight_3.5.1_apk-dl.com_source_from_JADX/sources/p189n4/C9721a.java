package p189n4;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.yeelight.yeelib.data.DeviceBrowserContract;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib_tasker.R$id;
import com.yeelight.yeelib_tasker.R$layout;

/* renamed from: n4.a */
public class C9721a extends CursorAdapter {
    static {
        Class<C9721a> cls = C9721a.class;
    }

    public C9721a(Context context, Cursor cursor) {
        super(context, cursor, false);
    }

    public void bindView(View view, Context context, Cursor cursor) {
        TextView textView = (TextView) view.findViewById(R$id.device_item_name);
        String string = cursor.getString(cursor.getColumnIndex(DeviceBrowserContract.DeviceBrowser.C6034a.f12284b));
        String string2 = cursor.getString(cursor.getColumnIndex(DeviceBrowserContract.DeviceBrowser.C6034a.f12285c));
        String string3 = cursor.getString(cursor.getColumnIndex(DeviceBrowserContract.DeviceBrowser.C6034a.f12287e));
        ((ImageView) view.findViewById(R$id.device_badge)).setBackground(ContextCompat.getDrawable(context, YeelightDeviceManager.m7794j0(string2).mo23116F()));
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
