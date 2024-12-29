package p051j4;

import com.p022mi.iot.common.abstractdevice.AbstractDevice;
import com.yeelight.yeelib.utils.AppUtils;

/* renamed from: j4.i */
public class C9191i {
    /* renamed from: a */
    public static void m22147a(AbstractDevice abstractDevice) {
        if (AppUtils.f4977a) {
            StringBuilder sb = new StringBuilder();
            sb.append("Device id: ");
            sb.append(abstractDevice.getDeviceId());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Device address: ");
            sb2.append(abstractDevice.getDevice().getMac());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Device name: ");
            sb3.append(abstractDevice.getName());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Device online: ");
            sb4.append(abstractDevice.isOnline());
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Device model: ");
            sb5.append(abstractDevice.getDevice().getDeviceType());
        }
    }

    /* renamed from: b */
    public static void m22148b(com.miot.common.abstractdevice.AbstractDevice abstractDevice) {
        if (AppUtils.f4977a) {
            StringBuilder sb = new StringBuilder();
            sb.append("Device id: ");
            sb.append(abstractDevice.getDeviceId());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Device address: ");
            sb2.append(abstractDevice.getAddress());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Device name: ");
            sb3.append(abstractDevice.getName());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Device owner: ");
            sb4.append(abstractDevice.getOwnership().name());
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Device online: ");
            sb5.append(abstractDevice.isOnline());
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Device model: ");
            sb6.append(abstractDevice.getDeviceModel());
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Device connected: ");
            sb7.append(abstractDevice.isConnectionEstablished());
            StringBuilder sb8 = new StringBuilder();
            sb8.append("Device connect type: ");
            sb8.append(abstractDevice.getConnectionType().name());
        }
    }
}
