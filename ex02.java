public class ex02{
    public static void main(String[] args){
        int grade = 80;
        char type = 'm';
        if (grade >= 60 && type =='m'){
            System.out.println("course:" + type +"\nypu can pass:" + grade);
        }else{
            System.err.println("課程不正確或成績不及格");
        }
    }
}