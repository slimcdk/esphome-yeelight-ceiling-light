package com.squareup.haha.guava.base;

import java.util.Arrays;
import org.apache.commons.p271io.IOUtils;

public abstract class CharMatcher implements Predicate<Character> {
    private static final String NINES;
    static final int WHITESPACE_SHIFT = Integer.numberOfLeadingZeros(31);
    private String description;

    static abstract class FastMatcher extends CharMatcher {
        FastMatcher(String str) {
            super(str);
        }

        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }
    }

    /* renamed from: com.squareup.haha.guava.base.CharMatcher$Or */
    static class C3836Or extends CharMatcher {
        private CharMatcher first;
        private CharMatcher second;

        C3836Or(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this(charMatcher, charMatcher2, "CharMatcher.or(" + charMatcher + ", " + charMatcher2 + ")");
        }

        private C3836Or(CharMatcher charMatcher, CharMatcher charMatcher2, String str) {
            super(str);
            this.first = (CharMatcher) Ascii.checkNotNull(charMatcher);
            this.second = (CharMatcher) Ascii.checkNotNull(charMatcher2);
        }

        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public final boolean matches(char c) {
            return this.first.matches(c) || this.second.matches(c);
        }

        /* access modifiers changed from: package-private */
        public final CharMatcher withToString(String str) {
            return new C3836Or(this.first, this.second, str);
        }
    }

    static class RangesMatcher extends CharMatcher {
        private final char[] rangeEnds;
        private final char[] rangeStarts;

        RangesMatcher(String str, char[] cArr, char[] cArr2) {
            super(str);
            this.rangeStarts = cArr;
            this.rangeEnds = cArr2;
            Ascii.checkArgument(cArr.length == cArr2.length);
            int i = 0;
            while (i < cArr.length) {
                Ascii.checkArgument(cArr[i] <= cArr2[i]);
                int i2 = i + 1;
                if (i2 < cArr.length) {
                    Ascii.checkArgument(cArr2[i] < cArr[i2]);
                }
                i = i2;
            }
        }

        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public final boolean matches(char c) {
            int binarySearch = Arrays.binarySearch(this.rangeStarts, c);
            if (binarySearch >= 0) {
                return true;
            }
            int i = (binarySearch ^ -1) - 1;
            return i >= 0 && c <= this.rangeEnds[i];
        }
    }

    static {
        new CharMatcher() {
            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                return CharMatcher.super.apply((Character) obj);
            }

            public final boolean matches(char c) {
                if (!(c == ' ' || c == 133 || c == 5760)) {
                    if (c != 8199) {
                        if (!(c == 8287 || c == 12288 || c == 8232 || c == 8233)) {
                            switch (c) {
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                    break;
                                default:
                                    return c >= 8192 && c <= 8202;
                            }
                        }
                    }
                }
                return true;
            }

            public final String toString() {
                return "CharMatcher.BREAKING_WHITESPACE";
            }
        };
        inRange(0, 127, "CharMatcher.ASCII");
        StringBuilder sb = new StringBuilder(31);
        for (int i = 0; i < 31; i++) {
            sb.append((char) ("0٠۰߀०০੦૦୦௦౦೦൦๐໐༠၀႐០᠐᥆᧐᭐᮰᱀᱐꘠꣐꤀꩐０".charAt(i) + 9));
        }
        NINES = sb.toString();
        new RangesMatcher("CharMatcher.DIGIT", "0٠۰߀०০੦૦୦௦౦೦൦๐໐༠၀႐០᠐᥆᧐᭐᮰᱀᱐꘠꣐꤀꩐０".toCharArray(), NINES.toCharArray());
        new CharMatcher("CharMatcher.JAVA_DIGIT") {
            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                return CharMatcher.super.apply((Character) obj);
            }

            public final boolean matches(char c) {
                return Character.isDigit(c);
            }
        };
        new CharMatcher("CharMatcher.JAVA_LETTER") {
            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                return CharMatcher.super.apply((Character) obj);
            }

            public final boolean matches(char c) {
                return Character.isLetter(c);
            }
        };
        new CharMatcher("CharMatcher.JAVA_LETTER_OR_DIGIT") {
            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                return CharMatcher.super.apply((Character) obj);
            }

            public final boolean matches(char c) {
                return Character.isLetterOrDigit(c);
            }
        };
        new CharMatcher("CharMatcher.JAVA_UPPER_CASE") {
            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                return CharMatcher.super.apply((Character) obj);
            }

            public final boolean matches(char c) {
                return Character.isUpperCase(c);
            }
        };
        new CharMatcher("CharMatcher.JAVA_LOWER_CASE") {
            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                return CharMatcher.super.apply((Character) obj);
            }

            public final boolean matches(char c) {
                return Character.isLowerCase(c);
            }
        };
        inRange(0, 31).mo21461or(inRange(127, 159)).withToString("CharMatcher.JAVA_ISO_CONTROL");
        new RangesMatcher("CharMatcher.INVISIBLE", "\u0000­؀؜۝܏ ᠎   ⁦⁧⁨⁩⁪　?﻿￹￺".toCharArray(), "  ­؄؜۝܏ ᠎‏ ⁤⁦⁧⁨⁩⁯　﻿￹￻".toCharArray());
        new RangesMatcher("CharMatcher.SINGLE_WIDTH", "\u0000־א׳؀ݐ฀Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ๿₯℺﷿﻿ￜ".toCharArray());
        new FastMatcher("CharMatcher.ANY") {
            public final boolean matches(char c) {
                return true;
            }

            /* renamed from: or */
            public final CharMatcher mo21461or(CharMatcher charMatcher) {
                Ascii.checkNotNull(charMatcher);
                return this;
            }
        };
        new FastMatcher("CharMatcher.NONE") {
            public final boolean matches(char c) {
                return false;
            }

            /* renamed from: or */
            public final CharMatcher mo21461or(CharMatcher charMatcher) {
                return (CharMatcher) Ascii.checkNotNull(charMatcher);
            }
        };
        new FastMatcher("WHITESPACE") {
            public final boolean matches(char c) {
                return " 　\r   　 \u000b　   　 \t     \f 　 　　 \n 　".charAt((48906 * c) >>> CharMatcher.WHITESPACE_SHIFT) == c;
            }
        };
    }

    protected CharMatcher() {
        this.description = super.toString();
    }

    CharMatcher(String str) {
        this.description = str;
    }

    private static CharMatcher inRange(char c, char c2) {
        Ascii.checkArgument(c2 >= c);
        return inRange(c, c2, "CharMatcher.inRange('" + showCharacter(c) + "', '" + showCharacter(c2) + "')");
    }

    private static CharMatcher inRange(final char c, final char c2, String str) {
        return new FastMatcher(str) {
            public final boolean matches(char c) {
                return c <= c && c <= c2;
            }
        };
    }

    private static String showCharacter(char c) {
        char[] cArr = {IOUtils.DIR_SEPARATOR_WINDOWS, 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    public final boolean apply(Character ch) {
        return matches(ch.charValue());
    }

    public abstract boolean matches(char c);

    /* renamed from: or */
    public CharMatcher mo21461or(CharMatcher charMatcher) {
        return new C3836Or(this, (CharMatcher) Ascii.checkNotNull(charMatcher));
    }

    public String toString() {
        return this.description;
    }

    /* access modifiers changed from: package-private */
    public CharMatcher withToString(String str) {
        throw new UnsupportedOperationException();
    }
}
