package p051j4;

import android.content.res.Resources;
import com.yeelight.yeelib.managers.C3108x;
import java.util.ArrayList;
import java.util.List;

/* renamed from: j4.n */
public class C9195n {

    /* renamed from: a */
    public static List<Integer> f17011a = new ArrayList();

    /* renamed from: b */
    public static List<Integer> f17012b = new ArrayList();

    /* renamed from: c */
    public static List<Integer> f17013c = new ArrayList();

    static {
        int identifier;
        int identifier2;
        int identifier3;
        int i = 1;
        int i2 = 1;
        do {
            Resources resources = C3108x.f4951e.getResources();
            identifier = resources.getIdentifier("icon_yeelight_room_type_" + i2, "drawable", C3108x.f4951e.getPackageName());
            if (identifier != 0) {
                f17012b.add(Integer.valueOf(identifier));
            }
            i2++;
        } while (identifier != 0);
        int i3 = 1;
        do {
            Resources resources2 = C3108x.f4951e.getResources();
            identifier2 = resources2.getIdentifier("icon_yeelight_scene_type_" + i3, "drawable", C3108x.f4951e.getPackageName());
            if (identifier2 != 0) {
                f17011a.add(Integer.valueOf(identifier2));
            }
            i3++;
        } while (identifier2 != 0);
        do {
            Resources resources3 = C3108x.f4951e.getResources();
            identifier3 = resources3.getIdentifier("icon_yeelight_room_widget_type_" + i, "drawable", C3108x.f4951e.getPackageName());
            if (identifier3 != 0) {
                f17013c.add(Integer.valueOf(identifier3));
            }
            i++;
        } while (identifier3 != 0);
    }

    /* renamed from: a */
    public static int m22164a(int i, int i2) {
        return ((i == 1 || i == 3 || i == 4) ? f17011a : i == 5 ? f17013c : f17012b).get(i2).intValue();
    }
}
