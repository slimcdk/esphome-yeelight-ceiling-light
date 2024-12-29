package com.miot.service.connection.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.apache.commons.p194io.IOUtils;

public class MiotBleAdvPacket implements Parcelable {
    public static final Parcelable.Creator<MiotBleAdvPacket> CREATOR = new Parcelable.Creator<MiotBleAdvPacket>() {
        public MiotBleAdvPacket createFromParcel(Parcel parcel) {
            return new MiotBleAdvPacket(parcel);
        }

        public MiotBleAdvPacket[] newArray(int i) {
            return new MiotBleAdvPacket[i];
        }
    };
    public Capability capability;
    public String comboKey;
    public Event event;
    public int[] extendedFrameCounter;
    public FrameControl frameControl;
    public int frameCounter;
    public IoCapability ioCapability;
    public String mac;
    public Mesh mesh;
    public int[] messageIntegrityCheck;
    public int productId;

    public static class Capability implements Parcelable {
        public static final Parcelable.Creator<Capability> CREATOR = new Parcelable.Creator<Capability>() {
            public Capability createFromParcel(Parcel parcel) {
                return new Capability(parcel);
            }

            public Capability[] newArray(int i) {
                return new Capability[i];
            }
        };
        public int bindable;
        public boolean centralable;
        public boolean connectable;
        public boolean encryptable;
        public boolean ioCapabilityable;

        Capability() {
        }

