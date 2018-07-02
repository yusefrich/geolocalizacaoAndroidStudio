package com.nativestudies.familia.geolocalizacao;

public class Localizacao {
//{
//  "ip":"8.8.8.8",
//  "type":"ipv4",
//  "continent_code":"NA",
//  "continent_name":"North America",
//  "country_code":"US",
//  "country_name":"United States",
//  "region_code":null,
//  "region_name":null,
//  "city":null,
//  "zip":null,
//  "latitude":37.751,
//  "longitude":-97.822,
//  "location":{
//    "geoname_id":null,
//    "capital":"Washington D.C.",
//    "languages":[
//      {
//        "code":"en",
//        "name":"English",
//        "native":"English"
//      }
//    ],
//    "country_flag":"http:\/\/assets.ipstack.com\/flags\/us.svg",
//    "country_flag_emoji":"\ud83c\uddfa\ud83c\uddf8",
//    "country_flag_emoji_unicode":"U+1F1FA U+1F1F8",
//    "calling_code":"1",
//    "is_eu":false
//  }
//}
    private String country_code;
    private String country_name;

    public Localizacao (String code, String name){
        this.country_code = code;
        this.country_name = name;
    }


    public String getCountry_code(){return  this.country_code;}
    public String getCountry_name(){return  this.country_name;}

}
