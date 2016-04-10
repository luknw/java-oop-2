package com.luknw;


public enum Company {
    INSTANCE;

    public CEO ceo;

    public void hireCEO(CEO ceo) {
        this.ceo = ceo;
    }

    @Override
    public String toString() {
        String companyString = ceo.name + " - " + "CEO";

        for (Employee employee : ceo.employees) {
            companyString += System.lineSeparator() + '\t' + employee.name + " - ";

            if (employee instanceof Manager) {
                companyString += "Manager";

                for (Employee subEmployee : ((Manager) employee).employees) {
                    companyString += System.lineSeparator() + "\t\t" + subEmployee.name + " - Employee";
                }

            } else {
                companyString += "Employee";
            }
        }
        return companyString;
    }
}
