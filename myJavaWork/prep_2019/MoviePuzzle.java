package prep_2019;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.net.*;


public class MoviePuzzle {
    static int totalPages = 0;
    static String[] getMovieTitles(String substr) throws IOException{
		
        String[] data = new String[1];
        StringBuilder sb= new StringBuilder();
        sb.append("https://jsonmock.hackerrank.com/api/movies/search/?Title=");
        sb.append(substr);
        String temp = sb.toString();
        URL url = new URL(temp);
        HttpURLConnection connect = (HttpURLConnection) url.openConnection();
        connect.setRequestMethod("GET");
        int resCode = connect.getResponseCode();
		
        if(resCode == 200){	
           BufferedReader br = new BufferedReader(new InputStreamReader(connect.getInputStream()));
            String line;
			
            while((line=br.readLine())!=null){	
                JsonObject jsonObj = new Gson().fromJson(line, JsonObject.class);
                JsonArray jsonArray = jsonObj.getAsJsonArray("data");
				for(int j=0;j<jsonArray.size();j++) {
					jsonObj = jsonArray.get(j).getAsJsonObject();
					String result = jsonObj.get("Title").toString().replaceAll("\"", "");;
					data[j] = result;
				}
				Arrays.sort(data);
				return data;
            } 
        }
        return data;
    }
    public static void main(String[] args) throws IOException{
		
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        String[] res;
        String _substr;
		
        try {
            _substr = in.nextLine();
        } catch (Exception e) {
            _substr = null;
        }
        
        res = getMovieTitles(_substr);
        for(int res_i=0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }
        
        bw.close();
    }
}