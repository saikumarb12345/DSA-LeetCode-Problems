package Arrays;

//Average Salary Excluding the Minimum and Maximum Salary
public class AvgSalary {
    public double average(int[] salary) {
        double sum = 0;
        int count = 0;
        Arrays.sort(salary);

        for(int i=1;i<salary.length-1;i++){
            count++;
            sum = sum + salary[i];
        }
        double avg = sum/count;
        return avg;
    }
}
