public interface ResponseValidator<Response> {
    boolean validate(Response response);
}