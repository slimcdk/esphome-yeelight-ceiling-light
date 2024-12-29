package com.yeelight.yeelib.p194ui.view;

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
import com.yeelight.yeelib.p194ui.view.NumberPicker;
import com.yeelight.yeelib.utils.C10550q;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;

/* renamed from: com.yeelight.yeelib.ui.view.TimePicker */
public class TimePicker extends FrameLayout {

    /* renamed from: l */
    private static final C10490g f19825l = new C10484a();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final NumberPicker f19826a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final NumberPicker f19827b;

    /* renamed from: c */
    private final NumberPicker f19828c;

    /* renamed from: d */
    private final Button f19829d;

    /* renamed from: e */
    private final String[] f19830e;

    /* renamed from: f */
    private boolean f19831f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f19832g;

    /* renamed from: h */
    private boolean f19833h;

    /* renamed from: i */
    private C10490g f19834i;

    /* renamed from: j */
    private Calendar f19835j;

    /* renamed from: k */
    private Locale f19836k;

    /* renamed from: com.yeelight.yeelib.ui.view.TimePicker$SavedState */
    private static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C10483a();

        /* renamed from: a */
        private final int f19837a;

        /* renamed from: b */
        private final int f19838b;

        /* renamed from: com.yeelight.yeelib.ui.view.TimePicker$SavedState$a */
        static class C10483a implements Parcelable.Creator<SavedState> {
            C10483a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (C10484a) null);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f19837a = parcel.readInt();
            this.f19838b = parcel.readInt();
        }

        /* synthetic */ SavedState(Parcel parcel, C10484a aVar) {
            this(parcel);
        }

        private SavedState(Parcelable parcelable, int i, int i2) {
            super(parcelable);
            this.f19837a = i;
            this.f19838b = i2;
        }

        /* synthetic */ SavedState(Parcelable parcelable, int i, int i2, C10484a aVar) {
            this(parcelable, i, i2);
        }

        /* renamed from: a */
        public int mo33155a() {
            return this.f19837a;
        }

        /* renamed from: b */
        public int mo33156b() {
            return this.f19838b;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f19837a);
            parcel.writeInt(this.f19838b);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.TimePicker$a */
    static class C10484a implements C10490g {
        C10484a() {
        }

        /* renamed from: a */
        public void mo32387a(TimePicker timePicker, int i, int i2) {
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.TimePicker$b */
    class C10485b implements NumberPicker.C10469i {
        C10485b() {
        }

        /* renamed from: a */
        public void mo32336a(NumberPicker numberPicker, int i, int i2) {
            if (!TimePicker.this.mo33142h() && ((i == 11 && i2 == 12) || (i == 12 && i2 == 11))) {
                TimePicker timePicker = TimePicker.this;
                boolean unused = timePicker.f19832g = !timePicker.f19832g;
                TimePicker.this.m25489j();
            }
            TimePicker.this.m25488i();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.TimePicker$c */
    class C10486c implements NumberPicker.C10469i {
        C10486c() {
        }

        /* renamed from: a */
        public void mo32336a(NumberPicker numberPicker, int i, int i2) {
            int value;
            TimePicker timePicker;
            boolean a;
            int minValue = TimePicker.this.f19827b.getMinValue();
            int maxValue = TimePicker.this.f19827b.getMaxValue();
            if (i == maxValue && i2 == minValue) {
                value = TimePicker.this.f19826a.getValue() + 1;
                if (!TimePicker.this.mo33142h() && value == 12) {
                    timePicker = TimePicker.this;
                    a = timePicker.f19832g;
                }
                TimePicker.this.f19826a.setValue(value);
                TimePicker.this.m25488i();
            }
            if (i == minValue && i2 == maxValue) {
                value = TimePicker.this.f19826a.getValue() - 1;
                if (!TimePicker.this.mo33142h() && value == 11) {
                    timePicker = TimePicker.this;
                    a = timePicker.f19832g;
                }
                TimePicker.this.f19826a.setValue(value);
            }
            TimePicker.this.m25488i();
            boolean unused = timePicker.f19832g = !a;
            TimePicker.this.m25489j();
            TimePicker.this.f19826a.setValue(value);
            TimePicker.this.m25488i();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.TimePicker$d */
    class C10487d implements View.OnClickListener {
        C10487d() {
        }

        public void onClick(View view) {
            view.requestFocus();
            TimePicker timePicker = TimePicker.this;
            boolean unused = timePicker.f19832g = !timePicker.f19832g;
            TimePicker.this.m25489j();
            TimePicker.this.m25488i();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.TimePicker$e */
    class C10488e implements NumberPicker.C10469i {
        C10488e() {
        }

        /* renamed from: a */
        public void mo32336a(NumberPicker numberPicker, int i, int i2) {
            numberPicker.requestFocus();
            TimePicker timePicker = TimePicker.this;
            boolean unused = timePicker.f19832g = !timePicker.f19832g;
            TimePicker.this.m25489j();
            TimePicker.this.m25488i();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.TimePicker$f */
    class C10489f implements NumberPicker.C10469i {
        C10489f() {
        }

        /* renamed from: a */
        public void mo32336a(NumberPicker numberPicker, int i, int i2) {
            TimePicker.this.mo33138g();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.TimePicker$g */
    public interface C10490g {
        /* renamed from: a */
        void mo32387a(TimePicker timePicker, int i, int i2);
    }

    public TimePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19833h = true;
        setCurrentLocale(C10550q.m25766b().mo33378a());
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R$layout.time_picker, this, true);
        NumberPicker numberPicker = (NumberPicker) findViewById(R$id.hour);
        this.f19826a = numberPicker;
        numberPicker.setOnValueChangedListener(new C10485b());
        NumberPicker numberPicker2 = (NumberPicker) findViewById(R$id.minute);
        this.f19827b = numberPicker2;
        numberPicker2.setMinValue(0);
        this.f19827b.setMaxValue(59);
        this.f19827b.setOnLongPressUpdateInterval(100);
        this.f19827b.setFormatter(NumberPicker.f19643q0);
        this.f19827b.setOnValueChangedListener(new C10486c());
        this.f19827b.setOnValueChangedListener(new C10489f());
        this.f19830e = new DateFormatSymbols().getAmPmStrings();
        View findViewById = findViewById(R$id.amPm);
        if (findViewById instanceof Button) {
            this.f19828c = null;
            Button button = (Button) findViewById;
            this.f19829d = button;
            button.setOnClickListener(new C10487d());
        } else {
            this.f19829d = null;
            NumberPicker numberPicker3 = (NumberPicker) findViewById;
            this.f19828c = numberPicker3;
            numberPicker3.setMinValue(0);
            this.f19828c.setMaxValue(1);
            this.f19828c.setDisplayedValues(this.f19830e);
            this.f19828c.setOnValueChangedListener(new C10488e());
        }
        m25490k();
        m25489j();
        setOnTimeChangedListener(f19825l);
        setCurrentHour(Integer.valueOf(this.f19835j.get(11)));
        setCurrentMinute(Integer.valueOf(this.f19835j.get(12)));
        if (!isEnabled()) {
            setEnabled(false);
        }
        if (Build.VERSION.SDK_INT >= 16 && getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m25488i() {
        sendAccessibilityEvent(4);
        C10490g gVar = this.f19834i;
        if (gVar != null) {
            gVar.mo32387a(this, getCurrentHour().intValue(), getCurrentMinute().intValue());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m25489j() {
        if (mo33142h()) {
            NumberPicker numberPicker = this.f19828c;
            if (numberPicker != null) {
                numberPicker.setVisibility(8);
            } else {
                this.f19829d.setVisibility(8);
            }
        } else {
            int i = !this.f19832g;
            NumberPicker numberPicker2 = this.f19828c;
            if (numberPicker2 != null) {
                numberPicker2.setValue(i);
                this.f19828c.setVisibility(0);
            } else {
                this.f19829d.setText(this.f19830e[i]);
                this.f19829d.setVisibility(0);
            }
        }
        sendAccessibilityEvent(4);
    }

    /* renamed from: k */
    private void m25490k() {
        NumberPicker.C10466f fVar;
        NumberPicker numberPicker;
        if (mo33142h()) {
            this.f19826a.setMinValue(0);
            this.f19826a.setMaxValue(23);
            numberPicker = this.f19826a;
            fVar = NumberPicker.f19643q0;
        } else {
            this.f19826a.setMinValue(1);
            this.f19826a.setMaxValue(12);
            numberPicker = this.f19826a;
            fVar = null;
        }
        numberPicker.setFormatter(fVar);
    }

    private void setCurrentLocale(Locale locale) {
        if (!locale.equals(this.f19836k)) {
            this.f19836k = locale;
            this.f19835j = Calendar.getInstance(locale);
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo33138g() {
        m25488i();
    }

    public int getBaseline() {
        return this.f19826a.getBaseline();
    }

    public Integer getCurrentHour() {
        int value = this.f19826a.getValue();
        if (mo33142h()) {
            return Integer.valueOf(value);
        }
        int i = value % 12;
        return this.f19832g ? Integer.valueOf(i) : Integer.valueOf(i + 12);
    }

    public Integer getCurrentMinute() {
        return Integer.valueOf(this.f19827b.getValue());
    }

    /* renamed from: h */
    public boolean mo33142h() {
        return this.f19831f;
    }

    public boolean isEnabled() {
        return this.f19833h;
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
        int i = this.f19831f ? 129 : 65;
        this.f19835j.set(11, getCurrentHour().intValue());
        this.f19835j.set(12, getCurrentMinute().intValue());
        accessibilityEvent.getText().add(DateUtils.formatDateTime(getContext(), this.f19835j.getTimeInMillis(), i));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentHour(Integer.valueOf(savedState.mo33155a()));
        setCurrentMinute(Integer.valueOf(savedState.mo33156b()));
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), getCurrentHour().intValue(), getCurrentMinute().intValue(), (C10484a) null);
    }

    public void setCurrentHour(Integer num) {
        if (num != null && !Objects.equals(num, getCurrentHour())) {
            if (!mo33142h()) {
                if (num.intValue() >= 12) {
                    this.f19832g = false;
                    if (num.intValue() > 12) {
                        num = Integer.valueOf(num.intValue() - 12);
                    }
                } else {
                    this.f19832g = true;
                    if (num.intValue() == 0) {
                        num = 12;
                    }
                }
                m25489j();
            }
            this.f19826a.setValue(num.intValue());
        }
    }

    public void setCurrentMinute(Integer num) {
        if (!Objects.equals(num, getCurrentMinute())) {
            this.f19827b.setValue(num.intValue());
        }
    }

    public void setEnabled(boolean z) {
        if (this.f19833h != z) {
            super.setEnabled(z);
            this.f19827b.setEnabled(z);
            this.f19826a.setEnabled(z);
            NumberPicker numberPicker = this.f19828c;
            if (numberPicker != null) {
                numberPicker.setEnabled(z);
            } else {
                this.f19829d.setEnabled(z);
            }
            this.f19833h = z;
        }
    }

    public void setIs24HourView(Boolean bool) {
        if (this.f19831f != bool.booleanValue()) {
            this.f19831f = bool.booleanValue();
            int intValue = getCurrentHour().intValue();
            m25490k();
            setCurrentHour(Integer.valueOf(intValue));
            m25489j();
        }
    }

    public void setOnTimeChangedListener(C10490g gVar) {
        this.f19834i = gVar;
    }
}
