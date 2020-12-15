package db;

public class City{
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName(String CityName){
        this.cityName=CityName;
    }
    public int getProvinceCode(){
        return cityCode;
    }
    public void setProvinceCode(int CityCode){
        this.cityCode=CityCode;
    }
    public int getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(int provinceId){
        this.provinceId=provinceId;
    }
}
