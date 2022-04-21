package com.company;

public class Main {
    enum Day{
        MONDAY("Thứ hai"),
                TUESDAY("Thứ ba"),
                WEDNESDAY("Thứ tư"),
                THURSDAY("Thứ năm"),
                FRIDAY("Thứ sáu"),
                SATURDAY("Thứ bảy"),
                SUNDAY("Chủ nhật");
        String dayInWeek;
        Day(String dayInWeek){
            this.dayInWeek = dayInWeek;
        }
        public String getDayInWeek(){
            return dayInWeek;
        }
    }
    public static void main(String[] args) {
        // bai tap so 1
        String s = "học lập trình java không khó";
        System.out.println(s.toUpperCase());
        System.out.println(s.replace("khó","dễ"));
        System.out.println("Vi tri cua J trong chuoi: "+s.indexOf("j"));

        // bai tap so 2
        Day day = Day.SATURDAY;
        System.out.println("Ngay trong tuan: "+day.getDayInWeek());
        // bai tap so 3
           bai3.vietHoa();


    }
}
