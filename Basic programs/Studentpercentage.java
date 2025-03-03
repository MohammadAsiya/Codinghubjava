public class Studentpercentage {
    public static void main(String[] args) {
        int s1=90;
        int s2=89;
        int s3=97;
        int s4=67;
        int s5=95;
        int s6=98;
        int t=s1+s2+s3+s4+s5+s6;
        double maxmarks=600.0;
        double percentage=(t/maxmarks)*100;
        System.out.println("Total Marks :"+t);
        System.out.println("Percentage "+(float)percentage);
    }
}
