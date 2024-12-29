package org.apache.commons.p194io;

import androidx.appcompat.widget.ActivityChooserView;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;
import p223w3.C11280k;

/* renamed from: org.apache.commons.io.FileSystemUtils */
public class FileSystemUtils {

    /* renamed from: DF */
    private static final String f17859DF;
    private static final int INIT_PROBLEM = -1;
    private static final FileSystemUtils INSTANCE = new FileSystemUtils();

    /* renamed from: OS */
    private static final int f17860OS;
    private static final int OTHER = 0;
    private static final int POSIX_UNIX = 3;
    private static final int UNIX = 2;
    private static final int WINDOWS = 1;

    static {
        String str = "df";
        int i = -1;
        try {
            String property = System.getProperty("os.name");
            if (property != null) {
                String lowerCase = property.toLowerCase(Locale.ENGLISH);
                if (lowerCase.indexOf("windows") != -1) {
                    i = 1;
                } else {
                    if (lowerCase.indexOf("linux") == -1 && lowerCase.indexOf("mpe/ix") == -1 && lowerCase.indexOf("freebsd") == -1 && lowerCase.indexOf("irix") == -1 && lowerCase.indexOf("digital unix") == -1 && lowerCase.indexOf("unix") == -1) {
                        if (lowerCase.indexOf("mac os x") == -1) {
                            if (lowerCase.indexOf("sun os") == -1 && lowerCase.indexOf("sunos") == -1) {
                                if (lowerCase.indexOf("solaris") == -1) {
                                    if (lowerCase.indexOf("hp-ux") == -1) {
                                        if (lowerCase.indexOf("aix") == -1) {
                                            i = 0;
                                        }
                                    }
                                    i = 3;
                                }
                            }
                            str = "/usr/xpg4/bin/df";
                            i = 3;
                        }
                    }
                    i = 2;
                }
                f17860OS = i;
                f17859DF = str;
                return;
            }
            throw new IOException("os.name not found");
        } catch (Exception unused) {
        }
    }

    @Deprecated
    public static long freeSpace(String str) {
        return INSTANCE.freeSpaceOS(str, f17860OS, false, -1);
    }

    public static long freeSpaceKb() {
        return freeSpaceKb(-1);
    }

    public static long freeSpaceKb(long j) {
        return freeSpaceKb(new File(".").getAbsolutePath(), j);
    }

    public static long freeSpaceKb(String str) {
        return freeSpaceKb(str, -1);
    }

    public static long freeSpaceKb(String str, long j) {
        return INSTANCE.freeSpaceOS(str, f17860OS, true, j);
    }

    /* access modifiers changed from: package-private */
    public long freeSpaceOS(String str, int i, boolean z, long j) {
        if (str == null) {
            throw new IllegalArgumentException("Path must not be empty");
        } else if (i == 0) {
            throw new IllegalStateException("Unsupported operating system");
        } else if (i == 1) {
            long freeSpaceWindows = freeSpaceWindows(str, j);
            return z ? freeSpaceWindows / 1024 : freeSpaceWindows;
        } else if (i == 2) {
            return freeSpaceUnix(str, z, false, j);
        } else {
            if (i == 3) {
                return freeSpaceUnix(str, z, true, j);
            }
            throw new IllegalStateException("Exception caught when determining operating system");
        }
    }

    /* access modifiers changed from: package-private */
    public long freeSpaceUnix(String str, boolean z, boolean z2, long j) {
        if (str.length() != 0) {
            String str2 = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
            if (z) {
                str2 = str2 + C11280k.f20834C;
            }
            if (z2) {
                str2 = str2 + "P";
            }
            List<String> performCommand = performCommand(str2.length() > 1 ? new String[]{f17859DF, str2, str} : new String[]{f17859DF, str}, 3, j);
            if (performCommand.size() >= 2) {
                StringTokenizer stringTokenizer = new StringTokenizer(performCommand.get(1), " ");
                if (stringTokenizer.countTokens() >= 4) {
                    stringTokenizer.nextToken();
                } else if (stringTokenizer.countTokens() != 1 || performCommand.size() < 3) {
                    throw new IOException("Command line '" + f17859DF + "' did not return data as expected " + "for path '" + str + "'- check path is valid");
                } else {
                    stringTokenizer = new StringTokenizer(performCommand.get(2), " ");
                }
                stringTokenizer.nextToken();
                stringTokenizer.nextToken();
                return parseBytes(stringTokenizer.nextToken(), str);
            }
            throw new IOException("Command line '" + f17859DF + "' did not return info as expected " + "for path '" + str + "'- response was " + performCommand);
        }
        throw new IllegalArgumentException("Path must not be empty");
    }

