public class ProjectTest {
    public static void main(String [] args) {
        Project chad = new Project();
        Project chad1 = new Project();
        Project chad2 = new Project("Chad");  
        Project chad3 = new Project("Chad", "Very Cool!"); 
        System.out.println(chad.elevatorPitch(chad1));  
        System.out.println(chad.elevatorPitch(chad2));       
        System.out.println(chad.elevatorPitch(chad3));
    }

}
