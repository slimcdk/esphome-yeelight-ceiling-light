package androidx.core.widget;

import android.os.Build;
import android.view.View;
import android.widget.ListView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

public final class ListViewCompat {

    @RequiresApi(19)
    static class Api19Impl {
        private Api19Impl() {
        }

        @DoNotInline
        static boolean canScrollList(ListView listView, int i) {
            return listView.canScrollList(i);
        }

        @DoNotInline
        static void scrollListBy(ListView listView, int i) {
            listView.scrollListBy(i);
        }
    }

    private ListViewCompat() {
    }

    public static boolean canScrollList(@NonNull ListView listView, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Api19Impl.canScrollList(listView, i);
        }
        int childCount = listView.getChildCount();
        if (childCount == 0) {
            return false;
        }
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (i > 0) {
            return firstVisiblePosition + childCount < listView.getCount() || listView.getChildAt(childCount + -1).getBottom() > listView.getHeight() - listView.getListPaddingBottom();
        }
        return firstVisiblePosition > 0 || listView.getChildAt(0).getTop() < listView.getListPaddingTop();
    }

    public static void scrollListBy(@NonNull ListView listView, int i) {
        View childAt;
        if (Build.VERSION.SDK_INT >= 19) {
            Api19Impl.scrollListBy(listView, i);
            return;
        }
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (firstVisiblePosition != -1 && (childAt = listView.getChildAt(0)) != null) {
            listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i);
        }
    }
}