    /* access modifiers changed from: package-private */
    public long freeSpaceWindows(String str, long j) {
        String normalize = FilenameUtils.normalize(str, false);
        if (normalize.length() > 0 && normalize.charAt(0) != '\"') {
            normalize = "\"" + normalize + "\"";
        }
        List<String> performCommand = performCommand(new String[]{"cmd.exe", "/C", "dir /a /-c " + normalize}, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, j);
        for (int size = performCommand.size() - 1; size >= 0; size--) {
            String str2 = performCommand.get(size);
            if (str2.length() > 0) {
                return parseDir(str2, normalize);
            }
        }
        throw new IOException("Command line 'dir /-c' did not return any info for path '" + normalize + "'");
    }

    /* access modifiers changed from: package-private */
    public Process openProcess(String[] strArr) {
        return Runtime.getRuntime().exec(strArr);
    }

    /* access modifiers changed from: package-private */
    public long parseBytes(String str, String str2) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong >= 0) {
                return parseLong;
            }
            throw new IOException("Command line '" + f17859DF + "' did not find free space in response " + "for path '" + str2 + "'- check path is valid");
        } catch (NumberFormatException e) {
            throw new IOExceptionWithCause("Command line '" + f17859DF + "' did not return numeric data as expected " + "for path '" + str2 + "'- check path is valid", e);
        }
    }

    /* access modifiers changed from: package-private */
    public long parseDir(String str, String str2) {
        int i;
        int i2;
        int i3;
        int length = str.length();
        while (true) {
            length--;
            i = 0;
            if (length < 0) {
                i2 = 0;
                break;
            } else if (Character.isDigit(str.charAt(length))) {
                i2 = length + 1;
                break;
            }
        }
        while (true) {
            if (length < 0) {
                i3 = 0;
                break;
            }
            char charAt = str.charAt(length);
            if (!Character.isDigit(charAt) && charAt != ',' && charAt != '.') {
                i3 = length + 1;
                break;
            }
            length--;
        }
        if (length >= 0) {
            StringBuilder sb = new StringBuilder(str.substring(i3, i2));
            while (i < sb.length()) {
                if (sb.charAt(i) == ',' || sb.charAt(i) == '.') {
                    sb.deleteCharAt(i);
                    i--;
                }
                i++;
            }
            return parseBytes(sb.toString(), str2);
        }
        throw new IOException("Command line 'dir /-c' did not return valid info for path '" + str2 + "'");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Process} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Process} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.Process} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Process} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: java.io.BufferedReader} */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.lang.String> performCommand(java.lang.String[] r10, int r11, long r12) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 20
            r0.<init>(r1)
            r1 = 0
            java.lang.Thread r2 = org.apache.commons.p194io.ThreadMonitor.start(r12)     // Catch:{ InterruptedException -> 0x00ce, all -> 0x00c8 }
            java.lang.Process r3 = r9.openProcess(r10)     // Catch:{ InterruptedException -> 0x00ce, all -> 0x00c8 }
            java.io.InputStream r4 = r3.getInputStream()     // Catch:{ InterruptedException -> 0x00c1, all -> 0x00be }
            java.io.OutputStream r5 = r3.getOutputStream()     // Catch:{ InterruptedException -> 0x00bb, all -> 0x00b6 }
            java.io.InputStream r6 = r3.getErrorStream()     // Catch:{ InterruptedException -> 0x00b3, all -> 0x00b0 }
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ InterruptedException -> 0x00ad, all -> 0x00a9 }
            java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch:{ InterruptedException -> 0x00ad, all -> 0x00a9 }
            r8.<init>(r4)     // Catch:{ InterruptedException -> 0x00ad, all -> 0x00a9 }
            r7.<init>(r8)     // Catch:{ InterruptedException -> 0x00ad, all -> 0x00a9 }
        L_0x0026:
            java.lang.String r1 = r7.readLine()     // Catch:{ InterruptedException -> 0x00a7, all -> 0x00a4 }
            if (r1 == 0) goto L_0x0040
            int r8 = r0.size()     // Catch:{ InterruptedException -> 0x00a7, all -> 0x00a4 }
            if (r8 >= r11) goto L_0x0040
            java.util.Locale r8 = java.util.Locale.ENGLISH     // Catch:{ InterruptedException -> 0x00a7, all -> 0x00a4 }
            java.lang.String r1 = r1.toLowerCase(r8)     // Catch:{ InterruptedException -> 0x00a7, all -> 0x00a4 }
            java.lang.String r1 = r1.trim()     // Catch:{ InterruptedException -> 0x00a7, all -> 0x00a4 }
            r0.add(r1)     // Catch:{ InterruptedException -> 0x00a7, all -> 0x00a4 }
            goto L_0x0026
        L_0x0040:
            r3.waitFor()     // Catch:{ InterruptedException -> 0x00a7, all -> 0x00a4 }
            org.apache.commons.p194io.ThreadMonitor.stop(r2)     // Catch:{ InterruptedException -> 0x00a7, all -> 0x00a4 }
            int r11 = r3.exitValue()     // Catch:{ InterruptedException -> 0x00a7, all -> 0x00a4 }
            if (r11 != 0) goto L_0x007d
            boolean r11 = r0.isEmpty()     // Catch:{ InterruptedException -> 0x00a7, all -> 0x00a4 }
            if (r11 != 0) goto L_0x0062
            org.apache.commons.p194io.IOUtils.closeQuietly((java.io.InputStream) r4)
            org.apache.commons.p194io.IOUtils.closeQuietly((java.io.OutputStream) r5)
            org.apache.commons.p194io.IOUtils.closeQuietly((java.io.InputStream) r6)
            org.apache.commons.p194io.IOUtils.closeQuietly((java.io.Reader) r7)
            r3.destroy()
            return r0
        L_0x0062:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ InterruptedException -> 0x00a7, all -> 0x00a4 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x00a7, all -> 0x00a4 }
            r0.<init>()     // Catch:{ InterruptedException -> 0x00a7, all -> 0x00a4 }
            java.lang.String r1 = "Command line did not return any info for command "
            r0.append(r1)     // Catch:{ InterruptedException -> 0x00a7, all -> 0x00a4 }
            java.util.List r1 = java.util.Arrays.asList(r10)     // Catch:{ InterruptedException -> 0x00a7, all -> 0x00a4 }
            r0.append(r1)     // Catch:{ InterruptedException -> 0x00a7, all -> 0x00a4 }
            java.lang.String r0 = r0.toString()     // Catch:{ InterruptedException -> 0x00a7, all -> 0x00a4 }
            r11.<init>(r0)     // Catch:{ InterruptedException -> 0x00a7, all -> 0x00a4 }
            throw r11     // Catch:{ InterruptedException -> 0x00a7, all -> 0x00a4 }
        L_0x007d:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ InterruptedException -> 0x00a7, all -> 0x00a4 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x00a7, all -> 0x00a4 }
            r0.<init>()     // Catch:{ InterruptedException -> 0x00a7, all -> 0x00a4 }
            java.lang.String r1 = "Command line returned OS error code '"
            r0.append(r1)     // Catch:{ InterruptedException -> 0x00a7, all -> 0x00a4 }
            int r1 = r3.exitValue()     // Catch:{ InterruptedException -> 0x00a7, all -> 0x00a4 }
            r0.append(r1)     // Catch:{ InterruptedException -> 0x00a7, all -> 0x00a4 }
            java.lang.String r1 = "' for command "
            r0.append(r1)     // Catch:{ InterruptedException -> 0x00a7, all -> 0x00a4 }
            java.util.List r1 = java.util.Arrays.asList(r10)     // Catch:{ InterruptedException -> 0x00a7, all -> 0x00a4 }
            r0.append(r1)     // Catch:{ InterruptedException -> 0x00a7, all -> 0x00a4 }
            java.lang.String r0 = r0.toString()     // Catch:{ InterruptedException -> 0x00a7, all -> 0x00a4 }
            r11.<init>(r0)     // Catch:{ InterruptedException -> 0x00a7, all -> 0x00a4 }
            throw r11     // Catch:{ InterruptedException -> 0x00a7, all -> 0x00a4 }
        L_0x00a4:
            r10 = move-exception
            goto L_0x00f8
        L_0x00a7:
            r11 = move-exception
            goto L_0x00c6
        L_0x00a9:
            r10 = move-exception
            r7 = r1
            goto L_0x00f8
        L_0x00ad:
            r11 = move-exception
            r7 = r1
            goto L_0x00c6
        L_0x00b0:
            r10 = move-exception
            r6 = r1
            goto L_0x00b9
        L_0x00b3:
            r11 = move-exception
            r6 = r1
            goto L_0x00c5
        L_0x00b6:
            r10 = move-exception
            r5 = r1
            r6 = r5
        L_0x00b9:
            r7 = r6
            goto L_0x00f8
        L_0x00bb:
            r11 = move-exception
            r5 = r1
            goto L_0x00c4
        L_0x00be:
            r10 = move-exception
            r5 = r1
            goto L_0x00cb
        L_0x00c1:
            r11 = move-exception
            r4 = r1
            r5 = r4
        L_0x00c4:
            r6 = r5
        L_0x00c5:
            r7 = r6
        L_0x00c6:
            r1 = r3
            goto L_0x00d3
        L_0x00c8:
            r10 = move-exception
            r3 = r1
            r5 = r3
        L_0x00cb:
            r6 = r5
            r7 = r6
            goto L_0x00f9
        L_0x00ce:
            r11 = move-exception
            r4 = r1
            r5 = r4
            r6 = r5
            r7 = r6
        L_0x00d3:
            org.apache.commons.io.IOExceptionWithCause r0 = new org.apache.commons.io.IOExceptionWithCause     // Catch:{ all -> 0x00f6 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f6 }
            r2.<init>()     // Catch:{ all -> 0x00f6 }
            java.lang.String r3 = "Command line threw an InterruptedException for command "
            r2.append(r3)     // Catch:{ all -> 0x00f6 }
            java.util.List r10 = java.util.Arrays.asList(r10)     // Catch:{ all -> 0x00f6 }
            r2.append(r10)     // Catch:{ all -> 0x00f6 }
            java.lang.String r10 = " timeout="
            r2.append(r10)     // Catch:{ all -> 0x00f6 }
            r2.append(r12)     // Catch:{ all -> 0x00f6 }
            java.lang.String r10 = r2.toString()     // Catch:{ all -> 0x00f6 }
            r0.<init>(r10, r11)     // Catch:{ all -> 0x00f6 }
            throw r0     // Catch:{ all -> 0x00f6 }
        L_0x00f6:
            r10 = move-exception
            r3 = r1
        L_0x00f8:
            r1 = r4
        L_0x00f9:
            org.apache.commons.p194io.IOUtils.closeQuietly((java.io.InputStream) r1)
            org.apache.commons.p194io.IOUtils.closeQuietly((java.io.OutputStream) r5)
            org.apache.commons.p194io.IOUtils.closeQuietly((java.io.InputStream) r6)
            org.apache.commons.p194io.IOUtils.closeQuietly((java.io.Reader) r7)
            if (r3 == 0) goto L_0x010a
            r3.destroy()
        L_0x010a:
            goto L_0x010c
        L_0x010b:
            throw r10
        L_0x010c:
            goto L_0x010b
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p194io.FileSystemUtils.performCommand(java.lang.String[], int, long):java.util.List");
    }
}
