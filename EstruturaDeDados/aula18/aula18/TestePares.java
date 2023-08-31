import java.lang.reflect.Method;

public class TestePares extends PilhaComNo{
  

    public static boolean expressaoValida(PilhaComNo<Character> pilha){
        
        if(pilha.estaVazio()){
            return false;
            
        }else if(pilha.getTamanho() % 2 > 0){
            return false;
        }
        return true;
    }

    

    public static boolean main(String[] args) {
        PilhaComNo<Character> pilha = new PilhaComNo<Character>();

        pilha.push('(');
        pilha.push('{');
        pilha.push('[');
        pilha.push(')');
        pilha.push('}');
        pilha.push(']');
        
        PilhaComNo<Character> pilhaAux = new PilhaComNo<>();

        while(pilha.getTamanho() > 0){
            Character c = pilha.pop();
            if(c == '(' || (c == ']') || (c == '}')){
                pilha.push(c);
            }else if((c == '(') || (c == '[') || (c == '{')){
                if(pilhaAux.estaVazio()){
                    return false;
                }else{
                    Character top = pilhaAux.pop();
                    if((c == '(' && top != ')') ||
                       (c == '[' && top != ']') ||
                        (c == '{' && top != '}')
                    ){
                        return false;
                    }
                }
            }
            
        }
        return pilhaAux.estaVazio();
        
    }

}