        protected Capability(Parcel parcel) {
            boolean z = true;
            this.connectable = parcel.readByte() != 0;
            this.centralable = parcel.readByte() != 0;
            this.encryptable = parcel.readByte() != 0;
            this.bindable = parcel.readInt();
            this.ioCapabilityable = parcel.readByte() == 0 ? false : z;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("connectable = " + this.connectable);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append("centralable = " + this.centralable);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append("encryptable = " + this.encryptable);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append("bindable = " + this.bindable);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append("ioCapabilityable = " + this.ioCapabilityable);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.connectable ? 1 : 0);
            parcel.writeInt(this.centralable ? 1 : 0);
            parcel.writeInt(this.encryptable ? 1 : 0);
            parcel.writeInt(this.bindable);
            parcel.writeInt(this.ioCapabilityable ? 1 : 0);
        }
    }

    public static class Event implements Parcelable {
        public static final Parcelable.Creator<Event> CREATOR = new Parcelable.Creator<Event>() {
            public Event createFromParcel(Parcel parcel) {
                return new Event(parcel);
            }

            public Event[] newArray(int i) {
                return new Event[i];
            }
        };
        public int[] eventData;
        public int eventId;
        public int eventLength;

        Event() {
        }

        protected Event(Parcel parcel) {
            this.eventId = parcel.readInt();
            int readInt = parcel.readInt();
            this.eventLength = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.eventData = iArr;
                parcel.readIntArray(iArr);
            }
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("");
            sb.append(String.format("eventId = 0x%x", new Object[]{Integer.valueOf(this.eventId)}));
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append("eventLength = " + this.eventLength);
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.eventId);
            int i2 = this.eventLength;
            if (i2 == 0 || this.eventData == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(i2);
            parcel.writeIntArray(this.eventData);
        }
    }

    public static class FrameControl implements Parcelable {
        public static final Parcelable.Creator<FrameControl> CREATOR = new Parcelable.Creator<FrameControl>() {
            public FrameControl createFromParcel(Parcel parcel) {
                return new FrameControl(parcel);
            }

            public FrameControl[] newArray(int i) {
                return new FrameControl[i];
            }
        };
        public static final int RC4_AUTH_MODE = 0;
        public static final int SECURE_AUTH_MODE = 1;
        public static final int STANDARD_AUTH_MODE = 2;
        public int authMode;
        public boolean bindingCfm;
        public boolean encrypted;
        public boolean registered;
        public int version;
        public boolean withCapability;
        public boolean withEvent;
        public boolean withMac;
        public boolean withMesh;

        FrameControl() {
        }

        protected FrameControl(Parcel parcel) {
            boolean z = true;
            this.encrypted = parcel.readByte() != 0;
            this.withMac = parcel.readByte() != 0;
            this.withCapability = parcel.readByte() != 0;
            this.withEvent = parcel.readByte() != 0;
            this.withMesh = parcel.readByte() != 0;
            this.registered = parcel.readByte() != 0;
            this.bindingCfm = parcel.readByte() == 0 ? false : z;
            this.authMode = parcel.readInt();
            this.version = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("");
            sb.append("encrypted = " + this.encrypted);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append("withMac = " + this.withMac);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append("withCapability = " + this.withCapability);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append("withEvent = " + this.withEvent);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append("withMesh = " + this.withMesh);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append("registered = " + this.registered);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append("bindingCfm = " + this.bindingCfm);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append("authMode = " + this.authMode);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append("version = " + this.version);
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.encrypted ? 1 : 0);
            parcel.writeInt(this.withMac ? 1 : 0);
            parcel.writeInt(this.withCapability ? 1 : 0);
            parcel.writeInt(this.withEvent ? 1 : 0);
            parcel.writeInt(this.withMesh ? 1 : 0);
            parcel.writeInt(this.registered ? 1 : 0);
            parcel.writeInt(this.bindingCfm ? 1 : 0);
            parcel.writeInt(this.authMode);
            parcel.writeInt(this.version);
        }
    }

    public static class IoCapability implements Parcelable {
        public static final Parcelable.Creator<IoCapability> CREATOR = new Parcelable.Creator<IoCapability>() {
            public IoCapability createFromParcel(Parcel parcel) {
                return new IoCapability(parcel);
            }

            public IoCapability[] newArray(int i) {
                return new IoCapability[i];
            }
        };
        public static final int INPUT_CAPABILITY_NFC_TAG = 4;
        public static final int INPUT_CAPABILITY_NONE = 0;
        public static final int INPUT_CAPABILITY_QR_CODE = 8;
        public static final int INPUT_CAPABILITY_SIX_CHAR = 2;
        public static final int INPUT_CAPABILITY_SIX_NUMBER = 1;
        public static final int OUTPUT_CAPABILITY_NFC_TAG = 4;
        public static final int OUTPUT_CAPABILITY_NONE = 0;
        public static final int OUTPUT_CAPABILITY_QR_CODE = 8;
        public static final int OUTPUT_CAPABILITY_SIX_CHAR = 2;
        public static final int OUTPUT_CAPABILITY_SIX_NUMBER = 1;
        public int inputCapability;
        public int outputCapability;

        IoCapability() {
        }

        protected IoCapability(Parcel parcel) {
            this.inputCapability = parcel.readInt();
            this.outputCapability = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("inputCapability = " + this.inputCapability);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append("outputCapability = " + this.outputCapability);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.inputCapability);
            parcel.writeInt(this.outputCapability);
        }
    }

    public static class Mesh implements Parcelable {
        public static final Parcelable.Creator<Mesh> CREATOR = new Parcelable.Creator<Mesh>() {
            public Mesh createFromParcel(Parcel parcel) {
                return new Mesh(parcel);
            }

            public Mesh[] newArray(int i) {
                return new Mesh[i];
            }
        };
        public int pbType;
        public int state;
        public int version;

        Mesh() {
        }

        protected Mesh(Parcel parcel) {
            this.pbType = parcel.readInt();
            this.state = parcel.readInt();
            this.version = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("pbType = " + this.pbType);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append("state = " + this.state);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append("version = " + this.version);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.pbType);
            parcel.writeInt(this.state);
            parcel.writeInt(this.version);
        }
    }

    protected MiotBleAdvPacket() {
    }

    protected MiotBleAdvPacket(Parcel parcel) {
        Capability capability2;
        this.frameControl = (FrameControl) parcel.readParcelable(FrameControl.class.getClassLoader());
        this.productId = parcel.readInt();
        this.frameCounter = parcel.readInt();
        if (this.frameControl.withMac) {
            this.mac = parcel.readString();
        }
        if (this.frameControl.withCapability) {
            this.capability = (Capability) parcel.readParcelable(Capability.class.getClassLoader());
        }
        if (isComboPacket()) {
            this.comboKey = parcel.readString();
        }
        if (this.frameControl.withCapability && (capability2 = this.capability) != null && capability2.ioCapabilityable) {
            this.ioCapability = (IoCapability) parcel.readParcelable(IoCapability.class.getClassLoader());
        }
        if (this.frameControl.withEvent) {
            this.event = (Event) parcel.readParcelable(Event.class.getClassLoader());
        }
        if (this.frameControl.encrypted) {
            int[] iArr = new int[3];
            this.extendedFrameCounter = iArr;
            parcel.readIntArray(iArr);
            if (this.frameControl.version >= 4) {
                this.messageIntegrityCheck = new int[4];
            } else {
                this.messageIntegrityCheck = new int[1];
            }
            parcel.readIntArray(this.messageIntegrityCheck);
        }
        if (this.frameControl.withMesh) {
            this.mesh = (Mesh) parcel.readParcelable(Mesh.class.getClassLoader());
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean isBinding() {
        FrameControl frameControl2 = this.frameControl;
        return frameControl2 != null && frameControl2.bindingCfm;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r0 = r2.frameControl;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isComboPacket() {
        /*
            r2 = this;
            com.miot.service.connection.bluetooth.MiotBleAdvPacket$Capability r0 = r2.capability
            if (r0 == 0) goto L_0x0013
            int r0 = r0.bindable
            r1 = 3
            if (r0 != r1) goto L_0x0013
            com.miot.service.connection.bluetooth.MiotBleAdvPacket$FrameControl r0 = r2.frameControl
            if (r0 == 0) goto L_0x0013
            int r0 = r0.version
            if (r0 < r1) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.service.connection.bluetooth.MiotBleAdvPacket.isComboPacket():boolean");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("productId = 0x%2x", new Object[]{Integer.valueOf(this.productId)}));
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        sb.append(String.format("frameCounter = %d", new Object[]{Integer.valueOf(this.frameCounter)}));
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        sb.append(String.format("mac = %s", new Object[]{this.mac}));
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        if (this.frameControl != null) {
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append("FrameControl: ");
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append(this.frameControl.toString());
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        if (this.capability != null) {
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append("Capability: ");
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append(this.capability.toString());
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        if (this.event != null) {
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append("Event: ");
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append(this.event.toString());
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        if (this.ioCapability != null) {
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append("IoCapability: ");
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append(this.ioCapability.toString());
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        if (this.mesh != null) {
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append("Mesh: ");
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append(this.mesh.toString());
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        if (!TextUtils.isEmpty(this.comboKey)) {
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append(String.format("comboKey: %s", new Object[]{this.comboKey}));
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Capability capability2;
        parcel.writeParcelable(this.frameControl, 0);
        parcel.writeInt(this.productId);
        parcel.writeInt(this.frameCounter);
        if (this.frameControl.withMac) {
            parcel.writeString(this.mac);
        }
        if (this.frameControl.withCapability) {
            parcel.writeParcelable(this.capability, 0);
        }
        if (isComboPacket()) {
            parcel.writeString(this.comboKey);
        }
        if (this.frameControl.withCapability && (capability2 = this.capability) != null && capability2.ioCapabilityable) {
            parcel.writeParcelable(this.ioCapability, 0);
        }
        if (this.frameControl.withEvent) {
            parcel.writeParcelable(this.event, 0);
        }
        if (this.frameControl.encrypted) {
            parcel.writeIntArray(this.extendedFrameCounter);
            parcel.writeIntArray(this.messageIntegrityCheck);
        }
        if (this.frameControl.withMesh) {
            parcel.writeParcelable(this.mesh, 0);
        }
    }
}
