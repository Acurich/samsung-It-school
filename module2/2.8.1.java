#1
public boolean check(ThreeIntegers<Integer, Integer, Integer> three){
    if ((Math.pow(three.t1, 2) + Math.pow(three.t2 , 2) == Math.pow(three.t3 , 2)) 
    || (Math.pow(three.t1,2) + Math.pow(three.t3 , 2) == Math.pow(three.t2 , 2)) 
    || (Math.pow(three.t3, 2) + Math.pow(three.t2,2) == Math.pow(three.t1,2))) 
    {
         return true;
    }
    else
    {
        return false;
    }
}
