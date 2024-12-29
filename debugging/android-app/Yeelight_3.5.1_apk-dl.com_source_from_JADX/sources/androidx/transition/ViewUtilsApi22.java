package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(22)
class ViewUtilsApi22 extends ViewUtilsApi21 {
    private static final String TAG = "ViewUtilsApi22";
    private static Method sSetLeftTopRightBottomMethod;
    private static boolean sSetLeftTopRightBottomMethodFetched;

    ViewUtilsApi22() {
    }

    @SuppressLint({"PrivateApi"})
    private void fetchSetLeftTopRightBottomMethod() {
        if (!sSetLeftTopRightBottomMethodFetched) {
            Class<View> cls = View.class;
            try {
                Class cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("setLeftTopRightBottom", new Class[]{cls2, cls2, cls2, cls2});
                sSetLeftTopRightBottomMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            sSetLeftTopRightBottomMethodFetched = true;
        }
    }

    public void setLeftTopRightBottom(View view, int i, int i2, int i3, int i4) {
        fetchSetLeftTopRightBottomMethod();
        Method method = sSetLeftTopRightBottomMethod;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }
}
