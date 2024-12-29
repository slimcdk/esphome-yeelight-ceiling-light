package com.miot.common.timer;

import com.google.gson.C2469e;
import com.miot.service.manager.timer.TimerCodec;
import java.util.List;
import org.json.JSONObject;

public final class TimerBean {
    private List<String> authed;
    private String identify;
    private String name;
    private SettingBean setting;
    private int st_id;
    private long us_id;

    public static class SettingBean {
        private String enable_push;
        private String enable_timer;
        private String enable_timer_off;
        private String enable_timer_on;
        private String off_desc;
        private String off_method;
        private Object off_param;
        private String off_time;
        private String on_desc;
        private String on_method;
        private Object on_param;
        private String on_time;
        private String timer_type = TimerCodec.DISENABLE;

        public String getEnable_push() {
            return this.enable_push;
        }

        public String getEnable_timer() {
            return this.enable_timer;
        }

        public String getEnable_timer_off() {
            return this.enable_timer_off;
        }

        public String getEnable_timer_on() {
            return this.enable_timer_on;
        }

        public String getOff_desc() {
            return this.off_desc;
        }

        public String getOff_method() {
            return this.off_method;
        }

        public Object getOff_param() {
            return this.off_param;
        }

        public String getOff_time() {
            return this.off_time;
        }

        public String getOn_desc() {
            return this.on_desc;
        }

        public String getOn_method() {
            return this.on_method;
        }

        public Object getOn_param() {
            return this.on_param;
        }

        public String getOn_time() {
            return this.on_time;
        }

        public String getTimer_type() {
            return this.timer_type;
        }

        public void setEnable_push(String str) {
            this.enable_push = str;
        }

        public void setEnable_timer(String str) {
            this.enable_timer = str;
        }

        public void setEnable_timer_off(String str) {
            this.enable_timer_off = str;
        }

        public void setEnable_timer_on(String str) {
            this.enable_timer_on = str;
        }

        public void setOff_desc(String str) {
            this.off_desc = str;
        }

        public void setOff_method(String str) {
            this.off_method = str;
        }

        public void setOff_param(List<Object> list) {
            this.off_param = list;
        }

        public void setOff_time(String str) {
            this.off_time = str;
        }

        public void setOn_desc(String str) {
            this.on_desc = str;
        }

        public void setOn_method(String str) {
            this.on_method = str;
        }

        public void setOn_param(List<Object> list) {
            this.on_param = list;
        }

        public void setOn_time(String str) {
            this.on_time = str;
        }

        public void setTimer_type(String str) {
            this.timer_type = str;
        }
    }

    public static TimerBean create(JSONObject jSONObject) {
        try {
            return (TimerBean) new C2469e().mo19225h(jSONObject.toString(), TimerBean.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<String> getAuthed() {
        return this.authed;
    }

    public String getIdentify() {
        return this.identify;
    }

    public String getName() {
        return this.name;
    }

    public SettingBean getSetting() {
        return this.setting;
    }

    public int getSt_id() {
        return this.st_id;
    }

    public long getUs_id() {
        return this.us_id;
    }

    public void setAuthed(List<String> list) {
        this.authed = list;
    }

    public void setIdentify(String str) {
        this.identify = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSetting(SettingBean settingBean) {
        this.setting = settingBean;
    }

    public void setSt_id(int i) {
        this.st_id = i;
    }

    public void setUs_id(long j) {
        this.us_id = j;
    }
}
