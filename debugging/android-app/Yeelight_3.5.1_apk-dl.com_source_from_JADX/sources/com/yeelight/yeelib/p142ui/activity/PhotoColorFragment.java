package com.yeelight.yeelib.p142ui.activity;

import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.miot.bluetooth.channel.packet.Packet;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p142ui.activity.ColorflowModeActivity;
import com.yeelight.yeelib.p142ui.view.PhotoColorView;
import java.io.File;
import java.io.FileInputStream;
import p051j4.C3283v;
import p051j4.C9193k;

/* renamed from: com.yeelight.yeelib.ui.activity.PhotoColorFragment */
public class PhotoColorFragment extends Fragment implements View.OnClickListener {

    /* renamed from: a */
    private PhotoColorView f15064a;

    /* renamed from: b */
    private TextView f15065b;

    /* renamed from: c */
    private TextView f15066c;

    /* renamed from: d */
    private TextView f15067d;

    /* renamed from: e */
    private TextView f15068e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f15069f;

    /* renamed from: g */
    private int f15070g;

    /* renamed from: h */
    private int f15071h;

    /* renamed from: i */
    private File f15072i;

    /* renamed from: j */
    private File f15073j;

    /* renamed from: k */
    private boolean f15074k;

    /* renamed from: com.yeelight.yeelib.ui.activity.PhotoColorFragment$a */
    class C8574a implements ColorflowModeActivity.C8384e {
        C8574a() {
        }

        /* renamed from: a */
        public void mo35679a(int i) {
            ((ColorflowModeActivity) PhotoColorFragment.this.getActivity()).mo35674b0(i);
            boolean unused = PhotoColorFragment.this.f15069f = true;
        }
    }

