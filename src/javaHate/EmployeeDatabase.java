package javaHate;


import java.util.Comparator;

public class EmployeeDatabase implements Comparator<EmployeeDatabase> {

       private String name;

        private String education;


        private int joiningYear;


        private String city;


        private int paymentTier;


        private int age;


        private String gender;


        private String everBenched;


        private int experienceInCurrentDomain;


        private int leaveOrNot;

    public EmployeeDatabase(String education, int joiningYear, String city, int paymentTier, int age,
                    String gender, String everBenched, int experienceInCurrentDomain, int leaveOrNot, String name) {
        this.education = education;
        this.joiningYear = joiningYear;
        this.city = city;
        this.paymentTier = paymentTier;
        this.age = age;
        this.gender = gender;
        this.everBenched = everBenched;
        this.experienceInCurrentDomain = experienceInCurrentDomain;
        this.leaveOrNot = leaveOrNot;
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getJoiningYear() {
        return joiningYear;
    }

    public void setJoiningYear(int joiningYear) {
        this.joiningYear = joiningYear;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPaymentTier() {
        return paymentTier;
    }

    public void setPaymentTier(int paymentTier) {
        this.paymentTier = paymentTier;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEverBenched() {
        return everBenched;
    }

    public void setEverBenched(String everBenched) {
        this.everBenched = everBenched;
    }

    public int getExperienceInCurrentDomain() {
        return experienceInCurrentDomain;
    }

    public void setExperienceInCurrentDomain(int experienceInCurrentDomain) {
        this.experienceInCurrentDomain = experienceInCurrentDomain;
    }

    public int getLeaveOrNot() {
        return leaveOrNot;
    }

    public void setLeaveOrNot(int leaveOrNot) {
        this.leaveOrNot = leaveOrNot;
    }

        @Override
        public String toString() {
            return name+",  "+education + ", " + city + ", " + age;
        }

    @Override
    public int compare(EmployeeDatabase o1, EmployeeDatabase o2) {
        return 0;
    }

    /*@Override
    public int compareTo(EmployeeDatabase employeeDatabase) {
        return this.getJoiningYear()-employeeDatabase.getJoiningYear();
    }
*/

}


