package com.yeelight.yeelib.p153g;

import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;

/* renamed from: com.yeelight.yeelib.g.w */
public class C9854w {
    /* renamed from: a */
    public static C9853v m24045a(int i) {
        C9853v vVar;
        if (i == 0) {
            vVar = new C9853v(i, R$string.device_category_bulb_title, R$string.device_category_bulb_subtitle, R$drawable.icon_device_group_bulb_small, R$drawable.icon_device_group_bulb_big);
        } else if (i == 1) {
            vVar = new C9853v(i, R$string.device_category_strip_title, R$string.device_category_strip_subtitle, R$drawable.icon_device_group_strip_small, R$drawable.icon_device_group_strip_big);
        } else if (i == 2) {
            vVar = new C9853v(i, R$string.device_category_ceiling_title, R$string.device_category_ceiling_subtitle, R$drawable.icon_device_group_ceiling_small, R$drawable.icon_device_group_ceiling_big);
        } else if (i == 3) {
            vVar = new C9853v(i, R$string.device_category_lamp_title, R$string.device_category_lamp_subtitle, R$drawable.icon_device_group_lamp_small, R$drawable.icon_device_group_lamp_big);
        } else if (i == 4) {
            vVar = new C9853v(i, R$string.device_category_spot_light_title, R$string.device_category_spot_light_subtitle, R$drawable.icon_device_group_spotlight_small, R$drawable.icon_device_group_spotlight_big);
        } else if (i != 5) {
            return null;
        } else {
            return new C9853v(i, R$string.device_category_other_device_title, R$string.device_category_other_device_subtitle, R$drawable.icon_device_group_other_small, R$drawable.icon_device_group_other_big);
        }
        return vVar;
    }
}
