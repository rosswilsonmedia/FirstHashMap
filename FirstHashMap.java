import java.util.HashMap;
import java.util.Set;

public class FirstHashMap {
    public void trackList() {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Don't Stop", "Just a small town girl");
        trackList.put("Believing", "Living in a lonely world");
        trackList.put("Journey", "She took the midnight train");
        trackList.put("The", "Going anywhere");
        System.out.println(trackList.get("Don't Stop"));
        Set<String> keys = trackList.keySet();
        for(String key: keys) {
            System.out.println(key + ": " + trackList.get(key));
        }
    }
}