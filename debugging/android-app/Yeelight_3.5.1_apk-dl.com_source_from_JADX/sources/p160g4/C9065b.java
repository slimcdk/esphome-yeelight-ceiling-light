package p160g4;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$style;
import java.util.ArrayList;
import java.util.List;

/* renamed from: g4.b */
public class C9065b extends Dialog implements View.OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public TextView f16649a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ListView f16650b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public View f16651c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public View.OnClickListener f16652d;

    /* renamed from: g4.b$b */
    public static class C9067b {

        /* renamed from: a */
        private final Context f16653a;

        /* renamed from: b */
        private String f16654b;

        /* renamed from: c */
        private List<String> f16655c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public AdapterView.OnItemClickListener f16656d;

        /* renamed from: e */
        private View.OnClickListener f16657e;

        /* renamed from: g4.b$b$a */
        class C9068a implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            final /* synthetic */ C9065b f16658a;

            C9068a(C9065b bVar) {
                this.f16658a = bVar;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                this.f16658a.dismiss();
                C9067b.this.f16656d.onItemClick(adapterView, view, i, j);
            }
        }

        public C9067b(Context context) {
            this.f16653a = context;
        }

        /* renamed from: b */
        public C9065b mo37004b() {
            C9065b bVar = new C9065b(this.f16653a);
            if (TextUtils.isEmpty(this.f16654b)) {
                bVar.f16649a.setVisibility(8);
                bVar.f16651c.setVisibility(8);
            } else {
                bVar.m21713g(this.f16654b);
            }
            bVar.f16650b.setAdapter(new C9069c(this.f16653a, this.f16655c));
            bVar.f16650b.setOnItemClickListener(new C9068a(bVar));
            View.OnClickListener unused = bVar.f16652d = this.f16657e;
            return bVar;
        }

        /* renamed from: c */
        public C9067b mo37005c(List<String> list) {
            this.f16655c = list;
            return this;
        }

        /* renamed from: d */
        public C9067b mo37006d(int[] iArr) {
            if (iArr == null) {
                return this;
            }
            this.f16655c = new ArrayList();
            for (int string : iArr) {
                this.f16655c.add(this.f16653a.getResources().getString(string));
            }
            return this;
        }

        /* renamed from: e */
        public C9067b mo37007e(View.OnClickListener onClickListener) {
            this.f16657e = onClickListener;
            return this;
        }

        /* renamed from: f */
        public C9067b mo37008f(AdapterView.OnItemClickListener onItemClickListener) {
            this.f16656d = onItemClickListener;
            return this;
        }

        /* renamed from: g */
        public C9067b mo37009g(@StringRes int i) {
            this.f16654b = this.f16653a.getResources().getString(i);
            return this;
        }
    }

    /* renamed from: g4.b$c */
    private static class C9069c extends BaseAdapter {

        /* renamed from: a */
        private final List<String> f16660a;

        /* renamed from: b */
        private final Context f16661b;

        /* renamed from: g4.b$c$a */
        private class C9070a {

            /* renamed from: a */
            TextView f16662a;

            private C9070a(C9069c cVar) {
            }
        }

        public C9069c(Context context, List<String> list) {
            this.f16661b = context;
            this.f16660a = list;
        }

        public int getCount() {
            List<String> list = this.f16660a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public Object getItem(int i) {
            return this.f16660a.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C9070a aVar;
            if (view == null) {
                aVar = new C9070a();
                view2 = LayoutInflater.from(this.f16661b).inflate(R$layout.item_bottom_list, (ViewGroup) null, false);
                aVar.f16662a = (TextView) view2.findViewById(R$id.tv_content);
                view2.setTag(aVar);
            } else {
                view2 = view;
                aVar = (C9070a) view.getTag();
            }
            aVar.f16662a.setText(this.f16660a.get(i));
            return view2;
        }
    }

    public C9065b(@NonNull Context context) {
        super(context, R$style.dialogstyle);
        m21712f(context);
    }

    /* renamed from: f */
    private void m21712f(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R$layout.dialog_bottom_list, (ViewGroup) null);
        this.f16649a = (TextView) inflate.findViewById(R$id.tv_title);
        this.f16650b = (ListView) inflate.findViewById(R$id.list_view);
        this.f16651c = inflate.findViewById(R$id.top_line);
        inflate.findViewById(R$id.tv_cancle).setOnClickListener(this);
        setContentView(inflate);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setWindowAnimations(R$style.alarm_popup_window_animation_style);
            window.setLayout(-1, -2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m21713g(String str) {
        this.f16649a.setText(str);
    }

    public void onClick(View view) {
        if (view.getId() == R$id.tv_cancle) {
            dismiss();
            View.OnClickListener onClickListener = this.f16652d;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }
}
