package pta;

import java.util.Scanner;

public class Main03寻找250 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(input.hasNext()){
            String line = input.nextLine();
            String[] splits = line.split(" ");

            for(int i=0;i<splits.length;i++){
                if("250".equals(splits[i])){
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}
