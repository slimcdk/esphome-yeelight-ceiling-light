package p215u3;

import android.app.Activity;
import android.view.View;
import com.yeelight.cherry.p141ui.activity.GroupRhythmActivity;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C6093d;
import com.yeelight.yeelib.device.base.DeviceStatusBase;

/* renamed from: u3.j0 */
public class C10466j0 extends C6093d {
    public C10466j0(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    /* renamed from: a */
    public View mo31681a(Activity activity, C3010c cVar) {
        return null;
    }

    /* renamed from: b */
    public void mo31682b() {
    }

    /* renamed from: c */
    public void mo31683c(C3010c cVar) {
    }

    /* renamed from: h */
    public Class mo31688h() {
        Class<GroupRhythmActivity> cls = GroupRhythmActivity.class;
        try {
            int i = GroupRhythmActivity.f10548g;
            return cls;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: j */
    public boolean mo31690j() {
        return false;
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
    }
}
