import java.util.Scanner;
public class Performance1 {
    int Studentid[];
    int sub1[], sub2[], sub3[];
    String name, Department, Section, Year;
   
    public Performance1() {
        // System.out.println" ");
        Studentid = new int[10];
        sub1 = new int[10];
        sub2 = new int[10];
        sub3 = new int[10];
    }
   
    public Performance1(String name) {
        Studentid = new int[10];
        sub1 = new int[10];
        sub2 = new int[10];
        sub3 = new int[10];
       
        this.name = name;
    }
   
    public Performance1(String name, String Department, String Section, String Year) {
        Studentid = new int[10];
        sub1 = new int[10];
        sub2 = new int[10];
        sub3 = new int[10];
       
        this.name = name;
        this.Department = Department;
        this.Section = Section;
        this.Year = Year;
    }
   
    void readMarks() {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter Marks for Subject1 : ");
        for(int i=0 ;i<10 ;i++) {
            sub1[i] = sc.nextInt();
        }
       
        System.out.println("Enter Marks for Subject2 : ");
        for(int j=0 ;j<10 ;j++) {
            sub2[j] = sc.nextInt();
        }
       
        System.out.println("Enter Marks for Subject3 : ");
        for(int k=0 ;k<10 ;k++) {
            sub3[k] = sc.nextInt();
        }
       
        sc.close();
    }

    int[] highestMarks() {
        int max1 = sub1[0];
       
        for(int i=0;i<10;i++) {
            if(sub1[i] > max1) {
                max1 = sub1[i];
            }
        }
       
        int max2 = sub1[0];
        for(int i=0;i<10;i++) {
            if(sub2[i] > max2) {
                max2 = sub2[i];
            }
        }
       
        int max3 = sub1[0];
        for(int i=0;i<10;i++) {
            if(sub3[i] > max3) {
                max3 = sub3[i];
            }
        }
       
        int max_values[] = new int[] {max1, max2, max3};
        return max_values;
    }
   
    static void display(int arr[]) {
        for(int i=0 ;i<arr.length ;i++){
            System.out.println(arr[i]);
        }
    }
}


