package cazarecamin_pckg;

import cazarecamin_pckg.Generator;

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
        return x/Math(10,Var_seed());
    }

    public int Var_seed (){
        int n=x,ok=0;
        while(n!=0){
            n=n/10;
            ok++;
        }
        return ok;
    }
}
