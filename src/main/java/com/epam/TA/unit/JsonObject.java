package com.epam.TA.unit;

import com.epam.TA.unit.User;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class JsonObject {


        public Object[][] getDataForUser() throws FileNotFoundException {
            JsonElement jsonData = new JsonParser().parse(new FileReader("src/main/resources/user.json"));
            JsonElement userSet = jsonData.getAsJsonObject().get("userSet");
            List<User> testData = new Gson().fromJson(userSet, new TypeToken<List<User>>(){}.getType());
            Object[][] returnValue = new Object[testData.size()][1];
            int index = 0;
            for (Object[] each : returnValue) {
                each[0] = testData.get(index++);
            }
            return returnValue;
        }

}
