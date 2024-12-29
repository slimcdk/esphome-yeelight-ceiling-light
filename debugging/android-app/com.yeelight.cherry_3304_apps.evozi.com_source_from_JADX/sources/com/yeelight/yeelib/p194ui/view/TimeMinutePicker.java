package com.yeelight.yeelib.p194ui.view;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.p194ui.view.NumberPicker;
import java.util.Objects;

/* renamed from: com.yeelight.yeelib.ui.view.TimeMinutePicker */
public class TimeMinutePicker extends FrameLayout {

    /* renamed from: c */
    private static final C10482c f19820c = new C10480a();

    /* renamed from: a */
    private final NumberPicker f19821a;

    /* renamed from: b */
    private C10482c f19822b;

    /* renamed from: com.yeelight.yeelib.ui.view.TimeMinutePicker$SavedState */
    private static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C10479a();

        /* renamed from: a */
        private final int f19823a;

        /* renamed from: com.yeelight.yeelib.ui.view.TimeMinutePicker$SavedState$a */
        static class C10479a implements Parcelable.Creator<SavedState> {
            C10479a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (C10480a) null);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f19823a = parcel.readInt();
        }

        /* synthetic */ SavedState(Parcel parcel, C10480a aVar) {
            this(parcel);
        }

        private SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f19823a = i;
        }

        /* synthetic */ SavedState(Parcelable parcelable, int i, C10480a aVar) {
            this(parcelable, i);
        }

        /* renamed from: a */
        public int mo33131a() {
            return this.f19823a;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f19823a);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.TimeMinutePicker$a */
    static class C10480a implements C10482c {
        C10480a() {
        }

        /* renamed from: a */
        public void mo32453a(int i) {
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.TimeMinutePicker$b */
    class C10481b implements NumberPicker.C10469i {
        C10481b() {
        }

        /* renamed from: a */
        public void mo32336a(NumberPicker numberPicker, int i, int i2) {
            TimeMinutePicker.this.m25475b();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.TimeMinutePicker$c */
    public interface C10482c {
        /* renamed from: a */
        void mo32453a(int i);
    }

    public TimeMinutePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimeMinutePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R$layout.widget_time_minute_picker, this, true);
        NumberPicker numberPicker = (NumberPicker) findViewById(R$id.minute);
        this.f19821a = numberPicker;
        numberPicker.setMinValue(1);
        this.f19821a.setMaxValue(60);
        this.f19821a.setOnLongPressUpdateInterval(100);
        this.f19821a.setFormatter(NumberPicker.f19643q0);
        this.f19821a.setOnValueChangedListener(new C10481b());
        setOnTimeChangedListener(f19820c);
        setCurrentMinute(15);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m25475b() {
        C10482c cVar = this.f19822b;
        if (cVar != null) {
            cVar.mo32453a(getCurrentMinute().intValue());
        }
    }

    public int getBaseline() {
        return this.f19821a.getBaseline();
    }

    public Integer getCurrentMinute() {
        return Integer.valueOf(this.f19821a.getValue());
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentMinute(Integer.valueOf(savedState.mo33131a()));
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), getCurrentMinute().intValue(), (C10480a) null);
    }

    public void setCurrentMinute(Integer num) {
        if (!Objects.equals(num, getCurrentMinute())) {
            this.f19821a.setValue(num.intValue());
            m25475b();
        }
    }

    public void setNumberBackground(int i) {
        this.f19821a.setBackgroundResource(i);
    }

    public void setOnTimeChangedListener(C10482c cVar) {
        this.f19822b = cVar;
    }
}
