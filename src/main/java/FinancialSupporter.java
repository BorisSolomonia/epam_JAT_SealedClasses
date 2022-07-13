public non-sealed class FinancialSupporter extends Supporter{
    public String name;
    public String origin;
    public Integer age;
    public Character id;
    public Integer pointsOfMoney;
    public FinancialSupporter(String name, String origin, Integer age, Character id) {
        this.name = name;
        this.origin =origin;
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

    private void setpointsOfMoney(Integer n){
        switch (n){
            case 50: this.pointsOfMoney = 10;
                break;
            case 100: this.pointsOfMoney = 20;
                break;
            case 150: this.pointsOfMoney = 30;
                break;
        }
    }

    public Integer getPointsOfWork(){
        return this.pointsOfMoney;
    }
}
