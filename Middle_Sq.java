import java.lang.Math;

public class Middle_Sq implements Generator {

    private int seed;

    Middle_Sq (int s){
        seed=s;
    }

    @Override
    public float next() {
        int x;
        x=seed*seed;
        x=x/(int)Math.pow(10,Var_seed()/2);
        x=x%(int)Math.pow(10,Var_seed());
        seed=x;
        return x/(float)Math.pow(10,Var_seed ());
    }
    public int Var_seed (){
        int n=seed,ok=0;
        while(n!=0){
            n=n/10;
            ok++;
        }
        return ok;
    }
}
