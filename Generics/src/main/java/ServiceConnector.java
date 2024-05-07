public interface ServiceConnector<T, Request, Response> {
    Response connect(Request request);
}