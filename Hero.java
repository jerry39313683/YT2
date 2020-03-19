public class Hero {

    private String name, Q_skill, W_skill, E_skill, R_skill;

    public Hero(String name) {
        setName(name);
    }

    public void setName(String hName) {
        this.name = hName;
    }

    public void setQskill(String skill) {
        this.Q_skill = skill;
    }

    public void setWskill(String skill) {
        this.W_skill = skill;
    }

    public void setEskill(String skill) {
        this.E_skill = skill;
    }

    public void setRskill(String skill) {
        this.R_skill = skill;
    }

    public String getName() {
        return name;
    }

    public String getQskill() {
        return Q_skill;
    }

    public String getWskill() {
        return W_skill;
    }

    public String getEskill() {
        return E_skill;
    }

    public String getRskill() {
        return R_skill;
    }
    public String getAll(){
        return "Hero name:\n" + name + "\nQ Skill\n" + Q_skill + "\nW Skill\n" +
                W_skill + "\nE Skill\n" + E_skill + "\nR Skill\n" + R_skill;
    }
}