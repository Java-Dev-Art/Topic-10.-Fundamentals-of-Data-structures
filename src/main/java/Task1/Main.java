package Task1;

public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.addElement("Privet");
        task1.addElement("Poka");
        task1.addElement("Kak");
        task1.addElement("Dela");

        task1.sizeList();

        System.out.println(task1.findElement("Privet"));
        System.out.println(task1.findIndex("Kak"));
        Print print = new Print(task1);
        print.print();
        task1.swapElement("Dela","Privet");
        print.print();

    }
}
