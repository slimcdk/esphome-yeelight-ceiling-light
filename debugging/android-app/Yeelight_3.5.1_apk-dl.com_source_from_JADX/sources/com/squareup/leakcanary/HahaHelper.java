package com.squareup.leakcanary;

import com.squareup.haha.perflib.ArrayInstance;
import com.squareup.haha.perflib.ClassInstance;
import com.squareup.haha.perflib.ClassObj;
import com.squareup.haha.perflib.Field;
import com.squareup.haha.perflib.Instance;
import com.squareup.haha.perflib.Type;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class HahaHelper {
    private static final Set<String> WRAPPER_TYPES = new HashSet(Arrays.asList(new String[]{Boolean.class.getName(), Character.class.getName(), Float.class.getName(), Double.class.getName(), Byte.class.getName(), Short.class.getName(), Integer.class.getName(), Long.class.getName()}));

    private HahaHelper() {
        throw new AssertionError();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r0v4, types: [com.squareup.haha.perflib.Instance, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String asString(java.lang.Object r9) {
        /*
            com.squareup.haha.perflib.Instance r9 = (com.squareup.haha.perflib.Instance) r9
            java.util.List r0 = classInstanceValues(r9)
            java.lang.String r1 = "count"
            java.lang.Object r2 = fieldValue(r0, r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.String r3 = "value"
            java.lang.Object r3 = fieldValue(r0, r3)
            boolean r4 = isCharArray(r3)
            r5 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "offset"
            if (r4 == 0) goto L_0x0031
            com.squareup.haha.perflib.ArrayInstance r3 = (com.squareup.haha.perflib.ArrayInstance) r3
            boolean r9 = hasField(r0, r6)
            if (r9 == 0) goto L_0x0049
            java.lang.Object r9 = fieldValue(r0, r6)
            r5 = r9
            java.lang.Integer r5 = (java.lang.Integer) r5
            goto L_0x0049
        L_0x0031:
            com.squareup.haha.perflib.Heap r0 = r9.getHeap()
            long r3 = r9.getId()
            r7 = 16
            long r3 = r3 + r7
            com.squareup.haha.perflib.Instance r0 = r0.getInstance(r3)
            boolean r3 = isCharArray(r0)
            if (r3 == 0) goto L_0x006f
            r3 = r0
            com.squareup.haha.perflib.ArrayInstance r3 = (com.squareup.haha.perflib.ArrayInstance) r3
        L_0x0049:
            com.squareup.leakcanary.Preconditions.checkNotNull(r2, r1)
            java.lang.String r9 = "charArray"
            com.squareup.leakcanary.Preconditions.checkNotNull(r3, r9)
            com.squareup.leakcanary.Preconditions.checkNotNull(r5, r6)
            int r9 = r2.intValue()
            if (r9 != 0) goto L_0x005d
            java.lang.String r9 = ""
            return r9
        L_0x005d:
            int r9 = r5.intValue()
            int r0 = r2.intValue()
            char[] r9 = r3.asCharArray(r9, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r9)
            return r0
        L_0x006f:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not find char array in "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.leakcanary.HahaHelper.asString(java.lang.Object):java.lang.String");
    }

    static List<ClassInstance.FieldValue> classInstanceValues(Instance instance) {
        return ((ClassInstance) instance).getValues();
    }

    static boolean extendsThread(ClassObj classObj) {
        for (ClassObj classObj2 = classObj; classObj2.getSuperClassObj() != null; classObj2 = classObj2.getSuperClassObj()) {
            if (classObj.getClassName().equals(Thread.class.getName())) {
                return true;
            }
        }
        return false;
    }

    static String fieldToString(ClassInstance.FieldValue fieldValue) {
        return fieldToString(fieldValue.getField(), fieldValue.getValue());
    }

    static String fieldToString(Field field, Object obj) {
        return field.getName() + " = " + obj;
    }

    static String fieldToString(Map.Entry<Field, Object> entry) {
        return fieldToString(entry.getKey(), entry.getValue());
    }

    static <T> T fieldValue(List<ClassInstance.FieldValue> list, String str) {
        for (ClassInstance.FieldValue next : list) {
            if (next.getField().getName().equals(str)) {
                return next.getValue();
            }
        }
        throw new IllegalArgumentException("Field " + str + " does not exists");
    }

    static boolean hasField(List<ClassInstance.FieldValue> list, String str) {
        for (ClassInstance.FieldValue field : list) {
            if (field.getField().getName().equals(str)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isCharArray(Object obj) {
        return (obj instanceof ArrayInstance) && ((ArrayInstance) obj).getArrayType() == Type.CHAR;
    }

    public static boolean isPrimitiveOrWrapperArray(Object obj) {
        if (!(obj instanceof ArrayInstance)) {
            return false;
        }
        ArrayInstance arrayInstance = (ArrayInstance) obj;
        if (arrayInstance.getArrayType() != Type.OBJECT) {
            return true;
        }
        return WRAPPER_TYPES.contains(arrayInstance.getClassObj().getClassName());
    }

    public static boolean isPrimitiveWrapper(Object obj) {
        if (!(obj instanceof ClassInstance)) {
            return false;
        }
        return WRAPPER_TYPES.contains(((ClassInstance) obj).getClassObj().getClassName());
    }

    static String threadName(Instance instance) {
        return asString(fieldValue(classInstanceValues(instance), "name"));
    }
}
