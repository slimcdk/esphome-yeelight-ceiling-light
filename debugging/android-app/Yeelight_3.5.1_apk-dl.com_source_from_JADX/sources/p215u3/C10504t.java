package p215u3;

import android.app.Activity;
import android.view.View;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C6093d;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.p142ui.activity.SceneActivity;

/* renamed from: u3.t */
public class C10504t extends C6093d {
    public C10504t(int i, String str, int i2, String str2) {
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
        StringBuilder sb = new StringBuilder();
        sb.append("RenameFeature, device name: ");
        sb.append(cVar.mo23210U());
    }

    /* renamed from: h */
    public Class mo31688h() {
        return SceneActivity.class;
    }

    /* renamed from: j */
    public boolean mo31690j() {
        return false;
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
    }
}
