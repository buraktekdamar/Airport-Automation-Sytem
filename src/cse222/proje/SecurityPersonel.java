package cse222.proje;

public class SecurityPersonel extends Employee {

    /**
     * Create a SecurityPersonel object
     * @param name will be set
     * @param surname will be set
     * @param ID will be set
     * @param password will be set
     */
    public SecurityPersonel(String name, String surname, int ID, String password) {
        super(name, surname, ID, password);
    }

    public SecurityPersonel() {

    }

    /**
     * Update given sector's securityState
     * @param sector will be updated
     * @return if updated successfully returns true
     * @throws NullPointerException if one of given parameters is null
     */
    public boolean updateSector(Sector sector){
        return true;
    }

    /**
     * Display given sector's data
     * @param sector will be displayed
     * @throws NullPointerException if given parameter is null
     */
    public void displaySector(Sector sector){
        System.out.printf("\n Sector %s security status : %s", sector.getSectorID(), sector.getSecurityState());
    }

}
