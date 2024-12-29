package com.yeelight.yeelib.service;

import androidx.core.view.ViewCompat;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p184n.C7556g;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p186e.C9770e;
import java.beans.PropertyChangeSupport;
import java.util.List;
import org.fourthline.cling.binding.annotations.UpnpAction;
import org.fourthline.cling.binding.annotations.UpnpInputArgument;
import org.fourthline.cling.binding.annotations.UpnpOutputArgument;
import org.fourthline.cling.binding.annotations.UpnpService;
import org.fourthline.cling.binding.annotations.UpnpServiceId;
import org.fourthline.cling.binding.annotations.UpnpServiceType;
import org.fourthline.cling.binding.annotations.UpnpStateVariable;
import org.json.JSONException;
import org.json.JSONObject;

@UpnpService(serviceId = @UpnpServiceId("UpnpDeviceCherry"), serviceType = @UpnpServiceType(value = "UpnpDeviceCherry", version = 1))
public class UpnpDeviceCherry implements C9770e {
    private static final String TAG = "UpnpDeviceCherry";
    public static final String sBrightChangeEventName = "Bright";
    public static final String sBrightInputArgument = "NewBrightValue";
    public static final String sBrightOutputArgument = "RetBrightValue";
    public static final String sColorChangeEventName = "Color";
    public static final String sColorFlowChangeEventName = "ColorFlow";
    public static final String sColorFlowInputArgument = "NewColorFlowValue";
    public static final String sColorFlowOutputArgument = "RetColorFlowValue";
    public static final String sColorInputArgument = "NewColorValue";
    public static final String sColorOutputArgument = "RetColorValue";
    public static final String sColorTempChangeEventName = "ColorTemp";
    public static final String sColorTempInputArgument = "NewColorTempValue";
    public static final String sColorTempOutputArgument = "RetColorTempValue";
    public static final String sDeviceIdChangeEventName = "DeviceIdChanged";
    public static final String sDeviceIdInputArgument = "NewDeviceIdValue";
    public static final String sDeviceIdOutputArgument = "RetDeviceIdValue";
    public static final String sGetBrightActionName = "GetBright";
    public static final String sGetColorActionName = "GetColor";
    public static final String sGetColorFlowActionName = "GetColorFlow";
    public static final String sGetColorTempActionName = "GetColorTemp";
    public static final String sGetDeviceIdActionName = "GetDeviceId";
    public static final String sGetModeActionName = "GetMode";
    public static final String sGetPowerActionName = "GetPower";
    public static final String sModeChangeEventName = "Mode";
    public static final String sModeInputArgument = "NewModeValue";
    public static final String sModeOutputArgument = "RetModeValue";
    public static final String sPowerChangeEventName = "Power";
    public static final String sPowerInputArgument = "NewPowerValue";
    public static final String sPowerOutputArgument = "RetPowerValue";
    public static final String sSaveModeInputArgument = "NewSaveModeValue";
    public static final String sSceneInputArgument = "NewSceneValue";
    public static final String sSetBrightActionName = "SetBright";
    public static final String sSetColorActionName = "SetColor";
    public static final String sSetColorFlowActionName = "SetColorFlow";
    public static final String sSetColorTempActionName = "SetColorTemp";
    public static final String sSetDeviceIdActionName = "SetDeviceId";
    public static final String sSetModeActionName = "SetMode";
    public static final String sSetPowerActionName = "SetPower";
    public static final String sSetSaveModeActionName = "SetSaveMode";
    public static final String sSetSceneActionName = "SetScene";
    public static final String sSetToggleActionName = "SetToggle";
    public static final String sToggleChangeEventName = "ToggleChanged";
    public static final String sToggleInputArgument = "NewToggleValue";
    public static final String sToggleOutputArgument = "RetToggleValue";
    public static final String sUpnpDeviceCherryServiceID = "UpnpDeviceCherry";
    public static final String sUpnpDeviceCherryUDADeviceType = "YeelightCherry";
    @UpnpStateVariable(defaultValue = "0", sendEvents = true)
    private String bright = TimerCodec.DISENABLE;
    @UpnpStateVariable(defaultValue = "0", sendEvents = true)
    private String color = TimerCodec.DISENABLE;
    @UpnpStateVariable(defaultValue = "0", sendEvents = true)
    private String colorFlow = TimerCodec.DISENABLE;
    @UpnpStateVariable(defaultValue = "0", sendEvents = true)
    private String colorTemp = TimerCodec.DISENABLE;
    @UpnpStateVariable(defaultValue = "0", sendEvents = true)
    private String deviceId = TimerCodec.DISENABLE;
    private final PropertyChangeSupport mPropertyChangeSupport = new PropertyChangeSupport(this);
    @UpnpStateVariable(defaultValue = "1", sendEvents = true)
    private String mode = TimerCodec.ENABLE;
    @UpnpStateVariable(defaultValue = "0", sendEvents = true)
    private String power = TimerCodec.DISENABLE;
    @UpnpStateVariable(defaultValue = "0", sendEvents = false)
    private String saveMode = TimerCodec.DISENABLE;
    @UpnpStateVariable(defaultValue = "0", sendEvents = false)
    private String scene = TimerCodec.DISENABLE;
    @UpnpStateVariable(defaultValue = "0", sendEvents = true)
    private String toggle = TimerCodec.DISENABLE;

