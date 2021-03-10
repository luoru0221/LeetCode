package pta;

import java.util.Scanner;

public class Main关于堆的判断 {
    public static void main(String[] args) {
        int nodeNum, checkNum, tmp;
        Scanner input = new Scanner(System.in);
        int[] heap = new int[1005];

        while (input.hasNext()) {
            nodeNum = input.nextInt();
            checkNum = input.nextInt();

            for (int i = 1; i <= nodeNum; i++) {
                heap[i] = input.nextInt();

                int index = i;
                while (index > 1 && heap[index] < heap[index / 2]) {
                    tmp = heap[index];
                    heap[index] = heap[index / 2];
                    heap[index / 2] = tmp;
                    index /= 2;
                }
            }

            input.nextLine();
            for (int j = 0; j < checkNum; j++) {
                String line = input.nextLine();

                String[] split = line.split(" ");
                boolean right;

                if (split.length == 4) {
                    //第一种命题
                    int root = Integer.parseInt(split[0]);
                    right = heap[1] == root;
                } else if (split.length == 5) {
                    //第二种命题
                    int one = Integer.parseInt(split[0]);
                    int another = Integer.parseInt(split[2]);
                    int one_index = 0;
                    int another_index = 0;
                    for (int i = 1; i <= nodeNum; i++) {
                        if (heap[i] == one) {
                            one_index = i;
                        }
                        if (heap[i] == another) {
                            another_index = i;
                        }
                    }
                    right = one_index / 2 == another_index / 2;
                } else {
                    if (split[3].equals("parent")) {
                        //第三种命题
                        int parent = Integer.parseInt(split[0]);
                        int child = Integer.parseInt(split[5]);
                        int parent_index = 0;
                        int child_index = 0;
                        for (int i = 1; i <= nodeNum; i++) {
                            if (heap[i] == parent) {
                                parent_index = i;
                            }
                            if (heap[i] == child) {
                                child_index = i;
                            }
                        }

                        right = child_index / 2 == parent_index;
                    } else {
                        //第四种命题
                        int child = Integer.parseInt(split[0]);
                        int parent = Integer.parseInt(split[5]);
                        int parent_index = 0;
                        int child_index = 0;
                        for (int i = 1; i <= nodeNum; i++) {
                            if (heap[i] == parent) {
                                parent_index = i;
                            }
                            if (heap[i] == child) {
                                child_index = i;
                            }
                        }

                        right = child_index / 2 == parent_index;
                    }
                }
                if(right) {
                    System.out.println("T");
                }else{
                    System.out.println("F");
                }
            }
        }
    }
}
