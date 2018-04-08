public class Solution {
	public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
    
        for (String cpdomain : cpdomains) {
            int count = Integer.valueOf(cpdomain.split(" ")[0]);
            String domain = cpdomain.split(" ")[1];
            
            while (domain.length() > 0) {
                map.put(domain, map.getOrDefault(domain, 0) + count);
                domain = domain.contains(".") ? domain.substring(domain.indexOf(".") + 1) : "";
            }   
        }
    
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result.add(entry.getValue() + " " + entry.getKey());
        }
        
        return result;
    }
}
