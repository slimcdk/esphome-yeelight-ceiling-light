package android.support.p002v4.media;

import android.media.browse.MediaBrowser;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@RequiresApi(21)
/* renamed from: android.support.v4.media.ParceledListSliceAdapterApi21 */
class ParceledListSliceAdapterApi21 {
    private static Constructor sConstructor;

    static {
        try {
            sConstructor = Class.forName("android.content.pm.ParceledListSlice").getConstructor(new Class[]{List.class});
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    private ParceledListSliceAdapterApi21() {
    }

    static Object newInstance(List<MediaBrowser.MediaItem> list) {
        try {
            return sConstructor.newInstance(new Object[]{list});
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }
}
