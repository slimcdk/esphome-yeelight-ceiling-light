package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(21)
class GhostViewApi21 implements GhostViewImpl {
    private static final String TAG = "GhostViewApi21";
    private static Method sAddGhostMethod;
    private static boolean sAddGhostMethodFetched;
    private static Class<?> sGhostViewClass;
    private static boolean sGhostViewClassFetched;
    private static Method sRemoveGhostMethod;
    private static boolean sRemoveGhostMethodFetched;
    private final View mGhostView;

    private GhostViewApi21(@NonNull View view) {
        this.mGhostView = view;
    }

    static GhostViewImpl addGhost(View view, ViewGroup viewGroup, Matrix matrix) {
        fetchAddGhostMethod();
        Method method = sAddGhostMethod;
        if (method != null) {
            try {
                return new GhostViewApi21((View) method.invoke((Object) null, new Object[]{view, viewGroup, matrix}));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return null;
    }

    private static void fetchAddGhostMethod() {
        if (!sAddGhostMethodFetched) {
            try {
                fetchGhostViewClass();
                Method declaredMethod = sGhostViewClass.getDeclaredMethod("addGhost", new Class[]{View.class, ViewGroup.class, Matrix.class});
                sAddGhostMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            sAddGhostMethodFetched = true;
        }
    }

    private static void fetchGhostViewClass() {
        if (!sGhostViewClassFetched) {
            try {
                sGhostViewClass = Class.forName("android.view.GhostView");
            } catch (ClassNotFoundException unused) {
            }
            sGhostViewClassFetched = true;
        }
    }

    private static void fetchRemoveGhostMethod() {
        if (!sRemoveGhostMethodFetched) {
            try {
                fetchGhostViewClass();
                Method declaredMethod = sGhostViewClass.getDeclaredMethod("removeGhost", new Class[]{View.class});
                sRemoveGhostMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            sRemoveGhostMethodFetched = true;
        }
    }

    static void removeGhost(View view) {
        fetchRemoveGhostMethod();
        Method method = sRemoveGhostMethod;
        if (method != null) {
            try {
                method.invoke((Object) null, new Object[]{view});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    public void reserveEndViewTransition(ViewGroup viewGroup, View view) {
    }

    public void setVisibility(int i) {
        this.mGhostView.setVisibility(i);
    }
}
