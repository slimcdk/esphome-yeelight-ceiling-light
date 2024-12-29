package com.yeelight.cherry.p141ui.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.p141ui.view.WaveView;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.fragment.DiscoFragment_ViewBinding */
public class DiscoFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DiscoFragment f12014a;

    @UiThread
    public DiscoFragment_ViewBinding(DiscoFragment discoFragment, View view) {
        this.f12014a = discoFragment;
        discoFragment.mBtnControl = (TextView) Utils.findRequiredViewAsType(view, 2131296464, "field 'mBtnControl'", TextView.class);
        discoFragment.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, C12225R$id.music_titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        discoFragment.mMusicModeDeviceNum = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.music_mode_device_number, "field 'mMusicModeDeviceNum'", TextView.class);
        discoFragment.mWaveView = (WaveView) Utils.findRequiredViewAsType(view, C12225R$id.disco_wave_view, "field 'mWaveView'", WaveView.class);
        discoFragment.mDefaultView = (ImageView) Utils.findRequiredViewAsType(view, C12225R$id.disco_default_view, "field 'mDefaultView'", ImageView.class);
        discoFragment.mControlProgressBar = (ProgressBar) Utils.findRequiredViewAsType(view, C12225R$id.btn_control_progress, "field 'mControlProgressBar'", ProgressBar.class);
        discoFragment.mMusicModeAudioType = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.music_mode_audio_type, "field 'mMusicModeAudioType'", TextView.class);
        discoFragment.mRgMusicMode = (RadioGroup) Utils.findRequiredViewAsType(view, C12225R$id.rg_music_mode_switch, "field 'mRgMusicMode'", RadioGroup.class);
        discoFragment.mRbMusicModeMic = (RadioButton) Utils.findRequiredViewAsType(view, C12225R$id.rb_music_mode_mic, "field 'mRbMusicModeMic'", RadioButton.class);
        discoFragment.mRbMusicModeAudio = (RadioButton) Utils.findRequiredViewAsType(view, C12225R$id.rb_music_mode_audio, "field 'mRbMusicModeAudio'", RadioButton.class);
        discoFragment.mMusicModeDeviceNumTitle = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.music_mode_device_number_title, "field 'mMusicModeDeviceNumTitle'", TextView.class);
    }

    @CallSuper
    public void unbind() {
        DiscoFragment discoFragment = this.f12014a;
        if (discoFragment != null) {
            this.f12014a = null;
            discoFragment.mBtnControl = null;
            discoFragment.mTitleBar = null;
            discoFragment.mMusicModeDeviceNum = null;
            discoFragment.mWaveView = null;
            discoFragment.mDefaultView = null;
            discoFragment.mControlProgressBar = null;
            discoFragment.mMusicModeAudioType = null;
            discoFragment.mRgMusicMode = null;
            discoFragment.mRbMusicModeMic = null;
            discoFragment.mRbMusicModeAudio = null;
            discoFragment.mMusicModeDeviceNumTitle = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
