package String;
//https://leetcode.com/problems/defanging-an-ip-address
public class Defanging_an_IP_Address {
    public static void main(String[] args) {
        String address="1.1.1.1";
        System.out.println(defangIPaddr(address));

    }
    public static String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < address.length(); i++){
            if (address.charAt(i) == '.'){
                str.append("[.]");
            } else {
                str.append(address.charAt(i));
            }
        }
        return str.toString();
    }
}