    /* renamed from: A */
    private void m20352A(String str) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            int i = options.outWidth;
            int i2 = this.f15070g;
            float f = 1.0f;
            float f2 = i > i2 ? ((float) i) / ((float) i2) : 1.0f;
            int i3 = options.outHeight;
            int i4 = this.f15071h;
            if (i3 > i4 / 2) {
                f = ((float) i3) / ((float) (i4 / 2));
            }
            int i5 = f2 > f ? (int) f2 : (int) f;
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            options.inPurgeable = true;
            options.inInputShareable = true;
            options.inSampleSize = i5;
            this.f15064a.setContentBitmap(BitmapFactory.decodeStream(new FileInputStream(new File(str))));
        } catch (Exception unused) {
            Toast.makeText(getActivity(), R$string.cherry_color_flow_load_photo_failed, 0).show();
        }
    }

    /* renamed from: B */
    private boolean m20353B(Uri uri) {
        ContentResolver contentResolver = getActivity().getContentResolver();
        String[] strArr = {"_data"};
        if (uri.getScheme().equals("file")) {
            m20352A(uri.getEncodedPath());
            return true;
        }
        Cursor query = contentResolver.query(uri, strArr, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return false;
        }
        String string = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
        query.close();
        if (string == null) {
            return false;
        }
        m20352A(string);
        return true;
    }

    /* renamed from: C */
    private void m20354C() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (this.f15074k) {
            intent.putExtra("output", Uri.fromFile(this.f15073j));
        }
        startActivityForResult(intent, 1002);
    }

    /* renamed from: w */
    private void m20356w(Uri uri, int i, int i2, int i3) {
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.setDataAndType(uri, "image/*");
        intent.putExtra("crop", "true");
        intent.putExtra("aspectX", 1);
        intent.putExtra("aspectY", 1);
        intent.putExtra("outputX", i);
        intent.putExtra("outputY", i2);
        intent.putExtra("scale", true);
        intent.putExtra("output", Uri.fromFile(this.f15072i));
        intent.putExtra("return-data", false);
        intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
        intent.putExtra("noFaceDetection", true);
        startActivityForResult(intent, i3);
    }

    /* renamed from: z */
    private void m20357z() {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            this.f15074k = false;
            return;
        }
        try {
            this.f15074k = true;
            File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/cherry/");
            this.f15073j = new File(file, "cameraTemp.jpg");
            this.f15072i = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/cherry/cropTemp.jpg");
            if (!this.f15073j.exists()) {
                file.mkdirs();
                this.f15073j.createNewFile();
            }
            if (!this.f15072i.exists()) {
                this.f15072i.createNewFile();
            } else if (this.f15072i.length() > 1 && TimerCodec.ENABLE.equals(C3283v.m8840f("cf_cache", TimerCodec.DISENABLE))) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = false;
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                options.inPurgeable = true;
                options.inInputShareable = true;
                this.f15064a.setContentBitmap(BitmapFactory.decodeStream(new FileInputStream(this.f15072i)));
            }
        } catch (Exception e) {
            this.f15074k = false;
            e.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001 && intent != null) {
            Uri data = intent.getData();
            if (this.f15074k) {
                int i3 = this.f15070g;
                m20356w(data, i3, i3, 1003);
            } else {
                m20353B(data);
            }
        }
        if (i == 1002 && i2 == -1) {
            if (this.f15074k) {
                Uri fromFile = Uri.fromFile(this.f15073j);
                int i4 = this.f15070g;
                m20356w(fromFile, i4, i4, 1003);
            } else if (intent != null && intent.hasExtra(Packet.DATA)) {
                this.f15064a.setContentBitmap((Bitmap) intent.getParcelableExtra(Packet.DATA));
            }
        } else if (i == 1003 && i2 == -1) {
            m20353B(Uri.fromFile(this.f15072i));
            C3283v.m8846l("cf_cache", TimerCodec.ENABLE);
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R$id.photo_add) {
            this.f15064a.mo36476e(true);
        } else if (id == R$id.photo_pictures) {
            startActivityForResult(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI), 1001);
        } else if (id == R$id.photo_camera) {
            if (ContextCompat.checkSelfPermission(getContext(), "android.permission.CAMERA") != 0) {
                requestPermissions(new String[]{"android.permission.CAMERA"}, 0);
            } else {
                m20354C();
            }
        } else if (id == R$id.photo_del) {
            this.f15064a.mo36477f();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f15070g = getResources().getDisplayMetrics().widthPixels;
        this.f15071h = getResources().getDisplayMetrics().heightPixels;
        View inflate = layoutInflater.inflate(R$layout.fragment_colorflow_photo, viewGroup, false);
        this.f15064a = (PhotoColorView) inflate.findViewById(R$id.photocolorView);
        int i = getResources().getDisplayMetrics().widthPixels;
        int c = C9193k.m22152c(getActivity(), 20.0f);
        int c2 = C9193k.m22152c(getActivity(), 5.0f);
        int i2 = i - (c2 * 2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i2, i2);
        layoutParams.setMargins(c2, c, c2, 0);
        this.f15064a.setLayoutParams(layoutParams);
        this.f15064a.setColorChangedListener(new C8574a());
        this.f15065b = (TextView) inflate.findViewById(R$id.photo_add);
        this.f15066c = (TextView) inflate.findViewById(R$id.photo_pictures);
        this.f15067d = (TextView) inflate.findViewById(R$id.photo_camera);
        this.f15068e = (TextView) inflate.findViewById(R$id.photo_del);
        this.f15065b.setOnClickListener(this);
        this.f15066c.setOnClickListener(this);
        this.f15067d.setOnClickListener(this);
        this.f15068e.setOnClickListener(this);
        this.f15064a.setContentBitmap(BitmapFactory.decodeResource(getResources(), R$drawable.colorpen));
        m20357z();
        return inflate;
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 0 && iArr.length > 0 && iArr[0] == 0) {
            m20354C();
        }
    }

    /* renamed from: x */
    public int[] mo35882x() {
        return this.f15064a.getColors();
    }
}
