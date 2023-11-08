public abstract class Handler {
    Handler next;

    public abstract void handleRequest(Request req);
}