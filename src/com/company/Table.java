package com.company;

public class Table   {

    private int TableId;
    private int NUmber;
    private int numberOfSeats;
    private String[] status = {"blocked","avaliable"};
    private TabLoc loc;

    enum TabLoc{
        NearWindow,
        InTheWindow,
        Other
    }

    private String TabLocDescription;

    public Table(int NUmber,int numberOfSeats,int id,TabLoc loc) {
        this.NUmber = NUmber;
        this.numberOfSeats = numberOfSeats;
        TableId=id;
        this.loc=loc;
    }

    public Table(int tableId, int NUmber, int numberOfSeats, String[] status, TabLoc loc, String tabLocDescription) {
        TableId = tableId;
        this.NUmber = NUmber;
        this.numberOfSeats = numberOfSeats;
        this.status = status;
        this.loc = loc;
        TabLocDescription = tabLocDescription;
    }

    public int getNUmber(){
        return NUmber;
    }
    public void setNUmber(int nu){
        NUmber = nu;
    }

    public int getNumberOfSeats(){
        return numberOfSeats;
    }
    public void setNumberOfSeats(int nuOfSeats){
        numberOfSeats = nuOfSeats;
    }


    public int getTableId() { return TableId; }
    public void setTableId(int tableId) { TableId = tableId; }

    public TabLoc getLoc() { return loc; }
    public void setLoc(TabLoc loc) { this.loc = loc; }

    public String getTabLocDescription() { return TabLocDescription; }

    public void setTabLocDescription(String tabLocDescription) { TabLocDescription = tabLocDescription; }
}
