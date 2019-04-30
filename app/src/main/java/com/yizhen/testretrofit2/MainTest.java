package com.yizhen.testretrofit2;

import com.google.gson.Gson;

public class MainTest {

    public static void main(String[] args){
//        Gson gson = new Gson();
//        User user = new User("怪盗kidou",24);
//        String jsonObject = gson.toJson(user); // {"name":"怪盗kidou","age":24}
//        System.out.println(jsonObject);


        Gson gson = new Gson();
        String jsonString = "{\"name\":\"怪盗kidou\",\"age\":24}";
        User user = gson.fromJson(jsonString, User.class);

        System.out.println(user.name);


    }

}
