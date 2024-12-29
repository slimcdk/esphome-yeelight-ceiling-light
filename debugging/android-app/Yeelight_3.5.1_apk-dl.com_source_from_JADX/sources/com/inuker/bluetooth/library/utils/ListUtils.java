package com.inuker.bluetooth.library.utils;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {
    public static <E> List<E> getEmptyList() {
        return new ArrayList();
    }

    public static boolean isEmpty(List<?> list) {
        return list == null || list.size() <= 0;
    }
}
