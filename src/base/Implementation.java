package base;

public class Implementation {
    public static void main(String[] args) {
        PetrolEngines petrolEngines=new PetrolEngines(123456,10,110,8000,4,"Petrol");
        DiselEngines diselEngines=new DiselEngines(48458,546,854,8546,4,"Diesel");
        CngEngines cngEngines=new CngEngines(4464,8854,878,88888,7,"CNG");
        ElectricalEngines electricalEngines=new ElectricalEngines(464646,85,8585,"Lithium Battery",12.0);

        petrolEngines.display();
        diselEngines.display();
        cngEngines.display();
        electricalEngines.display();
    }
}
