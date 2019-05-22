
package com.study.practice.pojo;

public class Skill {
    private String skillId;
    private String skillName;
    private String skillCategory;
    
    
    public Skill() {
        this.skillId = "N/A";
        this.skillName = "N/A";
        this.skillCategory = "N/A";
    }

    public Skill(String skillId, String skillName, String skillCategory) {
        this.skillId = skillId;
        this.skillName = skillName;
        this.skillCategory = skillCategory;
    }

    public String getSkillId() {
        return skillId;
    }

    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillCategory() {
        return skillCategory;
    }

    public void setSkillCategory(String skillCategory) {
        this.skillCategory = skillCategory;
    }

    @Override
    public String toString() {
        return "Skills{" + "skillId=" + skillId + ", skillName=" + skillName + ", skillCategory=" + skillCategory + '}';
    }
    
    
    
}
