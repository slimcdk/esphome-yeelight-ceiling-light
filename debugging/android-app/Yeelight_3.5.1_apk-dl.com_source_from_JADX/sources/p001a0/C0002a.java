package p001a0;

import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import java.util.Comparator;

/* renamed from: a0.a */
public final /* synthetic */ class C0002a implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C0002a f0a = new C0002a();

    private /* synthetic */ C0002a() {
    }

    public final int compare(Object obj, Object obj2) {
        Feature feature = (Feature) obj;
        Feature feature2 = (Feature) obj2;
        Parcelable.Creator<ApiFeatureRequest> creator = ApiFeatureRequest.CREATOR;
        return !feature.getName().equals(feature2.getName()) ? feature.getName().compareTo(feature2.getName()) : (feature.mo11760V() > feature2.mo11760V() ? 1 : (feature.mo11760V() == feature2.mo11760V() ? 0 : -1));
    }
}
