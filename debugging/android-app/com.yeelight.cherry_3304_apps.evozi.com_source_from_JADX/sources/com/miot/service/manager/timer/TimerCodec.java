package com.miot.service.manager.timer;

import android.text.TextUtils;
import com.miot.common.device.Action;
import com.miot.common.device.Device;
import com.miot.common.device.Service;
import com.miot.common.property.Property;
import com.miot.common.timer.CrontabTime;
import com.miot.common.timer.Timer;
import com.miot.common.timer.TimerBean;
import com.miot.common.utils.Logger;
import com.miot.service.common.manager.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p011c.p012a.p046d.C0664f;
import p011c.p012a.p046d.C0679o;

public class TimerCodec {
    public static final String DISENABLE = "0";
    public static final String ENABLE = "1";
    private static final String TAG = "TimerCodec";

    public static Action decodeAction(String str, JSONArray jSONArray, String str2, String str3) {
        String str4;
        Device device = ServiceManager.getInstance().getDevice(str3);
        if (device == null || str == null) {
            return null;
        }
        Action action = getAction(device, str, jSONArray);
        if (action == null) {
            return action;
        }
        Action action2 = (Action) action.clone();
        action2.setDescription(str2);
        if (jSONArray == null) {
            str4 = "jParams is null";
        } else {
            List<Property> inArguments = action2.getInArguments();
            if (jSONArray.length() < inArguments.size()) {
                str4 = "jArray.length() < properties.size()";
            } else {
                for (int i = 0; i < inArguments.size(); i++) {
                    Property property = inArguments.get(i);
                    Object objectValue = property.getDefinition().getDataType().toObjectValue(jSONArray.optString(i));
                    if (objectValue != null) {
                        property.setValue(objectValue);
                    }
                }
                return action2;
            }
        }
        Logger.m10630e(TAG, str4);
        return action2;
    }

    private static JSONArray decodeSpecTask(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    jSONArray2.put(optJSONObject);
                }
            }
        }
        return jSONArray2;
    }

    public static Timer decodeTimer(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Logger.m10629d(TAG, "timer: " + jSONObject.toString());
        TimerBean create = TimerBean.create(jSONObject);
        if (create == null) {
            return null;
        }
        TimerBean.SettingBean setting = create.getSetting();
        if (setting == null) {
            Logger.m10630e(TAG, "parse timer failed, setting is null");
            return null;
        }
        Timer timer = new Timer();
        timer.setTimerId(create.getUs_id());
        timer.setName(create.getName());
        timer.setIdentify(create.getIdentify());
        List<String> authed = create.getAuthed();
        if (authed != null && authed.size() > 0) {
            timer.setDeviceId(authed.get(0));
        }
        timer.setTimerEnabled(TextUtils.equals(setting.getEnable_timer(), ENABLE));
        timer.setPushEnabled(TextUtils.equals(setting.getEnable_push(), ENABLE));
        timer.setTimerStartEnabled(TextUtils.equals(setting.getEnable_timer_on(), ENABLE));
        timer.setTimerEndEnabled(TextUtils.equals(setting.getEnable_timer_off(), ENABLE));
        CrontabTime parse = CrontabTime.parse(setting.getOn_time());
        if (parse != null) {
            timer.setStartTime(parse);
        }
        CrontabTime parse2 = CrontabTime.parse(setting.getOff_time());
        if (parse2 != null) {
            timer.setEndTime(parse2);
        }
        String on_method = setting.getOn_method();
        JSONObject optJSONObject = jSONObject.optJSONObject("setting");
        if (optJSONObject == null) {
            return null;
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("on_param");
        if (optJSONArray == null || !optJSONArray.toString().contains("piid")) {
            timer.setStartAction(decodeAction(on_method, optJSONArray, setting.getOn_desc(), timer.getDeviceId()));
        } else {
            timer.setSpecStartTask(decodeSpecTask(optJSONArray));
        }
        String off_method = setting.getOff_method();
        JSONArray optJSONArray2 = optJSONObject.optJSONArray("off_param");
        if (optJSONArray2 == null || !optJSONArray2.toString().contains("piid")) {
            timer.setEndAction(decodeAction(off_method, optJSONArray2, setting.getOff_desc(), timer.getDeviceId()));
        } else {
            timer.setSpecEndTask(decodeSpecTask(optJSONArray2));
        }
        return timer;
    }

    public static TimerBean encodeTimer(Timer timer) {
        TimerBean timerBean = new TimerBean();
        timerBean.setUs_id(timer.getTimerId());
        timerBean.setIdentify(timer.getIdentify());
        timerBean.setName(timer.getName());
        timerBean.setSt_id(8);
        ArrayList arrayList = new ArrayList();
        arrayList.add(timer.getDeviceId());
        timerBean.setAuthed(arrayList);
        TimerBean.SettingBean settingBean = new TimerBean.SettingBean();
        boolean isTimerEnabled = timer.isTimerEnabled();
        String str = ENABLE;
        settingBean.setEnable_timer(isTimerEnabled ? str : DISENABLE);
        settingBean.setEnable_push(timer.isPushEnabled() ? str : DISENABLE);
        settingBean.setEnable_timer_on(timer.isTimerStartEnabled() ? str : DISENABLE);
        if (!timer.isTimerEndEnabled()) {
            str = DISENABLE;
        }
        settingBean.setEnable_timer_off(str);
        CrontabTime startTime = timer.getStartTime();
        if (startTime != null) {
            settingBean.setOn_time(startTime.toString());
        }
        CrontabTime endTime = timer.getEndTime();
        if (endTime != null) {
            settingBean.setOff_time(endTime.toString());
        }
        Action startAction = timer.getStartAction();
        JSONArray specStartTask = timer.getSpecStartTask();
        if (startAction != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Property value : startAction.getInArguments()) {
                arrayList2.add(value.getValue());
            }
            settingBean.setOn_method(startAction.getInternalName());
            settingBean.setOn_param(arrayList2);
            settingBean.setOn_desc(startAction.getDescription());
        } else if (specStartTask != null && specStartTask.length() > 0) {
            settingBean.setOn_method("set_properties");
            settingBean.setOn_param(jsonArrayToList(specStartTask));
        }
        Action endAction = timer.getEndAction();
        JSONArray specEndTask = timer.getSpecEndTask();
        if (endAction != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Property value2 : endAction.getInArguments()) {
                arrayList3.add(value2.getValue());
            }
            settingBean.setOff_method(endAction.getInternalName());
            settingBean.setOff_param(arrayList3);
            settingBean.setOff_desc(endAction.getDescription());
        } else if (specEndTask != null && specEndTask.length() > 0) {
            settingBean.setOff_method("set_properties");
            settingBean.setOff_param(jsonArrayToList(specEndTask));
        }
        timerBean.setSetting(settingBean);
        return timerBean;
    }

    public static Action getAction(Device device, String str, JSONArray jSONArray) {
        Action action = null;
        for (Service actions : device.getServices()) {
            Iterator<Action> it = actions.getActions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Action next = it.next();
                if (TextUtils.equals(next.getInternalName(), str) && matchArgument(next, jSONArray)) {
                    action = next;
                    break;
                }
            }
        }
        return action;
    }

    private static List<Object> jsonArrayToList(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(new C0664f().mo8704i(optJSONObject.toString(), C0679o.class));
            }
        }
        return arrayList;
    }

    public static boolean matchArgument(Action action, JSONArray jSONArray) {
        int size = action.getInArguments().size();
        return jSONArray == null ? size == 0 : size == jSONArray.length();
    }
}
