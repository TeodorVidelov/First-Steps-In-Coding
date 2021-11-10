import java.util.Scanner;
public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String architectName = scanner.nextLine();

        int countOfProjects = Integer.parseInt(scanner.nextLine());
        int hoursForProject = countOfProjects * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.",architectName,hoursForProject,countOfProjects);
    }
}