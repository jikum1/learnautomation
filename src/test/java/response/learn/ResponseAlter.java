package response.learn;

import org.json.JSONObject;

public class ResponseAlter{

    public static void main(String args[]){

        String str = "{\n" +
                "    \"FirstName\": \"Jitendra\"," +
                "    \"LastName\": \"Kumar\"," +
                "    \"Age\": \"26\"," +
                "    \"City\": \"Bangalore\"," +
                "    \"Address\" : {" +
                "        \"city\" : \"Bangalore\"," +
                "        \"country\":\"India\"" +
                "    }" +
                "}";


        System.out.println("Response str is " + str);
        JSONObject json = new JSONObject(str);
        json.put("Country", "India");
        json.remove("Age");
        json.remove("Address");
        System.out.println("Response is " + json.toString());
    }
}
