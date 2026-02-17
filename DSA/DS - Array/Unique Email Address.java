/* https://leetcode.com/problems/unique-email-addresses/ */
import java.util.HashSet;
class Solution {
    public int numUniqueEmails(String[] emails) {
       HashSet<String> uniqueEmails = new HashSet<>(); 
        for (int i = 0; i < emails.length; i++) {
            uniqueEmails.add(applyRule(emails[i]));
        }
        return uniqueEmails.size();
    }

    public static String applyRule(String s){

        String local, domain;

        local = s.substring(0, s.indexOf("@"));
        domain = s.substring(s.indexOf("@")+1, s.length());
        
        StringBuilder newLocal = new StringBuilder();
        for (int i = 0; i < local.length(); i++) {
            if (local.charAt(i) == '+'){
                break;
            }
            if (local.charAt(i) != '.'){
                newLocal.append(local.charAt(i));
            }
        }

        return newLocal.toString()+'@'+domain;
    }
}