package pta;

import java.util.PriorityQueue;
import java.util.Scanner;

class Message implements Comparable<Message> {
    String name;
    int value;

    public Message(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public int compareTo(Message msg) {
        return value - msg.value;
    }
}

public class WindowsMeaagesQueue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PriorityQueue<Message> messages = new PriorityQueue<>();
        while (input.hasNextLine()) {
            int operatorNumber = input.nextInt();
            input.nextLine();
            for (int i = 0; i < operatorNumber; i++) {
                String operator = input.nextLine();
                String[] commands = operator.split(" ");
                if (commands.length == 1) {
                    //此时为get命令
                    if (messages.isEmpty()) {
                        System.out.println("EMPTY QUEUE!");
                    } else {
                        System.out.println(messages.poll().name);
                    }
                } else {
                    Message message = new Message(commands[1], Integer.parseInt(commands[2]));
                    messages.add(message);
                }
            }
        }
    }
}
