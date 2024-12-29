package com.yeelight.yeelib.p194ui.activity;

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
import com.yeelight.yeelib.p194ui.activity.ColorflowModeActivity;
import com.yeelight.yeelib.p194ui.view.PhotoColorView;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C10559w;
import java.io.File;
import java.io.FileInputStream;

/* renamed from: com.yeelight.yeelib.ui.activity.PhotoColorFragment */
public class PhotoColorFragment extends Fragment implements View.OnClickListener {

    /* renamed from: a */
    private PhotoColorView f18756a;

    /* renamed from: b */
    private TextView f18757b;

    /* renamed from: c */
    private TextView f18758c;

    /* renamed from: d */
    private TextView f18759d;

    /* renamed from: e */
    private TextView f18760e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f18761f;

    /* renamed from: g */
    private int f18762g;

    /* renamed from: h */
    private int f18763h;

    /* renamed from: i */
    private File f18764i;

    /* renamed from: j */
    private File f18765j;

    /* renamed from: k */
    private boolean f18766k;

    /* renamed from: com.yeelight.yeelib.ui.activity.PhotoColorFragment$a */
    class C10156a implements ColorflowModeActivity.C9967e {
        C10156a() {
        }

        /* renamed from: a */
        public void mo32221a(int i) {
            ((ColorflowModeActivity) PhotoColorFragment.this.getActivity()).mo32216b0(i);
            boolean unused = PhotoColorFragment.this.f18761f = true;
        }
    }

    /* renamed from: r */
    private void m24746r(Uri uri, int i, int i2, int i3) {
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.setDataAndType(uri, "image/*");
        intent.putExtra("crop", "true");
        intent.putExtra("aspectX", 1);
        intent.putExtra("aspectY", 1);
        intent.putExtra("outputX", i);
        intent.putExtra("outputY", i2);
        intent.putExtra("scale", true);
        intent.putExtra("output", Uri.fromFile(this.f18764i));
        intent.putExtra("return-data", false);
        intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
        intent.putExtra("noFaceDetection", true);
        startActivityForResult(intent, i3);
    }

    /* renamed from: u */
    private void m24747u() {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            this.f18766k = false;
            return;
        }
        try {
            this.f18766k = true;
            File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/cherry/");
            this.f18765j = new File(file, "cameraTemp.jpg");
            this.f18764i = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/cherry/cropTemp.jpg");
            if (!this.f18765j.exists()) {
                file.mkdirs();
                this.f18765j.createNewFile();
            }
            if (!this.f18764i.exists()) {
                this.f18764i.createNewFile();
            } else if (this.f18764i.length() > 1 && TimerCodec.ENABLE.equals(C10559w.m25810f("cf_cache", TimerCodec.DISENABLE))) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = false;
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                options.inPurgeable = true;
                options.inInputShareable = true;
                this.f18756a.setContentBitmap(BitmapFactory.decodeStream(new FileInputStream(this.f18764i)));
            }
        } catch (Exception e) {
            this.f18766k = false;
            e.printStackTrace();
        }
    }

    /* renamed from: w */
    private void m24748w(String str) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            float f = 1.0f;
            float f2 = options.outWidth > this.f18762g ? ((float) options.outWidth) / ((float) this.f18762g) : 1.0f;
            if (options.outHeight > this.f18763h / 2) {
                f = ((float) options.outHeight) / ((float) (this.f18763h / 2));
            }
            int i = f2 > f ? (int) f2 : (int) f;
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            options.inPurgeable = true;
            options.inInputShareable = true;
            options.inSampleSize = i;
            this.f18756a.setContentBitmap(BitmapFactory.decodeStream(new FileInputStream(new File(str))));
        } catch (Exception unused) {
            Toast.makeText(getActivity(), R$string.cherry_color_flow_load_photo_failed, 0).show();
        }
    }

    /* renamed from: x */
    private boolean m24749x(Uri uri) {
        ContentResolver contentResolver = getActivity().getContentResolver();
        String[] strArr = {"_data"};
        if (uri.getScheme().equals("file")) {
            m24748w(uri.getEncodedPath());
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
        m24748w(string);
        return true;
    }

    /* renamed from: z */
    private void m24750z() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (this.f18766k) {
            intent.putExtra("output", Uri.fromFile(this.f18765j));
        }
        startActivityForResult(intent, 1002);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001 && intent != null) {
            Uri data = intent.getData();
            if (this.f18766k) {
                int i3 = this.f18762g;
                m24746r(data, i3, i3, 1003);
            } else {
                m24749x(data);
            }
        }
        if (i == 1002 && i2 == -1) {
            if (this.f18766k) {
                Uri fromFile = Uri.fromFile(this.f18765j);
                int i4 = this.f18762g;
                m24746r(fromFile, i4, i4, 1003);
            } else if (intent != null && intent.hasExtra(Packet.DATA)) {
                this.f18756a.setContentBitmap((Bitmap) intent.getParcelableExtra(Packet.DATA));
            }
        } else if (i == 1003 && i2 == -1) {
            m24749x(Uri.fromFile(this.f18764i));
            C10559w.m25816l("cf_cache", TimerCodec.ENABLE);
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R$id.photo_add) {
            this.f18756a.mo33107e(true);
        } else if (id == R$id.photo_pictures) {
            startActivityForResult(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI), 1001);
        } else if (id == R$id.photo_camera) {
            if (ContextCompat.checkSelfPermission(getContext(), "android.permission.CAMERA") != 0) {
                requestPermissions(new String[]{"android.permission.CAMERA"}, 0);
            } else {
                m24750z();
            }
        } else if (id == R$id.photo_del) {
            this.f18756a.mo33108f();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f18762g = getResources().getDisplayMetrics().widthPixels;
        this.f18763h = getResources().getDisplayMetrics().heightPixels;
        View inflate = layoutInflater.inflate(R$layout.fragment_colorflow_photo, viewGroup, false);
        this.f18756a = (PhotoColorView) inflate.findViewById(R$id.photocolorView);
        int i = getResources().getDisplayMetrics().widthPixels;
        int c = C10547m.m25753c(getActivity(), 20.0f);
        int c2 = C10547m.m25753c(getActivity(), 5.0f);
        int i2 = i - (c2 * 2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i2, i2);
        layoutParams.setMargins(c2, c, c2, 0);
        this.f18756a.setLayoutParams(layoutParams);
        this.f18756a.setColorChangedListener(new C10156a());
        this.f18757b = (TextView) inflate.findViewById(R$id.photo_add);
        this.f18758c = (TextView) inflate.findViewById(R$id.photo_pictures);
        this.f18759d = (TextView) inflate.findViewById(R$id.photo_camera);
        this.f18760e = (TextView) inflate.findViewById(R$id.photo_del);
        this.f18757b.setOnClickListener(this);
        this.f18758c.setOnClickListener(this);
        this.f18759d.setOnClickListener(this);
        this.f18760e.setOnClickListener(this);
        this.f18756a.setContentBitmap(BitmapFactory.decodeResource(getResources(), R$drawable.colorpen));
        m24747u();
        return inflate;
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 0 && iArr.length > 0 && iArr[0] == 0) {
            m24750z();
        }
    }

    /* renamed from: s */
    public int[] mo32455s() {
        return this.f18756a.getColors();
    }
}