    private String parseColorFlowString(List<C7556g.C7557a> list) {
        int size = list.size();
        C9856y.C9857a[] aVarArr = new C9856y.C9857a[size];
        for (int i = 0; i < size; i++) {
            aVarArr[i] = new C9856y.C9857a(2000, 1, list.get(i).mo28914a(), 100);
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 != 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb.append(aVarArr[i2].mo31896b());
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb.append(aVarArr[i2].mo31897c());
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb.append(aVarArr[i2].mo31898d() & ViewCompat.MEASURED_SIZE_MASK);
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb.append(aVarArr[i2].mo31895a());
        }
        return sb.toString();
    }

    @UpnpAction(out = {@UpnpOutputArgument(name = "RetBrightValue")})
    public String getBright() {
        return String.valueOf(C4257w.m11947l0().mo23668g0(this.deviceId).mo23408d0().mo27700m());
    }

    @UpnpAction(out = {@UpnpOutputArgument(name = "RetColorValue")})
    public String getColor() {
        return String.valueOf(C4257w.m11947l0().mo23668g0(this.deviceId).mo23408d0().mo27702n());
    }

    @UpnpAction(out = {@UpnpOutputArgument(name = "RetColorFlowValue")})
    public String getColorFlow() {
        return parseColorFlowString(C4257w.m11947l0().mo23668g0(this.deviceId).mo23408d0().mo27704o());
    }

    @UpnpAction(out = {@UpnpOutputArgument(name = "RetColorTempValue")})
    public String getColorTemp() {
        return String.valueOf(C4257w.m11947l0().mo23668g0(this.deviceId).mo23408d0().mo27706p());
    }

    @UpnpAction(out = {@UpnpOutputArgument(name = "RetDeviceIdValue")})
    public String getDeviceId() {
        return this.deviceId;
    }

    @UpnpAction(out = {@UpnpOutputArgument(name = "RetModeValue")})
    public String getMode() {
        return String.valueOf(C4257w.m11947l0().mo23668g0(this.deviceId).mo23408d0().mo27726z().name());
    }

    @UpnpAction(out = {@UpnpOutputArgument(name = "RetPowerValue")})
    public String getPower() {
        return C4257w.m11953o0(this.deviceId).mo23332k1() ? TimerCodec.ENABLE : TimerCodec.DISENABLE;
    }

    public PropertyChangeSupport getPropertyChangeSupport() {
        return this.mPropertyChangeSupport;
    }

