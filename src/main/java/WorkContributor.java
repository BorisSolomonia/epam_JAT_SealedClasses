public sealed class WorkContributor extends Supporter permits Freelancer{
    public String name;
    public String origin;
    public Integer age;
    public Character id;

    public WorkContributor(String name, String origin, Integer age,Character id) {
        this.name = name;
        this.origin = origin;
        this.age = age;
        this.id = id;
    }

    public WorkContributor() {
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
}
