package i5.las2peer.services.uatTestImage;

import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.ParseException;

public class classes {

    class image {

    public image() {}
    
    private String musicName;

    public void setmusicName(String setValue) {
        this.musicName = setValue;
    }

    public String getmusicName() {
        return this.musicName;
    }

    public JSONObject toJSON() {

        JSONObject jo = new JSONObject();
        jo.put("musicName", this.musicName); 

        return jo;
    }

    public void fromJSON(String jsonString) throws ParseException {
        JSONObject jsonObject = (JSONObject) JSONValue.parseWithException(jsonString);
        this.musicName = (String) jsonObject.get("musicName"); 

    }

}

    
}
