package com.yeelight.yeelib.p142ui.view;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.p142ui.view.NumberPicker;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;
import p051j4.C9196o;

/* renamed from: com.yeelight.yeelib.ui.view.TimePicker */
public class TimePicker extends FrameLayout {

    /* renamed from: l */
    private static final C8867g f16083l = new C8861a();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final NumberPicker f16084a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final NumberPicker f16085b;

    /* renamed from: c */
    private final NumberPicker f16086c;

    /* renamed from: d */
    private final Button f16087d;

    /* renamed from: e */
    private final String[] f16088e;

    /* renamed from: f */
    private boolean f16089f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f16090g;

    /* renamed from: h */
    private boolean f16091h;

    /* renamed from: i */
    private C8867g f16092i;

    /* renamed from: j */
    private Calendar f16093j;

    /* renamed from: k */
    private Locale f16094k;

    /* renamed from: com.yeelight.yeelib.ui.view.TimePicker$SavedState */
    private static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C8860a();

        /* renamed from: a */
        private final int f16095a;

        /* renamed from: b */
        private final int f16096b;

        /* renamed from: com.yeelight.yeelib.ui.view.TimePicker$SavedState$a */
        class C8860a implements Parcelable.Creator<SavedState> {
            C8860a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (C8861a) null);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f16095a = parcel.readInt();
            this.f16096b = parcel.readInt();
        }

        /* synthetic */ SavedState(Parcel parcel, C8861a aVar) {
            this(parcel);
        }

        private SavedState(Parcelable parcelable, int i, int i2) {
            super(parcelable);
            this.f16095a = i;
            this.f16096b = i2;
        }

        /* synthetic */ SavedState(Parcelable parcelable, int i, int i2, C8861a aVar) {
            this(parcelable, i, i2);
        }

        /* renamed from: a */
        public int mo36524a() {
            return this.f16095a;
        }

        /* renamed from: b */
        public int mo36525b() {
            return this.f16096b;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f16095a);
            parcel.writeInt(this.f16096b);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.TimePicker$a */
    class C8861a implements C8867g {
        C8861a() {
        }

        /* renamed from: a */
        public void mo35818a(TimePicker timePicker, int i, int i2) {
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.TimePicker$b */
    class C8862b implements NumberPicker.C8846i {
        C8862b() {
        }

        /* renamed from: a */
        public void mo35772a(NumberPicker numberPicker, int i, int i2) {
            if (!TimePicker.this.mo36511h() && ((i == 11 && i2 == 12) || (i == 12 && i2 == 11))) {
                TimePicker timePicker = TimePicker.this;
                boolean unused = timePicker.f16090g = !timePicker.f16090g;
                TimePicker.this.m21103j();
            }
            TimePicker.this.m21102i();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.TimePicker$c */
    class C8863c implements NumberPicker.C8846i {
        C8863c() {
        }

        /* renamed from: a */
        public void mo35772a(NumberPicker numberPicker, int i, int i2) {
            int value;
            TimePicker timePicker;
            boolean a;
            int minValue = TimePicker.this.f16085b.getMinValue();
            int maxValue = TimePicker.this.f16085b.getMaxValue();
            if (i == maxValue && i2 == minValue) {
                value = TimePicker.this.f16084a.getValue() + 1;
                if (!TimePicker.this.mo36511h() && value == 12) {
                    timePicker = TimePicker.this;
                    a = timePicker.f16090g;
                }
                TimePicker.this.f16084a.setValue(value);
                TimePicker.this.m21102i();
            }
            if (i == minValue && i2 == maxValue) {
                value = TimePicker.this.f16084a.getValue() - 1;
                if (!TimePicker.this.mo36511h() && value == 11) {
                    timePicker = TimePicker.this;
                    a = timePicker.f16090g;
                }
                TimePicker.this.f16084a.setValue(value);
            }
            TimePicker.this.m21102i();
            boolean unused = timePicker.f16090g = !a;
            TimePicker.this.m21103j();
            TimePicker.this.f16084a.setValue(value);
            TimePicker.this.m21102i();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.TimePicker$d */
    class C8864d implements View.OnClickListener {
        C8864d() {
        }

        public void onClick(View view) {
            view.requestFocus();
            TimePicker timePicker = TimePicker.this;
            boolean unused = timePicker.f16090g = !timePicker.f16090g;
            TimePicker.this.m21103j();
            TimePicker.this.m21102i();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.TimePicker$e */
    class C8865e implements NumberPicker.C8846i {
        C8865e() {
        }

        /* renamed from: a */
        public void mo35772a(NumberPicker numberPicker, int i, int i2) {
            numberPicker.requestFocus();
            TimePicker timePicker = TimePicker.this;
            boolean unused = timePicker.f16090g = !timePicker.f16090g;
            TimePicker.this.m21103j();
            TimePicker.this.m21102i();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.TimePicker$f */
    class C8866f implements NumberPicker.C8846i {
        C8866f() {
        }

        /* renamed from: a */
        public void mo35772a(NumberPicker numberPicker, int i, int i2) {
            TimePicker.this.mo36507g();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.TimePicker$g */
    public interface C8867g {
        /* renamed from: a */
        void mo35818a(TimePicker timePicker, int i, int i2);
    }

    public TimePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16091h = true;
        setCurrentLocale(C9196o.m22165b().mo37277a());
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R$layout.time_picker, this, true);
        NumberPicker numberPicker = (NumberPicker) findViewById(R$id.hour);
        this.f16084a = numberPicker;
        numberPicker.setOnValueChangedListener(new C8862b());
        NumberPicker numberPicker2 = (NumberPicker) findViewById(R$id.minute);
        this.f16085b = numberPicker2;
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(59);
        numberPicker2.setOnLongPressUpdateInterval(100);
        numberPicker2.setFormatter(NumberPicker.f15903z0);
        numberPicker2.setOnValueChangedListener(new C8863c());
        numberPicker2.setOnValueChangedListener(new C8866f());
        String[] amPmStrings = new DateFormatSymbols().getAmPmStrings();
        this.f16088e = amPmStrings;
        View findViewById = findViewById(R$id.amPm);
        if (findViewById instanceof Button) {
            this.f16086c = null;
            Button button = (Button) findViewById;
            this.f16087d = button;
            button.setOnClickListener(new C8864d());
        } else {
            this.f16087d = null;
            NumberPicker numberPicker3 = (NumberPicker) findViewById;
            this.f16086c = numberPicker3;
            numberPicker3.setMinValue(0);
            numberPicker3.setMaxValue(1);
            numberPicker3.setDisplayedValues(amPmStrings);
            numberPicker3.setOnValueChangedListener(new C8865e());
        }
        m21104k();
        m21103j();
        setOnTimeChangedListener(f16083l);
        setCurrentHour(Integer.valueOf(this.f16093j.get(11)));
        setCurrentMinute(Integer.valueOf(this.f16093j.get(12)));
        if (!isEnabled()) {
            setEnabled(false);
        }
        if (Build.VERSION.SDK_INT >= 16 && getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m21102i() {
        sendAccessibilityEvent(4);
        C8867g gVar = this.f16092i;
        if (gVar != null) {
            gVar.mo35818a(this, getCurrentHour().intValue(), getCurrentMinute().intValue());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m21103j() {
        if (mo36511h()) {
            NumberPicker numberPicker = this.f16086c;
            if (numberPicker != null) {
                numberPicker.setVisibility(8);
            } else {
                this.f16087d.setVisibility(8);
            }
        } else {
            int i = !this.f16090g;
            NumberPicker numberPicker2 = this.f16086c;
            if (numberPicker2 != null) {
                numberPicker2.setValue(i);
                this.f16086c.setVisibility(0);
            } else {
                this.f16087d.setText(this.f16088e[i]);
                this.f16087d.setVisibility(0);
            }
        }
        sendAccessibilityEvent(4);
    }

    /* renamed from: k */
    private void m21104k() {
        NumberPicker.C8843f fVar;
        NumberPicker numberPicker;
        if (mo36511h()) {
            this.f16084a.setMinValue(0);
            this.f16084a.setMaxValue(23);
            numberPicker = this.f16084a;
            fVar = NumberPicker.f15903z0;
        } else {
            this.f16084a.setMinValue(1);
            this.f16084a.setMaxValue(12);
            numberPicker = this.f16084a;
            fVar = null;
        }
        numberPicker.setFormatter(fVar);
    }

    private void setCurrentLocale(Locale locale) {
        if (!locale.equals(this.f16094k)) {
            this.f16094k = locale;
            this.f16093j = Calendar.getInstance(locale);
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo36507g() {
        m21102i();
    }

    public int getBaseline() {
        return this.f16084a.getBaseline();
    }

    public Integer getCurrentHour() {
        int value = this.f16084a.getValue();
        if (mo36511h()) {
            return Integer.valueOf(value);
        }
        int i = value % 12;
        return this.f16090g ? Integer.valueOf(i) : Integer.valueOf(i + 12);
    }

    public Integer getCurrentMinute() {
        return Integer.valueOf(this.f16085b.getValue());
    }

    /* renamed from: h */
    public boolean mo36511h() {
        return this.f16089f;
    }

    public boolean isEnabled() {
        return this.f16091h;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setCurrentLocale(configuration.locale);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(TimePicker.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(TimePicker.class.getName());
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        int i = this.f16089f ? 129 : 65;
        this.f16093j.set(11, getCurrentHour().intValue());
        this.f16093j.set(12, getCurrentMinute().intValue());
        accessibilityEvent.getText().add(DateUtils.formatDateTime(getContext(), this.f16093j.getTimeInMillis(), i));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentHour(Integer.valueOf(savedState.mo36524a()));
        setCurrentMinute(Integer.valueOf(savedState.mo36525b()));
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), getCurrentHour().intValue(), getCurrentMinute().intValue(), (C8861a) null);
    }

    public void setCurrentHour(Integer num) {
        if (num != null && !num.equals(getCurrentHour())) {
            if (!mo36511h()) {
                if (num.intValue() >= 12) {
                    this.f16090g = false;
                    if (num.intValue() > 12) {
                        num = Integer.valueOf(num.intValue() - 12);
                    }
                } else {
                    this.f16090g = true;
                    if (num.intValue() == 0) {
                        num = 12;
                    }
                }
                m21103j();
            }
            this.f16084a.setValue(num.intValue());
        }
    }

    public void setCurrentMinute(Integer num) {
        if (!Objects.equals(num, getCurrentMinute())) {
            this.f16085b.setValue(num.intValue());
        }
    }

    public void setEnabled(boolean z) {
        if (this.f16091h != z) {
            super.setEnabled(z);
            this.f16085b.setEnabled(z);
            this.f16084a.setEnabled(z);
            NumberPicker numberPicker = this.f16086c;
            if (numberPicker != null) {
                numberPicker.setEnabled(z);
            } else {
                this.f16087d.setEnabled(z);
            }
            this.f16091h = z;
        }
    }

    public void setIs24HourView(Boolean bool) {
        if (this.f16089f != bool.booleanValue()) {
            this.f16089f = bool.booleanValue();
            int intValue = getCurrentHour().intValue();
            m21104k();
            setCurrentHour(Integer.valueOf(intValue));
            m21103j();
        }
    }

    public void setOnTimeChangedListener(C8867g gVar) {
        this.f16092i = gVar;
    }
}
