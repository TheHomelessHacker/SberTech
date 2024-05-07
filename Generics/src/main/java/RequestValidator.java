public interface RequestValidator<Request> {
    boolean validate(Request request);
}