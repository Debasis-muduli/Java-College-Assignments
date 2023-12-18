public class _5_planet {
    String name;
    String[] satellites;

    public _5_planet(String name, String[] satellites) {
        this.name = name;
        this.satellites = satellites;
    }

    public void print() {
        System.out.println(name + " has " + satellites.length + " satellite(s):");
        for (String satellite : satellites) {
            System.out.println(satellite + ".");
        }
    }
 
    public static void main(String[] args) {
        String[] earthSatellites = {"Moon"};
        _5_planet earth = new _5_planet("Earth", earthSatellites);

        earth.print();
    }
}
