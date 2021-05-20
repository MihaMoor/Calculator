

class Arabian{
    String str;
    
    public Arabian(String s){
        str = s;
        int a, b;
        char c = 'c';
        
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '/' || str.charAt(i) == '*'){
                String temp = "";
                c = str.charAt(i);
                for(int j = 0; j < i; j++){
                    temp += str.charAt(j);
                }
                a = Integer.parseInt(temp);
                temp = "";
                for(int j = i+1; j < str.length(); j++){
                    temp += str.charAt(j);
                }
                b = Integer.parseInt(temp);
                calculatedArabian(a,b,c);
            }
        }
        if(c == 'c') System.out.println("Вы не ввели операцию!");
    }
    
    void calculatedArabian(int a, int b, char c){
        switch(c){
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '/':
                if(b != 0) System.out.println(a / b);
                else System.out.println("Devided by ZERO!");
                break;
            case '*':
                System.out.println(a * b);
                break;
        }
    }
}