package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.ArraySet;
import androidx.core.app.NotificationCompat;
import androidx.core.content.LocusIdCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
class NotificationCompatBuilder implements NotificationBuilderWithBuilderAccessor {
    private final List<Bundle> mActionExtrasList = new ArrayList();
    private RemoteViews mBigContentView;
    private final Notification.Builder mBuilder;
    private final NotificationCompat.Builder mBuilderCompat;
    private RemoteViews mContentView;
    private final Context mContext;
    private final Bundle mExtras = new Bundle();
    private int mGroupAlertBehavior;
    private RemoteViews mHeadsUpContentView;

    NotificationCompatBuilder(NotificationCompat.Builder builder) {
        Notification.Builder builder2;
        int i;
        Icon icon;
        List<String> combineLists;
        String str;
        Bundle bundle;
        this.mBuilderCompat = builder;
        this.mContext = builder.mContext;
        int i2 = Build.VERSION.SDK_INT;
        Context context = builder.mContext;
        if (i2 >= 26) {
            String str2 = builder.mChannelId;
        } else {
            builder2 = new Notification.Builder(context);
        }
        this.mBuilder = builder2;
        Notification notification = builder.mNotification;
        this.mBuilder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, builder.mTickerView).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(builder.mContentTitle).setContentText(builder.mContentText).setContentInfo(builder.mContentInfo).setContentIntent(builder.mContentIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(builder.mFullScreenIntent, (notification.flags & 128) != 0).setLargeIcon(builder.mLargeIcon).setNumber(builder.mNumber).setProgress(builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate);
        if (i2 < 21) {
            this.mBuilder.setSound(notification.sound, notification.audioStreamType);
        }
        if (i2 >= 16) {
            this.mBuilder.setSubText(builder.mSubText).setUsesChronometer(builder.mUseChronometer).setPriority(builder.mPriority);
            Iterator<NotificationCompat.Action> it = builder.mActions.iterator();
            while (it.hasNext()) {
                addAction(it.next());
            }
            Bundle bundle2 = builder.mExtras;
            if (bundle2 != null) {
                this.mExtras.putAll(bundle2);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (builder.mLocalOnly) {
                    this.mExtras.putBoolean(NotificationCompatExtras.EXTRA_LOCAL_ONLY, true);
                }
                String str3 = builder.mGroupKey;
                if (str3 != null) {
                    this.mExtras.putString(NotificationCompatExtras.EXTRA_GROUP_KEY, str3);
                    if (builder.mGroupSummary) {
                        bundle = this.mExtras;
                        str = NotificationCompatExtras.EXTRA_GROUP_SUMMARY;
                    } else {
                        bundle = this.mExtras;
                        str = NotificationManagerCompat.EXTRA_USE_SIDE_CHANNEL;
                    }
                    bundle.putBoolean(str, true);
                }
                String str4 = builder.mSortKey;
                if (str4 != null) {
                    this.mExtras.putString(NotificationCompatExtras.EXTRA_SORT_KEY, str4);
                }
            }
            this.mContentView = builder.mContentView;
            this.mBigContentView = builder.mBigContentView;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 17) {
            this.mBuilder.setShowWhen(builder.mShowWhen);
        }
        if (i3 >= 19 && i3 < 21 && (combineLists = combineLists(getPeople(builder.mPersonList), builder.mPeople)) != null && !combineLists.isEmpty()) {
            this.mExtras.putStringArray(NotificationCompat.EXTRA_PEOPLE, (String[]) combineLists.toArray(new String[combineLists.size()]));
        }
        if (i3 >= 20) {
            this.mBuilder.setLocalOnly(builder.mLocalOnly).setGroup(builder.mGroupKey).setGroupSummary(builder.mGroupSummary).setSortKey(builder.mSortKey);
            this.mGroupAlertBehavior = builder.mGroupAlertBehavior;
        }
        if (i3 >= 21) {
            this.mBuilder.setCategory(builder.mCategory).setColor(builder.mColor).setVisibility(builder.mVisibility).setPublicVersion(builder.mPublicVersion).setSound(notification.sound, notification.audioAttributes);
            List<String> combineLists2 = i3 < 28 ? combineLists(getPeople(builder.mPersonList), builder.mPeople) : builder.mPeople;
            if (combineLists2 != null && !combineLists2.isEmpty()) {
                for (String addPerson : combineLists2) {
                    this.mBuilder.addPerson(addPerson);
                }
            }
            this.mHeadsUpContentView = builder.mHeadsUpContentView;
            if (builder.mInvisibleActions.size() > 0) {
                Bundle bundle3 = builder.getExtras().getBundle("android.car.EXTENSIONS");
                bundle3 = bundle3 == null ? new Bundle() : bundle3;
                Bundle bundle4 = new Bundle(bundle3);
                Bundle bundle5 = new Bundle();
                for (int i4 = 0; i4 < builder.mInvisibleActions.size(); i4++) {
                    bundle5.putBundle(Integer.toString(i4), NotificationCompatJellybean.getBundleForAction(builder.mInvisibleActions.get(i4)));
                }
                bundle3.putBundle("invisible_actions", bundle5);
                bundle4.putBundle("invisible_actions", bundle5);
                builder.getExtras().putBundle("android.car.EXTENSIONS", bundle3);
                this.mExtras.putBundle("android.car.EXTENSIONS", bundle4);
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 23 && (icon = builder.mSmallIcon) != null) {
            this.mBuilder.setSmallIcon(icon);
        }
        if (i5 >= 24) {
            this.mBuilder.setExtras(builder.mExtras).setRemoteInputHistory(builder.mRemoteInputHistory);
            RemoteViews remoteViews = builder.mContentView;
            if (remoteViews != null) {
                this.mBuilder.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = builder.mBigContentView;
            if (remoteViews2 != null) {
                this.mBuilder.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = builder.mHeadsUpContentView;
            if (remoteViews3 != null) {
                this.mBuilder.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i5 >= 26) {
            this.mBuilder.setBadgeIconType(builder.mBadgeIcon).setSettingsText(builder.mSettingsText).setShortcutId(builder.mShortcutId).setTimeoutAfter(builder.mTimeout).setGroupAlertBehavior(builder.mGroupAlertBehavior);
            if (builder.mColorizedSet) {
                this.mBuilder.setColorized(builder.mColorized);
            }
            if (!TextUtils.isEmpty(builder.mChannelId)) {
                this.mBuilder.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (i5 >= 28) {
            Iterator<Person> it2 = builder.mPersonList.iterator();
            while (it2.hasNext()) {
                this.mBuilder.addPerson(it2.next().toAndroidPerson());
            }
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            this.mBuilder.setAllowSystemGeneratedContextualActions(builder.mAllowSystemGeneratedContextualActions);
            this.mBuilder.setBubbleMetadata(NotificationCompat.BubbleMetadata.toPlatform(builder.mBubbleMetadata));
            LocusIdCompat locusIdCompat = builder.mLocusId;
            if (locusIdCompat != null) {
                this.mBuilder.setLocusId(locusIdCompat.toLocusId());
            }
        }
        if (i6 >= 31 && (i = builder.mFgsDeferBehavior) != 0) {
            this.mBuilder.setForegroundServiceBehavior(i);
        }
        if (builder.mSilent) {
            if (this.mBuilderCompat.mGroupSummary) {
                this.mGroupAlertBehavior = 2;
            } else {
                this.mGroupAlertBehavior = 1;
            }
            this.mBuilder.setVibrate((long[]) null);
            this.mBuilder.setSound((Uri) null);
            int i7 = notification.defaults & -2;
            notification.defaults = i7;
            int i8 = i7 & -3;
            notification.defaults = i8;
            this.mBuilder.setDefaults(i8);
            if (i6 >= 26) {
                if (TextUtils.isEmpty(this.mBuilderCompat.mGroupKey)) {
                    this.mBuilder.setGroup(NotificationCompat.GROUP_KEY_SILENT);
                }
                this.mBuilder.setGroupAlertBehavior(this.mGroupAlertBehavior);
            }
        }
    }

    private void addAction(NotificationCompat.Action action) {
        Notification.Action.Builder builder;
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            IconCompat iconCompat = action.getIconCompat();
            if (i >= 23) {
                builder = new Notification.Action.Builder(iconCompat != null ? iconCompat.toIcon() : null, action.getTitle(), action.getActionIntent());
            } else {
                builder = new Notification.Action.Builder(iconCompat != null ? iconCompat.getResId() : 0, action.getTitle(), action.getActionIntent());
            }
            if (action.getRemoteInputs() != null) {
                for (RemoteInput addRemoteInput : RemoteInput.fromCompat(action.getRemoteInputs())) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            Bundle bundle = action.getExtras() != null ? new Bundle(action.getExtras()) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 24) {
                builder.setAllowGeneratedReplies(action.getAllowGeneratedReplies());
            }
            bundle.putInt("android.support.action.semanticAction", action.getSemanticAction());
            if (i2 >= 28) {
                builder.setSemanticAction(action.getSemanticAction());
            }
            if (i2 >= 29) {
                builder.setContextual(action.isContextual());
            }
            if (i2 >= 31) {
                builder.setAuthenticationRequired(action.isAuthenticationRequired());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", action.getShowsUserInterface());
            builder.addExtras(bundle);
            this.mBuilder.addAction(builder.build());
        } else if (i >= 16) {
            this.mActionExtrasList.add(NotificationCompatJellybean.writeActionAndGetExtras(this.mBuilder, action));
        }
    }

    @Nullable
    private static List<String> combineLists(@Nullable List<String> list, @Nullable List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        ArraySet arraySet = new ArraySet(list.size() + list2.size());
        arraySet.addAll(list);
        arraySet.addAll(list2);
        return new ArrayList(arraySet);
    }

    @Nullable
    private static List<String> getPeople(@Nullable List<Person> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Person resolveToLegacyUri : list) {
            arrayList.add(resolveToLegacyUri.resolveToLegacyUri());
        }
        return arrayList;
    }

    private void removeSoundAndVibration(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i = notification.defaults & -2;
        notification.defaults = i;
        notification.defaults = i & -3;
    }

    public Notification build() {
        Bundle extras;
        RemoteViews makeHeadsUpContentView;
        RemoteViews makeBigContentView;
        NotificationCompat.Style style = this.mBuilderCompat.mStyle;
        if (style != null) {
            style.apply(this);
        }
        RemoteViews makeContentView = style != null ? style.makeContentView(this) : null;
        Notification buildInternal = buildInternal();
        if (!(makeContentView == null && (makeContentView = this.mBuilderCompat.mContentView) == null)) {
            buildInternal.contentView = makeContentView;
        }
        int i = Build.VERSION.SDK_INT;
        if (!(i < 16 || style == null || (makeBigContentView = style.makeBigContentView(this)) == null)) {
            buildInternal.bigContentView = makeBigContentView;
        }
        if (!(i < 21 || style == null || (makeHeadsUpContentView = this.mBuilderCompat.mStyle.makeHeadsUpContentView(this)) == null)) {
            buildInternal.headsUpContentView = makeHeadsUpContentView;
        }
        if (!(i < 16 || style == null || (extras = NotificationCompat.getExtras(buildInternal)) == null)) {
            style.addCompatExtras(extras);
        }
        return buildInternal;
    }

    /* access modifiers changed from: protected */
    public Notification buildInternal() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.mBuilder.build();
        }
        if (i >= 24) {
            Notification build = this.mBuilder.build();
            if (this.mGroupAlertBehavior != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.mGroupAlertBehavior != 2)) {
                    removeSoundAndVibration(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.mGroupAlertBehavior == 1) {
                    removeSoundAndVibration(build);
                }
            }
            return build;
        } else if (i >= 21) {
            this.mBuilder.setExtras(this.mExtras);
            Notification build2 = this.mBuilder.build();
            RemoteViews remoteViews = this.mContentView;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.mBigContentView;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.mHeadsUpContentView;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.mGroupAlertBehavior != 0) {
                if (!(build2.getGroup() == null || (build2.flags & 512) == 0 || this.mGroupAlertBehavior != 2)) {
                    removeSoundAndVibration(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.mGroupAlertBehavior == 1) {
                    removeSoundAndVibration(build2);
                }
            }
            return build2;
        } else if (i >= 20) {
            this.mBuilder.setExtras(this.mExtras);
            Notification build3 = this.mBuilder.build();
            RemoteViews remoteViews4 = this.mContentView;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.mBigContentView;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.mGroupAlertBehavior != 0) {
                if (!(build3.getGroup() == null || (build3.flags & 512) == 0 || this.mGroupAlertBehavior != 2)) {
                    removeSoundAndVibration(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.mGroupAlertBehavior == 1) {
                    removeSoundAndVibration(build3);
                }
            }
            return build3;
        } else if (i >= 19) {
            SparseArray<Bundle> buildActionExtrasMap = NotificationCompatJellybean.buildActionExtrasMap(this.mActionExtrasList);
            if (buildActionExtrasMap != null) {
                this.mExtras.putSparseParcelableArray(NotificationCompatExtras.EXTRA_ACTION_EXTRAS, buildActionExtrasMap);
            }
            this.mBuilder.setExtras(this.mExtras);
            Notification build4 = this.mBuilder.build();
            RemoteViews remoteViews6 = this.mContentView;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.mBigContentView;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (i < 16) {
            return this.mBuilder.getNotification();
        } else {
            Notification build5 = this.mBuilder.build();
            Bundle extras = NotificationCompat.getExtras(build5);
            Bundle bundle = new Bundle(this.mExtras);
            for (String str : this.mExtras.keySet()) {
                if (extras.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            extras.putAll(bundle);
            SparseArray<Bundle> buildActionExtrasMap2 = NotificationCompatJellybean.buildActionExtrasMap(this.mActionExtrasList);
            if (buildActionExtrasMap2 != null) {
                NotificationCompat.getExtras(build5).putSparseParcelableArray(NotificationCompatExtras.EXTRA_ACTION_EXTRAS, buildActionExtrasMap2);
            }
            RemoteViews remoteViews8 = this.mContentView;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.mBigContentView;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        }
    }

    public Notification.Builder getBuilder() {
        return this.mBuilder;
    }

    /* access modifiers changed from: package-private */
    public Context getContext() {
        return this.mContext;
    }
}
