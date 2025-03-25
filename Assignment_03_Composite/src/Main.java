public class Main {
    public static void main(String[] args) {
        Component bigCompany = new Department("Big Company CO.LTD");
        Component researchDepartment = new Department("Research Department");
        Component marketDepartment = new Department("Market Department");
        Component marketDepartment_Asia = new Department("Market Department Asia");
        Component marketDepartment_Europe = new Department("Market Department Europe");

        Component bigBoss = new Employee("big boss", 30000);
        Component researchManager = new Employee("research manager", 10000);
        Component scienceExpert = new Employee("science expert", 10000);
        Component marketManager = new Employee("market manager", 20000);
        Component marketManager_Asia = new Employee("Asian market manager", 10000);
        Component marketManager_Europe = new Employee("European market manager", 10000);

        bigCompany.add(researchDepartment);
        bigCompany.add(marketDepartment);
        marketDepartment.add(marketDepartment_Asia);
        marketDepartment.add(marketDepartment_Europe);

        bigCompany.add(bigBoss);

        researchDepartment.add(researchManager);
        researchDepartment.add(scienceExpert);

        marketDepartment.add(marketManager);
        marketDepartment_Asia.add(marketManager_Asia);
        marketDepartment_Europe.add(marketManager_Europe);

        ((Department) bigCompany).printTotalSalary();

        bigCompany.printData();

    }

}