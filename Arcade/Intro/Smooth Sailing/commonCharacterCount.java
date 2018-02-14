int commonCharacterCount(String s1, String s2) {
    int count = 0;
    List <Character> s2List = new ArrayList<>();
    for (char c : s2.toCharArray()) {
        s2List.add(c);
    }
    
    for (int i = 0; i < s1.length(); i++) {
        for (int j = 0; j < s2List.size(); j++) {
            if (s1.charAt(i) == s2List.get(j)) {
                count++;
                s2List.remove(j);
                break;
            }
        }
        
        if (s2List.size() == 0) {
            break;
        }
    }
    
    return count;
}
