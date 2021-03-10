package pta;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main02_扫码抗疫情 {

    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        int record_num, check_num;
        while (input.hasNext()) {
            record_num = input.nextInt();
            check_num = input.nextInt();
            input.nextLine();

            Student[] students = new Student[record_num + 1];
            for (int i = 0; i < record_num; i++) {
                String record = input.nextLine();
                String[] stuRecord = record.split(" ");

                students[i] = new Student(stuRecord[0], sdf.parse(stuRecord[1]), stuRecord[2]);
            }
            //排序
            Arrays.sort(students, 0, record_num);

            Student[] realStu = new Student[record_num];
            Map<String, Long> stay = new HashMap<>();
            int index = 0;
            for (int i = 0; i < record_num - 1; i++) {
                if (students[i].id.equals(students[i + 1].id)
                        && students[i].type.equals("in")
                        && students[i + 1].type.equals("out")) {
                    realStu[index++] = students[i];
                    realStu[index++] = students[i + 1];

                    if (stay.containsKey(students[i].id)) {
                        stay.put(students[i].id, stay.get(students[i].id) + students[i + 1].time.getTime() - students[i].time.getTime());
                    } else {
                        stay.put(students[i].id, students[i + 1].time.getTime() - students[i].time.getTime());
                    }
                }
            }

            Arrays.sort(realStu, 0, index, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return o1.time.compareTo(o2.time);
                }
            });

            for (int i = 0; i < check_num; i++) {
                String checkTime = input.nextLine();
                int cnt = 0;
                Date time = sdf.parse(checkTime);
                for (int j = 0; j < index; j++) {
                    if (time.compareTo(realStu[j].time) >= 0) {
                        if (realStu[j].type.equals("in")) {
                            cnt++;
                        } else {
                            cnt--;
                        }
                    } else {
                        break;
                    }
                }
                System.out.println(cnt);
            }

            long max_len = 0;
            for (Long value : stay.values()) {
                if (value > max_len) {
                    max_len = value;
                }
            }

            String[] ansStu = new String[index];
            int ansIndex = 0;
            for (String id : stay.keySet()) {
                if (stay.get(id) == max_len) {
                    ansStu[ansIndex++] = id;
                }
            }

            Arrays.sort(ansStu, 0, ansIndex);
            for (int i = 0; i < ansIndex; i++) {
                System.out.print(ansStu[i] + " ");
            }
            long hour = max_len / (1000 * 60 * 60);
            long minutes = max_len % (1000 * 60 * 60) / (1000 * 60);
            long seconds = max_len / 1000 - hour * 3600 - minutes * 60;

            System.out.printf("%02d:%02d:%02d%n",hour,minutes,seconds);
        }
    }
}

class Student implements Comparable<Student> {
    String id;
    Date time;
    String type;

    Student(String id, Date time, String type) {
        this.id = id;
        this.time = time;
        this.type = type;
    }

    @Override
    public int compareTo(Student o) {
        if (id.compareTo(o.id) == 0) {
            return time.compareTo(o.time);
        }
        return id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", time=" + time +
                ", type='" + type + '\'' +
                '}';
    }
}
