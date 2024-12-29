package com.inuker.bluetooth.library.utils.hook.utils;

import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

public class MemberUtils {
    static boolean isAccessible(Member member) {
        return member != null && Modifier.isPublic(member.getModifiers()) && !member.isSynthetic();
    }
}
