package androidx.core.view;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public final class ContentInfoCompat {
    public static final int FLAG_CONVERT_TO_PLAIN_TEXT = 1;
    public static final int SOURCE_APP = 0;
    public static final int SOURCE_AUTOFILL = 4;
    public static final int SOURCE_CLIPBOARD = 1;
    public static final int SOURCE_DRAG_AND_DROP = 3;
    public static final int SOURCE_INPUT_METHOD = 2;
    public static final int SOURCE_PROCESS_TEXT = 5;
    @NonNull
    private final Compat mCompat;

    @RequiresApi(31)
    private static final class Api31Impl {
        private Api31Impl() {
        }

        @DoNotInline
        @NonNull
        public static Pair<ContentInfo, ContentInfo> partition(@NonNull ContentInfo contentInfo, @NonNull Predicate<ClipData.Item> predicate) {
            ClipData clip = contentInfo.getClip();
            if (clip.getItemCount() == 1) {
                boolean test = predicate.test(clip.getItemAt(0));
                ContentInfo contentInfo2 = test ? contentInfo : null;
                if (test) {
                    contentInfo = null;
                }
                return Pair.create(contentInfo2, contentInfo);
            }
            Objects.requireNonNull(predicate);
            Pair<ClipData, ClipData> partition = ContentInfoCompat.partition(clip, (androidx.core.util.Predicate<ClipData.Item>) new C0293a(predicate));
            return partition.first == null ? Pair.create((Object) null, contentInfo) : partition.second == null ? Pair.create(contentInfo, (Object) null) : Pair.create(new ContentInfo.Builder(contentInfo).setClip((ClipData) partition.first).build(), new ContentInfo.Builder(contentInfo).setClip((ClipData) partition.second).build());
        }
    }

    public static final class Builder {
        @NonNull
        private final BuilderCompat mBuilderCompat;

        public Builder(@NonNull ClipData clipData, int i) {
            this.mBuilderCompat = Build.VERSION.SDK_INT >= 31 ? new BuilderCompat31Impl(clipData, i) : new BuilderCompatImpl(clipData, i);
        }

        public Builder(@NonNull ContentInfoCompat contentInfoCompat) {
            this.mBuilderCompat = Build.VERSION.SDK_INT >= 31 ? new BuilderCompat31Impl(contentInfoCompat) : new BuilderCompatImpl(contentInfoCompat);
        }

        @NonNull
        public ContentInfoCompat build() {
            return this.mBuilderCompat.build();
        }

        @NonNull
        public Builder setClip(@NonNull ClipData clipData) {
            this.mBuilderCompat.setClip(clipData);
            return this;
        }

        @NonNull
        public Builder setExtras(@Nullable Bundle bundle) {
            this.mBuilderCompat.setExtras(bundle);
            return this;
        }

        @NonNull
        public Builder setFlags(int i) {
            this.mBuilderCompat.setFlags(i);
            return this;
        }

        @NonNull
        public Builder setLinkUri(@Nullable Uri uri) {
            this.mBuilderCompat.setLinkUri(uri);
            return this;
        }

        @NonNull
        public Builder setSource(int i) {
            this.mBuilderCompat.setSource(i);
            return this;
        }
    }

    private interface BuilderCompat {
        @NonNull
        ContentInfoCompat build();

        void setClip(@NonNull ClipData clipData);

        void setExtras(@Nullable Bundle bundle);

        void setFlags(int i);

        void setLinkUri(@Nullable Uri uri);

        void setSource(int i);
    }

    @RequiresApi(31)
    private static final class BuilderCompat31Impl implements BuilderCompat {
        @NonNull
        private final ContentInfo.Builder mPlatformBuilder;

        BuilderCompat31Impl(@NonNull ClipData clipData, int i) {
            this.mPlatformBuilder = new ContentInfo.Builder(clipData, i);
        }

        BuilderCompat31Impl(@NonNull ContentInfoCompat contentInfoCompat) {
            this.mPlatformBuilder = new ContentInfo.Builder(contentInfoCompat.toContentInfo());
        }

        @NonNull
        public ContentInfoCompat build() {
            return new ContentInfoCompat(new Compat31Impl(this.mPlatformBuilder.build()));
        }

        public void setClip(@NonNull ClipData clipData) {
            this.mPlatformBuilder.setClip(clipData);
        }

        public void setExtras(@Nullable Bundle bundle) {
            this.mPlatformBuilder.setExtras(bundle);
        }

        public void setFlags(int i) {
            this.mPlatformBuilder.setFlags(i);
        }

        public void setLinkUri(@Nullable Uri uri) {
            this.mPlatformBuilder.setLinkUri(uri);
        }

        public void setSource(int i) {
            this.mPlatformBuilder.setSource(i);
        }
    }

    private static final class BuilderCompatImpl implements BuilderCompat {
        @NonNull
        ClipData mClip;
        @Nullable
        Bundle mExtras;
        int mFlags;
        @Nullable
        Uri mLinkUri;
        int mSource;

        BuilderCompatImpl(@NonNull ClipData clipData, int i) {
            this.mClip = clipData;
            this.mSource = i;
        }

        BuilderCompatImpl(@NonNull ContentInfoCompat contentInfoCompat) {
            this.mClip = contentInfoCompat.getClip();
            this.mSource = contentInfoCompat.getSource();
            this.mFlags = contentInfoCompat.getFlags();
            this.mLinkUri = contentInfoCompat.getLinkUri();
            this.mExtras = contentInfoCompat.getExtras();
        }

        @NonNull
        public ContentInfoCompat build() {
            return new ContentInfoCompat(new CompatImpl(this));
        }

        public void setClip(@NonNull ClipData clipData) {
            this.mClip = clipData;
        }

        public void setExtras(@Nullable Bundle bundle) {
            this.mExtras = bundle;
        }

        public void setFlags(int i) {
            this.mFlags = i;
        }

        public void setLinkUri(@Nullable Uri uri) {
            this.mLinkUri = uri;
        }

        public void setSource(int i) {
            this.mSource = i;
        }
    }

    private interface Compat {
        @NonNull
        ClipData getClip();

        @Nullable
        Bundle getExtras();

        int getFlags();

        @Nullable
        Uri getLinkUri();

        int getSource();

        @Nullable
        ContentInfo getWrapped();
    }

    @RequiresApi(31)
    private static final class Compat31Impl implements Compat {
        @NonNull
        private final ContentInfo mWrapped;

        Compat31Impl(@NonNull ContentInfo contentInfo) {
            this.mWrapped = (ContentInfo) Preconditions.checkNotNull(contentInfo);
        }

        @NonNull
        public ClipData getClip() {
            return this.mWrapped.getClip();
        }

        @Nullable
        public Bundle getExtras() {
            return this.mWrapped.getExtras();
        }

        public int getFlags() {
            return this.mWrapped.getFlags();
        }

        @Nullable
        public Uri getLinkUri() {
            return this.mWrapped.getLinkUri();
        }

        public int getSource() {
            return this.mWrapped.getSource();
        }

        @NonNull
        public ContentInfo getWrapped() {
            return this.mWrapped;
        }

        @NonNull
        public String toString() {
            return "ContentInfoCompat{" + this.mWrapped + "}";
        }
    }

    private static final class CompatImpl implements Compat {
        @NonNull
        private final ClipData mClip;
        @Nullable
        private final Bundle mExtras;
        private final int mFlags;
        @Nullable
        private final Uri mLinkUri;
        private final int mSource;

        CompatImpl(BuilderCompatImpl builderCompatImpl) {
            this.mClip = (ClipData) Preconditions.checkNotNull(builderCompatImpl.mClip);
            this.mSource = Preconditions.checkArgumentInRange(builderCompatImpl.mSource, 0, 5, "source");
            this.mFlags = Preconditions.checkFlagsArgument(builderCompatImpl.mFlags, 1);
            this.mLinkUri = builderCompatImpl.mLinkUri;
            this.mExtras = builderCompatImpl.mExtras;
        }

        @NonNull
        public ClipData getClip() {
            return this.mClip;
        }

        @Nullable
        public Bundle getExtras() {
            return this.mExtras;
        }

        public int getFlags() {
            return this.mFlags;
        }

        @Nullable
        public Uri getLinkUri() {
            return this.mLinkUri;
        }

        public int getSource() {
            return this.mSource;
        }

        @Nullable
        public ContentInfo getWrapped() {
            return null;
        }

        @NonNull
        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.mClip.getDescription());
            sb.append(", source=");
            sb.append(ContentInfoCompat.sourceToString(this.mSource));
            sb.append(", flags=");
            sb.append(ContentInfoCompat.flagsToString(this.mFlags));
            String str2 = "";
            if (this.mLinkUri == null) {
                str = str2;
            } else {
                str = ", hasLinkUri(" + this.mLinkUri.toString().length() + ")";
            }
            sb.append(str);
            if (this.mExtras != null) {
                str2 = ", hasExtras";
            }
            sb.append(str2);
            sb.append("}");
            return sb.toString();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Source {
    }

    ContentInfoCompat(@NonNull Compat compat) {
        this.mCompat = compat;
    }

    @NonNull
    static ClipData buildClipData(@NonNull ClipDescription clipDescription, @NonNull List<ClipData.Item> list) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), list.get(0));
        for (int i = 1; i < list.size(); i++) {
            clipData.addItem(list.get(i));
        }
        return clipData;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    static String flagsToString(int i) {
        return (i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i);
    }

    @NonNull
    static Pair<ClipData, ClipData> partition(@NonNull ClipData clipData, @NonNull androidx.core.util.Predicate<ClipData.Item> predicate) {
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i = 0; i < clipData.getItemCount(); i++) {
            ClipData.Item itemAt = clipData.getItemAt(i);
            if (predicate.test(itemAt)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(itemAt);
            }
        }
        return arrayList == null ? Pair.create((Object) null, clipData) : arrayList2 == null ? Pair.create(clipData, (Object) null) : Pair.create(buildClipData(clipData.getDescription(), arrayList), buildClipData(clipData.getDescription(), arrayList2));
    }

    @RequiresApi(31)
    @NonNull
    public static Pair<ContentInfo, ContentInfo> partition(@NonNull ContentInfo contentInfo, @NonNull Predicate<ClipData.Item> predicate) {
        return Api31Impl.partition(contentInfo, predicate);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    static String sourceToString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    @RequiresApi(31)
    @NonNull
    public static ContentInfoCompat toContentInfoCompat(@NonNull ContentInfo contentInfo) {
        return new ContentInfoCompat(new Compat31Impl(contentInfo));
    }

    @NonNull
    public ClipData getClip() {
        return this.mCompat.getClip();
    }

    @Nullable
    public Bundle getExtras() {
        return this.mCompat.getExtras();
    }

    public int getFlags() {
        return this.mCompat.getFlags();
    }

    @Nullable
    public Uri getLinkUri() {
        return this.mCompat.getLinkUri();
    }

    public int getSource() {
        return this.mCompat.getSource();
    }

    @NonNull
    public Pair<ContentInfoCompat, ContentInfoCompat> partition(@NonNull androidx.core.util.Predicate<ClipData.Item> predicate) {
        ClipData clip = this.mCompat.getClip();
        ContentInfoCompat contentInfoCompat = null;
        if (clip.getItemCount() == 1) {
            boolean test = predicate.test(clip.getItemAt(0));
            ContentInfoCompat contentInfoCompat2 = test ? this : null;
            if (!test) {
                contentInfoCompat = this;
            }
            return Pair.create(contentInfoCompat2, contentInfoCompat);
        }
        Pair<ClipData, ClipData> partition = partition(clip, predicate);
        return partition.first == null ? Pair.create((Object) null, this) : partition.second == null ? Pair.create(this, (Object) null) : Pair.create(new Builder(this).setClip((ClipData) partition.first).build(), new Builder(this).setClip((ClipData) partition.second).build());
    }

    @RequiresApi(31)
    @NonNull
    public ContentInfo toContentInfo() {
        ContentInfo wrapped = this.mCompat.getWrapped();
        Objects.requireNonNull(wrapped);
        return wrapped;
    }

    @NonNull
    public String toString() {
        return this.mCompat.toString();
    }
}
