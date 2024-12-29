package com.yeelight.yeelib.p142ui.view;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.p142ui.view.NumberPicker;
import java.util.Objects;

/* renamed from: com.yeelight.yeelib.ui.view.TimeMinutePicker */
public class TimeMinutePicker extends FrameLayout {

    /* renamed from: c */
    private static final C8859c f16078c = new C8857a();

    /* renamed from: a */
    private final NumberPicker f16079a;

    /* renamed from: b */
    private C8859c f16080b;

    /* renamed from: com.yeelight.yeelib.ui.view.TimeMinutePicker$SavedState */
    private static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C8856a();

        /* renamed from: a */
        private final int f16081a;

        /* renamed from: com.yeelight.yeelib.ui.view.TimeMinutePicker$SavedState$a */
        class C8856a implements Parcelable.Creator<SavedState> {
            C8856a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (C8857a) null);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f16081a = parcel.readInt();
        }

        /* synthetic */ SavedState(Parcel parcel, C8857a aVar) {
            this(parcel);
        }

        private SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f16081a = i;
        }

        /* synthetic */ SavedState(Parcelable parcelable, int i, C8857a aVar) {
            this(parcelable, i);
        }

        /* renamed from: a */
        public int mo36500a() {
            return this.f16081a;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f16081a);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.TimeMinutePicker$a */
    class C8857a implements C8859c {
        C8857a() {
        }

        /* renamed from: a */
        public void mo35880a(int i) {
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.TimeMinutePicker$b */
    class C8858b implements NumberPicker.C8846i {
        C8858b() {
        }

        /* renamed from: a */
        public void mo35772a(NumberPicker numberPicker, int i, int i2) {
            TimeMinutePicker.this.m21089b();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.TimeMinutePicker$c */
    public interface C8859c {
        /* renamed from: a */
        void mo35880a(int i);
    }

    public TimeMinutePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimeMinutePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R$layout.widget_time_minute_picker, this, true);
        NumberPicker numberPicker = (NumberPicker) findViewById(R$id.minute);
        this.f16079a = numberPicker;
        numberPicker.setMinValue(1);
        numberPicker.setMaxValue(60);
        numberPicker.setOnLongPressUpdateInterval(100);
        numberPicker.setFormatter(NumberPicker.f15903z0);
        numberPicker.setOnValueChangedListener(new C8858b());
        setOnTimeChangedListener(f16078c);
        setCurrentMinute(15);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m21089b() {
        C8859c cVar = this.f16080b;
        if (cVar != null) {
            cVar.mo35880a(getCurrentMinute().intValue());
        }
    }

    public int getBaseline() {
        return this.f16079a.getBaseline();
    }

    public Integer getCurrentMinute() {
        return Integer.valueOf(this.f16079a.getValue());
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentMinute(Integer.valueOf(savedState.mo36500a()));
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), getCurrentMinute().intValue(), (C8857a) null);
    }

    public void setCurrentMinute(Integer num) {
        if (!Objects.equals(num, getCurrentMinute())) {
            this.f16079a.setValue(num.intValue());
            m21089b();
        }
    }

    public void setNumberBackground(int i) {
        this.f16079a.setBackgroundResource(i);
    }

    public void setOnTimeChangedListener(C8859c cVar) {
        this.f16080b = cVar;
    }
}
