package learn.getresponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GetResponseValue {

    public static void  main(String argsp[]){

        String str = "{" +
                "    \"t1\": {" +
                "        \"title1\": \"value1\"," +
                "    \"title2\": \"value2\"," +
                "        \"title3\" : {" +
                "            \"t31\":\"value31\"" +
                "        }" +
                "        }," +
                "    \"t2\": \"t2value\"" +
                "    }" +
                "}";

        String jsonArray =  "[" +
                "    {" +
                "        \"a1\" : \"av1\"," +
                "        \"a2\" : \"av2\"," +
                "        \"a3\" : {" +
                "            \"a3a\" : \"a3av1\"" +
                "        }" +
                "    }," +
                "    {" +
                "        \"b1\" : \"bv1\"," +
                "        \"b2\" : \"bv2\"" +
                "    }" +
                "]";
        String arrJson = "{" +
                "    \"t3\": [" +
                "        {" +
                "            \"FirstName\" : \"Jitendra\"" +
                "        }," +
                "        {" +
                "            \"LastName\" : \"Kumar\"," +
                "            \"age\" : [" +
                "                {" +
                "                \"realage\" : \"16\"," +
                "                \"fakeage\" : \"17\"" +
                "            }" +
                "            ]" +
                "        }" +
                "    ]" +
                "}";

        System.out.println("String is " + str);
        System.out.println("JSONArray String  is " + jsonArray);
        String key = "t3 [0]FirstName";
        System.out.println("Response of key "+ key + " is " + getResponse(arrJson,key));
    }

    static String getResponse(String response, String key) {
        String value = null;
        /*If response is JSONArray*/
        if(key.startsWith("[")){
            String keyArr[] = key.split(" ");
            String index = keyArr[0].substring(1,keyArr[0].indexOf("]"));
            int arrNo =  Integer.valueOf(index);
            JSONArray array = new JSONArray(response);
            JSONObject json = array.getJSONObject(arrNo);
            key = key.substring((key.indexOf("]") + 1));
            value = getRecursionJSONObjectValue(json.toString(), key);
        }
        else if(key.contains("[")){
            value = getRecursionJSONObjectValue(response, key);

        }
        else if (key.contains(" ")) {
            value = getRecursionJSONObjectValue(response, key);
        } else {
            JSONObject json = new JSONObject(response);
            try {
                value = json.getString(key);
            } catch (JSONException e) {
                System.out.println("***Please provide the correct key value***");
            }
        }
        return value;
    }

    static String getRecursionJSONObjectValue(String response, String key){
        int count = 0;
        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i) == ' ') {
                count++;
            }
        }
        String keyArr[] = key.split(" ");
        int var = 0;
        JSONObject json = new JSONObject(response);
        JSONObject newJSON =  json;

        String index;
        int arrNo;
        while (count > 0) {
            if(keyArr[var].startsWith("[")){
                index = keyArr[var].substring(1,keyArr[var].indexOf("]"));
                arrNo =  Integer.valueOf(index);
                keyArr[var] = keyArr[var].substring(keyArr[var].indexOf("]") + 1);

            }
            newJSON = json.getJSONObject(keyArr[var++]);
            json = newJSON;
            count--;
        }
        return newJSON.getString(keyArr[var++]);
    }

    /*static String getRecursionJSONObjectValue(String response, String key){
        int count = 0;
        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i) == ' ') {
                count++;
            }
        }
        String keyArr[] = key.split(" ");
        int var = 0;
        JSONObject json = new JSONObject(response);
        JSONObject newJSON =  json;
        while (count > 0) {
            newJSON = json.getJSONObject(keyArr[var++]);
            json = newJSON;
            count--;
        }
        return newJSON.getString(keyArr[var++]);
    }*/
}
