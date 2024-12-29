package androidx.transition;

import android.animation.Animator;
import android.animation.LayoutTransition;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ViewGroupUtilsApi14 {
    private static final int LAYOUT_TRANSITION_CHANGING = 4;
    private static final String TAG = "ViewGroupUtilsApi14";
    private static Method sCancelMethod;
    private static boolean sCancelMethodFetched;
    private static LayoutTransition sEmptyLayoutTransition;
    private static Field sLayoutSuppressedField;
    private static boolean sLayoutSuppressedFieldFetched;

    private ViewGroupUtilsApi14() {
    }

    private static void cancelLayoutTransition(LayoutTransition layoutTransition) {
        if (!sCancelMethodFetched) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                sCancelMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            sCancelMethodFetched = true;
        }
        Method method = sCancelMethod;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
    }

    static void suppressLayout(@NonNull ViewGroup viewGroup, boolean z) {
        LayoutTransition layoutTransition;
        boolean z2 = false;
        if (sEmptyLayoutTransition == null) {
            C04151 r0 = new LayoutTransition() {
                public boolean isChangingLayout() {
                    return true;
                }
            };
            sEmptyLayoutTransition = r0;
            r0.setAnimator(2, (Animator) null);
            sEmptyLayoutTransition.setAnimator(0, (Animator) null);
            sEmptyLayoutTransition.setAnimator(1, (Animator) null);
            sEmptyLayoutTransition.setAnimator(3, (Animator) null);
            sEmptyLayoutTransition.setAnimator(4, (Animator) null);
        }
        if (z) {
            LayoutTransition layoutTransition2 = viewGroup.getLayoutTransition();
            if (layoutTransition2 != null) {
                if (layoutTransition2.isRunning()) {
                    cancelLayoutTransition(layoutTransition2);
                }
                if (layoutTransition2 != sEmptyLayoutTransition) {
                    viewGroup.setTag(C0401R.C0403id.transition_layout_save, layoutTransition2);
                }
            }
            layoutTransition = sEmptyLayoutTransition;
        } else {
            viewGroup.setLayoutTransition((LayoutTransition) null);
            if (!sLayoutSuppressedFieldFetched) {
                try {
                    Field declaredField = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                    sLayoutSuppressedField = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                sLayoutSuppressedFieldFetched = true;
            }
            Field field = sLayoutSuppressedField;
            if (field != null) {
                try {
                    boolean z3 = field.getBoolean(viewGroup);
                    if (z3) {
                        try {
                            sLayoutSuppressedField.setBoolean(viewGroup, false);
                        } catch (IllegalAccessException unused2) {
                        }
                    }
                    z2 = z3;
                } catch (IllegalAccessException unused3) {
                }
            }
            if (z2) {
                viewGroup.requestLayout();
            }
            layoutTransition = (LayoutTransition) viewGroup.getTag(C0401R.C0403id.transition_layout_save);
            if (layoutTransition != null) {
                viewGroup.setTag(C0401R.C0403id.transition_layout_save, (Object) null);
            } else {
                return;
            }
        }
        viewGroup.setLayoutTransition(layoutTransition);
    }
}
