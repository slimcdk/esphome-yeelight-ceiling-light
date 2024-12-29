package com.miot.api;

import android.os.RemoteException;
import com.miot.api.IVoiceInvokeHandler;
import com.miot.api.IVoiceSessionHandler;
import com.miot.common.exception.MiotException;
import com.miot.common.people.People;
import com.miot.common.utils.Logger;
import com.miot.common.voice.VoiceCommand;
import com.miot.common.voice.VoiceResult;
import com.miot.common.voice.VoiceSession;
import com.xiaomi.mipush.sdk.Constants;

public class VoiceAssistant {
    private static final String TAG = "VoiceAssistant";
    private IVoiceAssistant mIVoiceAssistant;

    public VoiceAssistant(IVoiceAssistant iVoiceAssistant) {
        this.mIVoiceAssistant = iVoiceAssistant;
    }

    public void setIVoiceAssistant(IVoiceAssistant iVoiceAssistant) {
        this.mIVoiceAssistant = iVoiceAssistant;
    }

    public void startSession(int i, String str, final CommonHandler<VoiceSession> commonHandler) {
        if (this.mIVoiceAssistant != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                Logger.m7499d(TAG, "startSession:" + i + Constants.COLON_SEPARATOR + str);
                try {
                    this.mIVoiceAssistant.startSessionNew(people, i, str, new IVoiceSessionHandler.Stub() {
                        public void onFailed(int i, String str) {
                            Logger.m7499d(VoiceAssistant.TAG, "startSession onFailed: " + i + str);
                            try {
                                commonHandler.onFailed(i, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        public void onSucceed(VoiceSession voiceSession) {
                            Logger.m7499d(VoiceAssistant.TAG, "startSession onSucceed");
                            try {
                                commonHandler.onSucceed(voiceSession);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void startSession(final CommonHandler<VoiceSession> commonHandler) {
        if (this.mIVoiceAssistant != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIVoiceAssistant.startSession(people, new IVoiceSessionHandler.Stub() {
                        public void onFailed(int i, String str) {
                            Logger.m7499d(VoiceAssistant.TAG, "startSession onFailed: " + i + str);
                            try {
                                commonHandler.onFailed(i, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        public void onSucceed(VoiceSession voiceSession) {
                            Logger.m7499d(VoiceAssistant.TAG, "startSession onSucceed");
                            try {
                                commonHandler.onSucceed(voiceSession);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void voiceInvoke(VoiceSession voiceSession, VoiceCommand voiceCommand, final CommonHandler<VoiceResult> commonHandler) {
        if (this.mIVoiceAssistant != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    Logger.m7499d(TAG, "voiceInvoke");
                    this.mIVoiceAssistant.voiceInvoke(people, voiceSession, voiceCommand, new IVoiceInvokeHandler.Stub() {
                        public void onFailed(int i, String str) {
                            Logger.m7499d(VoiceAssistant.TAG, "voiceInvoke onFailed: " + i + str);
                            try {
                                commonHandler.onFailed(i, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        public void onSucceed(VoiceResult voiceResult) {
                            Logger.m7499d(VoiceAssistant.TAG, "voiceInvoke onSucceed");
                            try {
                                commonHandler.onSucceed(voiceResult);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }
}
