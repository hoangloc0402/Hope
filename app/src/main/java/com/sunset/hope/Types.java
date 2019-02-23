package com.sunset.hope;

public class Types {
    int[] icon;
    String[] text;

    public Types(int[] icon, String[] text){
        this.icon = icon;
        this.text = text;
    }

    public static Types getTypeList(){
        Types type = new Types(new int[]{R.drawable.spn_drop_down,
                R.drawable.spn_bloods,
                R.drawable.spn_clothes,
                R.drawable.spn_foods,
                R.drawable.spn_medicines,
                R.drawable.spn_money},
                new String[]{"Select Tag",
                        "Bloods",
                        "Clothes",
                        "Foods",
                        "Medicines",
                        "Money"});
        return type;
    }
}
