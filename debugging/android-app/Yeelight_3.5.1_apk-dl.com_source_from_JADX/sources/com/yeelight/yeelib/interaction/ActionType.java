package com.yeelight.yeelib.interaction;

import android.app.Activity;
import com.yeelight.yeelib.R$string;

public enum ActionType {
    COMMAND(0),
    ON(1),
    OFF(2),
    TOGGLE(3),
    BRIGHT(4),
    SCENE(5),
    CONNECT(6),
    BRIGHT_UP(7),
    BRIGHT_DOWN(8),
    LAUNCH(9),
    MODE(10),
    COLOR(11),
    BRIGHT_VARIABLE(12),
    CT_VARIABLE(13),
    COLOR_VARIABLE(14),
    TURN_ON_ALL(15),
    TURN_OFF_ALL(16),
    SCENE_BUNDLE(17),
    DIMMER(18),
    CT(19),
    RECOMMEND_SCENE(20);
    
    public static final int DEVICE_EVENT_UNKNOWN = -1;
    private int mValue;

    /* renamed from: com.yeelight.yeelib.interaction.ActionType$a */
    static /* synthetic */ class C8254a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14150a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.yeelight.yeelib.interaction.ActionType[] r0 = com.yeelight.yeelib.interaction.ActionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14150a = r0
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.ON     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14150a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.OFF     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f14150a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.TOGGLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f14150a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.BRIGHT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f14150a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.SCENE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f14150a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.RECOMMEND_SCENE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.interaction.ActionType.C8254a.<clinit>():void");
        }
    }

    private ActionType(int i) {
        this.mValue = -1;
        this.mValue = i;
    }

    public static String OPEN_CLSOE_2_ON_OFF(String str) {
        if (str.equals("OPEN")) {
            str = ON.name();
        }
        return str.equals("CLOSE") ? OFF.name() : str;
    }

    public String getActionName(Activity activity) {
        int i;
        switch (C8254a.f14150a[ordinal()]) {
            case 1:
                i = R$string.common_text_action_on;
                break;
            case 2:
                i = R$string.common_text_action_off;
                break;
            case 3:
                i = R$string.common_text_action_toggle;
                break;
            case 4:
                i = R$string.common_text_action_bright;
                break;
            case 5:
                i = R$string.common_text_action_scene;
                break;
            case 6:
                i = R$string.common_text_action_recommend_scene;
                break;
            default:
                return name();
        }
        return activity.getString(i);
    }

    public int getValue() {
        return this.mValue;
    }

    public String toString() {
        return name();
    }
}
