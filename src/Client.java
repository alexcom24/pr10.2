public class Client {
    public Chair chair;
    public void setChair(Chair chair) {
        this.chair=chair;
    }
    public void sit() {
        System.out.print("Клиент сидит на стуле: ");
        System.out.println(chair);
    }
}
