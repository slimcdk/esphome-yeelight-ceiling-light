package retrofit2;

public class HttpException extends RuntimeException {
    private final int code;
    private final String message;
    private final transient C3666j<?> response;

    public HttpException(C3666j<?> jVar) {
        super(getMessage(jVar));
        this.code = jVar.mo26041b();
        this.message = jVar.mo26043e();
        this.response = jVar;
    }

    private static String getMessage(C3666j<?> jVar) {
        C3672m.m10495b(jVar, "response == null");
        return "HTTP " + jVar.mo26041b() + " " + jVar.mo26043e();
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    public C3666j<?> response() {
        return this.response;
    }
}
