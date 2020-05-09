package javatraining.oletsky.io;

public class DemoCloseable {
    public static void main(String[] args) {
        try (Kl ekz=new Kl()) {
            ekz.metod();
            } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Kl implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Resource closed");
    }

    public void metod() {
        System.out.println("Ku-ku!");
    }
}
