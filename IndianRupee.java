public class IndianRupee{
    private int rupeeId;
    private String rupeeName;
    private String printDate;
    private String color;
    private String serialNo;
    private static int noOfLanguages=17;
    private String size;
    private String backsidePlaceName;
    private String location;

    // Getter and Setter methods for each variable

    public void setRupeeId(int rupeeId){
        this.rupeeId = rupeeId;
    }
    public int getRupeeId(){
        return rupeeId;
    }
    public void setRupeeName(String rupeeName){
        this.rupeeName = rupeeName;
    }
    public String getRupeeName(){
        return rupeeName;
    }
    public void setPrintDate(String printDate){
        this.printDate = printDate;
    }
    public String getPrintDate(){
        return printDate;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setSerialNo(String serialNo){
        this.serialNo = serialNo;
    }
    public String getSerialNo(){
        return serialNo;
    }
    public void setNoOfLanguages(int noOfLanguages){
        this.noOfLanguages = noOfLanguages;
    }
    public int getNoOfLanguages(){
        return noOfLanguages;
    }
    public void setSize(String size){
        this.size = size;
    }
    public String getSize(){
        return size;
    }
    public void setBacksidePlaceName(String backsidePlaceName){
        this.backsidePlaceName = backsidePlaceName;
    }
    public String getBacksidePlaceName(){
        return backsidePlaceName;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public String getLocation(){
        return location;
    }
}
