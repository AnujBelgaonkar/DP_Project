public class Handler1 extends Handler{

    public void setNextHandler(Handler o){
        this.next = o;
    }
    @Override
    public void handleRequest(Request req) {
        if(req.getType().equalsIgnoreCase("ADMIT")){
            System.out.println("Request handled by handler 1");
        }
        else next.handleRequest(req);
    }
}
