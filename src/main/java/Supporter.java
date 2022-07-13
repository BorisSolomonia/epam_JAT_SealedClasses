abstract sealed class Supporter permits FinancialSupporter, WorkContributor {
    public String name;
    public String origin;
    public Integer age;
    public Character id;



    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public Integer getAge() {
        return age;
    }

    public Character getId() {
        return id;
    }

}
