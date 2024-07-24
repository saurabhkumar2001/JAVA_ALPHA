public class remove_duplicate {
    public static void removeDuplicate(String str,int i,StringBuilder newstr,boolean map[]){
        //base
        if (i==str.length()) {
           System.out.println(newstr);
            return;
        }
        //kaam
        char currchar = str.charAt(i);
         if(map[currchar - 'a'] == true){
            removeDuplicate(str, i+1,newstr,map);
         }else{
            map[currchar - 'a'] = true;
            newstr.append(currchar);
            removeDuplicate(str, i+1, newstr, map);
         }
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDuplicate(str,0,new StringBuilder(""),new boolean[26]);
    }
}
