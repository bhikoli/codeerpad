import java.io.*; 
import java.util.*;  
import java.util.Map.*;

public class FindSuccessIpCount {  
    
	public static void main(String[] args) 
	{ 
	    final String[] log = {"123.123.123.123 - - [26/Apr/2000:00:23:48 -0400] \"GET /pics/wpaper.gif HTTP/1.0\" 200 6248 \"http:// www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I; PPC)\"\n",
		    "123.123.123.123 - - [26/Apr/2000:00:23:47 -0400] \"GET /asctortf/ HTTP/1.0\" 200 8130 \"http:// search.netscape.com/Computers/Data_Formats/Document/Text/RTF\" \"Mozilla/4.05 (Macintosh; I; PPC)\"\n" , "123.123.123.124 - - [26/Apr/2000:00:23:48 -0400] \"GET /pics/5star2000.gif HTTP/1.0\" 200 4005 \"http:// www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I; PPC)\"\n" , "123.123.123.123 - - [26/Apr/2000:00:23:50 -0400] \"GET /pics/5star.gif HTTP/1.0\" 404 1031 \"http:// www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I; PPC)\"\n" , "123.123.123.126 - - [26/Apr/2000:00:23:51 -0400] \"GET /pics/a2hlogo.jpg HTTP/1.0\" 200 4282 \"http:// www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I; PPC)\"\n" , "123.123.123.123 - - [26/Apr/2000:00:23:51 -0400] \"GET /cgi-bin/newcount?jafsof3&width=4&font=digital&noshow HTTP/1.0\" 200 36 \"http:// www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I; PPC)\"\n"};
	    List<String> arr_list= Arrays.asList(log);
	    List<String> list1= new ArrayList();
	    String[] splitlog = {}; 
	    String temp =""; 
	    for(String s:arr_list) 
		{
    	    		splitlog = s.split("\\s+");
    	    		temp = splitlog[0].toString();
    			list1.add(temp);
		}       
        
        Map<String, Integer> countMap = new HashMap<>();
        for(String item:list1) 
		{ 
          if (countMap.containsKey(item))
              countMap.put(item, countMap.get(item) + 1);
          else
              countMap.put(item, 1);
        }
    
        int maxValueInMap = Collections.max(countMap.values());
        for (Entry<String, Integer> entry : countMap.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
               System.out.println("IP address which appeared most of the times is :  "+entry.getKey());     // Print the key with max value
               System.out.print("count: "+maxValueInMap);
            }
        }
	} 
} 
