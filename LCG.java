import java.lang.Math;

public class LCG implements Generator {
    private int a,m,c,x;
    LCG (int aaa, int mmm, int ccc , int xx ){
        a=aaa;
        m=mmm;
        c=ccc;
        x=xx;
    }

    @Override
    public float next() {
        x=(a*x+c)%m;
        return x/(float)Math.pow(10,Var_m()-1);
    }

    public int Var_seed (){
        int n=x,ok=0;
        while(n!=0){
            n=n/10;
            ok++;
        }
        return ok;
    }

    public int Var_m (){
        int n=m,ok=0;
        while(n!=0){
            n=n/10;
            ok++;
        }
        return ok;
    }
}
