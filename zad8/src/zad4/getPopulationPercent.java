package zad4;

class PopulationInformer {

    public static String getPopulationPercent(Continent continent) {
        String result;

        if (continent == Continent.ASIA) {
            result = "59.5%";
        } else if (continent == Continent.AFRICA) {
            result = "16.9%";
        } else if (continent == Continent.NORTH_AMERICA) {
            result = "7.7%";
        } else if (continent == Continent.SOUTH_AMERICA) {
            result = "5.6%";
        } else if (continent == Continent.ANTARCTICA) {
            result = "<0.1%";
        } else if (continent == Continent.EUROPE) {
            result = "9.7%";
        } else if (continent == Continent.AUSTRALIA) {
            result = "0.5%";
        } else {
            result = "Такого материка не существует.";
        }

        return result;
    }
}

enum Continent {
    ASIA,
    AFRICA,
    NORTH_AMERICA,
    SOUTH_AMERICA,
    ANTARCTICA,
    EUROPE,
    AUSTRALIA
}


public class  getPopulationPercent{
    public static void main(String[] args) {
        PopulationInformer populatioInformer = new PopulationInformer();
        System.out.println(populatioInformer.getPopulationPercent(Continent.ASIA));
        System.out.println(populatioInformer.getPopulationPercent(Continent.AFRICA));
        System.out.println(populatioInformer.getPopulationPercent(Continent.NORTH_AMERICA));
        System.out.println(populatioInformer.getPopulationPercent(Continent.SOUTH_AMERICA));
        System.out.println(populatioInformer.getPopulationPercent(Continent.ANTARCTICA));
        System.out.println(populatioInformer.getPopulationPercent(Continent.AUSTRALIA));
    }
}
