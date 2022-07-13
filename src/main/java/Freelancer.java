public non-sealed class Freelancer extends WorkContributor {
    public String name;
    public String origin;
    public Integer age;
    public Character id;
    public Integer pointsOfWork;

    public Freelancer(String name, String origin, Integer age, Character id) {
        this.name = name;
        this.origin = origin;
        this.age = age;
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getOrigin() {
        return origin;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public Character getId() {
        return id;
    }

    private void setWorkToPoints(String a){
        switch (a){
            case "A": this.pointsOfWork = 10;
            break;
            case "B": this.pointsOfWork = 20;
            break;
            case "C": this.pointsOfWork = 30;
            break;
        }
    }

    public Integer getPointsOfWork(){
        return this.pointsOfWork;
    }
}
