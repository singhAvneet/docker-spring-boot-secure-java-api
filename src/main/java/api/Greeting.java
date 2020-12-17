package api;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Greeting{

    private final long id=0;
    private final String content=null;

    ArrayList<Object> obj = new ArrayList();

    public Greeting() {
        for(int i=0;i<160;i++){
                this.obj.add(i,"avneet"+i);
        }

    }

    public ArrayList getArrayList(int n) {
        ArrayList<String> out = new ArrayList();
        if(n>0) {
            for (int i = n - 20, m = 0; i < n; i++, m++) {
                out.add(m, (String) this.obj.get(i));
            }
        }
        if(n==0) {
            for (int i = 0, m = 0; i < 20; i++, m++) {
                out.add(m, (String) this.obj.get(i));
            }
        }

        return out;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }



    String returnLine=new String() ;
public Greeting readData(){
    return this;
}
//    public String readJavascript(){
//        String inputLine=null ;
//        try
//        {
//            URL oracle = new URL("http://localhost:3001/main.bundle.js");
//            BufferedReader in = new BufferedReader(
//                    new InputStreamReader(oracle.openStream()));
//
//
//            while ((inputLine = in.readLine()) != null){
//                returnLine += inputLine;
//            }
//
//
//            in.close();
//
//
//
//        }catch(FileNotFoundException fnfe)
//        {
//            System.out.println("The specified file not found" + fnfe);
//        }
//        catch(IOException ioe)
//        {
//            System.out.println("I/O Exception: " + ioe);
//        }
//
//
//        return returnLine;
//
//    }







}