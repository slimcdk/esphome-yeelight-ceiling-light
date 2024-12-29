package com.yeelight.yeelib.p191j.p192a;

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

/* renamed from: com.yeelight.yeelib.j.a.b */
public class C9891b extends Dialog implements View.OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public TextView f17980a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ListView f17981b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public View f17982c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public View.OnClickListener f17983d;

    /* renamed from: com.yeelight.yeelib.j.a.b$b */
    public static class C9893b {

        /* renamed from: a */
        private final Context f17984a;

        /* renamed from: b */
        private String f17985b;

        /* renamed from: c */
        private List<String> f17986c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public AdapterView.OnItemClickListener f17987d;

        /* renamed from: e */
        private View.OnClickListener f17988e;

        /* renamed from: com.yeelight.yeelib.j.a.b$b$a */
        class C9894a implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            final /* synthetic */ C9891b f17989a;

            C9894a(C9891b bVar) {
                this.f17989a = bVar;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                this.f17989a.dismiss();
                C9893b.this.f17987d.onItemClick(adapterView, view, i, j);
            }
        }

        public C9893b(Context context) {
            this.f17984a = context;
        }

        /* renamed from: b */
        public C9891b mo31992b() {
            C9891b bVar = new C9891b(this.f17984a);
            if (TextUtils.isEmpty(this.f17985b)) {
                bVar.f17980a.setVisibility(8);
                bVar.f17982c.setVisibility(8);
            } else {
                bVar.m24260g(this.f17985b);
            }
            bVar.f17981b.setAdapter(new C9895c(this.f17984a, this.f17986c));
            bVar.f17981b.setOnItemClickListener(new C9894a(bVar));
            View.OnClickListener unused = bVar.f17983d = this.f17988e;
            return bVar;
        }

        /* renamed from: c */
        public C9893b mo31993c(List<String> list) {
            this.f17986c = list;
            return this;
        }

        /* renamed from: d */
        public C9893b mo31994d(int[] iArr) {
            if (iArr == null) {
                return this;
            }
            this.f17986c = new ArrayList();
            for (int string : iArr) {
                this.f17986c.add(this.f17984a.getResources().getString(string));
            }
            return this;
        }

        /* renamed from: e */
        public C9893b mo31995e(View.OnClickListener onClickListener) {
            this.f17988e = onClickListener;
            return this;
        }

        /* renamed from: f */
        public C9893b mo31996f(AdapterView.OnItemClickListener onItemClickListener) {
            this.f17987d = onItemClickListener;
            return this;
        }

        /* renamed from: g */
        public C9893b mo31997g(@StringRes int i) {
            this.f17985b = this.f17984a.getResources().getString(i);
            return this;
        }
    }

    /* renamed from: com.yeelight.yeelib.j.a.b$c */
    private static class C9895c extends BaseAdapter {

        /* renamed from: a */
        private final List<String> f17991a;

        /* renamed from: b */
        private final Context f17992b;

        /* renamed from: com.yeelight.yeelib.j.a.b$c$a */
        private class C9896a {

            /* renamed from: a */
            TextView f17993a;

            private C9896a(C9895c cVar) {
            }
        }

        public C9895c(Context context, List<String> list) {
            this.f17992b = context;
            this.f17991a = list;
        }

        public int getCount() {
            List<String> list = this.f17991a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public Object getItem(int i) {
            return this.f17991a.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C9896a aVar;
            if (view == null) {
                aVar = new C9896a();
                view2 = LayoutInflater.from(this.f17992b).inflate(R$layout.item_bottom_list, (ViewGroup) null, false);
                aVar.f17993a = (TextView) view2.findViewById(R$id.tv_content);
                view2.setTag(aVar);
            } else {
                view2 = view;
                aVar = (C9896a) view.getTag();
            }
            aVar.f17993a.setText(this.f17991a.get(i));
            return view2;
        }
    }

    public C9891b(@NonNull Context context) {
        super(context, R$style.dialogstyle);
        m24259f(context);
    }

    /* renamed from: f */
    private void m24259f(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R$layout.dialog_bottom_list, (ViewGroup) null);
        this.f17980a = (TextView) inflate.findViewById(R$id.tv_title);
        this.f17981b = (ListView) inflate.findViewById(R$id.list_view);
        this.f17982c = inflate.findViewById(R$id.top_line);
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
    public void m24260g(String str) {
        this.f17980a.setText(str);
    }

    public void onClick(View view) {
        if (view.getId() == R$id.tv_cancle) {
            dismiss();
            View.OnClickListener onClickListener = this.f17983d;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }
}
