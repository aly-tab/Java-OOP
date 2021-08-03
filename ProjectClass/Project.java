class Project {
    private String name;
    private String description;

    public Project() {
    }

    public Project(String name) {
        this.name = name;
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String elevatorPitch(Project Object) {
        return Object.name + " : " + Object.description;        
    }
}