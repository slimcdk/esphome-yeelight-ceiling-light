package com.squareup.leakcanary;

import com.squareup.leakcanary.ExcludedRefs;
import java.util.EnumSet;
import java.util.Iterator;

public enum AndroidExcludedRefs {
    ;
    
    final boolean applies;

    /* JADX WARNING: Removed duplicated region for block: B:100:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01c3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0193  */
    static {
        /*
            com.squareup.leakcanary.AndroidExcludedRefs$1 r0 = new com.squareup.leakcanary.AndroidExcludedRefs$1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            r3 = 19
            r4 = 1
            r5 = 0
            if (r1 < r3) goto L_0x0010
            if (r1 > r2) goto L_0x0010
            r6 = 1
            goto L_0x0011
        L_0x0010:
            r6 = 0
        L_0x0011:
            java.lang.String r7 = "ACTIVITY_CLIENT_RECORD__NEXT_IDLE"
            r0.<init>(r7, r5, r6)
            ACTIVITY_CLIENT_RECORD__NEXT_IDLE = r0
            com.squareup.leakcanary.AndroidExcludedRefs$2 r6 = new com.squareup.leakcanary.AndroidExcludedRefs$2
            if (r1 > r3) goto L_0x001e
            r7 = 1
            goto L_0x001f
        L_0x001e:
            r7 = 0
        L_0x001f:
            java.lang.String r8 = "SPAN_CONTROLLER"
            r6.<init>(r8, r4, r7)
            SPAN_CONTROLLER = r6
            com.squareup.leakcanary.AndroidExcludedRefs$3 r7 = new com.squareup.leakcanary.AndroidExcludedRefs$3
            if (r1 != r2) goto L_0x002c
            r8 = 1
            goto L_0x002d
        L_0x002c:
            r8 = 0
        L_0x002d:
            java.lang.String r9 = "MEDIA_SESSION_LEGACY_HELPER__SINSTANCE"
            r10 = 2
            r7.<init>(r9, r10, r8)
            MEDIA_SESSION_LEGACY_HELPER__SINSTANCE = r7
            com.squareup.leakcanary.AndroidExcludedRefs$4 r8 = new com.squareup.leakcanary.AndroidExcludedRefs$4
            r9 = 22
            if (r1 > r9) goto L_0x003d
            r11 = 1
            goto L_0x003e
        L_0x003d:
            r11 = 0
        L_0x003e:
            java.lang.String r12 = "TEXT_LINE__SCACHED"
            r13 = 3
            r8.<init>(r12, r13, r11)
            TEXT_LINE__SCACHED = r8
            com.squareup.leakcanary.AndroidExcludedRefs$5 r11 = new com.squareup.leakcanary.AndroidExcludedRefs$5
            if (r1 >= r2) goto L_0x004c
            r12 = 1
            goto L_0x004d
        L_0x004c:
            r12 = 0
        L_0x004d:
            java.lang.String r14 = "BLOCKING_QUEUE"
            r15 = 4
            r11.<init>(r14, r15, r12)
            BLOCKING_QUEUE = r11
            com.squareup.leakcanary.AndroidExcludedRefs$6 r12 = new com.squareup.leakcanary.AndroidExcludedRefs$6
            r14 = 23
            r15 = 15
            if (r1 < r15) goto L_0x0061
            if (r1 > r14) goto L_0x0061
            r13 = 1
            goto L_0x0062
        L_0x0061:
            r13 = 0
        L_0x0062:
            java.lang.String r10 = "INPUT_METHOD_MANAGER__SERVED_VIEW"
            r4 = 5
            r12.<init>(r10, r4, r13)
            INPUT_METHOD_MANAGER__SERVED_VIEW = r12
            com.squareup.leakcanary.AndroidExcludedRefs$7 r10 = new com.squareup.leakcanary.AndroidExcludedRefs$7
            if (r1 < r15) goto L_0x0072
            if (r1 > r14) goto L_0x0072
            r13 = 1
            goto L_0x0073
        L_0x0072:
            r13 = 0
        L_0x0073:
            java.lang.String r5 = "INPUT_METHOD_MANAGER__ROOT_VIEW"
            r14 = 6
            r10.<init>(r5, r14, r13)
            INPUT_METHOD_MANAGER__ROOT_VIEW = r10
            com.squareup.leakcanary.AndroidExcludedRefs$8 r5 = new com.squareup.leakcanary.AndroidExcludedRefs$8
            r13 = 14
            if (r1 < r13) goto L_0x0085
            if (r1 > r9) goto L_0x0085
            r14 = 1
            goto L_0x0086
        L_0x0085:
            r14 = 0
        L_0x0086:
            java.lang.String r15 = "LAYOUT_TRANSITION"
            r3 = 7
            r5.<init>(r15, r3, r14)
            LAYOUT_TRANSITION = r5
            com.squareup.leakcanary.AndroidExcludedRefs$9 r14 = new com.squareup.leakcanary.AndroidExcludedRefs$9
            r15 = 16
            if (r1 < r15) goto L_0x0098
            if (r1 > r9) goto L_0x0098
            r3 = 1
            goto L_0x0099
        L_0x0098:
            r3 = 0
        L_0x0099:
            java.lang.String r15 = "SPELL_CHECKER_SESSION"
            r4 = 8
            r14.<init>(r15, r4, r3)
            SPELL_CHECKER_SESSION = r14
            com.squareup.leakcanary.AndroidExcludedRefs$10 r3 = new com.squareup.leakcanary.AndroidExcludedRefs$10
            if (r1 <= r13) goto L_0x00aa
            if (r1 > r9) goto L_0x00aa
            r15 = 1
            goto L_0x00ab
        L_0x00aa:
            r15 = 0
        L_0x00ab:
            java.lang.String r4 = "ACTIVITY_CHOOSE_MODEL"
            r13 = 9
            r3.<init>(r4, r13, r15)
            ACTIVITY_CHOOSE_MODEL = r3
            com.squareup.leakcanary.AndroidExcludedRefs$11 r4 = new com.squareup.leakcanary.AndroidExcludedRefs$11
            if (r1 >= r2) goto L_0x00ba
            r15 = 1
            goto L_0x00bb
        L_0x00ba:
            r15 = 0
        L_0x00bb:
            java.lang.String r13 = "SPEECH_RECOGNIZER"
            r2 = 10
            r4.<init>(r13, r2, r15)
            SPEECH_RECOGNIZER = r4
            com.squareup.leakcanary.AndroidExcludedRefs$12 r13 = new com.squareup.leakcanary.AndroidExcludedRefs$12
            r15 = 5
            if (r1 <= r15) goto L_0x00cd
            if (r1 > r9) goto L_0x00cd
            r15 = 1
            goto L_0x00ce
        L_0x00cd:
            r15 = 0
        L_0x00ce:
            java.lang.String r2 = "ACCOUNT_MANAGER"
            r9 = 11
            r13.<init>(r2, r9, r15)
            ACCOUNT_MANAGER = r13
            com.squareup.leakcanary.AndroidExcludedRefs$13 r2 = new com.squareup.leakcanary.AndroidExcludedRefs$13
            r15 = 22
            if (r1 > r15) goto L_0x00df
            r9 = 1
            goto L_0x00e0
        L_0x00df:
            r9 = 0
        L_0x00e0:
            java.lang.String r15 = "MEDIA_SCANNER_CONNECTION"
            r16 = r13
            r13 = 12
            r2.<init>(r15, r13, r9)
            MEDIA_SCANNER_CONNECTION = r2
            com.squareup.leakcanary.AndroidExcludedRefs$14 r9 = new com.squareup.leakcanary.AndroidExcludedRefs$14
            r15 = 16
            if (r1 < r15) goto L_0x00f7
            r15 = 22
            if (r1 > r15) goto L_0x00f9
            r13 = 1
            goto L_0x00fa
        L_0x00f7:
            r15 = 22
        L_0x00f9:
            r13 = 0
        L_0x00fa:
            java.lang.String r15 = "USER_MANAGER__SINSTANCE"
            r17 = r2
            r2 = 13
            r9.<init>(r15, r2, r13)
            USER_MANAGER__SINSTANCE = r9
            com.squareup.leakcanary.AndroidExcludedRefs$15 r13 = new com.squareup.leakcanary.AndroidExcludedRefs$15
            r15 = 22
            if (r1 >= r15) goto L_0x010d
            r15 = 1
            goto L_0x010e
        L_0x010d:
            r15 = 0
        L_0x010e:
            java.lang.String r2 = "APP_WIDGET_HOST_CALLBACKS"
            r18 = r9
            r9 = 14
            r13.<init>(r2, r9, r15)
            APP_WIDGET_HOST_CALLBACKS = r13
            com.squareup.leakcanary.AndroidExcludedRefs$16 r2 = new com.squareup.leakcanary.AndroidExcludedRefs$16
            java.lang.String r9 = android.os.Build.MANUFACTURER
            java.lang.String r15 = "motorola"
            boolean r15 = r15.equals(r9)
            if (r15 == 0) goto L_0x012d
            r15 = 19
            if (r1 != r15) goto L_0x012d
            r19 = r13
            r15 = 1
            goto L_0x0130
        L_0x012d:
            r19 = r13
            r15 = 0
        L_0x0130:
            java.lang.String r13 = "DEVICE_POLICY_MANAGER__SETTINGS_OBSERVER"
            r20 = r4
            r4 = 15
            r2.<init>(r13, r4, r15)
            DEVICE_POLICY_MANAGER__SETTINGS_OBSERVER = r2
            com.squareup.leakcanary.AndroidExcludedRefs$17 r4 = new com.squareup.leakcanary.AndroidExcludedRefs$17
            java.lang.String r13 = "samsung"
            boolean r15 = r13.equals(r9)
            if (r15 == 0) goto L_0x014d
            r15 = 19
            if (r1 != r15) goto L_0x014d
            r21 = r2
            r15 = 1
            goto L_0x0150
        L_0x014d:
            r21 = r2
            r15 = 0
        L_0x0150:
            java.lang.String r2 = "SPEN_GESTURE_MANAGER"
            r22 = r3
            r3 = 16
            r4.<init>(r2, r3, r15)
            SPEN_GESTURE_MANAGER = r4
            com.squareup.leakcanary.AndroidExcludedRefs$18 r2 = new com.squareup.leakcanary.AndroidExcludedRefs$18
            r3 = 17
            boolean r15 = r13.equals(r9)
            if (r15 == 0) goto L_0x0171
            r15 = 19
            if (r1 < r15) goto L_0x0171
            r15 = 21
            if (r1 > r15) goto L_0x0171
            r23 = r4
            r15 = 1
            goto L_0x0174
        L_0x0171:
            r23 = r4
            r15 = 0
        L_0x0174:
            java.lang.String r4 = "CLIPBOARD_UI_MANAGER__SINSTANCE"
            r2.<init>(r4, r3, r15)
            CLIPBOARD_UI_MANAGER__SINSTANCE = r2
            com.squareup.leakcanary.AndroidExcludedRefs$19 r3 = new com.squareup.leakcanary.AndroidExcludedRefs$19
            r4 = 18
            java.lang.String r15 = "LGE"
            boolean r15 = r15.equals(r9)
            if (r15 == 0) goto L_0x0193
            r15 = 19
            if (r1 < r15) goto L_0x0193
            r15 = 21
            if (r1 > r15) goto L_0x0193
            r24 = r2
            r15 = 1
            goto L_0x0196
        L_0x0193:
            r24 = r2
            r15 = 0
        L_0x0196:
            java.lang.String r2 = "BUBBLE_POPUP_HELPER__SHELPER"
            r3.<init>(r2, r4, r15)
            BUBBLE_POPUP_HELPER__SHELPER = r3
            com.squareup.leakcanary.AndroidExcludedRefs$20 r2 = new com.squareup.leakcanary.AndroidExcludedRefs$20
            boolean r4 = r13.equals(r9)
            if (r4 == 0) goto L_0x01ad
            r4 = 19
            if (r1 != r4) goto L_0x01af
            r25 = r3
            r15 = 1
            goto L_0x01b2
        L_0x01ad:
            r4 = 19
        L_0x01af:
            r25 = r3
            r15 = 0
        L_0x01b2:
            java.lang.String r3 = "AW_RESOURCE__SRESOURCES"
            r2.<init>(r3, r4, r15)
            AW_RESOURCE__SRESOURCES = r2
            com.squareup.leakcanary.AndroidExcludedRefs$21 r3 = new com.squareup.leakcanary.AndroidExcludedRefs$21
            java.lang.String r15 = "NVIDIA"
            boolean r15 = r15.equals(r9)
            if (r15 == 0) goto L_0x01c7
            if (r1 != r4) goto L_0x01c7
            r15 = 1
            goto L_0x01c8
        L_0x01c7:
            r15 = 0
        L_0x01c8:
            java.lang.String r4 = "MAPPER_CLIENT"
            r27 = r2
            r2 = 20
            r3.<init>(r4, r2, r15)
            MAPPER_CLIENT = r3
            com.squareup.leakcanary.AndroidExcludedRefs$22 r2 = new com.squareup.leakcanary.AndroidExcludedRefs$22
            boolean r4 = r13.equals(r9)
            if (r4 == 0) goto L_0x01e7
            r4 = 19
            if (r1 < r4) goto L_0x01e7
            r4 = 21
            if (r1 > r4) goto L_0x01e9
            r26 = r3
            r15 = 1
            goto L_0x01ec
        L_0x01e7:
            r4 = 21
        L_0x01e9:
            r26 = r3
            r15 = 0
        L_0x01ec:
            java.lang.String r3 = "TEXT_VIEW__MLAST_HOVERED_VIEW"
            r2.<init>(r3, r4, r15)
            TEXT_VIEW__MLAST_HOVERED_VIEW = r2
            com.squareup.leakcanary.AndroidExcludedRefs$23 r3 = new com.squareup.leakcanary.AndroidExcludedRefs$23
            boolean r4 = r13.equals(r9)
            if (r4 == 0) goto L_0x0201
            r4 = 19
            if (r1 != r4) goto L_0x0203
            r15 = 1
            goto L_0x0204
        L_0x0201:
            r4 = 19
        L_0x0203:
            r15 = 0
        L_0x0204:
            java.lang.String r4 = "PERSONA_MANAGER"
            r28 = r2
            r2 = 22
            r3.<init>(r4, r2, r15)
            PERSONA_MANAGER = r3
            com.squareup.leakcanary.AndroidExcludedRefs$24 r2 = new com.squareup.leakcanary.AndroidExcludedRefs$24
            boolean r4 = r13.equals(r9)
            if (r4 == 0) goto L_0x021d
            r4 = 19
            if (r1 != r4) goto L_0x021d
            r4 = 1
            goto L_0x021e
        L_0x021d:
            r4 = 0
        L_0x021e:
            java.lang.String r15 = "RESOURCES__MCONTEXT"
            r29 = r3
            r3 = 23
            r2.<init>(r15, r3, r4)
            RESOURCES__MCONTEXT = r2
            com.squareup.leakcanary.AndroidExcludedRefs$25 r3 = new com.squareup.leakcanary.AndroidExcludedRefs$25
            r4 = 24
            boolean r15 = r13.equals(r9)
            if (r15 == 0) goto L_0x023b
            r15 = 19
            if (r1 != r15) goto L_0x023b
            r30 = r2
            r15 = 1
            goto L_0x023e
        L_0x023b:
            r30 = r2
            r15 = 0
        L_0x023e:
            java.lang.String r2 = "VIEW_CONFIGURATION__MCONTEXT"
            r3.<init>(r2, r4, r15)
            VIEW_CONFIGURATION__MCONTEXT = r3
            com.squareup.leakcanary.AndroidExcludedRefs$26 r2 = new com.squareup.leakcanary.AndroidExcludedRefs$26
            r4 = 25
            boolean r9 = r13.equals(r9)
            if (r9 == 0) goto L_0x0255
            r9 = 19
            if (r1 != r9) goto L_0x0255
            r9 = 1
            goto L_0x0256
        L_0x0255:
            r9 = 0
        L_0x0256:
            java.lang.String r13 = "AUDIO_MANAGER__MCONTEXT_STATIC"
            r2.<init>(r13, r4, r9)
            AUDIO_MANAGER__MCONTEXT_STATIC = r2
            com.squareup.leakcanary.AndroidExcludedRefs$27 r4 = new com.squareup.leakcanary.AndroidExcludedRefs$27
            r9 = 26
            r13 = 22
            if (r1 > r13) goto L_0x0267
            r1 = 1
            goto L_0x0268
        L_0x0267:
            r1 = 0
        L_0x0268:
            java.lang.String r13 = "AUDIO_MANAGER"
            r4.<init>(r13, r9, r1)
            AUDIO_MANAGER = r4
            com.squareup.leakcanary.AndroidExcludedRefs$28 r1 = new com.squareup.leakcanary.AndroidExcludedRefs$28
            r9 = 27
            java.lang.String r13 = "EDITTEXT_BLINK_MESSAGEQUEUE"
            r1.<init>(r13, r9)
            EDITTEXT_BLINK_MESSAGEQUEUE = r1
            com.squareup.leakcanary.AndroidExcludedRefs$29 r9 = new com.squareup.leakcanary.AndroidExcludedRefs$29
            r13 = 28
            java.lang.String r15 = "SERVICE_BINDER"
            r9.<init>(r15, r13)
            SERVICE_BINDER = r9
            com.squareup.leakcanary.AndroidExcludedRefs$30 r13 = new com.squareup.leakcanary.AndroidExcludedRefs$30
            r15 = 29
            r31 = r9
            java.lang.String r9 = "SOFT_REFERENCES"
            r13.<init>(r9, r15)
            SOFT_REFERENCES = r13
            com.squareup.leakcanary.AndroidExcludedRefs$31 r9 = new com.squareup.leakcanary.AndroidExcludedRefs$31
            r15 = 30
            r32 = r13
            java.lang.String r13 = "FINALIZER_WATCHDOG_DAEMON"
            r9.<init>(r13, r15)
            FINALIZER_WATCHDOG_DAEMON = r9
            com.squareup.leakcanary.AndroidExcludedRefs$32 r13 = new com.squareup.leakcanary.AndroidExcludedRefs$32
            r15 = 31
            r33 = r9
            java.lang.String r9 = "MAIN"
            r13.<init>(r9, r15)
            MAIN = r13
            com.squareup.leakcanary.AndroidExcludedRefs$33 r9 = new com.squareup.leakcanary.AndroidExcludedRefs$33
            r15 = 32
            r34 = r13
            java.lang.String r13 = "LEAK_CANARY_THREAD"
            r9.<init>(r13, r15)
            LEAK_CANARY_THREAD = r9
            com.squareup.leakcanary.AndroidExcludedRefs$34 r13 = new com.squareup.leakcanary.AndroidExcludedRefs$34
            r15 = 33
            r35 = r9
            java.lang.String r9 = "EVENT_RECEIVER__MMESSAGE_QUEUE"
            r13.<init>(r9, r15)
            EVENT_RECEIVER__MMESSAGE_QUEUE = r13
            r9 = 34
            com.squareup.leakcanary.AndroidExcludedRefs[] r9 = new com.squareup.leakcanary.AndroidExcludedRefs[r9]
            r15 = 0
            r9[r15] = r0
            r0 = 1
            r9[r0] = r6
            r0 = 2
            r9[r0] = r7
            r0 = 3
            r9[r0] = r8
            r0 = 4
            r9[r0] = r11
            r0 = 5
            r9[r0] = r12
            r0 = 6
            r9[r0] = r10
            r0 = 7
            r9[r0] = r5
            r0 = 8
            r9[r0] = r14
            r0 = 9
            r9[r0] = r22
            r0 = 10
            r9[r0] = r20
            r0 = 11
            r9[r0] = r16
            r0 = 12
            r9[r0] = r17
            r0 = 13
            r9[r0] = r18
            r0 = 14
            r9[r0] = r19
            r0 = 15
            r9[r0] = r21
            r0 = 16
            r9[r0] = r23
            r0 = 17
            r9[r0] = r24
            r0 = 18
            r9[r0] = r25
            r0 = 19
            r9[r0] = r27
            r0 = 20
            r9[r0] = r26
            r0 = 21
            r9[r0] = r28
            r0 = 22
            r9[r0] = r29
            r0 = 23
            r9[r0] = r30
            r0 = 24
            r9[r0] = r3
            r0 = 25
            r9[r0] = r2
            r0 = 26
            r9[r0] = r4
            r0 = 27
            r9[r0] = r1
            r0 = 28
            r9[r0] = r31
            r0 = 29
            r9[r0] = r32
            r0 = 30
            r9[r0] = r33
            r0 = 31
            r9[r0] = r34
            r0 = 32
            r9[r0] = r35
            r0 = 33
            r9[r0] = r13
            $VALUES = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.leakcanary.AndroidExcludedRefs.<clinit>():void");
    }

    private AndroidExcludedRefs(boolean z) {
        this.applies = z;
    }

    public static ExcludedRefs.Builder createAndroidDefaults() {
        return createBuilder(EnumSet.of(SOFT_REFERENCES, new AndroidExcludedRefs[]{FINALIZER_WATCHDOG_DAEMON, MAIN, LEAK_CANARY_THREAD, EVENT_RECEIVER__MMESSAGE_QUEUE, SERVICE_BINDER}));
    }

    public static ExcludedRefs.Builder createAppDefaults() {
        return createBuilder(EnumSet.allOf(AndroidExcludedRefs.class));
    }

    public static ExcludedRefs.Builder createBuilder(EnumSet<AndroidExcludedRefs> enumSet) {
        ExcludedRefs.Builder builder = ExcludedRefs.builder();
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            AndroidExcludedRefs androidExcludedRefs = (AndroidExcludedRefs) it.next();
            if (androidExcludedRefs.applies) {
                androidExcludedRefs.add(builder);
                ((ExcludedRefs.BuilderWithParams) builder).named(androidExcludedRefs.name());
            }
        }
        return builder;
    }

    /* access modifiers changed from: package-private */
    public abstract void add(ExcludedRefs.Builder builder);
}
