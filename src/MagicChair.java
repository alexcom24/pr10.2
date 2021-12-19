public class MagicChair implements Chair{
    public void doMagic() {
        System.out.println("Магический стул делает магию");
    }

    @Override
    public String toString() {
        return "Магический стул";
    }
}
