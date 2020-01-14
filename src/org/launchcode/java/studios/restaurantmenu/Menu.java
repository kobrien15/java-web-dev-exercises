package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> currentMenu;
    private ArrayList<MenuItem> upcomingMenu;
    private Date createdDate;
    private Date modifiedDate;
    private Date menuStartDate;
    private Date menuEndDate;

    public Menu(ArrayList<MenuItem> currentMenu, ArrayList<MenuItem> upcomingMenu, Date createdDate, Date modifiedDate, Date menuStartDate, Date menuEndDate) {
        this.currentMenu = currentMenu;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.menuStartDate = menuStartDate;
        this.menuEndDate = menuEndDate;
    }
}
