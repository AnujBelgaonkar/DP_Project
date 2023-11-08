public class Request {
    private String type;
    private String req;

    public Request(String type, String req) {
        this.type = type;
        this.req = req;
    }

    public String getType() {
        return type;
    }

    public String getReq() {
        return req;
    }
}
