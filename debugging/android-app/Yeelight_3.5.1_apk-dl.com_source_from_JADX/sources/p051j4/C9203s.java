package p051j4;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.InputDeviceCompat;
import com.miot.api.bluetooth.BindStyle;
import com.miot.api.bluetooth.BluetoothDeviceConfig;

/* renamed from: j4.s */
public class C9203s {
    /* renamed from: a */
    public static BluetoothDeviceConfig m22203a(String str) {
        int i;
        BluetoothDeviceConfig bluetoothDeviceConfig = new BluetoothDeviceConfig();
        bluetoothDeviceConfig.bindStyle = BindStyle.WEAK;
        if (TextUtils.isEmpty(str)) {
            return bluetoothDeviceConfig;
        }
        if (str.equals("yeelink.light.color4")) {
            bluetoothDeviceConfig.model = "yeelink.light.color4";
            i = 1227;
        } else if (str.equals("yeelink.light.color6")) {
            bluetoothDeviceConfig.model = "yeelink.light.color6";
            i = 1469;
        } else if (str.equals("yeelink.light.color8")) {
            bluetoothDeviceConfig.model = "yeelink.light.color8";
            i = 2061;
        } else if (str.equals("yeelink.light.plate2")) {
            bluetoothDeviceConfig.model = "yeelink.light.plate2";
            i = 5134;
        } else if (str.equals("yeelink.light.mono4")) {
            bluetoothDeviceConfig.model = "yeelink.light.mono4";
            i = 1242;
        } else if (str.equals("yeelink.light.mono5")) {
            bluetoothDeviceConfig.model = "yeelink.light.mono5";
            i = 1241;
        } else if (str.equals("yeelink.light.bslamp1")) {
            bluetoothDeviceConfig.model = "yeelink.light.bslamp1";
            i = 274;
        } else if (str.equals("yeelink.light.bslamp2")) {
            bluetoothDeviceConfig.model = "yeelink.light.bslamp2";
            i = 882;
        } else if (str.equals("yeelink.light.bslamp3")) {
            bluetoothDeviceConfig.model = "yeelink.light.bslamp3";
            i = 1136;
        } else if (str.equals("yeelink.light.lamp4")) {
            bluetoothDeviceConfig.model = "yeelink.light.lamp4";
            i = 931;
        } else if (str.equals("yeelink.light.lamp7")) {
            bluetoothDeviceConfig.model = "yeelink.light.lamp7";
            i = 1263;
        } else if (str.equals("yeelink.light.lamp9")) {
            bluetoothDeviceConfig.model = "yeelink.light.lamp9";
            i = 1261;
        } else if (str.equals("yeelink.light.lamp10")) {
            bluetoothDeviceConfig.model = "yeelink.light.lamp10";
            i = 1260;
        } else if (str.equals("yeelink.light.lamp15")) {
            bluetoothDeviceConfig.model = "yeelink.light.lamp15";
            i = 70702;
        } else if (str.equals("yeelink.light.lamp19")) {
            bluetoothDeviceConfig.model = "yeelink.light.lamp19";
            i = 3525;
        } else if (str.equals("yeelink.light.lamp2")) {
            bluetoothDeviceConfig.model = "yeelink.light.lamp2";
            i = 664;
        } else if (str.equals("yeelink.light.ceiling1")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceiling1";
            i = 344;
        } else if (str.equals("yeelink.light.ceiling2")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceiling2";
            i = TypedValues.PositionType.TYPE_CURVE_FIT;
        } else if (str.equals("yeelink.light.ceiling3")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceiling3";
            i = InputDeviceCompat.SOURCE_DPAD;
        } else if (str.equals("yeelink.light.ceiling4")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceiling4";
            i = 514;
        } else if (str.equals("yeelink.light.ceiling5")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceiling5";
            i = TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID;
        } else if (str.equals("yeelink.light.ceiling6")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceiling6";
            i = 824;
        } else if (str.equals("yeelink.light.ceiling7")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceiling7";
            i = 826;
        } else if (str.equals("yeelink.light.ceiling8")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceiling8";
            i = 825;
        } else if (str.equals("yeelink.light.ceiling9")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceiling9";
            i = 993;
        } else if (str.equals("yeelink.light.ceiling10")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceiling10";
            i = 992;
        } else if (str.equals("yeelink.light.ceiling11")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceiling11";
            i = 1141;
        } else if (str.equals("yeelink.light.ceiling12")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceiling12";
            i = 1140;
        } else if (str.equals("yeelink.light.ceiling13")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceiling13";
            i = 1139;
        } else if (str.equals("yeelink.light.ceiling14")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceiling14";
            i = 1138;
        } else if (str.equals("yeelink.light.ceiling15")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceiling15";
            i = 1137;
        } else if (str.equals("yeelink.light.ceiling16")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceiling16";
            i = 1206;
        } else if (str.equals("yeelink.light.ceiling17")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceiling17";
            i = 1246;
        } else if (str.equals("yeelink.light.ceiling18")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceiling18";
            i = 1272;
        } else if (str.equals("yeelink.light.ceiling19")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceiling19";
            i = 1271;
        } else if (str.equals("yeelink.light.ceiling20")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceiling20";
            i = 1270;
        } else if (str.equals("yeelink.light.ceiling21")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceiling21";
            i = 1296;
        } else if (str.equals("yeelink.light.ceiling22")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceiling22";
            i = 1295;
        } else if (str.equals("yeelink.light.ceiling23")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceiling23";
            i = 1294;
        } else if (str.equals("yeelink.light.ceiling24")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceiling24";
            i = 1321;
        } else if (str.equals("yeelink.light.ceil26")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceil26";
            i = 1815;
        } else if (str.equals("yeelink.light.ceil27")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceil27";
            i = 1877;
        } else if (str.equals("yeelink.light.ceil29")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceil29";
            i = 2118;
        } else if (str.equals("yeelink.light.strip4")) {
            bluetoothDeviceConfig.model = "yeelink.light.strip4";
            i = 1230;
        } else if (str.equals("yeelink.light.strip6")) {
            bluetoothDeviceConfig.model = "yeelink.light.strip6";
            i = 1889;
        } else if (str.equals("yeelink.light.strip8")) {
            bluetoothDeviceConfig.model = "yeelink.light.strip8";
            i = 4351;
        } else if (str.equals("yeelink.light.stripa")) {
            bluetoothDeviceConfig.model = "yeelink.light.stripa";
            i = 2889;
        } else if (str.equals("yeelink.light.panel1")) {
            bluetoothDeviceConfig.model = "yeelink.light.panel1";
            i = 862;
        } else if (str.equals("yeelink.light.panel3")) {
            bluetoothDeviceConfig.model = "yeelink.light.panel3";
            i = 1416;
        } else if (str.equals("yilai.light.ceiling1")) {
            bluetoothDeviceConfig.model = "yilai.light.ceiling1";
            i = 977;
        } else if (str.equals("yilai.light.ceiling2")) {
            bluetoothDeviceConfig.model = "yilai.light.ceiling2";
            i = 1051;
        } else if (str.equals("yilai.light.ceiling3")) {
            bluetoothDeviceConfig.model = "yilai.light.ceiling3";
            i = 1052;
        } else if (str.equals("yeelink.wifispeaker.v1")) {
            bluetoothDeviceConfig.model = "yeelink.wifispeaker.v1";
            i = 543;
        } else if (str.equals("yeelink.bhf_light.v1")) {
            bluetoothDeviceConfig.model = "yeelink.bhf_light.v1";
            i = 952;
        } else if (str.equals("yeelink.gateway.v1")) {
            bluetoothDeviceConfig.model = "yeelink.gateway.v1";
            i = 636;
        } else if (str.equals("yeelink.gateway.va")) {
            bluetoothDeviceConfig.model = "yeelink.gateway.va";
            i = 2783;
        } else if (str.equals("yeelink.light.ceil30")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceil30";
            i = 2677;
        } else if (str.equals("yeelink.light.ceil31")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceil31";
            i = 2681;
        } else if (str.equals("yeelink.light.ceil32")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceil32";
            i = 2892;
        } else if (str.equals("yeelink.light.ceil33")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceil33";
            i = 3312;
        } else if (str.equals("yeelink.light.ceil35")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceil35";
            i = 4616;
        } else if (str.equals("yeelink.light.ceila")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceila";
            i = 2782;
        } else if (str.equals("yeelink.light.ceilb")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceilb";
            i = 2972;
        } else if (str.equals("yeelink.light.ceilc")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceilc";
            i = 3232;
        } else if (str.equals("yeelink.light.ceild")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceild";
            i = 3456;
        } else if (str.equals("yeelink.light.ceile")) {
            bluetoothDeviceConfig.model = "yeelink.light.ceile";
            i = 8267;
        } else if (str.equals("yeelink.light.fancl1")) {
            bluetoothDeviceConfig.model = "yeelink.light.fancl1";
            i = 1568;
        } else if (str.equals("yeelink.light.fancl2")) {
            bluetoothDeviceConfig.model = "yeelink.light.fancl2";
            i = 1634;
        } else if (str.equals("yeelink.light.fancl5")) {
            bluetoothDeviceConfig.model = "yeelink.light.fancl5";
            i = 2214;
        } else if (str.equals("yeelink.light.fancl6")) {
            bluetoothDeviceConfig.model = "yeelink.light.fancl6";
            i = 2431;
        } else if (str.equals("yeelink.switch.sw1")) {
            bluetoothDeviceConfig.model = "yeelink.switch.sw1";
            i = 2299;
        } else if (str.equals("yeelink.curtain.ctmt1")) {
            bluetoothDeviceConfig.model = "yeelink.curtain.ctmt1";
            i = 1548;
        } else if (str.equals("yeelink.light.colore")) {
            bluetoothDeviceConfig.model = "yeelink.light.colore";
            i = 8542;
        } else {
            if (str.equals("yeelink.light.ctc")) {
                bluetoothDeviceConfig.model = "yeelink.light.ctc";
                i = 8550;
            }
            return bluetoothDeviceConfig;
        }
        bluetoothDeviceConfig.productId = i;
        return bluetoothDeviceConfig;
    }
}
