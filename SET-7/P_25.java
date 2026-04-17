class Table {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

class T1 extends Thread {
    Table t;
    T1(Table t) { this.t = t; }

    public void run() {
        t.printTable(5);
    }
}

class T2 extends Thread {
    Table t;
    T2(Table t) { this.t = t; }

    public void run() {
        t.printTable(7);
    }
}

public class Main {
    public static void main(String[] args) {
        Table obj = new Table();
        new T1(obj).start();
        new T2(obj).start();
    }
}
