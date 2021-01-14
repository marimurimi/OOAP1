public class Context {
    Strategy strategy;

    public void chooseStrategy(String ch,int n1,int n2){
        if(ch.equals("+")){
            strategy = new Plus();
        }
        else{
            strategy = new Minus();
        }
        System.out.println("Результат: " + strategy.doSmth(n1,n2));
    }
}
