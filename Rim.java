

class Rim{
    
    public Rim(String s){
        calculatedRim(s);
    }
    
    public void calculatedRim(String str){
        int a = 0, b = 0, result = 0;
        char c = 'c';
        String[] rim  = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV",
        "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX",
        "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII",
        "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII",
        "LVIII",  "LIX",  "LX",  "LXI",  "LXII",  "LXIII",  "LXIV",  "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
        "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII",
        "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV",
        "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C" };
        
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '/' || str.charAt(i) == '*'){
                c = str.charAt(i);
                String temp = "";
                for(int j = 0; j < i; j++){
                    temp += str.charAt(j);
                }
                for(int j = 0; j < rim.length; j++){
                    if(temp.equals(rim[j]))
                        a = j + 1;
                }
                temp = "";
                for(int j = i+1; j < str.length(); j++){
                    temp += str.charAt(j);
                }
                for(int j = 0; j < rim.length; j++){
                    if(temp.equals(rim[j]))
                        b = j + 1;
                }
                break;
            }
        }
        if(c == 'c'){
            System.out.println("Вы не ввели операцию!");
            return;
        }
        switch(c){
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '/':
                if(b != 0) result = a / b;
                else System.out.println("Devided by ZERO!");
                break;
            case '*':
                result = a * b;
                break;
        }
        
        System.out.println(rim[result-1]);
    }
}