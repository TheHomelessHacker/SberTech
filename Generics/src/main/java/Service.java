public class Service<T, Request, Response> {
    private RequestValidator<Request> requestValidator;
    private ResponseValidator<Response> responseValidator;
    private ServiceConnector<T, Request, Response> serviceConnector;

    public void ExternalServiceHandler(RequestValidator<Request> requestValidator,
                                       ResponseValidator<Response> responseValidator,
                                       ServiceConnector<T, Request, Response> serviceConnector) {
        this.requestValidator = requestValidator;
        this.responseValidator = responseValidator;
        this.serviceConnector = serviceConnector;
    }

    public boolean executeServiceRequest(Request request) {
        if (!requestValidator.validate(request)) {
            System.out.println("Проверка запроса не удалась");
            return false;
        }

        Response response = serviceConnector.connect(request);

        if (response == null) {
            System.out.println("Не удалось подключиться к серверу");
            return false;
        }

        if (!responseValidator.validate(response)) {
            System.out.println("Не удалось выполнить проверку ответа");
            return false;
        }

        System.out.println("Сервисный запрос выполнен успешно");
        return true;
    }
}
