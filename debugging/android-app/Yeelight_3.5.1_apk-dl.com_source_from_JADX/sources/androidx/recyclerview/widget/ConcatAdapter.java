package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class ConcatAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    static final String TAG = "ConcatAdapter";
    private final ConcatAdapterController mController;

    public static final class Config {
        @NonNull
        public static final Config DEFAULT = new Config(true, StableIdMode.NO_STABLE_IDS);
        public final boolean isolateViewTypes;
        @NonNull
        public final StableIdMode stableIdMode;

        public static final class Builder {
            private boolean mIsolateViewTypes;
            private StableIdMode mStableIdMode;

            public Builder() {
                Config config = Config.DEFAULT;
                this.mIsolateViewTypes = config.isolateViewTypes;
                this.mStableIdMode = config.stableIdMode;
            }

            @NonNull
            public Config build() {
                return new Config(this.mIsolateViewTypes, this.mStableIdMode);
            }

            @NonNull
            public Builder setIsolateViewTypes(boolean z) {
                this.mIsolateViewTypes = z;
                return this;
            }

            @NonNull
            public Builder setStableIdMode(@NonNull StableIdMode stableIdMode) {
                this.mStableIdMode = stableIdMode;
                return this;
            }
        }

        public enum StableIdMode {
            NO_STABLE_IDS,
            ISOLATED_STABLE_IDS,
            SHARED_STABLE_IDS
        }

        Config(boolean z, @NonNull StableIdMode stableIdMode2) {
            this.isolateViewTypes = z;
            this.stableIdMode = stableIdMode2;
        }
    }

    public ConcatAdapter(@NonNull Config config, @NonNull List<? extends RecyclerView.Adapter<? extends RecyclerView.ViewHolder>> list) {
        this.mController = new ConcatAdapterController(this, config);
        for (RecyclerView.Adapter addAdapter : list) {
            addAdapter(addAdapter);
        }
        super.setHasStableIds(this.mController.hasStableIds());
    }

    @SafeVarargs
    public ConcatAdapter(@NonNull Config config, @NonNull RecyclerView.Adapter<? extends RecyclerView.ViewHolder>... adapterArr) {
        this(config, (List<? extends RecyclerView.Adapter<? extends RecyclerView.ViewHolder>>) Arrays.asList(adapterArr));
    }

    public ConcatAdapter(@NonNull List<? extends RecyclerView.Adapter<? extends RecyclerView.ViewHolder>> list) {
        this(Config.DEFAULT, list);
    }

    @SafeVarargs
    public ConcatAdapter(@NonNull RecyclerView.Adapter<? extends RecyclerView.ViewHolder>... adapterArr) {
        this(Config.DEFAULT, adapterArr);
    }

    public boolean addAdapter(int i, @NonNull RecyclerView.Adapter<? extends RecyclerView.ViewHolder> adapter) {
        return this.mController.addAdapter(i, adapter);
    }

    public boolean addAdapter(@NonNull RecyclerView.Adapter<? extends RecyclerView.ViewHolder> adapter) {
        return this.mController.addAdapter(adapter);
    }

    public int findRelativeAdapterPositionIn(@NonNull RecyclerView.Adapter<? extends RecyclerView.ViewHolder> adapter, @NonNull RecyclerView.ViewHolder viewHolder, int i) {
        return this.mController.getLocalAdapterPosition(adapter, viewHolder, i);
    }

    @NonNull
    public List<? extends RecyclerView.Adapter<? extends RecyclerView.ViewHolder>> getAdapters() {
        return Collections.unmodifiableList(this.mController.getCopyOfAdapters());
    }

    public int getItemCount() {
        return this.mController.getTotalCount();
    }

    public long getItemId(int i) {
        return this.mController.getItemId(i);
    }

    public int getItemViewType(int i) {
        return this.mController.getItemViewType(i);
    }

    /* access modifiers changed from: package-private */
    public void internalSetStateRestorationPolicy(@NonNull RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
        super.setStateRestorationPolicy(stateRestorationPolicy);
    }

    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        this.mController.onAttachedToRecyclerView(recyclerView);
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        this.mController.onBindViewHolder(viewHolder, i);
    }

    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return this.mController.onCreateViewHolder(viewGroup, i);
    }

    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        this.mController.onDetachedFromRecyclerView(recyclerView);
    }

    public boolean onFailedToRecycleView(@NonNull RecyclerView.ViewHolder viewHolder) {
        return this.mController.onFailedToRecycleView(viewHolder);
    }

    public void onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        this.mController.onViewAttachedToWindow(viewHolder);
    }

    public void onViewDetachedFromWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        this.mController.onViewDetachedFromWindow(viewHolder);
    }

    public void onViewRecycled(@NonNull RecyclerView.ViewHolder viewHolder) {
        this.mController.onViewRecycled(viewHolder);
    }

    public boolean removeAdapter(@NonNull RecyclerView.Adapter<? extends RecyclerView.ViewHolder> adapter) {
        return this.mController.removeAdapter(adapter);
    }

    public void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    public void setStateRestorationPolicy(@NonNull RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }
}
