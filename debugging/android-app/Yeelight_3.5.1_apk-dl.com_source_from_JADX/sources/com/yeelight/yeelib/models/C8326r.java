package com.yeelight.yeelib.models;

import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;

/* renamed from: com.yeelight.yeelib.models.r */
public class C8326r {
    /* renamed from: a */
    public static C8325q m19802a(int i) {
        C8325q qVar;
        if (i == 0) {
            qVar = new C8325q(i, R$string.device_category_bulb_title, R$string.device_category_bulb_subtitle, R$drawable.icon_device_group_bulb_small, R$drawable.icon_device_group_bulb_big);
        } else if (i == 1) {
            qVar = new C8325q(i, R$string.device_category_strip_title, R$string.device_category_strip_subtitle, R$drawable.icon_device_group_strip_small, R$drawable.icon_device_group_strip_big);
        } else if (i == 2) {
            qVar = new C8325q(i, R$string.device_category_ceiling_title, R$string.device_category_ceiling_subtitle, R$drawable.icon_device_group_ceiling_small, R$drawable.icon_device_group_ceiling_big);
        } else if (i == 3) {
            qVar = new C8325q(i, R$string.device_category_lamp_title, R$string.device_category_lamp_subtitle, R$drawable.icon_device_group_lamp_small, R$drawable.icon_device_group_lamp_big);
        } else if (i == 4) {
            qVar = new C8325q(i, R$string.device_category_spot_light_title, R$string.device_category_spot_light_subtitle, R$drawable.icon_device_group_spotlight_small, R$drawable.icon_device_group_spotlight_big);
        } else if (i != 5) {
            return null;
        } else {
            return new C8325q(i, R$string.device_category_other_device_title, R$string.device_category_other_device_subtitle, R$drawable.icon_device_group_other_small, R$drawable.icon_device_group_other_big);
        }
        return qVar;
    }
}
