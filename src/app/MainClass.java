package app;

import app.Implement.Device;
import app.Interface.Printer;

public class MainClass {
    public static void main(String[] args) {
        Device dev = new Device();
        Device.Message mass = new Device.Message(null, "hello");
        dev.print(mass);

        Printer pr = new Printer() {
            @Override
            public void print(Device.Message message) {
                if (message.getSender() == null
                        && message.getTex() == null) {
                    System.out.println("Опрацьовується пусте " +
                            "повідомлення від анонімного користувача...");

                }
            }

        };
        pr.print(mass);
    }
}
