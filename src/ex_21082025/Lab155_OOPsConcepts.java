package ex_21082025;

public class Lab155_OOPsConcepts {
    public static void main(String[] args) {
        //  Class - Attribute / properties - data Types - primitve or non primitive.
        // Class - Behaviour /Methods - functions -

        // object - real entity - class -
        // ClassName classRef = new ClassName();

        // new ClassName(); - Object
        // classRef - Class Ref
        // ClassName = Class Name which blueprint you are using


        BuildingBP dlf=new BuildingBP();
        dlf.name= "DLF Properties PVT LTD";
        dlf.noOfRooms=20;
        dlf.useLift();
        dlf.activities();

        BuildingBP prestige = new BuildingBP();
        prestige.name = "Prestige Pvt Builder";
        prestige.noOfRooms = 100;

        prestige.useLift();
        prestige.activities();
    }
}
