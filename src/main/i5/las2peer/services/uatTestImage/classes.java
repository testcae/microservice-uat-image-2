package i5.las2peer.services.uatTestImage;

import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.ParseException;

public class classes {

    class image {

    public image() {}
    
    private String imageName;

    public void setimageName(String setValue) {
        this.imageName = setValue;
    }

    public String getimageName() {
        return this.imageName;
    }
    private int imageId;

    public void setimageId(int setValue) {
        this.imageId = setValue;
    }

    public int getimageId() {
        return this.imageId;
    }
    private String imageUrl;

    public void setimageUrl(String setValue) {
        this.imageUrl = setValue;
    }

    public String getimageUrl() {
        return this.imageUrl;
    }
    private String musicName;

    public void setmusicName(String setValue) {
        this.musicName = setValue;
    }

    public String getmusicName() {
        return this.musicName;
    }

    public JSONObject toJSON() {

        JSONObject jo = new JSONObject();
        jo.put("imageName", this.imageName); 
        jo.put("imageId", this.imageId); 
        jo.put("imageUrl", this.imageUrl); 
        jo.put("musicName", this.musicName); 

        return jo;
    }

    public void fromJSON(String jsonString) throws ParseException {
        JSONObject jsonObject = (JSONObject) JSONValue.parseWithException(jsonString);
        this.imageName = (String) jsonObject.get("imageName"); 
        this.imageId = ((Long) jsonObject.get("imageId")).intValue(); 
        this.imageUrl = (String) jsonObject.get("imageUrl"); 
        this.musicName = (String) jsonObject.get("musicName"); 

    }

}
    class image_2 {

    public image_2() {}
    
    private String imageId;

    public void setimageId(String setValue) {
        this.imageId = setValue;
    }

    public String getimageId() {
        return this.imageId;
    }
    private String imageName;

    public void setimageName(String setValue) {
        this.imageName = setValue;
    }

    public String getimageName() {
        return this.imageName;
    }
    private String imageUrl;

    public void setimageUrl(String setValue) {
        this.imageUrl = setValue;
    }

    public String getimageUrl() {
        return this.imageUrl;
    }

    public JSONObject toJSON() {

        JSONObject jo = new JSONObject();
        jo.put("imageId", this.imageId); 
        jo.put("imageName", this.imageName); 
        jo.put("imageUrl", this.imageUrl); 

        return jo;
    }

    public void fromJSON(String jsonString) throws ParseException {
        JSONObject jsonObject = (JSONObject) JSONValue.parseWithException(jsonString);
        this.imageId = (String) jsonObject.get("imageId"); 
        this.imageName = (String) jsonObject.get("imageName"); 
        this.imageUrl = (String) jsonObject.get("imageUrl"); 

    }

}

    
}
