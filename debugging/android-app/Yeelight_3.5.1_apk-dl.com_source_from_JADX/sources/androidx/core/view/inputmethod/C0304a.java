package androidx.core.view.inputmethod;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.inputmethod.InputConnectionCompat;

/* renamed from: androidx.core.view.inputmethod.a */
public final /* synthetic */ class C0304a implements InputConnectionCompat.OnCommitContentListener {

    /* renamed from: a */
    public final /* synthetic */ View f160a;

    public /* synthetic */ C0304a(View view) {
        this.f160a = view;
    }

    public final boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
        return InputConnectionCompat.lambda$createOnCommitContentListenerUsingPerformReceiveContent$0(this.f160a, inputContentInfoCompat, i, bundle);
    }
}
