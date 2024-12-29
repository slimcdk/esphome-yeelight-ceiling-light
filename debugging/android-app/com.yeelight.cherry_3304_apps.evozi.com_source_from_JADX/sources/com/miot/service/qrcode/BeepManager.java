package com.miot.service.qrcode;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Vibrator;
import com.miot.service.C3602R;
import java.io.Closeable;

final class BeepManager implements MediaPlayer.OnErrorListener, Closeable {
    private static final float BEEP_VOLUME = 0.1f;
    private static final String TAG = BeepManager.class.getSimpleName();
    private static final long VIBRATE_DURATION = 200;
    private final Activity activity;
    private MediaPlayer mediaPlayer = null;
    private boolean playBeep;
    private boolean vibrate;

    BeepManager(Activity activity2) {
        this.activity = activity2;
        updatePrefs();
    }

    private MediaPlayer buildMediaPlayer(Context context) {
        AssetFileDescriptor openRawResourceFd;
        MediaPlayer mediaPlayer2 = new MediaPlayer();
        try {
            openRawResourceFd = context.getResources().openRawResourceFd(C3602R.raw.beep);
            mediaPlayer2.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
            openRawResourceFd.close();
            mediaPlayer2.setOnErrorListener(this);
            mediaPlayer2.setAudioStreamType(3);
            mediaPlayer2.setLooping(false);
            mediaPlayer2.setVolume(BEEP_VOLUME, BEEP_VOLUME);
            mediaPlayer2.prepare();
            return mediaPlayer2;
        } catch (Exception unused) {
            mediaPlayer2.release();
            return null;
        } catch (Throwable th) {
            openRawResourceFd.close();
            throw th;
        }
    }

    private static boolean shouldBeep(SharedPreferences sharedPreferences, Context context) {
        return ((AudioManager) context.getSystemService("audio")).getRingerMode() == 2;
    }

    public synchronized void close() {
        if (this.mediaPlayer != null) {
            this.mediaPlayer.release();
            this.mediaPlayer = null;
        }
    }

    public synchronized boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
        if (i == 100) {
            this.activity.finish();
        } else {
            close();
            updatePrefs();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public synchronized void playBeepSoundAndVibrate() {
        if (this.playBeep && this.mediaPlayer != null) {
            this.mediaPlayer.start();
        }
        if (this.vibrate) {
            ((Vibrator) this.activity.getSystemService("vibrator")).vibrate(VIBRATE_DURATION);
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void updatePrefs() {
        boolean shouldBeep = shouldBeep((SharedPreferences) null, this.activity);
        this.playBeep = shouldBeep;
        this.vibrate = false;
        if (shouldBeep && this.mediaPlayer == null) {
            this.activity.setVolumeControlStream(3);
            this.mediaPlayer = buildMediaPlayer(this.activity);
        }
    }
}
