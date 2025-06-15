class Solution {
    public int maxDiff(int num) {
        String str1 = Integer.toString(num);
        String str2 = str1;

        int idx = -1;
        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) != '9'){
                idx = i;
                break;
            }
        }

        if(idx != -1){
            char ch = str1.charAt(idx);
            str1 = str1.replace(ch, '9');
        }

        for(int i = 0; i < str2.length(); i++){
            char ch = str2.charAt(i);
            if(i == 0){
                if(ch != '1'){
                    str2 = str2.replace(ch, '1');
                    break;
                }
            } else if (ch != '0' && ch != str2.charAt(0)){
                str2 = str2.replace(ch, '0');
                break;
            }
        }

        return Integer.parseInt(str1) - Integer.parseInt(str2);
    }
}