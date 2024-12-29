package com.yeelight.yeelib.utils;

import android.content.res.Resources;
import com.yeelight.yeelib.p152f.C4297y;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.yeelib.utils.p */
public class C10549p {

    /* renamed from: a */
    public static List<Integer> f20166a = new ArrayList();

    /* renamed from: b */
    public static List<Integer> f20167b = new ArrayList();

    /* renamed from: c */
    public static List<Integer> f20168c = new ArrayList();

    static {
        int identifier;
        int identifier2;
        int identifier3;
        int i = 1;
        int i2 = 1;
        do {
            Resources resources = C4297y.f7456e.getResources();
            identifier = resources.getIdentifier("icon_yeelight_room_type_" + i2, "drawable", C4297y.f7456e.getPackageName());
            if (identifier != 0) {
                f20167b.add(Integer.valueOf(identifier));
            }
            i2++;
        } while (identifier != 0);
        int i3 = 1;
        do {
            Resources resources2 = C4297y.f7456e.getResources();
            identifier2 = resources2.getIdentifier("icon_yeelight_scene_type_" + i3, "drawable", C4297y.f7456e.getPackageName());
            if (identifier2 != 0) {
                f20166a.add(Integer.valueOf(identifier2));
            }
            i3++;
        } while (identifier2 != 0);
        do {
            Resources resources3 = C4297y.f7456e.getResources();
            identifier3 = resources3.getIdentifier("icon_yeelight_room_widget_type_" + i, "drawable", C4297y.f7456e.getPackageName());
            if (identifier3 != 0) {
                f20168c.add(Integer.valueOf(identifier3));
            }
            i++;
        } while (identifier3 != 0);
    }

    /* renamed from: a */
    public static int m25765a(int i, int i2) {
        return ((i == 1 || i == 3 || i == 4) ? f20166a : i == 5 ? f20168c : f20167b).get(i2).intValue();
    }
}
