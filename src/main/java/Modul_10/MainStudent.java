package Modul_10;

public class MainStudent {

    public static void main(String[] args) {
        Student siswa = new Student();
        int[] nilai = siswa.getTestScore();

        siswa.setName("jaemin");
        siswa.setTestScore(1, 99);
        siswa.setTestScore(2, 89);
        siswa.setTestScore(3, 96);
        
        System.out.println("Nama = " + siswa.getName());
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Test ke-" + (i + 1) + " = " + nilai[i]);
        }
        System.out.println("Course Grade = " + siswa.getCourseGrade());
    }
}