    public void onStatusChange(int i, C6024e eVar) {
        PropertyChangeSupport propertyChangeSupport;
        String str;
        String str2;
        String str3;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        if (i != 16) {
                            if (i != 32) {
                                if (i == 64) {
                                    getPropertyChangeSupport().firePropertyChange(sColorFlowChangeEventName, "", this.colorFlow);
                                    return;
                                }
                                return;
                            } else if (eVar.mo27706p() != Integer.valueOf(this.colorTemp).intValue()) {
                                str = this.colorTemp;
                                this.colorTemp = String.valueOf(eVar.mo27706p());
                                propertyChangeSupport = getPropertyChangeSupport();
                                str3 = this.colorTemp;
                                str2 = sColorTempChangeEventName;
                            } else {
                                return;
                            }
                        } else if (eVar.mo27702n() != Integer.valueOf(this.color).intValue()) {
                            str = this.color;
                            this.color = String.valueOf(eVar.mo27702n());
                            propertyChangeSupport = getPropertyChangeSupport();
                            str3 = this.color;
                            str2 = sColorChangeEventName;
                        } else {
                            return;
                        }
                    } else if (eVar.mo27700m() != Integer.valueOf(this.bright).intValue()) {
                        str = this.bright;
                        this.bright = String.valueOf(eVar.mo27700m());
                        propertyChangeSupport = getPropertyChangeSupport();
                        str3 = this.bright;
                        str2 = "Bright";
                    } else {
                        return;
                    }
                } else if (!eVar.mo27726z().name().equals(this.mode)) {
                    str = this.mode;
                    this.mode = eVar.mo27726z().name();
                    propertyChangeSupport = getPropertyChangeSupport();
                    str3 = this.mode;
                    str2 = "Mode";
                } else {
                    return;
                }
                propertyChangeSupport.firePropertyChange(str2, str, str3);
            } else if (this.power.equals(TimerCodec.ENABLE)) {
                this.power = TimerCodec.DISENABLE;
                getPropertyChangeSupport().firePropertyChange("Power", TimerCodec.ENABLE, TimerCodec.DISENABLE);
            }
        } else if (this.power.equals(TimerCodec.DISENABLE)) {
            this.power = TimerCodec.ENABLE;
            getPropertyChangeSupport().firePropertyChange("Power", TimerCodec.DISENABLE, TimerCodec.ENABLE);
        }
    }

    @UpnpAction
    public void setBright(@UpnpInputArgument(name = "NewBrightValue") String str) {
        C4257w.m11953o0(this.deviceId).mo23340p1((long) Integer.valueOf(str).intValue());
    }

    @UpnpAction
    public void setColor(@UpnpInputArgument(name = "NewColorValue") String str) {
        C4257w.m11953o0(this.deviceId).mo23341q1(Integer.valueOf(str).intValue());
    }

    @UpnpAction
    public void setColorFlow(@UpnpInputArgument(name = "NewColorFlowValue") String str) {
        this.colorFlow = str;
        C4200i o0 = C4257w.m11953o0(this.deviceId);
        String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        int[] iArr = new int[(split.length / 4)];
        int parseInt = Integer.parseInt(split[0]);
        for (int i = 0; i < split.length / 4; i++) {
            iArr[i] = Integer.parseInt(split[(i * 4) + 2]) | ViewCompat.MEASURED_STATE_MASK;
        }
        o0.mo23343r1(parseInt, iArr, o0.mo23408d0().mo27700m());
    }

    @UpnpAction
    public void setColorTemp(@UpnpInputArgument(name = "NewColorTempValue") String str) {
        C4257w.m11953o0(this.deviceId).mo23345s1(Integer.valueOf(str).intValue());
    }

    @UpnpAction
    public void setDeviceId(@UpnpInputArgument(name = "NewDeviceIdValue") String str) {
        this.deviceId = str;
        C4200i o0 = C4257w.m11953o0(str);
        this.power = o0.mo23332k1() ? TimerCodec.ENABLE : TimerCodec.DISENABLE;
        this.mode = o0.mo23408d0().mo27726z().name();
        this.bright = String.valueOf(o0.mo23408d0().mo27700m());
        this.color = String.valueOf(o0.mo23408d0().mo27702n());
        this.colorTemp = String.valueOf(o0.mo23408d0().mo27706p());
        this.colorFlow = parseColorFlowString(o0.mo23408d0().mo27704o());
        o0.mo23365B0(this);
    }

    @UpnpAction
    public void setMode(@UpnpInputArgument(name = "NewModeValue") String str) {
        "upnp device cherry, set mode: " + str;
        C4257w.m11953o0(this.deviceId).mo23352w1(C6024e.C6028d.valueOf(str));
    }

    @UpnpAction
    public void setPower(@UpnpInputArgument(name = "NewPowerValue") String str) {
        C4200i o0 = C4257w.m11953o0(this.deviceId);
        if (str.equals(TimerCodec.ENABLE)) {
            o0.mo23334l1();
        } else {
            o0.mo23326b1();
        }
    }

    @UpnpAction
    public void setSaveMode(@UpnpInputArgument(name = "NewSaveModeValue") String str) {
        "upnp device, saveMode: " + str;
        C4257w.m11953o0(this.deviceId).mo23338o1(C6024e.C6028d.valueOf(str));
    }

    @UpnpAction
    public void setScene(@UpnpInputArgument(name = "NewSceneValue") String str) {
        C4200i o0 = C4257w.m11953o0(this.deviceId);
        "upnp device, set scene: " + str;
        String str2 = "";
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.has("mode") ? jSONObject.getInt("mode") : 0;
            int i2 = jSONObject.has("bright") ? jSONObject.getInt("bright") : 0;
            int i3 = jSONObject.has("ct") ? jSONObject.getInt("ct") : 0;
            int i4 = jSONObject.has("color") ? jSONObject.getInt("color") : 0;
            if (jSONObject.has("flowParam")) {
                str2 = jSONObject.getString("flowParam");
            }
            o0.mo23355x1(new C9856y(i, i2, i3, i4, str2));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @UpnpAction
    public void setToggle(@UpnpInputArgument(name = "NewToggleValue") String str) {
        C4257w.m11953o0(this.deviceId).mo23300A1();
    }
}
